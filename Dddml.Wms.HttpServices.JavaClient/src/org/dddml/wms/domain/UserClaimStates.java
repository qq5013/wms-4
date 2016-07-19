package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.specialization.Saveable;

public interface UserClaimStates extends Iterable<UserClaimState>, Saveable
{
        UserClaimState get(Integer claimId);
        
        void remove(UserClaimState state);

        void addToSave(UserClaimState state);

}


