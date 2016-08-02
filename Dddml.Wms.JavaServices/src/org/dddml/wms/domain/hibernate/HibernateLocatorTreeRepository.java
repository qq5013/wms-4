package org.dddml.wms.domain.hibernate;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;
import org.springframework.transaction.annotation.Transactional;

public class HibernateLocatorTreeRepository implements LocatorTreeRepository
{
    private TreeLocatorStateRepository locatorStateRepository;

    public TreeLocatorStateRepository getLocatorStateRepository() {
        return this.locatorStateRepository; 
    }

    public void setLocatorStateRepository(TreeLocatorStateRepository repository) { 
        this.locatorStateRepository = repository; 
    }



    @Transactional(readOnly = true)
    public Iterable<LocatorTree> getRoots(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        Iterable<LocatorState> states = getLocatorStateRepository().getLocatorTreeRoots(filter, orders, firstResult, maxResults);
        return contentStatesToLocatorTreeCollection(states);
    }

    @Transactional(readOnly = true)
    public Iterable<LocatorTree> getChildren(String parentId, Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        Iterable<LocatorState> states = getLocatorStateRepository().getLocatorTreeChildren(parentId, filter, orders, firstResult, maxResults);
        return contentStatesToLocatorTreeCollection(states);
    }

    @Transactional(readOnly = true)
    public Iterable<String> getRootIds(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        Iterable<LocatorState> states = getLocatorStateRepository().getLocatorTreeRoots(filter, orders, firstResult, maxResults);
        return contentStatesToIdCollection(states);
    }

    @Transactional(readOnly = true)
    public Iterable<String> getChildIds(String parentId, Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        Iterable<LocatorState> states = getLocatorStateRepository().getLocatorTreeChildren(parentId, filter, orders, firstResult, maxResults);
        return contentStatesToIdCollection(states);
    }



    @Transactional(readOnly = true)
    public Iterable<LocatorTree> getRoots(org.dddml.support.criterion.Criterion filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        Iterable<LocatorState> states = getLocatorStateRepository().getLocatorTreeRoots(filter, orders, firstResult, maxResults);
        return contentStatesToLocatorTreeCollection(states);
    }

    @Transactional(readOnly = true)
    public Iterable<LocatorTree> getChildren(String parentId, org.dddml.support.criterion.Criterion filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        Iterable<LocatorState> states = getLocatorStateRepository().getLocatorTreeChildren(parentId, filter, orders, firstResult, maxResults);
        return contentStatesToLocatorTreeCollection(states);
    }

    @Transactional(readOnly = true)
    public Iterable<String> getRootIds(org.dddml.support.criterion.Criterion filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        Iterable<LocatorState> states = getLocatorStateRepository().getLocatorTreeRoots(filter, orders, firstResult, maxResults);
        return contentStatesToIdCollection(states);
    }

    @Transactional(readOnly = true)
    public Iterable<String> getChildIds(String parentId, org.dddml.support.criterion.Criterion filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        Iterable<LocatorState> states = getLocatorStateRepository().getLocatorTreeChildren(parentId, filter, orders, firstResult, maxResults);
        return contentStatesToIdCollection(states);
    }


    private Iterable<LocatorTree> contentStatesToLocatorTreeCollection(Iterable<LocatorState> states)
    {
        List<LocatorTree> trees = new ArrayList<LocatorTree>();
        for (LocatorState state : states)
        {
            trees.add(new AbstractLocatorTreeApplicationService.SimpleLocatorTree(state, this));
        }
        return trees;
    }

    private Iterable<String> contentStatesToIdCollection(Iterable<LocatorState> states)
    {
        List<String> ids = new ArrayList<String>();
        for (LocatorState state : states)
        {
            ids.add(state.getLocatorId());
        }
        return ids;
    }



}

