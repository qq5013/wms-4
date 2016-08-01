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
import org.dddml.wms.specialization.hibernate.CriterionUtils;
import org.springframework.transaction.annotation.Transactional;

public class HibernateLocatorStateRepository implements LocatorStateRepository
{
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() { return this.sessionFactory; }

    public void setSessionFactory(SessionFactory sessionFactory) { this.sessionFactory = sessionFactory; }

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }
    
    @Transactional(readOnly = true)
    public LocatorState get(String id)
    {
        LocatorState state = (LocatorState)getCurrentSession().get(AbstractLocatorState.SimpleLocatorState.class, id);
        if (state == null) {
            state = new AbstractLocatorState.SimpleLocatorState();
            state.setLocatorId(id);
        }
        return state;
    }

    @Transactional(readOnly = true)
    public Iterable<LocatorState> getAll(Integer firstResult, Integer maxResults)
    {
        Criteria criteria = getCurrentSession().createCriteria(AbstractLocatorState.SimpleLocatorState.class);
        if (firstResult != null) { criteria.setFirstResult(firstResult); }
        if (maxResults != null) { criteria.setMaxResults(maxResults); }
         addNotDeletedRestriction(criteria);
        return criteria.list();
    }

    public void save(LocatorState state)
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
    public Iterable<LocatorState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        Criteria criteria = getCurrentSession().createCriteria(LocatorState.class);

        criteriaAddFilterAndOrdersAndSetFirstResultAndMaxResults(criteria, filter, orders, firstResult, maxResults);
        addNotDeletedRestriction(criteria);
        return criteria.list();
    }

    @Transactional(readOnly = true)
    public Iterable<LocatorState> get(org.dddml.support.criterion.Criterion filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        Criteria criteria = getCurrentSession().createCriteria(LocatorState.class);

        criteriaAddFilterAndOrdersAndSetFirstResultAndMaxResults(criteria, filter, orders, firstResult, maxResults);
        addNotDeletedRestriction(criteria);
        return criteria.list();
    }

    @Transactional(readOnly = true)
    public LocatorState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders)
    {
        List<LocatorState> list = (List<LocatorState>)get(filter, orders, 0, 1);
        if (list == null || list.size() <= 0)
        {
            return null;
        }
        return list.get(0);
    }

    @Transactional(readOnly = true)
    public LocatorState getFirst(Map.Entry<String, Object> keyValue, List<String> orders)
    {
        List<Map.Entry<String, Object>> filter = new ArrayList<>();
        filter.add(keyValue);
        return getFirst(filter, orders);
    }

    @Transactional(readOnly = true)
    public Iterable<LocatorState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults)
    {
        Map.Entry<String, Object> keyValue = new java.util.AbstractMap.SimpleEntry<String, Object> (propertyName, propertyValue);
        List<Map.Entry<String, Object>> filter = new ArrayList<Map.Entry<String, Object>>();
        filter.add(keyValue);
        return get(filter, orders, firstResult, maxResults);
    }

    @Transactional(readOnly = true)
    public long getCount(Iterable<Map.Entry<String, Object>> filter)
    {
        Criteria criteria = getCurrentSession().createCriteria(LocatorState.class);
        criteria.setProjection(Projections.rowCount());
        if (filter != null) {
            criteriaAddFilter(criteria, filter);
        }
        addNotDeletedRestriction(criteria);
        return (long)criteria.uniqueResult();
    }

    @Transactional(readOnly = true)
    public long getCount(org.dddml.support.criterion.Criterion filter)
    {
        Criteria criteria = getCurrentSession().createCriteria(LocatorState.class);
        criteria.setProjection(Projections.rowCount());
        if (filter != null)
        {
            org.hibernate.criterion.Criterion hc = CriterionUtils.toHibernateCriterion(filter);
            criteria.add(hc);
        }
        addNotDeletedRestriction(criteria);
        return (long)criteria.uniqueResult();
    }


    protected static void addNotDeletedRestriction(Criteria criteria)
    {
        criteria.add(org.hibernate.criterion.Restrictions.eq("deleted", false));
    }

    protected void criteriaAddFilterAndOrdersAndSetFirstResultAndMaxResults(Criteria criteria, Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        if (filter != null)
        {
            criteriaAddFilter(criteria, filter);
        }
        criteriaAddOrdersAndSetFirstResultAndMaxResults(criteria, orders, firstResult, maxResults);
    }

    protected void criteriaAddFilter(Criteria criteria, Iterable<Map.Entry<String, Object>> filter)
    {
        for (Map.Entry<String, Object> p : filter)
        {
            criteriaAddFilterPair(criteria, p);
        }
    }

    protected void criteriaAddFilterPair(Criteria criteria, Map.Entry<String, Object> filterPair)
    {
        if (filterPair.getValue() == null)
        {
            criteria.add(org.hibernate.criterion.Restrictions.isNull(filterPair.getKey()));
        }
        else
        {
            criteria.add(org.hibernate.criterion.Restrictions.eq(filterPair.getKey(), filterPair.getValue()));
        }
    }

    protected static void criteriaAddOrders(Criteria criteria, List<String> orders)
    {
        for (String order : orders)
        {
            boolean isDesc = order.startsWith("-");
            String pName = isDesc ? order.substring(1) : order;
            criteria.addOrder(isDesc ? Order.desc(pName) : Order.asc(pName));
        }
    }

    protected void disjunctionAddCriterion(org.hibernate.criterion.Disjunction disjunction, String propertyName, Object propertyValue)
    {
        if (propertyValue == null)
        {
            disjunction.add(org.hibernate.criterion.Restrictions.isNull(propertyName));
        }
        else
        {
            disjunction.add(org.hibernate.criterion.Restrictions.eq(propertyName, propertyValue));
        }
    }

    protected void criteriaAddCriterion(Criteria criteria, String propertyName, Object propertyValue)
    {
        if (propertyValue == null)
        {
            criteria.add(org.hibernate.criterion.Restrictions.isNull(propertyName));
        }
        else
        {
            criteria.add(org.hibernate.criterion.Restrictions.eq(propertyName, propertyValue));
        }
    }

    private static void criteriaAddFilterAndOrdersAndSetFirstResultAndMaxResults(Criteria criteria, org.dddml.support.criterion.Criterion filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        criteriaAddFilterAndSetFirstResultAndMaxResults(criteria, filter, firstResult, maxResults);
        if (orders != null)
        {
            criteriaAddOrders(criteria, orders);
        }
    }
        
    private static void criteriaAddOrdersAndSetFirstResultAndMaxResults(Criteria criteria, List<String> orders, Integer firstResult, Integer maxResults)
    {
        if (orders != null)
        {
            criteriaAddOrders(criteria, orders);
        }

        if (firstResult != null) { criteria.setFirstResult(firstResult); }
        if (maxResults != null) { criteria.setMaxResults(maxResults); }
    }

    private static void criteriaAddFilterAndSetFirstResultAndMaxResults(Criteria criteria, org.dddml.support.criterion.Criterion filter, Integer firstResult, Integer maxResults)
    {
        if (filter != null)
        {
            org.hibernate.criterion.Criterion hc = CriterionUtils.toHibernateCriterion(filter);
            criteria.add(hc);
        }
        if (firstResult != null) { criteria.setFirstResult(firstResult); }
        if (maxResults != null) { criteria.setMaxResults(maxResults); }
    }

}

