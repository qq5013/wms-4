package org.dddml.wms.domain;

import java.util.Date;

public interface UserRoleStateDao
{
    UserRoleState get(UserRoleId id);

    void save(UserRoleState state);

    Iterable<UserRoleState> findByUserId(String userId);

    void delete(UserRoleState state);
}


