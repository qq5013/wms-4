package org.dddml.wms.domain;

import java.util.Date;

public interface AttributeSetInstanceExtensionFieldStateEventDao
{
    void save(AttributeSetInstanceExtensionFieldStateEvent e);

    Iterable<AttributeSetInstanceExtensionFieldStateEvent> findByAttributeSetInstanceExtensionFieldGroupStateEventId(AttributeSetInstanceExtensionFieldGroupStateEventId attributeSetInstanceExtensionFieldGroupStateEventId);

}

