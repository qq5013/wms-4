package org.dddml.wms.domain.hibernate;

import java.util.Date;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.dddml.wms.domain.*;
import org.dddml.wms.specialization.*;
import org.springframework.transaction.annotation.Transactional;

public class HibernateMonthPlanStateEventDao implements MonthPlanStateEventDao
{
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() { return this.sessionFactory; }

    public void setSessionFactory(SessionFactory sessionFactory) { this.sessionFactory = sessionFactory; }

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public void save(MonthPlanStateEvent e)
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
    public Iterable<MonthPlanStateEvent> findByYearPlanStateEventId(YearPlanStateEventId yearPlanStateEventId)
    {
        Criteria criteria = getCurrentSession().createCriteria(AbstractMonthPlanStateEvent.class);
        Junction partIdCondition = Restrictions.conjunction()
            .add(Restrictions.eq("stateEventId.personalNameFirstName", yearPlanStateEventId.getPersonalName().getFirstName()))
            .add(Restrictions.eq("stateEventId.personalNameLastName", yearPlanStateEventId.getPersonalName().getLastName()))
            .add(Restrictions.eq("stateEventId.year", yearPlanStateEventId.getYear()))
            .add(Restrictions.eq("stateEventId.personVersion", yearPlanStateEventId.getPersonVersion()))
            ;
        return criteria.add(partIdCondition).list();
    }

}

