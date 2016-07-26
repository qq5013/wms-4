package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface AudienceCommand extends Command
{
    String getClientId();

    Long getVersion();


    interface CreateOrMergePatchAudience extends AudienceCommand
    {
        String getName();

        String getBase64Secret();

        Boolean getActive();

    }

    interface CreateAudience extends CreateOrMergePatchAudience
    {
    }

    interface MergePatchAudience extends CreateOrMergePatchAudience
    {
        Boolean getIsPropertyNameRemoved();

        Boolean getIsPropertyBase64SecretRemoved();

        Boolean getIsPropertyActiveRemoved();

    }

	interface DeleteAudience extends AudienceCommand
	{
	}

}

