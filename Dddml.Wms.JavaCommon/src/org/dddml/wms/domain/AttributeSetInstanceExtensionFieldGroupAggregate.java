package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface AttributeSetInstanceExtensionFieldGroupAggregate
{
    AttributeSetInstanceExtensionFieldGroupState getState();

    List<Event> getChanges();

    void throwOnInvalidStateTransition(Command c);

    void create(AttributeSetInstanceExtensionFieldGroupCommand.CreateAttributeSetInstanceExtensionFieldGroup c);

    void mergePatch(AttributeSetInstanceExtensionFieldGroupCommand.MergePatchAttributeSetInstanceExtensionFieldGroup c);

    void delete(AttributeSetInstanceExtensionFieldGroupCommand.DeleteAttributeSetInstanceExtensionFieldGroup c);

}

