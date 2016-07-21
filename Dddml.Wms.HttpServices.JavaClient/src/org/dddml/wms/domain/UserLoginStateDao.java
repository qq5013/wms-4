package org.dddml.wms.domain;

import java.util.Date;

public interface UserLoginStateDao
{
    UserLoginState get(UserLoginId id);

    void save(UserLoginState state);

    Iterable<UserLoginState> findByUserId(String userId);

    void delete(UserLoginState state);
}


