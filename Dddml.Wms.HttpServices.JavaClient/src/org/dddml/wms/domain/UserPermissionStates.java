package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.specialization.Saveable;

public interface UserPermissionStates extends Iterable<UserPermissionState>, Saveable
{
        UserPermissionState get(String permissionId);
        
        void remove(UserPermissionState state);

        void addToSave(UserPermissionState state);

}


