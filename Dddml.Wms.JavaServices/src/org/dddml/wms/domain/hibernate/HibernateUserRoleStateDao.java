package org.dddml.wms.domain.hibernate;

import java.util.Date;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.dddml.wms.domain.*;
import org.dddml.wms.specialization.*;

public class HibernateUserRoleStateDao implements UserRoleStateDao
{
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() { return this.sessionFactory; }

    public void setSessionFactory(SessionFactory sessionFactory) { this.sessionFactory = sessionFactory; }

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    //[Transaction(ReadOnly = true)]
    @Override
    public UserRoleState get(UserRoleId id)
    {
        UserRoleState state = (UserRoleState) getCurrentSession().get(AbstractUserRoleState.SimpleUserRoleState.class, id);
        if (state == null)
        {
            state = new AbstractUserRoleState.SimpleUserRoleState();
            state.setUserRoleId(id);
        }
        return state;
    }

    @Override
    public void save(UserRoleState state)
    {
        if(state.getVersion() == null || state.getVersion().equals(UserRoleState.VERSION_ZERO)) {
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
    public Iterable<UserRoleState> findByUserId(String userId)
    {
        Criteria criteria = getCurrentSession().createCriteria(AbstractUserRoleState.SimpleUserRoleState.class);
        Junction partIdCondition = Restrictions.conjunction()
            .add(Restrictions.eq("userRoleId.userId", userId))
            ;
        return criteria.add(partIdCondition).list();
    }

    @Override
    public void delete(UserRoleState state)
    {
        if (state instanceof Saveable)
        {
            Saveable saveable = (Saveable) state;
            saveable.save();
        }
        getCurrentSession().delete(state);
    }

}

