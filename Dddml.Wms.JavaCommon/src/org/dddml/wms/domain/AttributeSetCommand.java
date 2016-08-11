package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.Command;

public interface AttributeSetCommand extends Command
{
    String getAttributeSetId();

    void setAttributeSetId(String attributeSetId);

    Long getVersion();

    void setVersion(Long version);


    interface CreateOrMergePatchAttributeSet extends AttributeSetCommand
    {
        String getName();

        void setName(String name);

        String getOrganizationId();

        void setOrganizationId(String organizationId);

        String getDescription();

        void setDescription(String description);

        String getSerialNumberAttributeId();

        void setSerialNumberAttributeId(String serialNumberAttributeId);

        String getLotAttributeId();

        void setLotAttributeId(String lotAttributeId);

        String getReferenceId();

        void setReferenceId(String referenceId);

        Boolean getActive();

        void setActive(Boolean active);

    }

    interface CreateAttributeSet extends CreateOrMergePatchAttributeSet
    {
        CreateAttributeUseCommands getAttributeUses();

        AttributeUseCommand.CreateAttributeUse newCreateAttributeUse();

    }

    interface MergePatchAttributeSet extends CreateOrMergePatchAttributeSet
    {
        Boolean getIsPropertyNameRemoved();

        void setIsPropertyNameRemoved(Boolean removed);

        Boolean getIsPropertyOrganizationIdRemoved();

        void setIsPropertyOrganizationIdRemoved(Boolean removed);

        Boolean getIsPropertyDescriptionRemoved();

        void setIsPropertyDescriptionRemoved(Boolean removed);

        Boolean getIsPropertySerialNumberAttributeIdRemoved();

        void setIsPropertySerialNumberAttributeIdRemoved(Boolean removed);

        Boolean getIsPropertyLotAttributeIdRemoved();

        void setIsPropertyLotAttributeIdRemoved(Boolean removed);

        Boolean getIsPropertyReferenceIdRemoved();

        void setIsPropertyReferenceIdRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

        AttributeUseCommands getAttributeUseCommands();

        AttributeUseCommand.CreateAttributeUse newCreateAttributeUse();

        AttributeUseCommand.MergePatchAttributeUse newMergePatchAttributeUse();

        AttributeUseCommand.RemoveAttributeUse newRemoveAttributeUse();

    }

	interface DeleteAttributeSet extends AttributeSetCommand
	{
	}

    interface CreateAttributeUseCommands extends Iterable<AttributeUseCommand.CreateAttributeUse>
    {
        void add(AttributeUseCommand.CreateAttributeUse c);

        void remove(AttributeUseCommand.CreateAttributeUse c);

        void clear();
    }

    interface AttributeUseCommands extends Iterable<AttributeUseCommand>
    {
        void add(AttributeUseCommand c);

        void remove(AttributeUseCommand c);

        void clear();
    }

}

