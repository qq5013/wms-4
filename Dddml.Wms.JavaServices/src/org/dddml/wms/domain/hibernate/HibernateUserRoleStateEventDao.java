package org.dddml.wms.domain.hibernate;

import java.util.Date;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.dddml.wms.domain.*;
import org.dddml.wms.specialization.*;

public class HibernateUserRoleStateEventDao implements UserRoleStateEventDao
{
    public SessionFactory sessionFactory;

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public void save(UserRoleStateEvent e)
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
    public Iterable<UserRoleStateEvent> findByUserStateEventId(UserStateEventId userStateEventId)
    {
        Criteria criteria = getCurrentSession().createCriteria(AbstractUserRoleStateEvent.class);
        Junction partIdCondition = Restrictions.conjunction()
            .add(Restrictions.eq("stateEventId.userId", userStateEventId.getUserId()))
            .add(Restrictions.eq("stateEventId.userVersion", userStateEventId.getVersion()))
            ;
        return criteria.add(partIdCondition).list();
    }

}

