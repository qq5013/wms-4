package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.RoleStateEvent.*;

public interface RoleState
{
    String getRoleId();

    void setRoleId(String roleId);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    Long getVersion();

    void setVersion(Long version);

    Boolean getActive();

    void setActive(Boolean active);


    boolean isStateUnsaved();


    void when(RoleStateCreated e);

    void when(RoleStateMergePatched e);

    void when(RoleStateDeleted e);

    void mutate(Event e);

    
}

