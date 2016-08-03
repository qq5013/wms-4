package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.util.Date;

public interface UserStateRepository
{
    UserState get(String id);

    Iterable<UserState> getAll(Integer firstResult, Integer maxResults);
    
    void save(UserState state);
    
    Iterable<UserState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<UserState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    UserState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    UserState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<UserState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

    UserRoleState getUserRole(String userId, String roleId);

    UserClaimState getUserClaim(String userId, Integer claimId);

    UserPermissionState getUserPermission(String userId, String permissionId);

    UserLoginState getUserLogin(String userId, LoginKey loginKey);

}

