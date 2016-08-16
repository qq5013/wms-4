package org.dddml.wms.domain.hibernate;

import java.util.Date;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.dddml.wms.domain.*;
import org.dddml.wms.specialization.*;
import org.springframework.transaction.annotation.Transactional;

public class HibernateYearPlanStateDao implements YearPlanStateDao
{
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() { return this.sessionFactory; }

    public void setSessionFactory(SessionFactory sessionFactory) { this.sessionFactory = sessionFactory; }

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Transactional(readOnly = true)
    @Override
    public YearPlanState get(YearPlanId id)
    {
        YearPlanState state = (YearPlanState) getCurrentSession().get(AbstractYearPlanState.SimpleYearPlanState.class, id);
        if (state == null)
        {
            state = new AbstractYearPlanState.SimpleYearPlanState();
            state.setYearPlanId(id);
        }
        return state;
    }

    @Override
    public void save(YearPlanState state)
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
    public Iterable<YearPlanState> findByPersonalName(PersonalName personalName)
    {
        Criteria criteria = getCurrentSession().createCriteria(AbstractYearPlanState.SimpleYearPlanState.class);
        Junction partIdCondition = Restrictions.conjunction()
            .add(Restrictions.eq("yearPlanId.personalNameFirstName", personalName.getFirstName()))
            .add(Restrictions.eq("yearPlanId.personalNameLastName", personalName.getLastName()))
            ;
        return criteria.add(partIdCondition).list();
    }

    @Override
    public void delete(YearPlanState state)
    {
        if (state instanceof Saveable)
        {
            Saveable saveable = (Saveable) state;
            saveable.save();
        }
        getCurrentSession().delete(state);
    }

}

