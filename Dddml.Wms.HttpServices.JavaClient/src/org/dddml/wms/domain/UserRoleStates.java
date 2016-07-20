package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.specialization.Saveable;

public interface UserRoleStates extends Iterable<UserRoleState>, Saveable
{
    UserRoleState get(String roleId);
        
    void remove(UserRoleState state);

    void addToSave(UserRoleState state);

}


