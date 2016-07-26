package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.ApplicationContext;

public abstract class AbstractUserClaimStates implements UserClaimStates
{
    protected UserClaimStateDao getUserClaimStateDao()
    {
        return (UserClaimStateDao)ApplicationContext.current.get("UserClaimStateDao");
    }

    private UserState userState;

    private Map<UserClaimId, UserClaimState> loadedUserClaimStates = new HashMap<UserClaimId, UserClaimState>();

    private List<UserClaimState> removedUserClaimStates = new ArrayList<UserClaimState>();

    protected Iterable<UserClaimState> getLoadedUserClaimStates() {
        return this.loadedUserClaimStates.values();
    }

    private Iterable<UserClaimState> innerIterable;

    protected Iterable<UserClaimState> getInnerIterable()
    {
        if (innerIterable == null)
        {
            innerIterable = getUserClaimStateDao().findByUserId(userState.getUserId());
        }
        return innerIterable;
    }

    public AbstractUserClaimStates(UserState outerState)
    {
        this.userState = outerState;
    }

    @Override
    public Iterator<UserClaimState> iterator() {
        return innerIterable.iterator();
    }

    public UserClaimState get(Integer claimId)
    {
        UserClaimId globalId = new UserClaimId(userState.getUserId(), claimId);
        if (loadedUserClaimStates.containsKey(globalId)) {
            return loadedUserClaimStates.get(globalId);
        }
        UserClaimState state = getUserClaimStateDao().get(globalId);
        loadedUserClaimStates.put(globalId, state);
        return state;
    }

    public void remove(UserClaimState state)
    {
        this.removedUserClaimStates.add(state);
    }

    public void addToSave(UserClaimState state)
    {
        this.loadedUserClaimStates.put(state.getUserClaimId(), state);
    }

    //region Saveable Implements

    public void save ()
    {
        for (UserClaimState s : this.getLoadedUserClaimStates()) {
            getUserClaimStateDao().save(s);
        }
        for (UserClaimState s : this.removedUserClaimStates) {
            getUserClaimStateDao().delete(s);
        }
    }

    //endregion

}


