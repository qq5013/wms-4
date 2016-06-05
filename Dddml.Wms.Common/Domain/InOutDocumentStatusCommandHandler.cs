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

        [ThreadStatic]
        private static string _nextDocumentStatus;

        private static StateMachine<string, string> _stateMachine;

        static InOutDocumentStatusCommandHandler()
        {
            var tm = new StateMachine<string, string>(() => _currentDocumentStatus, s => _nextDocumentStatus = s);
            
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
            _nextDocumentStatus = null;

            _currentDocumentStatus = command.GetState();

            _stateMachine.Fire(command.Content);

            _nextDocumentStatus = _stateMachine.State;

            command.SetState(_nextDocumentStatus);
        }
    }
}
