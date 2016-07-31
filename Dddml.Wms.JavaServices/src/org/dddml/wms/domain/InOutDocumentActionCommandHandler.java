package org.dddml.wms.domain;

import org.dddml.wms.specialization.CommandType;
import org.dddml.wms.specialization.PropertyCommand;
import org.dddml.wms.specialization.PropertyCommandHandler;

/**
 * Created by Yang on 2016/7/31.
 */
public class InOutDocumentActionCommandHandler implements PropertyCommandHandler<DocumentAction, String>
{

    static
    {
        //TODO
        /*
        StateMachine<String, String> tm = new StateMachine<String, String>(() => _currentDocumentStatus, s => _currentDocumentStatus = s);

        tm.Configure(DocumentStatus.INITIAL).Permit(DocumentActionName.DRAFT, DocumentStatus.DRAFTED);

        tm.Configure(DocumentStatus.DRAFTED).Permit(DocumentActionName.COMPLETE, DocumentStatus.COMPLETED).Permit(DocumentActionName.VOID, DocumentStatus.VOIDED);

        tm.Configure(DocumentStatus.COMPLETED).Permit(DocumentActionName.CLOSE, DocumentStatus.CLOSED).Permit(DocumentActionName.REVERSE, DocumentStatus.REVERSED);

        _stateMachine = tm;
        */
    }

    @Override
    public final void execute(PropertyCommand<DocumentAction, String> command)
    {
        String currentState = command.getStateGetter().get();
        String trigger = command.getContent() != null ? command.getContent().getName() : null;

        if (command.getOuterCommandType().equals(CommandType.CREATE)) {
            if (currentState != null && !currentState.trim().equals("")) {
                currentState = DocumentStatus.INITIAL;
            }
            if (trigger == null) {
                trigger = DocumentActionName.DRAFT;
            }
        }

        //TODO
        //stateMachine.fire(trigger);
        //command.getStateSetter().accept(newDocumentStatus);
    }

}
