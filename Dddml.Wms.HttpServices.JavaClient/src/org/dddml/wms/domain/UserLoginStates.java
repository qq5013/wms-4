package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.specialization.Saveable;

public interface UserLoginStates extends Iterable<UserLoginState>, Saveable
{
        UserLoginState get(LoginKey loginKey);
        
        void remove(UserLoginState state);

        void addToSave(UserLoginState state);

}


