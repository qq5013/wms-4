package org.dddml.wms.domain.hibernate;

import java.util.Date;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.dddml.wms.domain.*;
import org.dddml.wms.specialization.*;
import org.springframework.transaction.annotation.Transactional;

public class HibernateDayPlanStateEventDao implements DayPlanStateEventDao
{
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() { return this.sessionFactory; }

    public void setSessionFactory(SessionFactory sessionFactory) { this.sessionFactory = sessionFactory; }

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public void save(DayPlanStateEvent e)
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
    public Iterable<DayPlanStateEvent> findByMonthPlanStateEventId(MonthPlanStateEventId monthPlanStateEventId)
    {
        Criteria criteria = getCurrentSession().createCriteria(AbstractDayPlanStateEvent.class);
        Junction partIdCondition = Restrictions.conjunction()
            .add(Restrictions.eq("stateEventId.personalNameFirstName", monthPlanStateEventId.getPersonalName().getFirstName()))
            .add(Restrictions.eq("stateEventId.personalNameLastName", monthPlanStateEventId.getPersonalName().getLastName()))
            .add(Restrictions.eq("stateEventId.year", monthPlanStateEventId.getYear()))
            .add(Restrictions.eq("stateEventId.month", monthPlanStateEventId.getMonth()))
            .add(Restrictions.eq("stateEventId.personVersion", monthPlanStateEventId.getPersonVersion()))
            ;
        return criteria.add(partIdCondition).list();
    }

}

