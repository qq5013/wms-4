package org.dddml.wms.domain.hibernate;

import java.util.Date;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.dddml.wms.domain.*;
import org.dddml.wms.specialization.*;

public class HibernateUserClaimStateDao implements UserClaimStateDao
{
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() { return this.sessionFactory; }

    public void setSessionFactory(SessionFactory sessionFactory) { this.sessionFactory = sessionFactory; }

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    //[Transaction(ReadOnly = true)]
    @Override
    public UserClaimState get(UserClaimId id)
    {
        UserClaimState state = (UserClaimState) getCurrentSession().get(AbstractUserClaimState.SimpleUserClaimState.class, id);
        if (state == null)
        {
            state = new AbstractUserClaimState.SimpleUserClaimState();
            state.setUserClaimId(id);
        }
        return state;
    }

    @Override
    public void save(UserClaimState state)
    {
        if(state.getVersion() == null || state.getVersion().equals(UserClaimState.VERSION_ZERO)) {
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

    //[Transaction(ReadOnly = true)]
    @Override
    public Iterable<UserClaimState> findByUserId(String userId)
    {
        Criteria criteria = getCurrentSession().createCriteria(AbstractUserClaimState.SimpleUserClaimState.class);
        Junction partIdCondition = Restrictions.conjunction()
            .add(Restrictions.eq("userClaimId.userId", userId))
            ;
        return criteria.add(partIdCondition).list();
    }

    @Override
    public void delete(UserClaimState state)
    {
        if (state instanceof Saveable)
        {
            Saveable saveable = (Saveable) state;
            saveable.save();
        }
        getCurrentSession().delete(state);
    }

}

