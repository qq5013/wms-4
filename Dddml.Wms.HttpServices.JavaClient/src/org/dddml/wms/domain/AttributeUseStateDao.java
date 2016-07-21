package org.dddml.wms.domain;

import java.util.Date;

public interface AttributeUseStateDao
{
    AttributeUseState get(AttributeSetAttributeUseId id);

    void save(AttributeUseState state);

    Iterable<AttributeUseState> findByAttributeSetId(String attributeSetId);

    void delete(AttributeUseState state);
}


