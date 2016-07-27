package org.dddml.wms.domain.hibernate;

import java.util.Date;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.dddml.wms.domain.*;
import org.dddml.wms.specialization.*;

public class HibernateAttributeUseStateEventDao implements AttributeUseStateEventDao
{
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() { return this.sessionFactory; }

    public void setSessionFactory(SessionFactory sessionFactory) { this.sessionFactory = sessionFactory; }

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public void save(AttributeUseStateEvent e)
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
    public Iterable<AttributeUseStateEvent> findByAttributeSetStateEventId(AttributeSetStateEventId attributeSetStateEventId)
    {
        Criteria criteria = getCurrentSession().createCriteria(AbstractAttributeUseStateEvent.class);
        Junction partIdCondition = Restrictions.conjunction()
            .add(Restrictions.eq("stateEventId.attributeSetId", attributeSetStateEventId.getAttributeSetId()))
            .add(Restrictions.eq("stateEventId.attributeSetVersion", attributeSetStateEventId.getVersion()))
            ;
        return criteria.add(partIdCondition).list();
    }

}

