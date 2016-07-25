package org.dddml.wms.domain.hibernate;

import java.util.Date;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.dddml.wms.domain.*;
import org.dddml.wms.specialization.*;

public class HibernateAttributeValueStateEventDao implements AttributeValueStateEventDao
{
    public SessionFactory sessionFactory;

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public void save(AttributeValueStateEvent e)
    {
        getCurrentSession().save(e);
        if (e instanceof Saveable)
        {
            Saveable saveable = (Saveable) e;
            saveable.save();
        }
    }


    //[Transaction(ReadOnly = true)]
    @Override
    public Iterable<AttributeValueStateEvent> findByAttributeStateEventId(AttributeStateEventId attributeStateEventId)
    {
        Criteria criteria = getCurrentSession().createCriteria(AbstractAttributeValueStateEvent.class);
        Junction partIdCondition = Restrictions.conjunction()
            .add(Restrictions.eq("stateEventId.attributeId", attributeStateEventId.getAttributeId()))
            .add(Restrictions.eq("stateEventId.attributeVersion", attributeStateEventId.getVersion()))
            ;
        return criteria.add(partIdCondition).list();
    }

}

