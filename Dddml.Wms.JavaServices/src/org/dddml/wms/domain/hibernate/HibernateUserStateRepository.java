package org.dddml.wms.domain.hibernate;

import java.util.*;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projections;
import org.hibernate.SessionFactory;
import org.dddml.wms.domain.*;
import org.dddml.wms.specialization.*;
import org.dddml.wms.specialization.hibernate.*;
import org.springframework.transaction.annotation.Transactional;

public class HibernateUserStateRepository implements UserStateRepository
{
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() { return this.sessionFactory; }

    public void setSessionFactory(SessionFactory sessionFactory) { this.sessionFactory = sessionFactory; }

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }
    
    @Transactional(readOnly = true)
    public UserState get(String id)
    {
        UserState state = (UserState)getCurrentSession().get(AbstractUserState.SimpleUserState.class, id);
        if (state == null) {
            state = new AbstractUserState.SimpleUserState();
            state.setUserId(id);
        }
        return state;
    }

    @Transactional(readOnly = true)
    public Iterable<UserState> getAll(Integer firstResult, Integer maxResults)
    {
        Criteria criteria = getCurrentSession().createCriteria(AbstractUserState.SimpleUserState.class);
        if (firstResult != null) { criteria.setFirstResult(firstResult); }
        if (maxResults != null) { criteria.setMaxResults(maxResults); }
         addNotDeletedRestriction(criteria);
        return criteria.list();
    }

    public void save(UserState state)
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
    public Iterable<UserState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        Criteria criteria = getCurrentSession().createCriteria(UserState.class);

        HibernateUtils.criteriaAddFilterAndOrdersAndSetFirstResultAndMaxResults(criteria, filter, orders, firstResult, maxResults);
        addNotDeletedRestriction(criteria);
        return criteria.list();
    }

    @Transactional(readOnly = true)
    public Iterable<UserState> get(org.dddml.support.criterion.Criterion filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        Criteria criteria = getCurrentSession().createCriteria(UserState.class);

        HibernateUtils.criteriaAddFilterAndOrdersAndSetFirstResultAndMaxResults(criteria, filter, orders, firstResult, maxResults);
        addNotDeletedRestriction(criteria);
        return criteria.list();
    }

    @Transactional(readOnly = true)
    public UserState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders)
    {
        List<UserState> list = (List<UserState>)get(filter, orders, 0, 1);
        if (list == null || list.size() <= 0)
        {
            return null;
        }
        return list.get(0);
    }

    @Transactional(readOnly = true)
    public UserState getFirst(Map.Entry<String, Object> keyValue, List<String> orders)
    {
        List<Map.Entry<String, Object>> filter = new ArrayList<>();
        filter.add(keyValue);
        return getFirst(filter, orders);
    }

    @Transactional(readOnly = true)
    public Iterable<UserState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults)
    {
        Map.Entry<String, Object> keyValue = new java.util.AbstractMap.SimpleEntry<String, Object> (propertyName, propertyValue);
        List<Map.Entry<String, Object>> filter = new ArrayList<Map.Entry<String, Object>>();
        filter.add(keyValue);
        return get(filter, orders, firstResult, maxResults);
    }

    @Transactional(readOnly = true)
    public long getCount(Iterable<Map.Entry<String, Object>> filter)
    {
        Criteria criteria = getCurrentSession().createCriteria(UserState.class);
        criteria.setProjection(Projections.rowCount());
        if (filter != null) {
            HibernateUtils.criteriaAddFilter(criteria, filter);
        }
        addNotDeletedRestriction(criteria);
        return (long)criteria.uniqueResult();
    }

    @Transactional(readOnly = true)
    public long getCount(org.dddml.support.criterion.Criterion filter)
    {
        Criteria criteria = getCurrentSession().createCriteria(UserState.class);
        criteria.setProjection(Projections.rowCount());
        if (filter != null)
        {
            org.hibernate.criterion.Criterion hc = CriterionUtils.toHibernateCriterion(filter);
            criteria.add(hc);
        }
        addNotDeletedRestriction(criteria);
        return (long)criteria.uniqueResult();
    }

    @Transactional(readOnly = true)
    public UserRoleState getUserRole(String userId, String roleId)
    {
        UserRoleId entityId = new UserRoleId(userId, roleId);
        return (UserRoleState) getCurrentSession().get(AbstractUserRoleState.SimpleUserRoleState.class, entityId);
    }

    @Transactional(readOnly = true)
    public UserClaimState getUserClaim(String userId, Integer claimId)
    {
        UserClaimId entityId = new UserClaimId(userId, claimId);
        return (UserClaimState) getCurrentSession().get(AbstractUserClaimState.SimpleUserClaimState.class, entityId);
    }

    @Transactional(readOnly = true)
    public UserPermissionState getUserPermission(String userId, String permissionId)
    {
        UserPermissionId entityId = new UserPermissionId(userId, permissionId);
        return (UserPermissionState) getCurrentSession().get(AbstractUserPermissionState.SimpleUserPermissionState.class, entityId);
    }

    @Transactional(readOnly = true)
    public UserLoginState getUserLogin(String userId, LoginKey loginKey)
    {
        UserLoginId entityId = new UserLoginId(userId, loginKey);
        return (UserLoginState) getCurrentSession().get(AbstractUserLoginState.SimpleUserLoginState.class, entityId);
    }


    protected static void addNotDeletedRestriction(Criteria criteria)
    {
        criteria.add(org.hibernate.criterion.Restrictions.eq("deleted", false));
    }

}

