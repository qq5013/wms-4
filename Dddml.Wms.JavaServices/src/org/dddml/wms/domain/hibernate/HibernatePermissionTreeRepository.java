package org.dddml.wms.domain.hibernate;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;
import org.springframework.transaction.annotation.Transactional;

public class HibernatePermissionTreeRepository implements PermissionTreeRepository
{
    private TreePermissionStateRepository permissionStateRepository;

    public TreePermissionStateRepository getPermissionStateRepository() {
        return this.permissionStateRepository; 
    }

    public void setPermissionStateRepository(TreePermissionStateRepository repository) { 
        this.permissionStateRepository = repository; 
    }



    @Transactional(readOnly = true)
    public Iterable<PermissionTree> getRoots(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        Iterable<PermissionState> states = getPermissionStateRepository().getPermissionTreeRoots(filter, orders, firstResult, maxResults);
        return contentStatesToPermissionTreeCollection(states);
    }

    @Transactional(readOnly = true)
    public Iterable<PermissionTree> getChildren(String parentId, Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        Iterable<PermissionState> states = getPermissionStateRepository().getPermissionTreeChildren(parentId, filter, orders, firstResult, maxResults);
        return contentStatesToPermissionTreeCollection(states);
    }

    @Transactional(readOnly = true)
    public Iterable<String> getRootIds(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        Iterable<PermissionState> states = getPermissionStateRepository().getPermissionTreeRoots(filter, orders, firstResult, maxResults);
        return contentStatesToIdCollection(states);
    }

    @Transactional(readOnly = true)
    public Iterable<String> getChildIds(String parentId, Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        Iterable<PermissionState> states = getPermissionStateRepository().getPermissionTreeChildren(parentId, filter, orders, firstResult, maxResults);
        return contentStatesToIdCollection(states);
    }



    @Transactional(readOnly = true)
    public Iterable<PermissionTree> getRoots(org.dddml.support.criterion.Criterion filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        Iterable<PermissionState> states = getPermissionStateRepository().getPermissionTreeRoots(filter, orders, firstResult, maxResults);
        return contentStatesToPermissionTreeCollection(states);
    }

    @Transactional(readOnly = true)
    public Iterable<PermissionTree> getChildren(String parentId, org.dddml.support.criterion.Criterion filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        Iterable<PermissionState> states = getPermissionStateRepository().getPermissionTreeChildren(parentId, filter, orders, firstResult, maxResults);
        return contentStatesToPermissionTreeCollection(states);
    }

    @Transactional(readOnly = true)
    public Iterable<String> getRootIds(org.dddml.support.criterion.Criterion filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        Iterable<PermissionState> states = getPermissionStateRepository().getPermissionTreeRoots(filter, orders, firstResult, maxResults);
        return contentStatesToIdCollection(states);
    }

    @Transactional(readOnly = true)
    public Iterable<String> getChildIds(String parentId, org.dddml.support.criterion.Criterion filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        Iterable<PermissionState> states = getPermissionStateRepository().getPermissionTreeChildren(parentId, filter, orders, firstResult, maxResults);
        return contentStatesToIdCollection(states);
    }


    private Iterable<PermissionTree> contentStatesToPermissionTreeCollection(Iterable<PermissionState> states)
    {
        List<PermissionTree> trees = new ArrayList<PermissionTree>();
        for (PermissionState state : states)
        {
            trees.add(new AbstractPermissionTreeApplicationService.SimplePermissionTree(state, this));
        }
        return trees;
    }

    private Iterable<String> contentStatesToIdCollection(Iterable<PermissionState> states)
    {
        List<String> ids = new ArrayList<String>();
        for (PermissionState state : states)
        {
            ids.add(state.getPermissionId());
        }
        return ids;
    }



}

