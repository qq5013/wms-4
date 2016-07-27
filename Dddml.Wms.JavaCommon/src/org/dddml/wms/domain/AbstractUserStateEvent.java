package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractUserStateEvent extends AbstractStateEvent implements UserStateEvent 
{
    private UserStateEventId stateEventId;

    public UserStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(UserStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }
    
    private boolean stateEventReadOnly;

    public boolean getStateEventReadOnly() { return this.stateEventReadOnly; }

    public void setStateEventReadOnly(boolean readOnly) { this.stateEventReadOnly = readOnly; }

    private String userName;

    public String getUserName()
    {
        return this.userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    private Integer accessFailedCount;

    public Integer getAccessFailedCount()
    {
        return this.accessFailedCount;
    }

    public void setAccessFailedCount(Integer accessFailedCount)
    {
        this.accessFailedCount = accessFailedCount;
    }

    private String email;

    public String getEmail()
    {
        return this.email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    private Boolean emailConfirmed;

    public Boolean getEmailConfirmed()
    {
        return this.emailConfirmed;
    }

    public void setEmailConfirmed(Boolean emailConfirmed)
    {
        this.emailConfirmed = emailConfirmed;
    }

    private Boolean lockoutEnabled;

    public Boolean getLockoutEnabled()
    {
        return this.lockoutEnabled;
    }

    public void setLockoutEnabled(Boolean lockoutEnabled)
    {
        this.lockoutEnabled = lockoutEnabled;
    }

    private Date lockoutEndDateUtc;

    public Date getLockoutEndDateUtc()
    {
        return this.lockoutEndDateUtc;
    }

    public void setLockoutEndDateUtc(Date lockoutEndDateUtc)
    {
        this.lockoutEndDateUtc = lockoutEndDateUtc;
    }

    private String passwordHash;

    public String getPasswordHash()
    {
        return this.passwordHash;
    }

    public void setPasswordHash(String passwordHash)
    {
        this.passwordHash = passwordHash;
    }

    private String phoneNumber;

    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    private Boolean phoneNumberConfirmed;

    public Boolean getPhoneNumberConfirmed()
    {
        return this.phoneNumberConfirmed;
    }

    public void setPhoneNumberConfirmed(Boolean phoneNumberConfirmed)
    {
        this.phoneNumberConfirmed = phoneNumberConfirmed;
    }

    private Boolean twoFactorEnabled;

    public Boolean getTwoFactorEnabled()
    {
        return this.twoFactorEnabled;
    }

    public void setTwoFactorEnabled(Boolean twoFactorEnabled)
    {
        this.twoFactorEnabled = twoFactorEnabled;
    }

    private String securityStamp;

    public String getSecurityStamp()
    {
        return this.securityStamp;
    }

    public void setSecurityStamp(String securityStamp)
    {
        this.securityStamp = securityStamp;
    }

    private String createdBy;

    public String getCreatedBy()
    {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
    }

    private Date createdAt;

    public Date getCreatedAt()
    {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt)
    {
        this.createdAt = createdAt;
    }

    private Boolean active;

    public Boolean getActive()
    {
        return this.active;
    }

    public void setActive(Boolean active)
    {
        this.active = active;
    }


    private String commandId;

    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    protected AbstractUserStateEvent() {
    }

    protected AbstractUserStateEvent(UserStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }

    protected UserRoleStateEventDao getUserRoleStateEventDao() {
        return (UserRoleStateEventDao)ApplicationContext.current.get("UserRoleStateEventDao");
    }

    protected UserRoleStateEventId newUserRoleStateEventId(String roleId)
    {
        UserRoleStateEventId stateEventId = new UserRoleStateEventId(this.getStateEventId().getUserId(), 
            roleId, 
            this.getStateEventId().getVersion());
        return stateEventId;
    }

    protected void throwOnInconsistentEventIds(UserRoleStateEvent e)
    {
        throwOnInconsistentEventIds(this, e);
    }

    public static void throwOnInconsistentEventIds(UserStateEvent oe, UserRoleStateEvent e)
    {
        if (!oe.getStateEventId().getUserId().equals(e.getStateEventId().getUserId()))
        { 
            throw DomainError.named("inconsistentEventIds", "Outer Id UserId %1$s but inner id UserId %2$s", 
                oe.getStateEventId().getUserId(), e.getStateEventId().getUserId());
        }
    }

    protected UserClaimStateEventDao getUserClaimStateEventDao() {
        return (UserClaimStateEventDao)ApplicationContext.current.get("UserClaimStateEventDao");
    }

    protected UserClaimStateEventId newUserClaimStateEventId(Integer claimId)
    {
        UserClaimStateEventId stateEventId = new UserClaimStateEventId(this.getStateEventId().getUserId(), 
            claimId, 
            this.getStateEventId().getVersion());
        return stateEventId;
    }

    protected void throwOnInconsistentEventIds(UserClaimStateEvent e)
    {
        throwOnInconsistentEventIds(this, e);
    }

    public static void throwOnInconsistentEventIds(UserStateEvent oe, UserClaimStateEvent e)
    {
        if (!oe.getStateEventId().getUserId().equals(e.getStateEventId().getUserId()))
        { 
            throw DomainError.named("inconsistentEventIds", "Outer Id UserId %1$s but inner id UserId %2$s", 
                oe.getStateEventId().getUserId(), e.getStateEventId().getUserId());
        }
    }

    protected UserPermissionStateEventDao getUserPermissionStateEventDao() {
        return (UserPermissionStateEventDao)ApplicationContext.current.get("UserPermissionStateEventDao");
    }

    protected UserPermissionStateEventId newUserPermissionStateEventId(String permissionId)
    {
        UserPermissionStateEventId stateEventId = new UserPermissionStateEventId(this.getStateEventId().getUserId(), 
            permissionId, 
            this.getStateEventId().getVersion());
        return stateEventId;
    }

    protected void throwOnInconsistentEventIds(UserPermissionStateEvent e)
    {
        throwOnInconsistentEventIds(this, e);
    }

    public static void throwOnInconsistentEventIds(UserStateEvent oe, UserPermissionStateEvent e)
    {
        if (!oe.getStateEventId().getUserId().equals(e.getStateEventId().getUserId()))
        { 
            throw DomainError.named("inconsistentEventIds", "Outer Id UserId %1$s but inner id UserId %2$s", 
                oe.getStateEventId().getUserId(), e.getStateEventId().getUserId());
        }
    }

    protected UserLoginStateEventDao getUserLoginStateEventDao() {
        return (UserLoginStateEventDao)ApplicationContext.current.get("UserLoginStateEventDao");
    }

    protected UserLoginStateEventId newUserLoginStateEventId(LoginKey loginKey)
    {
        UserLoginStateEventId stateEventId = new UserLoginStateEventId(this.getStateEventId().getUserId(), 
            loginKey, 
            this.getStateEventId().getVersion());
        return stateEventId;
    }

    protected void throwOnInconsistentEventIds(UserLoginStateEvent e)
    {
        throwOnInconsistentEventIds(this, e);
    }

    public static void throwOnInconsistentEventIds(UserStateEvent oe, UserLoginStateEvent e)
    {
        if (!oe.getStateEventId().getUserId().equals(e.getStateEventId().getUserId()))
        { 
            throw DomainError.named("inconsistentEventIds", "Outer Id UserId %1$s but inner id UserId %2$s", 
                oe.getStateEventId().getUserId(), e.getStateEventId().getUserId());
        }
    }

    public UserRoleStateEvent.UserRoleStateCreated newUserRoleStateCreated(String roleId) {
        return new AbstractUserRoleStateEvent.SimpleUserRoleStateCreated(newUserRoleStateEventId(roleId));
    }

    public UserRoleStateEvent.UserRoleStateMergePatched newUserRoleStateMergePatched(String roleId) {
        return new AbstractUserRoleStateEvent.SimpleUserRoleStateMergePatched(newUserRoleStateEventId(roleId));
    }

    public UserRoleStateEvent.UserRoleStateRemoved newUserRoleStateRemoved(String roleId) {
        return new AbstractUserRoleStateEvent.SimpleUserRoleStateRemoved(newUserRoleStateEventId(roleId));
    }

    public UserClaimStateEvent.UserClaimStateCreated newUserClaimStateCreated(Integer claimId) {
        return new AbstractUserClaimStateEvent.SimpleUserClaimStateCreated(newUserClaimStateEventId(claimId));
    }

    public UserClaimStateEvent.UserClaimStateMergePatched newUserClaimStateMergePatched(Integer claimId) {
        return new AbstractUserClaimStateEvent.SimpleUserClaimStateMergePatched(newUserClaimStateEventId(claimId));
    }

    public UserClaimStateEvent.UserClaimStateRemoved newUserClaimStateRemoved(Integer claimId) {
        return new AbstractUserClaimStateEvent.SimpleUserClaimStateRemoved(newUserClaimStateEventId(claimId));
    }

    public UserPermissionStateEvent.UserPermissionStateCreated newUserPermissionStateCreated(String permissionId) {
        return new AbstractUserPermissionStateEvent.SimpleUserPermissionStateCreated(newUserPermissionStateEventId(permissionId));
    }

    public UserPermissionStateEvent.UserPermissionStateMergePatched newUserPermissionStateMergePatched(String permissionId) {
        return new AbstractUserPermissionStateEvent.SimpleUserPermissionStateMergePatched(newUserPermissionStateEventId(permissionId));
    }

    public UserPermissionStateEvent.UserPermissionStateRemoved newUserPermissionStateRemoved(String permissionId) {
        return new AbstractUserPermissionStateEvent.SimpleUserPermissionStateRemoved(newUserPermissionStateEventId(permissionId));
    }

    public UserLoginStateEvent.UserLoginStateCreated newUserLoginStateCreated(LoginKey loginKey) {
        return new AbstractUserLoginStateEvent.SimpleUserLoginStateCreated(newUserLoginStateEventId(loginKey));
    }

    public UserLoginStateEvent.UserLoginStateMergePatched newUserLoginStateMergePatched(LoginKey loginKey) {
        return new AbstractUserLoginStateEvent.SimpleUserLoginStateMergePatched(newUserLoginStateEventId(loginKey));
    }

    public UserLoginStateEvent.UserLoginStateRemoved newUserLoginStateRemoved(LoginKey loginKey) {
        return new AbstractUserLoginStateEvent.SimpleUserLoginStateRemoved(newUserLoginStateEventId(loginKey));
    }


    public abstract String getStateEventType();


    public static abstract class AbstractUserStateCreated extends AbstractUserStateEvent implements UserStateCreated, Saveable
    {
        public AbstractUserStateCreated() {
        }

        public AbstractUserStateCreated(UserStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

        private Map<UserRoleStateEventId, UserRoleStateEvent.UserRoleStateCreated> userRoleEvents = new HashMap<UserRoleStateEventId, UserRoleStateEvent.UserRoleStateCreated>();
        
        private Iterable<UserRoleStateEvent.UserRoleStateCreated> readOnlyUserRoleEvents;

        public Iterable<UserRoleStateEvent.UserRoleStateCreated> getUserRoleEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.userRoleEvents.values();
            }
            else
            {
                if (readOnlyUserRoleEvents != null) { return readOnlyUserRoleEvents; }
                UserRoleStateEventDao eventDao = getUserRoleStateEventDao();
                List<UserRoleStateEvent.UserRoleStateCreated> eL = new ArrayList<UserRoleStateEvent.UserRoleStateCreated>();
                for (UserRoleStateEvent e : eventDao.findByUserStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((UserRoleStateEvent.UserRoleStateCreated)e);
                }
                return (readOnlyUserRoleEvents = eL);
            }
        }

        public void setUserRoleEvents(Iterable<UserRoleStateEvent.UserRoleStateCreated> es)
        {
            if (es != null)
            {
                for (UserRoleStateEvent.UserRoleStateCreated e : es)
                {
                    addUserRoleEvent(e);
                }
            }
            else { this.userRoleEvents.clear(); }
        }
        
        public void addUserRoleEvent(UserRoleStateEvent.UserRoleStateCreated e)
        {
            throwOnInconsistentEventIds(e);
            this.userRoleEvents.put(e.getStateEventId(), e);
        }

        private Map<UserClaimStateEventId, UserClaimStateEvent.UserClaimStateCreated> userClaimEvents = new HashMap<UserClaimStateEventId, UserClaimStateEvent.UserClaimStateCreated>();
        
        private Iterable<UserClaimStateEvent.UserClaimStateCreated> readOnlyUserClaimEvents;

        public Iterable<UserClaimStateEvent.UserClaimStateCreated> getUserClaimEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.userClaimEvents.values();
            }
            else
            {
                if (readOnlyUserClaimEvents != null) { return readOnlyUserClaimEvents; }
                UserClaimStateEventDao eventDao = getUserClaimStateEventDao();
                List<UserClaimStateEvent.UserClaimStateCreated> eL = new ArrayList<UserClaimStateEvent.UserClaimStateCreated>();
                for (UserClaimStateEvent e : eventDao.findByUserStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((UserClaimStateEvent.UserClaimStateCreated)e);
                }
                return (readOnlyUserClaimEvents = eL);
            }
        }

        public void setUserClaimEvents(Iterable<UserClaimStateEvent.UserClaimStateCreated> es)
        {
            if (es != null)
            {
                for (UserClaimStateEvent.UserClaimStateCreated e : es)
                {
                    addUserClaimEvent(e);
                }
            }
            else { this.userClaimEvents.clear(); }
        }
        
        public void addUserClaimEvent(UserClaimStateEvent.UserClaimStateCreated e)
        {
            throwOnInconsistentEventIds(e);
            this.userClaimEvents.put(e.getStateEventId(), e);
        }

        private Map<UserPermissionStateEventId, UserPermissionStateEvent.UserPermissionStateCreated> userPermissionEvents = new HashMap<UserPermissionStateEventId, UserPermissionStateEvent.UserPermissionStateCreated>();
        
        private Iterable<UserPermissionStateEvent.UserPermissionStateCreated> readOnlyUserPermissionEvents;

        public Iterable<UserPermissionStateEvent.UserPermissionStateCreated> getUserPermissionEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.userPermissionEvents.values();
            }
            else
            {
                if (readOnlyUserPermissionEvents != null) { return readOnlyUserPermissionEvents; }
                UserPermissionStateEventDao eventDao = getUserPermissionStateEventDao();
                List<UserPermissionStateEvent.UserPermissionStateCreated> eL = new ArrayList<UserPermissionStateEvent.UserPermissionStateCreated>();
                for (UserPermissionStateEvent e : eventDao.findByUserStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((UserPermissionStateEvent.UserPermissionStateCreated)e);
                }
                return (readOnlyUserPermissionEvents = eL);
            }
        }

        public void setUserPermissionEvents(Iterable<UserPermissionStateEvent.UserPermissionStateCreated> es)
        {
            if (es != null)
            {
                for (UserPermissionStateEvent.UserPermissionStateCreated e : es)
                {
                    addUserPermissionEvent(e);
                }
            }
            else { this.userPermissionEvents.clear(); }
        }
        
        public void addUserPermissionEvent(UserPermissionStateEvent.UserPermissionStateCreated e)
        {
            throwOnInconsistentEventIds(e);
            this.userPermissionEvents.put(e.getStateEventId(), e);
        }

        private Map<UserLoginStateEventId, UserLoginStateEvent.UserLoginStateCreated> userLoginEvents = new HashMap<UserLoginStateEventId, UserLoginStateEvent.UserLoginStateCreated>();
        
        private Iterable<UserLoginStateEvent.UserLoginStateCreated> readOnlyUserLoginEvents;

        public Iterable<UserLoginStateEvent.UserLoginStateCreated> getUserLoginEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.userLoginEvents.values();
            }
            else
            {
                if (readOnlyUserLoginEvents != null) { return readOnlyUserLoginEvents; }
                UserLoginStateEventDao eventDao = getUserLoginStateEventDao();
                List<UserLoginStateEvent.UserLoginStateCreated> eL = new ArrayList<UserLoginStateEvent.UserLoginStateCreated>();
                for (UserLoginStateEvent e : eventDao.findByUserStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((UserLoginStateEvent.UserLoginStateCreated)e);
                }
                return (readOnlyUserLoginEvents = eL);
            }
        }

        public void setUserLoginEvents(Iterable<UserLoginStateEvent.UserLoginStateCreated> es)
        {
            if (es != null)
            {
                for (UserLoginStateEvent.UserLoginStateCreated e : es)
                {
                    addUserLoginEvent(e);
                }
            }
            else { this.userLoginEvents.clear(); }
        }
        
        public void addUserLoginEvent(UserLoginStateEvent.UserLoginStateCreated e)
        {
            throwOnInconsistentEventIds(e);
            this.userLoginEvents.put(e.getStateEventId(), e);
        }

        public void save()
        {
            for (UserRoleStateEvent.UserRoleStateCreated e : this.getUserRoleEvents()) {
                getUserRoleStateEventDao().save(e);
            }
            for (UserClaimStateEvent.UserClaimStateCreated e : this.getUserClaimEvents()) {
                getUserClaimStateEventDao().save(e);
            }
            for (UserPermissionStateEvent.UserPermissionStateCreated e : this.getUserPermissionEvents()) {
                getUserPermissionStateEventDao().save(e);
            }
            for (UserLoginStateEvent.UserLoginStateCreated e : this.getUserLoginEvents()) {
                getUserLoginStateEventDao().save(e);
            }
        }
    }


    public static abstract class AbstractUserStateMergePatched extends AbstractUserStateEvent implements UserStateMergePatched, Saveable
    {
        public AbstractUserStateMergePatched() {
        }

        public AbstractUserStateMergePatched(UserStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.MERGE_PATCHED;
        }

        private Boolean isPropertyUserNameRemoved;

        public Boolean getIsPropertyUserNameRemoved() {
            return this.isPropertyUserNameRemoved;
        }

        public void setIsPropertyUserNameRemoved(Boolean removed) {
            this.isPropertyUserNameRemoved = removed;
        }

        private Boolean isPropertyAccessFailedCountRemoved;

        public Boolean getIsPropertyAccessFailedCountRemoved() {
            return this.isPropertyAccessFailedCountRemoved;
        }

        public void setIsPropertyAccessFailedCountRemoved(Boolean removed) {
            this.isPropertyAccessFailedCountRemoved = removed;
        }

        private Boolean isPropertyEmailRemoved;

        public Boolean getIsPropertyEmailRemoved() {
            return this.isPropertyEmailRemoved;
        }

        public void setIsPropertyEmailRemoved(Boolean removed) {
            this.isPropertyEmailRemoved = removed;
        }

        private Boolean isPropertyEmailConfirmedRemoved;

        public Boolean getIsPropertyEmailConfirmedRemoved() {
            return this.isPropertyEmailConfirmedRemoved;
        }

        public void setIsPropertyEmailConfirmedRemoved(Boolean removed) {
            this.isPropertyEmailConfirmedRemoved = removed;
        }

        private Boolean isPropertyLockoutEnabledRemoved;

        public Boolean getIsPropertyLockoutEnabledRemoved() {
            return this.isPropertyLockoutEnabledRemoved;
        }

        public void setIsPropertyLockoutEnabledRemoved(Boolean removed) {
            this.isPropertyLockoutEnabledRemoved = removed;
        }

        private Boolean isPropertyLockoutEndDateUtcRemoved;

        public Boolean getIsPropertyLockoutEndDateUtcRemoved() {
            return this.isPropertyLockoutEndDateUtcRemoved;
        }

        public void setIsPropertyLockoutEndDateUtcRemoved(Boolean removed) {
            this.isPropertyLockoutEndDateUtcRemoved = removed;
        }

        private Boolean isPropertyPasswordHashRemoved;

        public Boolean getIsPropertyPasswordHashRemoved() {
            return this.isPropertyPasswordHashRemoved;
        }

        public void setIsPropertyPasswordHashRemoved(Boolean removed) {
            this.isPropertyPasswordHashRemoved = removed;
        }

        private Boolean isPropertyPhoneNumberRemoved;

        public Boolean getIsPropertyPhoneNumberRemoved() {
            return this.isPropertyPhoneNumberRemoved;
        }

        public void setIsPropertyPhoneNumberRemoved(Boolean removed) {
            this.isPropertyPhoneNumberRemoved = removed;
        }

        private Boolean isPropertyPhoneNumberConfirmedRemoved;

        public Boolean getIsPropertyPhoneNumberConfirmedRemoved() {
            return this.isPropertyPhoneNumberConfirmedRemoved;
        }

        public void setIsPropertyPhoneNumberConfirmedRemoved(Boolean removed) {
            this.isPropertyPhoneNumberConfirmedRemoved = removed;
        }

        private Boolean isPropertyTwoFactorEnabledRemoved;

        public Boolean getIsPropertyTwoFactorEnabledRemoved() {
            return this.isPropertyTwoFactorEnabledRemoved;
        }

        public void setIsPropertyTwoFactorEnabledRemoved(Boolean removed) {
            this.isPropertyTwoFactorEnabledRemoved = removed;
        }

        private Boolean isPropertySecurityStampRemoved;

        public Boolean getIsPropertySecurityStampRemoved() {
            return this.isPropertySecurityStampRemoved;
        }

        public void setIsPropertySecurityStampRemoved(Boolean removed) {
            this.isPropertySecurityStampRemoved = removed;
        }

        private Boolean isPropertyActiveRemoved;

        public Boolean getIsPropertyActiveRemoved() {
            return this.isPropertyActiveRemoved;
        }

        public void setIsPropertyActiveRemoved(Boolean removed) {
            this.isPropertyActiveRemoved = removed;
        }

        private Map<UserRoleStateEventId, UserRoleStateEvent> userRoleEvents = new HashMap<UserRoleStateEventId, UserRoleStateEvent>();
        
        private Iterable<UserRoleStateEvent> readOnlyUserRoleEvents;

        public Iterable<UserRoleStateEvent> getUserRoleEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.userRoleEvents.values();
            }
            else
            {
                if (readOnlyUserRoleEvents != null) { return readOnlyUserRoleEvents; }
                UserRoleStateEventDao eventDao = getUserRoleStateEventDao();
                List<UserRoleStateEvent> eL = new ArrayList<UserRoleStateEvent>();
                for (UserRoleStateEvent e : eventDao.findByUserStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((UserRoleStateEvent)e);
                }
                return (readOnlyUserRoleEvents = eL);
            }
        }

        public void setUserRoleEvents(Iterable<UserRoleStateEvent> es)
        {
            if (es != null)
            {
                for (UserRoleStateEvent e : es)
                {
                    addUserRoleEvent(e);
                }
            }
            else { this.userRoleEvents.clear(); }
        }
        
        public void addUserRoleEvent(UserRoleStateEvent e)
        {
            throwOnInconsistentEventIds(e);
            this.userRoleEvents.put(e.getStateEventId(), e);
        }

        private Map<UserClaimStateEventId, UserClaimStateEvent> userClaimEvents = new HashMap<UserClaimStateEventId, UserClaimStateEvent>();
        
        private Iterable<UserClaimStateEvent> readOnlyUserClaimEvents;

        public Iterable<UserClaimStateEvent> getUserClaimEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.userClaimEvents.values();
            }
            else
            {
                if (readOnlyUserClaimEvents != null) { return readOnlyUserClaimEvents; }
                UserClaimStateEventDao eventDao = getUserClaimStateEventDao();
                List<UserClaimStateEvent> eL = new ArrayList<UserClaimStateEvent>();
                for (UserClaimStateEvent e : eventDao.findByUserStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((UserClaimStateEvent)e);
                }
                return (readOnlyUserClaimEvents = eL);
            }
        }

        public void setUserClaimEvents(Iterable<UserClaimStateEvent> es)
        {
            if (es != null)
            {
                for (UserClaimStateEvent e : es)
                {
                    addUserClaimEvent(e);
                }
            }
            else { this.userClaimEvents.clear(); }
        }
        
        public void addUserClaimEvent(UserClaimStateEvent e)
        {
            throwOnInconsistentEventIds(e);
            this.userClaimEvents.put(e.getStateEventId(), e);
        }

        private Map<UserPermissionStateEventId, UserPermissionStateEvent> userPermissionEvents = new HashMap<UserPermissionStateEventId, UserPermissionStateEvent>();
        
        private Iterable<UserPermissionStateEvent> readOnlyUserPermissionEvents;

        public Iterable<UserPermissionStateEvent> getUserPermissionEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.userPermissionEvents.values();
            }
            else
            {
                if (readOnlyUserPermissionEvents != null) { return readOnlyUserPermissionEvents; }
                UserPermissionStateEventDao eventDao = getUserPermissionStateEventDao();
                List<UserPermissionStateEvent> eL = new ArrayList<UserPermissionStateEvent>();
                for (UserPermissionStateEvent e : eventDao.findByUserStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((UserPermissionStateEvent)e);
                }
                return (readOnlyUserPermissionEvents = eL);
            }
        }

        public void setUserPermissionEvents(Iterable<UserPermissionStateEvent> es)
        {
            if (es != null)
            {
                for (UserPermissionStateEvent e : es)
                {
                    addUserPermissionEvent(e);
                }
            }
            else { this.userPermissionEvents.clear(); }
        }
        
        public void addUserPermissionEvent(UserPermissionStateEvent e)
        {
            throwOnInconsistentEventIds(e);
            this.userPermissionEvents.put(e.getStateEventId(), e);
        }

        private Map<UserLoginStateEventId, UserLoginStateEvent> userLoginEvents = new HashMap<UserLoginStateEventId, UserLoginStateEvent>();
        
        private Iterable<UserLoginStateEvent> readOnlyUserLoginEvents;

        public Iterable<UserLoginStateEvent> getUserLoginEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.userLoginEvents.values();
            }
            else
            {
                if (readOnlyUserLoginEvents != null) { return readOnlyUserLoginEvents; }
                UserLoginStateEventDao eventDao = getUserLoginStateEventDao();
                List<UserLoginStateEvent> eL = new ArrayList<UserLoginStateEvent>();
                for (UserLoginStateEvent e : eventDao.findByUserStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((UserLoginStateEvent)e);
                }
                return (readOnlyUserLoginEvents = eL);
            }
        }

        public void setUserLoginEvents(Iterable<UserLoginStateEvent> es)
        {
            if (es != null)
            {
                for (UserLoginStateEvent e : es)
                {
                    addUserLoginEvent(e);
                }
            }
            else { this.userLoginEvents.clear(); }
        }
        
        public void addUserLoginEvent(UserLoginStateEvent e)
        {
            throwOnInconsistentEventIds(e);
            this.userLoginEvents.put(e.getStateEventId(), e);
        }

        public void save()
        {
            for (UserRoleStateEvent e : this.getUserRoleEvents()) {
                getUserRoleStateEventDao().save(e);
            }
            for (UserClaimStateEvent e : this.getUserClaimEvents()) {
                getUserClaimStateEventDao().save(e);
            }
            for (UserPermissionStateEvent e : this.getUserPermissionEvents()) {
                getUserPermissionStateEventDao().save(e);
            }
            for (UserLoginStateEvent e : this.getUserLoginEvents()) {
                getUserLoginStateEventDao().save(e);
            }
        }
    }


    public static abstract class AbstractUserStateDeleted extends AbstractUserStateEvent implements UserStateDeleted, Saveable
    {
        public AbstractUserStateDeleted() {
        }

        public AbstractUserStateDeleted(UserStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.DELETED;
        }

		
        private Map<UserRoleStateEventId, UserRoleStateEvent.UserRoleStateRemoved> userRoleEvents = new HashMap<UserRoleStateEventId, UserRoleStateEvent.UserRoleStateRemoved>();
        
        private Iterable<UserRoleStateEvent.UserRoleStateRemoved> readOnlyUserRoleEvents;

        public Iterable<UserRoleStateEvent.UserRoleStateRemoved> getUserRoleEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.userRoleEvents.values();
            }
            else
            {
                if (readOnlyUserRoleEvents != null) { return readOnlyUserRoleEvents; }
                UserRoleStateEventDao eventDao = getUserRoleStateEventDao();
                List<UserRoleStateEvent.UserRoleStateRemoved> eL = new ArrayList<UserRoleStateEvent.UserRoleStateRemoved>();
                for (UserRoleStateEvent e : eventDao.findByUserStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((UserRoleStateEvent.UserRoleStateRemoved)e);
                }
                return (readOnlyUserRoleEvents = eL);
            }
        }

        public void setUserRoleEvents(Iterable<UserRoleStateEvent.UserRoleStateRemoved> es)
        {
            if (es != null)
            {
                for (UserRoleStateEvent.UserRoleStateRemoved e : es)
                {
                    addUserRoleEvent(e);
                }
            }
            else { this.userRoleEvents.clear(); }
        }
        
        public void addUserRoleEvent(UserRoleStateEvent.UserRoleStateRemoved e)
        {
            throwOnInconsistentEventIds(e);
            this.userRoleEvents.put(e.getStateEventId(), e);
        }

		
        private Map<UserClaimStateEventId, UserClaimStateEvent.UserClaimStateRemoved> userClaimEvents = new HashMap<UserClaimStateEventId, UserClaimStateEvent.UserClaimStateRemoved>();
        
        private Iterable<UserClaimStateEvent.UserClaimStateRemoved> readOnlyUserClaimEvents;

        public Iterable<UserClaimStateEvent.UserClaimStateRemoved> getUserClaimEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.userClaimEvents.values();
            }
            else
            {
                if (readOnlyUserClaimEvents != null) { return readOnlyUserClaimEvents; }
                UserClaimStateEventDao eventDao = getUserClaimStateEventDao();
                List<UserClaimStateEvent.UserClaimStateRemoved> eL = new ArrayList<UserClaimStateEvent.UserClaimStateRemoved>();
                for (UserClaimStateEvent e : eventDao.findByUserStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((UserClaimStateEvent.UserClaimStateRemoved)e);
                }
                return (readOnlyUserClaimEvents = eL);
            }
        }

        public void setUserClaimEvents(Iterable<UserClaimStateEvent.UserClaimStateRemoved> es)
        {
            if (es != null)
            {
                for (UserClaimStateEvent.UserClaimStateRemoved e : es)
                {
                    addUserClaimEvent(e);
                }
            }
            else { this.userClaimEvents.clear(); }
        }
        
        public void addUserClaimEvent(UserClaimStateEvent.UserClaimStateRemoved e)
        {
            throwOnInconsistentEventIds(e);
            this.userClaimEvents.put(e.getStateEventId(), e);
        }

		
        private Map<UserPermissionStateEventId, UserPermissionStateEvent.UserPermissionStateRemoved> userPermissionEvents = new HashMap<UserPermissionStateEventId, UserPermissionStateEvent.UserPermissionStateRemoved>();
        
        private Iterable<UserPermissionStateEvent.UserPermissionStateRemoved> readOnlyUserPermissionEvents;

        public Iterable<UserPermissionStateEvent.UserPermissionStateRemoved> getUserPermissionEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.userPermissionEvents.values();
            }
            else
            {
                if (readOnlyUserPermissionEvents != null) { return readOnlyUserPermissionEvents; }
                UserPermissionStateEventDao eventDao = getUserPermissionStateEventDao();
                List<UserPermissionStateEvent.UserPermissionStateRemoved> eL = new ArrayList<UserPermissionStateEvent.UserPermissionStateRemoved>();
                for (UserPermissionStateEvent e : eventDao.findByUserStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((UserPermissionStateEvent.UserPermissionStateRemoved)e);
                }
                return (readOnlyUserPermissionEvents = eL);
            }
        }

        public void setUserPermissionEvents(Iterable<UserPermissionStateEvent.UserPermissionStateRemoved> es)
        {
            if (es != null)
            {
                for (UserPermissionStateEvent.UserPermissionStateRemoved e : es)
                {
                    addUserPermissionEvent(e);
                }
            }
            else { this.userPermissionEvents.clear(); }
        }
        
        public void addUserPermissionEvent(UserPermissionStateEvent.UserPermissionStateRemoved e)
        {
            throwOnInconsistentEventIds(e);
            this.userPermissionEvents.put(e.getStateEventId(), e);
        }

		
        private Map<UserLoginStateEventId, UserLoginStateEvent.UserLoginStateRemoved> userLoginEvents = new HashMap<UserLoginStateEventId, UserLoginStateEvent.UserLoginStateRemoved>();
        
        private Iterable<UserLoginStateEvent.UserLoginStateRemoved> readOnlyUserLoginEvents;

        public Iterable<UserLoginStateEvent.UserLoginStateRemoved> getUserLoginEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.userLoginEvents.values();
            }
            else
            {
                if (readOnlyUserLoginEvents != null) { return readOnlyUserLoginEvents; }
                UserLoginStateEventDao eventDao = getUserLoginStateEventDao();
                List<UserLoginStateEvent.UserLoginStateRemoved> eL = new ArrayList<UserLoginStateEvent.UserLoginStateRemoved>();
                for (UserLoginStateEvent e : eventDao.findByUserStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((UserLoginStateEvent.UserLoginStateRemoved)e);
                }
                return (readOnlyUserLoginEvents = eL);
            }
        }

        public void setUserLoginEvents(Iterable<UserLoginStateEvent.UserLoginStateRemoved> es)
        {
            if (es != null)
            {
                for (UserLoginStateEvent.UserLoginStateRemoved e : es)
                {
                    addUserLoginEvent(e);
                }
            }
            else { this.userLoginEvents.clear(); }
        }
        
        public void addUserLoginEvent(UserLoginStateEvent.UserLoginStateRemoved e)
        {
            throwOnInconsistentEventIds(e);
            this.userLoginEvents.put(e.getStateEventId(), e);
        }

        public void save()
        {
            for (UserRoleStateEvent.UserRoleStateRemoved e : this.getUserRoleEvents()) {
                getUserRoleStateEventDao().save(e);
            }
            for (UserClaimStateEvent.UserClaimStateRemoved e : this.getUserClaimEvents()) {
                getUserClaimStateEventDao().save(e);
            }
            for (UserPermissionStateEvent.UserPermissionStateRemoved e : this.getUserPermissionEvents()) {
                getUserPermissionStateEventDao().save(e);
            }
            for (UserLoginStateEvent.UserLoginStateRemoved e : this.getUserLoginEvents()) {
                getUserLoginStateEventDao().save(e);
            }
        }
    }
        public static class SimpleUserStateCreated extends AbstractUserStateCreated
        {
			public SimpleUserStateCreated() {
			}

			public SimpleUserStateCreated(UserStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleUserStateMergePatched extends AbstractUserStateMergePatched
        {
			public SimpleUserStateMergePatched() {
			}

			public SimpleUserStateMergePatched(UserStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleUserStateDeleted extends AbstractUserStateDeleted
        {
			public SimpleUserStateDeleted() {
			}

			public SimpleUserStateDeleted(UserStateEventId stateEventId) {
				super(stateEventId);
			}
        }

}

