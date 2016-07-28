package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface AttributeSetInstanceExtensionFieldCommand extends Command
{
    String getIndex();

    void setIndex(String index);

    String getGroupId();

    void setGroupId(String groupId);


    interface CreateOrMergePatchAttributeSetInstanceExtensionField extends AttributeSetInstanceExtensionFieldCommand
    {
        String getName();

        void setName(String name);

        String getType();

        void setType(String type);

        Integer getLength();

        void setLength(Integer length);

        String getAlias();

        void setAlias(String alias);

        String getDescription();

        void setDescription(String description);

        Boolean getActive();

        void setActive(Boolean active);

    }

    interface CreateAttributeSetInstanceExtensionField extends CreateOrMergePatchAttributeSetInstanceExtensionField
    {
    }

    interface MergePatchAttributeSetInstanceExtensionField extends CreateOrMergePatchAttributeSetInstanceExtensionField
    {
        Boolean getIsPropertyNameRemoved();

        void setIsPropertyNameRemoved(Boolean removed);

        Boolean getIsPropertyTypeRemoved();

        void setIsPropertyTypeRemoved(Boolean removed);

        Boolean getIsPropertyLengthRemoved();

        void setIsPropertyLengthRemoved(Boolean removed);

        Boolean getIsPropertyAliasRemoved();

        void setIsPropertyAliasRemoved(Boolean removed);

        Boolean getIsPropertyDescriptionRemoved();

        void setIsPropertyDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

    }

	interface RemoveAttributeSetInstanceExtensionField extends AttributeSetInstanceExtensionFieldCommand
	{
	}

}

