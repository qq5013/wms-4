package org.dddml.wms.domain;

import java.math.BigDecimal;
import java.util.Date;

public interface InOutLineStateEventDao
{
    void save(InOutLineStateEvent e);

    Iterable<InOutLineStateEvent> findByInOutStateEventId(InOutStateEventId inOutStateEventId);

}

