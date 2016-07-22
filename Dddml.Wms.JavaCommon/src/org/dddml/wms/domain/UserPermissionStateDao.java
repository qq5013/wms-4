package org.dddml.wms.domain;

import java.util.Date;

public interface UserPermissionStateDao
{
    UserPermissionState get(UserPermissionId id);

    void save(UserPermissionState state);

    Iterable<UserPermissionState> findByUserId(String userId);

    void delete(UserPermissionState state);
}


