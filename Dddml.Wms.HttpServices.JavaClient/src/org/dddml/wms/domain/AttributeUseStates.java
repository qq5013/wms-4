package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.specialization.Saveable;

public interface AttributeUseStates extends Iterable<AttributeUseState>, Saveable
{
    AttributeUseState get(String attributeId);
        
    void remove(AttributeUseState state);

    void addToSave(AttributeUseState state);

}


