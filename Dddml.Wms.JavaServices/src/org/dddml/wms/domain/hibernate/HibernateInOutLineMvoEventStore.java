package org.dddml.wms.domain.hibernate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.joda.money.Money;
import org.dddml.wms.specialization.EventStoreAggregateId;
import org.dddml.wms.specialization.hibernate.AbstractHibernateEventStore;
import org.hibernate.*;
import org.dddml.wms.domain.*;

public class HibernateInOutLineMvoEventStore extends AbstractHibernateEventStore
{
    @Override
    protected Serializable getEventId(EventStoreAggregateId eventStoreAggregateId, long version)
    {
        return new InOutLineMvoStateEventId((InOutLineId) eventStoreAggregateId.getId(), version);
    }

    @Override
    protected Class getSupportedStateEventType()
    {
        return AbstractInOutLineMvoStateEvent.class;
    }

}

