package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.ApplicationContext;

public abstract class AbstractUserRoleStates implements UserRoleStates
{
    protected UserRoleStateDao getUserRoleStateDao()
    {
        return (UserRoleStateDao)ApplicationContext.current.get("UserRoleStateDao");
    }

    private UserState userState;

    private Map<UserRoleId, UserRoleState> loadedUserRoleStates = new HashMap<UserRoleId, UserRoleState>();

    private List<UserRoleState> removedUserRoleStates = new ArrayList<UserRoleState>();

    protected Iterable<UserRoleState> getLoadedUserRoleStates() {
        return this.loadedUserRoleStates.values();
    }

    private Iterable<UserRoleState> innerIterable;

    protected Iterable<UserRoleState> getInnerIterable()
    {
        if (innerIterable == null)
        {
            innerIterable = getUserRoleStateDao().findByUserId(userState.getUserId());
        }
        return innerIterable;
    }

    public AbstractUserRoleStates(UserState outerState)
    {
        this.userState = outerState;
    }

    @Override
    public Iterator<UserRoleState> iterator() {
        return innerIterable.iterator();
    }

    public UserRoleState get(String roleId)
    {
        UserRoleId globalId = new UserRoleId(userState.getUserId(), roleId);
        if (loadedUserRoleStates.containsKey(globalId)) {
            return loadedUserRoleStates.get(globalId);
        }
        UserRoleState state = getUserRoleStateDao().get(globalId);
        loadedUserRoleStates.put(globalId, state);
        return state;
    }

    public void remove(UserRoleState state)
    {
        this.removedUserRoleStates.add(state);
    }

    public void addToSave(UserRoleState state)
    {
        this.loadedUserRoleStates.put(state.getUserRoleId(), state);
    }

    //region Saveable Implements

    public void save ()
    {
        for (UserRoleState s : this.getLoadedUserRoleStates()) {
            getUserRoleStateDao().save(s);
        }
        for (UserRoleState s : this.removedUserRoleStates) {
            getUserRoleStateDao().delete(s);
        }
    }

    //endregion

}


