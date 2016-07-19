package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.specialization.Saveable;

public interface AttributeSetInstanceExtensionFieldStates extends Iterable<AttributeSetInstanceExtensionFieldState>, Saveable
{
        AttributeSetInstanceExtensionFieldState get(String index);
        
        void remove(AttributeSetInstanceExtensionFieldState state);

        void addToSave(AttributeSetInstanceExtensionFieldState state);

}


