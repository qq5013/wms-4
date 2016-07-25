using Dddml.Wms.Specialization;
using Stateless;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Dddml.Wms.Domain
{
    public class InOutDocumentActionCommandHandler : IPropertyCommandHandler<DocumentAction, string>
    {
        [ThreadStatic]
        private static string _currentDocumentStatus;

        private static StateMachine<string, string> _stateMachine;

        static InOutDocumentActionCommandHandler()
        {
            var tm = new StateMachine<string, string>(() => _currentDocumentStatus, s => _currentDocumentStatus = s);

            tm.Configure(DocumentStatus.Initial)
                .Permit(DocumentActionName.Draft, DocumentStatus.Drafted);

            tm.Configure(DocumentStatus.Drafted)
                .Permit(DocumentActionName.Complete, DocumentStatus.Completed)
                .Permit(DocumentActionName.Void, DocumentStatus.Voided);

            tm.Configure(DocumentStatus.Completed)
                .Permit(DocumentActionName.Close, DocumentStatus.Closed)
                .Permit(DocumentActionName.Reverse, DocumentStatus.Reversed);

            _stateMachine = tm;
        }

        public void Execute(IPropertyCommand<DocumentAction, string> command)
        {
            var currentState = command.GetState();
            var trigger = command.Content != null ? command.Content.Name : null;

            if (command.OuterCommandType == CommandType.Create)
            {
                if (String.IsNullOrWhiteSpace(currentState))
                { currentState = DocumentStatus.Initial; }
                if (trigger == null)
                { trigger = DocumentActionName.Draft; }
            }

            _currentDocumentStatus = currentState;
            _stateMachine.Fire(trigger);
            command.SetState(_currentDocumentStatus);
        }

    }
}
