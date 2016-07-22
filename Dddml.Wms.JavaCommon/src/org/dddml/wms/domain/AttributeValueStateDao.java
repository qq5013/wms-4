package org.dddml.wms.domain;

import java.util.Date;

public interface AttributeValueStateDao
{
    AttributeValueState get(AttributeValueId id);

    void save(AttributeValueState state);

    Iterable<AttributeValueState> findByAttributeId(String attributeId);

    void delete(AttributeValueState state);
}


