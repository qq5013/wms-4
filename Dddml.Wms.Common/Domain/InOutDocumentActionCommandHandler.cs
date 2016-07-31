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
        //[ThreadStatic]
        //private static string _currentDocumentStatus;

        //private static StateMachine<string, string> _stateMachine;

        //static InOutDocumentActionCommandHandler()
        //{
        //    var tm = BuildStateMachine(() => _currentDocumentStatus, s => _currentDocumentStatus = s);
        //    _stateMachine = tm;
        //}

        private static StateMachine<string, string> BuildStateMachine(Func<String> stateAccessor, Action<String> stateMutator)
        {
            var tm = new StateMachine<string, string>(stateAccessor, stateMutator);

            tm.Configure(DocumentStatus.Initial)
                .Permit(DocumentActionName.Draft, DocumentStatus.Drafted);

            tm.Configure(DocumentStatus.Drafted)
                .Permit(DocumentActionName.Complete, DocumentStatus.Completed)
                .Permit(DocumentActionName.Void, DocumentStatus.Voided);

            tm.Configure(DocumentStatus.Completed)
                .Permit(DocumentActionName.Close, DocumentStatus.Closed)
                .Permit(DocumentActionName.Reverse, DocumentStatus.Reversed);
            return tm;
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

            //TODO 这样才是线程安全的，但是效率不高，需要改进：
            var stateMachine = BuildStateMachine(() => currentState, command.SetState);
            stateMachine.Fire(trigger);
            //_currentDocumentStatus = currentState;
            //_stateMachine.Fire(trigger);
            //command.SetState(_currentDocumentStatus);
        }

    }
}
