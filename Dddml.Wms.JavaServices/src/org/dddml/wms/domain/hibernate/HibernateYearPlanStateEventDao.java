package org.dddml.wms.domain.hibernate;

import java.util.Date;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.dddml.wms.domain.*;
import org.dddml.wms.specialization.*;
import org.springframework.transaction.annotation.Transactional;

public class HibernateYearPlanStateEventDao implements YearPlanStateEventDao
{
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() { return this.sessionFactory; }

    public void setSessionFactory(SessionFactory sessionFactory) { this.sessionFactory = sessionFactory; }

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public void save(YearPlanStateEvent e)
    {
        getCurrentSession().save(e);
        if (e instanceof Saveable)
        {
            Saveable saveable = (Saveable) e;
            saveable.save();
        }
    }


    @Transactional(readOnly = true)
    @Override
    public Iterable<YearPlanStateEvent> findByPersonStateEventId(PersonStateEventId personStateEventId)
    {
        Criteria criteria = getCurrentSession().createCriteria(AbstractYearPlanStateEvent.class);
        Junction partIdCondition = Restrictions.conjunction()
            .add(Restrictions.eq("stateEventId.personalNameFirstName", personStateEventId.getPersonalName().getFirstName()))
            .add(Restrictions.eq("stateEventId.personalNameLastName", personStateEventId.getPersonalName().getLastName()))
            .add(Restrictions.eq("stateEventId.personVersion", personStateEventId.getVersion()))
            ;
        return criteria.add(partIdCondition).list();
    }

}

