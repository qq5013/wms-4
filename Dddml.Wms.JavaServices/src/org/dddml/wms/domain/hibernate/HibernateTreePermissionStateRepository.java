// <autogenerated>
//   This file was generated by T4 code generator GenerateBoundedContextDomainNHibernateAggregates.tt.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.dddml.wms.domain.hibernate;

import java.util.*;
import org.hibernate.*;
import org.hibernate.criterion.*;
import java.util.Date;
import org.dddml.support.criterion.Criterion;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;
import org.dddml.wms.specialization.hibernate.*;
import org.springframework.transaction.annotation.Transactional;

public class HibernateTreePermissionStateRepository extends HibernatePermissionStateRepository implements TreePermissionStateRepository
{
    @Transactional(readOnly = true)
    public Iterable<PermissionState> getPermissionTreeRoots(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        Criteria criteria = getCurrentSession().createCriteria(PermissionState.class);

        criteriaAddRootParentIdCriterion(criteria);
        HibernateUtils.criteriaAddFilterAndOrdersAndSetFirstResultAndMaxResults(criteria, filter, orders, firstResult, maxResults);
        return criteria.list();
    }

    @Transactional(readOnly = true)
    public Iterable<PermissionState> getPermissionTreeChildren(String parentId, Criterion filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        Criteria criteria = getCurrentSession().createCriteria(PermissionState.class);

        HibernateUtils.criteriaAddCriterion(criteria, "parentPermissionId", parentId);
        HibernateUtils.criteriaAddFilterAndOrdersAndSetFirstResultAndMaxResults(criteria, filter, orders, firstResult, maxResults);
        return criteria.list();
    }

    @Transactional(readOnly = true)
    public Iterable<PermissionState> getPermissionTreeRoots(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        Criteria criteria = getCurrentSession().createCriteria(PermissionState.class);

        criteriaAddRootParentIdCriterion(criteria);
        HibernateUtils.criteriaAddFilterAndOrdersAndSetFirstResultAndMaxResults(criteria, filter, orders, firstResult, maxResults);
        return criteria.list();
    }

    @Transactional(readOnly = true)
    public Iterable<PermissionState> getPermissionTreeChildren(String parentId, Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        Criteria criteria = getCurrentSession().createCriteria(PermissionState.class);

        HibernateUtils.criteriaAddCriterion(criteria, "parentPermissionId", parentId);
        HibernateUtils.criteriaAddFilterAndOrdersAndSetFirstResultAndMaxResults(criteria, filter, orders, firstResult, maxResults);
        return criteria.list();
    }

    private void criteriaAddRootParentIdCriterion(Criteria criteria)
    {
        Object[] rootParentIdValues = new Object[] { null, "" };
        if (rootParentIdValues.length == 1)
        {
            HibernateUtils.criteriaAddCriterion(criteria, "parentPermissionId", rootParentIdValues[0]);
        }
        else
        {
            Disjunction j = Restrictions.disjunction();
            for (Object pIdValue : rootParentIdValues)
            {
                HibernateUtils.disjunctionAddCriterion(j, "parentPermissionId", pIdValue);
            }
            criteria.add(j);
        }
    }
}

