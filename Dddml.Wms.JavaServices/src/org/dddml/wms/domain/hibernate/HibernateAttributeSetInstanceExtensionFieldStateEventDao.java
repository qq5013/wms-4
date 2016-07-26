package org.dddml.wms.domain.hibernate;

import java.util.Date;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.dddml.wms.domain.*;
import org.dddml.wms.specialization.*;

public class HibernateAttributeSetInstanceExtensionFieldStateEventDao implements AttributeSetInstanceExtensionFieldStateEventDao
{
    public SessionFactory sessionFactory;

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public void save(AttributeSetInstanceExtensionFieldStateEvent e)
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
    public Iterable<AttributeSetInstanceExtensionFieldStateEvent> findByAttributeSetInstanceExtensionFieldGroupStateEventId(AttributeSetInstanceExtensionFieldGroupStateEventId attributeSetInstanceExtensionFieldGroupStateEventId)
    {
        Criteria criteria = getCurrentSession().createCriteria(AbstractAttributeSetInstanceExtensionFieldStateEvent.class);
        Junction partIdCondition = Restrictions.conjunction()
            .add(Restrictions.eq("stateEventId.groupId", attributeSetInstanceExtensionFieldGroupStateEventId.getId()))
            .add(Restrictions.eq("stateEventId.attributeSetInstanceExtensionFieldGroupVersion", attributeSetInstanceExtensionFieldGroupStateEventId.getVersion()))
            ;
        return criteria.add(partIdCondition).list();
    }

}

