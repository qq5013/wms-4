package org.dddml.wms.domain;

import java.util.Date;

public interface UserLoginStateEventDao
{
    void save(UserLoginStateEvent e);

    Iterable<UserLoginStateEvent> findByUserStateEventId(UserStateEventId userStateEventId);

}

