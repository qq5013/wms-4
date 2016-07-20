package org.dddml.wms.domain;

import java.util.Date;

public interface UserClaimStateEventDao
{
    void save(UserClaimStateEvent e);

    Iterable<UserClaimStateEvent> findByUserStateEventId(UserStateEventId userStateEventId);

}

