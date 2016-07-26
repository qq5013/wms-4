package org.dddml.wms.domain;

import java.util.Date;

public interface AttributeUseStateEventDao
{
    void save(AttributeUseStateEvent e);

    Iterable<AttributeUseStateEvent> findByAttributeSetStateEventId(AttributeSetStateEventId attributeSetStateEventId);

}

