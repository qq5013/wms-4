using Dddml.Wms.Specialization;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Stateless;

namespace Dddml.Wms.Domain
{
    public class InOutDocumentStatusCommandHandler : IPropertyCommandHandler<string, string>
    {
        [ThreadStatic]
        private static string _currentDocumentStatus;

        private static StateMachine<string, string> _stateMachine;

        static InOutDocumentStatusCommandHandler()
        {
            var tm = new StateMachine<string, string>(() => _currentDocumentStatus, s => _currentDocumentStatus = s);

            tm.Configure(String.Empty)
                .Permit(DocumentAction.Draft, DocumentStatus.Drafted);

            tm.Configure(DocumentStatus.Drafted)
                .Permit(DocumentAction.Complete, DocumentStatus.Completed)
                .Permit(DocumentAction.Void, DocumentStatus.Voided);

            tm.Configure(DocumentStatus.Completed)
                .Permit(DocumentAction.Close, DocumentStatus.Closed)
                .Permit(DocumentAction.Reverse, DocumentStatus.Reversed);

            _stateMachine = tm;
        }
        
        public void Execute(IPropertyCommand<string, string> command)
        {
            _currentDocumentStatus = command.GetState();
            if (String.IsNullOrWhiteSpace(_currentDocumentStatus)) 
            {
                _currentDocumentStatus = String.Empty;//todo 给一个名称？
            }

            _stateMachine.Fire(command.Content);

            command.SetState(_currentDocumentStatus);
        }
    }
}
