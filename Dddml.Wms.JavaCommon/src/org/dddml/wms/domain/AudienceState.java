package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.AudienceStateEvent.*;

public interface AudienceState
{
    Long VERSION_ZERO = 0L;

    String getClientId();

    void setClientId(String clientId);

    String getName();

    void setName(String name);

    String getBase64Secret();

    void setBase64Secret(String base64Secret);

    Long getVersion();

    void setVersion(Long version);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

    String getUpdatedBy();

    void setUpdatedBy(String updatedBy);

    Date getUpdatedAt();

    void setUpdatedAt(Date updatedAt);

    Boolean getActive();

    void setActive(Boolean active);

    Boolean getDeleted();

    void setDeleted(Boolean deleted);


    boolean isStateUnsaved();


    void mutate(Event e);

    void when(AudienceStateCreated e);

    void when(AudienceStateMergePatched e);

    void when(AudienceStateDeleted e);
    
}

