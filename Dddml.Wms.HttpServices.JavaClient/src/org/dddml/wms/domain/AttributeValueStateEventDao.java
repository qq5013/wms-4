package org.dddml.wms.domain;

import java.util.Date;

public interface AttributeValueStateEventDao
{
    void save(AttributeValueStateEvent e);

    Iterable<AttributeValueStateEvent> findByAttributeStateEventId(AttributeStateEventId attributeStateEventId);

}

