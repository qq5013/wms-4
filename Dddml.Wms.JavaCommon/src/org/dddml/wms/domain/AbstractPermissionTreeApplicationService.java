package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.support.criterion.Criterion;
import org.dddml.wms.specialization.*;

public abstract class AbstractPermissionTreeApplicationService implements PermissionTreeApplicationService
{
    private PermissionTreeRepository permissionTreeRepository;

    public PermissionTreeRepository getPermissionTreeRepository() {
        return this.permissionTreeRepository; 
    }

    public void setPermissionTreeRepository(PermissionTreeRepository permissionTreeRepository) {
        this.permissionTreeRepository = permissionTreeRepository;
    }

    public Iterable<PermissionState> getRoots(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        return toContentCollection(getPermissionTreeRepository().getRoots(filter, orders, firstResult, maxResults));
    }

    public Iterable<PermissionState> getChildren(String parentId, Criterion filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        return toContentCollection(getPermissionTreeRepository().getChildren(parentId, filter, orders, firstResult, maxResults));
    }

    public Iterable<String> getRootIds(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        return getPermissionTreeRepository().getRootIds(filter, orders, firstResult, maxResults);
    }

    public Iterable<String> getChildIds(String parentId, Criterion filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        return getPermissionTreeRepository().getChildIds(parentId, filter, orders, firstResult, maxResults);
    }

    public Iterable<PermissionState> getRoots(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        return toContentCollection(getPermissionTreeRepository().getRoots(filter, orders, firstResult, maxResults));
    }

    public Iterable<PermissionState> getChildren(String parentId, Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        return toContentCollection(getPermissionTreeRepository().getChildren(parentId, filter, orders, firstResult, maxResults));
    }

    public Iterable<String> getRootIds(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        return getPermissionTreeRepository().getRootIds(filter, orders, firstResult, maxResults);
    }

    public Iterable<String> getChildIds(String parentId, Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults)
    {
        return getPermissionTreeRepository().getChildIds(parentId, filter, orders, firstResult, maxResults);
    }

    private static Iterable<PermissionState> toContentCollection(Iterable<PermissionTree> trees)
    {
        List<PermissionState> states = new ArrayList<PermissionState>();
        for (PermissionTree t : trees)
        {
            states.add(t.getContent());
        }
        return states;
    }

    public static class SimplePermissionTreeApplicationService extends AbstractPermissionTreeApplicationService
    {
    }


    public static class SimplePermissionTree implements PermissionTree
    {
        private PermissionState state;

        private PermissionTreeRepository repository;

        public SimplePermissionTree(PermissionState state, PermissionTreeRepository repository)
        {
            this.state = state;
            this.repository = repository;
        }

        //@Override
        //public Iterable<PermissionTree> getPermissionTreeChildren()
        //{
        //}

        @Override
        public Iterable<Tree<PermissionState>> getChildren()
        {
            return (Iterable) repository.getChildren(this.state.getPermissionId(), (Iterable<Map.Entry<String, Object>>)null, null, null, null);
        }

        @Override
        public PermissionState getContent()
        {
            return state;
        }

    }
}


