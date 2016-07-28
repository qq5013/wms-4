package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.ApplicationContext;

public abstract class AbstractUserPermissionStates implements UserPermissionStates
{
    protected UserPermissionStateDao getUserPermissionStateDao()
    {
        return (UserPermissionStateDao)ApplicationContext.current.get("UserPermissionStateDao");
    }

    private UserState userState;

    private Map<UserPermissionId, UserPermissionState> loadedUserPermissionStates = new HashMap<UserPermissionId, UserPermissionState>();

    private List<UserPermissionState> removedUserPermissionStates = new ArrayList<UserPermissionState>();

    protected Iterable<UserPermissionState> getLoadedUserPermissionStates() {
        return this.loadedUserPermissionStates.values();
    }

    private Iterable<UserPermissionState> innerIterable;

    protected Iterable<UserPermissionState> getInnerIterable()
    {
        if (innerIterable == null)
        {
            innerIterable = getUserPermissionStateDao().findByUserId(userState.getUserId());
        }
        return innerIterable;
    }

    public AbstractUserPermissionStates(UserState outerState)
    {
        this.userState = outerState;
    }

    @Override
    public Iterator<UserPermissionState> iterator() {
        return getInnerIterable().iterator();
    }

    public UserPermissionState get(String permissionId)
    {
        UserPermissionId globalId = new UserPermissionId(userState.getUserId(), permissionId);
        if (loadedUserPermissionStates.containsKey(globalId)) {
            return loadedUserPermissionStates.get(globalId);
        }
        UserPermissionState state = getUserPermissionStateDao().get(globalId);
        loadedUserPermissionStates.put(globalId, state);
        return state;
    }

    public void remove(UserPermissionState state)
    {
        this.removedUserPermissionStates.add(state);
    }

    public void addToSave(UserPermissionState state)
    {
        this.loadedUserPermissionStates.put(state.getUserPermissionId(), state);
    }

    //region Saveable Implements

    public void save ()
    {
        for (UserPermissionState s : this.getLoadedUserPermissionStates()) {
            getUserPermissionStateDao().save(s);
        }
        for (UserPermissionState s : this.removedUserPermissionStates) {
            getUserPermissionStateDao().delete(s);
        }
    }

    //endregion

}


