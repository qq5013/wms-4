package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.support.criterion.Criterion;
import org.dddml.wms.specialization.*;

public abstract class AbstractOrganizationTreeApplicationService implements OrganizationTreeApplicationService
{
    private OrganizationTreeRepository organizationTreeRepository;

    public OrganizationTreeRepository getOrganizationTreeRepository() {
        return this.organizationTreeRepository; 
    }

    public void setOrganizationTreeRepository(OrganizationTreeRepository organizationTreeRepository) {
        this.organizationTreeRepository = organizationTreeRepository;
    }

    public Iterable<OrganizationState> getRoots(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        return toContentCollection(getOrganizationTreeRepository().getRoots(filter, orders, firstResult, maxResults));
    }

    public Iterable<OrganizationState> getChildren(String parentId, Criterion filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        return toContentCollection(getOrganizationTreeRepository().getChildren(parentId, filter, orders, firstResult, maxResults));
    }

    public Iterable<String> getRootIds(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        return getOrganizationTreeRepository().getRootIds(filter, orders, firstResult, maxResults);
    }

    public Iterable<String> getChildIds(String parentId, Criterion filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        return getOrganizationTreeRepository().getChildIds(parentId, filter, orders, firstResult, maxResults);
    }

    public Iterable<OrganizationState> getRoots(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        return toContentCollection(getOrganizationTreeRepository().getRoots(filter, orders, firstResult, maxResults));
    }

    public Iterable<OrganizationState> getChildren(String parentId, Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        return toContentCollection(getOrganizationTreeRepository().getChildren(parentId, filter, orders, firstResult, maxResults));
    }

    public Iterable<String> getRootIds(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        return getOrganizationTreeRepository().getRootIds(filter, orders, firstResult, maxResults);
    }

    public Iterable<String> getChildIds(String parentId, Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        return getOrganizationTreeRepository().getChildIds(parentId, filter, orders, firstResult, maxResults);
    }

    private static Iterable<OrganizationState> toContentCollection(Iterable<OrganizationTree> trees)
    {
        List<OrganizationState> states = new ArrayList<OrganizationState>();
        for (OrganizationTree t : trees)
        {
            states.add(t.getContent());
        }
        return states;
    }

    public static class SimpleOrganizationTreeApplicationService extends AbstractOrganizationTreeApplicationService
    {
    }


    public static class SimpleOrganizationTree implements OrganizationTree
    {
        private OrganizationState state;

        private OrganizationTreeRepository repository;

        public SimpleOrganizationTree(OrganizationState state, OrganizationTreeRepository repository)
        {
            this.state = state;
            this.repository = repository;
        }

        //@Override
        //public Iterable<OrganizationTree> getOrganizationTreeChildren()
        //{
        //}

        @Override
        public Iterable<Tree<OrganizationState>> getChildren()
        {
            return (Iterable) repository.getChildren(this.state.getOrganizationId(), (Iterable<Map.Entry<String, Object>>)null, null, null, null);
        }

        @Override
        public OrganizationState getContent()
        {
            return state;
        }

    }
}


