package org.dddml.wms.domain;

import java.util.Date;

public interface AttributeSetInstanceExtensionFieldStateDao
{
    AttributeSetInstanceExtensionFieldState get(AttributeSetInstanceExtensionFieldId id);

    void save(AttributeSetInstanceExtensionFieldState state);

    Iterable<AttributeSetInstanceExtensionFieldState> findByGroupId(String groupId);

    void delete(AttributeSetInstanceExtensionFieldState state);
}


