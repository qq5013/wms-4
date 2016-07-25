package org.dddml.wms.domain.hibernate;

import java.util.Date;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.dddml.wms.domain.*;
import org.dddml.wms.specialization.*;

public class HibernateUserLoginStateDao implements UserLoginStateDao
{
    public SessionFactory sessionFactory;

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    //[Transaction(ReadOnly = true)]
    @Override
    public UserLoginState get(UserLoginId id)
    {
        UserLoginState state = (UserLoginState) getCurrentSession().get(AbstractUserLoginState.SimpleUserLoginState.class, id);
        if (state == null)
        {
            state = new AbstractUserLoginState.SimpleUserLoginState();
            state.setUserLoginId(id);
        }
        return state;
    }

    @Override
    public void save(UserLoginState state)
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
    public Iterable<UserLoginState> findByUserId(String userId)
    {
        Criteria criteria = getCurrentSession().createCriteria(AbstractUserLoginState.SimpleUserLoginState.class);
        Junction partIdCondition = Restrictions.conjunction()
            .add(Restrictions.eq("userLoginId.userId", userId))
            ;
        return criteria.add(partIdCondition).list();
    }

    @Override
    public void delete(UserLoginState state)
    {
        if (state instanceof Saveable)
        {
            Saveable saveable = (Saveable) state;
            saveable.save();
        }
        getCurrentSession().delete(state);
    }

}

