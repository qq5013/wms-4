package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface AudienceCommand extends Command
{
    String getClientId();

    void setClientId(String clientId);

    Long getVersion();

    void setVersion(Long version);


    interface CreateOrMergePatchAudience extends AudienceCommand
    {
        String getName();

        void setName(String name);

        String getBase64Secret();

        void setBase64Secret(String base64Secret);

        Boolean getActive();

        void setActive(Boolean active);

    }

    interface CreateAudience extends CreateOrMergePatchAudience
    {
    }

    interface MergePatchAudience extends CreateOrMergePatchAudience
    {
        Boolean getIsPropertyNameRemoved();

        void setIsPropertyNameRemoved(Boolean removed);

        Boolean getIsPropertyBase64SecretRemoved();

        void setIsPropertyBase64SecretRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

    }

	interface DeleteAudience extends AudienceCommand
	{
	}

}

