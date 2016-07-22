package org.dddml.wms.domain;

import java.util.Date;

public interface UserRoleStateEventDao
{
    void save(UserRoleStateEvent e);

    Iterable<UserRoleStateEvent> findByUserStateEventId(UserStateEventId userStateEventId);

}

