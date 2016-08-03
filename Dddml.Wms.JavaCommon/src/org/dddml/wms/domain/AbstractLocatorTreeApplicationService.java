package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.support.criterion.Criterion;
import org.dddml.wms.specialization.*;

public abstract class AbstractLocatorTreeApplicationService implements LocatorTreeApplicationService
{
    private LocatorTreeRepository locatorTreeRepository;

    public LocatorTreeRepository getLocatorTreeRepository() {
        return this.locatorTreeRepository; 
    }

    public void setLocatorTreeRepository(LocatorTreeRepository locatorTreeRepository) {
        this.locatorTreeRepository = locatorTreeRepository;
    }

    public Iterable<LocatorState> getRoots(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        return toContentCollection(getLocatorTreeRepository().getRoots(filter, orders, firstResult, maxResults));
    }

    public Iterable<LocatorState> getChildren(String parentId, Criterion filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        return toContentCollection(getLocatorTreeRepository().getChildren(parentId, filter, orders, firstResult, maxResults));
    }

    public Iterable<String> getRootIds(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        return getLocatorTreeRepository().getRootIds(filter, orders, firstResult, maxResults);
    }

    public Iterable<String> getChildIds(String parentId, Criterion filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        return getLocatorTreeRepository().getChildIds(parentId, filter, orders, firstResult, maxResults);
    }

    public Iterable<LocatorState> getRoots(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        return toContentCollection(getLocatorTreeRepository().getRoots(filter, orders, firstResult, maxResults));
    }

    public Iterable<LocatorState> getChildren(String parentId, Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        return toContentCollection(getLocatorTreeRepository().getChildren(parentId, filter, orders, firstResult, maxResults));
    }

    public Iterable<String> getRootIds(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        return getLocatorTreeRepository().getRootIds(filter, orders, firstResult, maxResults);
    }

    public Iterable<String> getChildIds(String parentId, Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        return getLocatorTreeRepository().getChildIds(parentId, filter, orders, firstResult, maxResults);
    }

    private static Iterable<LocatorState> toContentCollection(Iterable<LocatorTree> trees)
    {
        List<LocatorState> states = new ArrayList<LocatorState>();
        for (LocatorTree t : trees)
        {
            states.add(t.getContent());
        }
        return states;
    }

    public static class SimpleLocatorTreeApplicationService extends AbstractLocatorTreeApplicationService
    {
    }


    public static class SimpleLocatorTree implements LocatorTree
    {
        private LocatorState state;

        private LocatorTreeRepository repository;

        public SimpleLocatorTree(LocatorState state, LocatorTreeRepository repository)
        {
            this.state = state;
            this.repository = repository;
        }

        //@Override
        //public Iterable<LocatorTree> getLocatorTreeChildren()
        //{
        //}

        @Override
        public Iterable<Tree<LocatorState>> getChildren()
        {
            return (Iterable) repository.getChildren(this.state.getLocatorId(), (Iterable<Map.Entry<String, Object>>)null, null, null, null);
        }

        @Override
        public LocatorState getContent()
        {
            return state;
        }

    }
}


