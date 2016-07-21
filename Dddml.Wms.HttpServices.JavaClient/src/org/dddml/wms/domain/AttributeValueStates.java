package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.specialization.Saveable;

public interface AttributeValueStates extends Iterable<AttributeValueState>, Saveable
{
    AttributeValueState get(String value);
        
    void remove(AttributeValueState state);

    void addToSave(AttributeValueState state);

}


