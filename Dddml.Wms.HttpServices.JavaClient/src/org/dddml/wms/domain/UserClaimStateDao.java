package org.dddml.wms.domain;

import java.util.Date;

public interface UserClaimStateDao
{
    UserClaimState get(UserClaimId id);

    void save(UserClaimState state);

    Iterable<UserClaimState> findByUserId(String userId);

    void delete(UserClaimState state);
}


