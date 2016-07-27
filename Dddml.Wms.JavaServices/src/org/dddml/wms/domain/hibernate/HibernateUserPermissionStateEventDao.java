package org.dddml.wms.domain.hibernate;

import java.util.Date;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.dddml.wms.domain.*;
import org.dddml.wms.specialization.*;

public class HibernateUserPermissionStateEventDao implements UserPermissionStateEventDao
{
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() { return this.sessionFactory; }

    public void setSessionFactory(SessionFactory sessionFactory) { this.sessionFactory = sessionFactory; }

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public void save(UserPermissionStateEvent e)
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
    public Iterable<UserPermissionStateEvent> findByUserStateEventId(UserStateEventId userStateEventId)
    {
        Criteria criteria = getCurrentSession().createCriteria(AbstractUserPermissionStateEvent.class);
        Junction partIdCondition = Restrictions.conjunction()
            .add(Restrictions.eq("stateEventId.userId", userStateEventId.getUserId()))
            .add(Restrictions.eq("stateEventId.userVersion", userStateEventId.getVersion()))
            ;
        return criteria.add(partIdCondition).list();
    }

}

