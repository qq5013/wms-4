package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.AudienceStateEvent.*;

public interface AudienceState
{
    String getClientId();

    void setClientId(String clientId);

    String getName();

    void setName(String name);

    String getBase64Secret();

    void setBase64Secret(String base64Secret);

    Long getVersion();

    void setVersion(Long version);

    Boolean getActive();

    void setActive(Boolean active);


    boolean isStateUnsaved();


    void when(AudienceStateCreated e);

    void when(AudienceStateMergePatched e);

    void when(AudienceStateDeleted e);

    void mutate(Event e);

    
}

