package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface AttributeSetCommand extends Command
{
    String getAttributeSetId();

    Long getVersion();


    interface CreateOrMergePatchAttributeSet extends AttributeSetCommand
    {
        String getName();

        String getOrganizationId();

        String getDescription();

        String getSerialNumberAttributeId();

        String getLotAttributeId();

        String getReferenceId();

        Boolean getActive();

    }

    interface CreateAttributeSet extends CreateOrMergePatchAttributeSet
    {
        CreateAttributeUseCommands getAttributeUses();

        AttributeUseCommand.CreateAttributeUse newCreateAttributeUse();

    }

    interface MergePatchAttributeSet extends CreateOrMergePatchAttributeSet
    {
        Boolean getIsPropertyNameRemoved();

        Boolean getIsPropertyOrganizationIdRemoved();

        Boolean getIsPropertyDescriptionRemoved();

        Boolean getIsPropertySerialNumberAttributeIdRemoved();

        Boolean getIsPropertyLotAttributeIdRemoved();

        Boolean getIsPropertyReferenceIdRemoved();

        Boolean getIsPropertyActiveRemoved();

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

