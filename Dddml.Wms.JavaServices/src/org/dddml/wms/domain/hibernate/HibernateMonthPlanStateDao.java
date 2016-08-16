package org.dddml.wms.domain.hibernate;

import java.util.Date;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.dddml.wms.domain.*;
import org.dddml.wms.specialization.*;
import org.springframework.transaction.annotation.Transactional;

public class HibernateMonthPlanStateDao implements MonthPlanStateDao
{
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() { return this.sessionFactory; }

    public void setSessionFactory(SessionFactory sessionFactory) { this.sessionFactory = sessionFactory; }

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Transactional(readOnly = true)
    @Override
    public MonthPlanState get(MonthPlanId id)
    {
        MonthPlanState state = (MonthPlanState) getCurrentSession().get(AbstractMonthPlanState.SimpleMonthPlanState.class, id);
        if (state == null)
        {
            state = new AbstractMonthPlanState.SimpleMonthPlanState();
            state.setMonthPlanId(id);
        }
        return state;
    }

    @Override
    public void save(MonthPlanState state)
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
    public Iterable<MonthPlanState> findByPersonalNameAndYear(PersonalName personalName, Integer year)
    {
        Criteria criteria = getCurrentSession().createCriteria(AbstractMonthPlanState.SimpleMonthPlanState.class);
        Junction partIdCondition = Restrictions.conjunction()
            .add(Restrictions.eq("monthPlanId.personalNameFirstName", personalName.getFirstName()))
            .add(Restrictions.eq("monthPlanId.personalNameLastName", personalName.getLastName()))
            .add(Restrictions.eq("monthPlanId.year", year))
            ;
        return criteria.add(partIdCondition).list();
    }

    @Override
    public void delete(MonthPlanState state)
    {
        if (state instanceof Saveable)
        {
            Saveable saveable = (Saveable) state;
            saveable.save();
        }
        getCurrentSession().delete(state);
    }

}

