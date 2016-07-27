package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface AttributeSetInstanceExtensionFieldMvoAggregate
{
    AttributeSetInstanceExtensionFieldMvoState getState();

    List<Event> getChanges();

    void create(AttributeSetInstanceExtensionFieldMvoCommand.CreateAttributeSetInstanceExtensionFieldMvo c);

    void mergePatch(AttributeSetInstanceExtensionFieldMvoCommand.MergePatchAttributeSetInstanceExtensionFieldMvo c);

    void delete(AttributeSetInstanceExtensionFieldMvoCommand.DeleteAttributeSetInstanceExtensionFieldMvo c);

    void throwOnInvalidStateTransition(Command c);
}

