package org.dddml.wms.domain;

import java.util.Date;

public interface UserPermissionStateEventDao
{
    void save(UserPermissionStateEvent e);

    Iterable<UserPermissionStateEvent> findByUserStateEventId(UserStateEventId userStateEventId);

}

