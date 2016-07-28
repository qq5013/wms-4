package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.ApplicationContext;

public abstract class AbstractUserLoginStates implements UserLoginStates
{
    protected UserLoginStateDao getUserLoginStateDao()
    {
        return (UserLoginStateDao)ApplicationContext.current.get("UserLoginStateDao");
    }

    private UserState userState;

    private Map<UserLoginId, UserLoginState> loadedUserLoginStates = new HashMap<UserLoginId, UserLoginState>();

    private List<UserLoginState> removedUserLoginStates = new ArrayList<UserLoginState>();

    protected Iterable<UserLoginState> getLoadedUserLoginStates() {
        return this.loadedUserLoginStates.values();
    }

    private Iterable<UserLoginState> innerIterable;

    protected Iterable<UserLoginState> getInnerIterable()
    {
        if (innerIterable == null)
        {
            innerIterable = getUserLoginStateDao().findByUserId(userState.getUserId());
        }
        return innerIterable;
    }

    public AbstractUserLoginStates(UserState outerState)
    {
        this.userState = outerState;
    }

    @Override
    public Iterator<UserLoginState> iterator() {
        return getInnerIterable().iterator();
    }

    public UserLoginState get(LoginKey loginKey)
    {
        UserLoginId globalId = new UserLoginId(userState.getUserId(), loginKey);
        if (loadedUserLoginStates.containsKey(globalId)) {
            return loadedUserLoginStates.get(globalId);
        }
        UserLoginState state = getUserLoginStateDao().get(globalId);
        loadedUserLoginStates.put(globalId, state);
        return state;
    }

    public void remove(UserLoginState state)
    {
        this.removedUserLoginStates.add(state);
    }

    public void addToSave(UserLoginState state)
    {
        this.loadedUserLoginStates.put(state.getUserLoginId(), state);
    }

    //region Saveable Implements

    public void save ()
    {
        for (UserLoginState s : this.getLoadedUserLoginStates()) {
            getUserLoginStateDao().save(s);
        }
        for (UserLoginState s : this.removedUserLoginStates) {
            getUserLoginStateDao().delete(s);
        }
    }

    //endregion

}


