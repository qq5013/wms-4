package org.dddml.wms.domain.hibernate;

import java.util.Date;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.dddml.wms.domain.*;
import org.dddml.wms.specialization.*;

public class HibernateUserClaimStateDao implements UserClaimStateDao
{
    public SessionFactory sessionFactory;

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    //[Transaction(ReadOnly = true)]
    @Override
    public UserClaimState get(UserClaimId id)
    {
        UserClaimState state = (UserClaimState) getCurrentSession().get(UserClaimState.class, id);
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
        getCurrentSession().saveOrUpdate(state);
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
        Criteria criteria = getCurrentSession().createCriteria(UserClaimState.class);
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
