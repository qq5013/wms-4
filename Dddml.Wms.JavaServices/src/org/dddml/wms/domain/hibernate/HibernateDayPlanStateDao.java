package org.dddml.wms.domain.hibernate;

import java.util.Date;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.dddml.wms.domain.*;
import org.dddml.wms.specialization.*;
import org.springframework.transaction.annotation.Transactional;

public class HibernateDayPlanStateDao implements DayPlanStateDao
{
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() { return this.sessionFactory; }

    public void setSessionFactory(SessionFactory sessionFactory) { this.sessionFactory = sessionFactory; }

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Transactional(readOnly = true)
    @Override
    public DayPlanState get(DayPlanId id)
    {
        DayPlanState state = (DayPlanState) getCurrentSession().get(AbstractDayPlanState.SimpleDayPlanState.class, id);
        if (state == null)
        {
            state = new AbstractDayPlanState.SimpleDayPlanState();
            state.setDayPlanId(id);
        }
        return state;
    }

    @Override
    public void save(DayPlanState state)
    {
        if(state.getVersion() == null) {
            getCurrentSession().save(state);
        }else {
            getCurrentSession().update(state);
        }

        if (state instanceof Saveable)
        {
            Saveable saveable = (Saveable) state;
            saveable.save();
        }
    }

    @Transactional(readOnly = true)
    @Override
    public Iterable<DayPlanState> findByPersonalNameAndYearAndMonth(PersonalName personalName, Integer year, Integer month)
    {
        Criteria criteria = getCurrentSession().createCriteria(AbstractDayPlanState.SimpleDayPlanState.class);
        Junction partIdCondition = Restrictions.conjunction()
            .add(Restrictions.eq("dayPlanId.personalNameFirstName", personalName.getFirstName()))
            .add(Restrictions.eq("dayPlanId.personalNameLastName", personalName.getLastName()))
            .add(Restrictions.eq("dayPlanId.year", year))
            .add(Restrictions.eq("dayPlanId.month", month))
            ;
        return criteria.add(partIdCondition).list();
    }

    @Override
    public void delete(DayPlanState state)
    {
        if (state instanceof Saveable)
        {
            Saveable saveable = (Saveable) state;
            saveable.save();
        }
        getCurrentSession().delete(state);
    }

}

