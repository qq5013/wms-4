package org.dddml.wms.domain;

import java.util.Date;

public class CreateOrMergePatchAttributeSetDto extends AbstractAttributeSetCommandDto
{
    private String name;

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    private String organizationId;

    public String getOrganizationId()
    {
        return this.organizationId;
    }

    public void setOrganizationId(String organizationId)
    {
        this.organizationId = organizationId;
    }

    private String description;

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    private String serialNumberAttributeId;

    public String getSerialNumberAttributeId()
    {
        return this.serialNumberAttributeId;
    }

    public void setSerialNumberAttributeId(String serialNumberAttributeId)
    {
        this.serialNumberAttributeId = serialNumberAttributeId;
    }

    private String lotAttributeId;

    public String getLotAttributeId()
    {
        return this.lotAttributeId;
    }

    public void setLotAttributeId(String lotAttributeId)
    {
        this.lotAttributeId = lotAttributeId;
    }

    private String referenceId;

    public String getReferenceId()
    {
        return this.referenceId;
    }

    public void setReferenceId(String referenceId)
    {
        this.referenceId = referenceId;
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

    private CreateOrMergePatchAttributeUseDto[] attributeUses;

    public CreateOrMergePatchAttributeUseDto[] getAttributeUses()
    {
        return this.attributeUses;
    }

    public void setAttributeUses(CreateOrMergePatchAttributeUseDto[] attributeUses)
    {
        this.attributeUses = attributeUses;
    }

    private Boolean isPropertyNameRemoved;

    public Boolean getIsPropertyNameRemoved()
    {
        return this.isPropertyNameRemoved;
    }

    public void setIsPropertyNameRemoved(Boolean isPropertyNameRemoved)
    {
        this.isPropertyNameRemoved = isPropertyNameRemoved;
    }

    private Boolean isPropertyOrganizationIdRemoved;

    public Boolean getIsPropertyOrganizationIdRemoved()
    {
        return this.isPropertyOrganizationIdRemoved;
    }

    public void setIsPropertyOrganizationIdRemoved(Boolean isPropertyOrganizationIdRemoved)
    {
        this.isPropertyOrganizationIdRemoved = isPropertyOrganizationIdRemoved;
    }

    private Boolean isPropertyDescriptionRemoved;

    public Boolean getIsPropertyDescriptionRemoved()
    {
        return this.isPropertyDescriptionRemoved;
    }

    public void setIsPropertyDescriptionRemoved(Boolean isPropertyDescriptionRemoved)
    {
        this.isPropertyDescriptionRemoved = isPropertyDescriptionRemoved;
    }

    private Boolean isPropertySerialNumberAttributeIdRemoved;

    public Boolean getIsPropertySerialNumberAttributeIdRemoved()
    {
        return this.isPropertySerialNumberAttributeIdRemoved;
    }

    public void setIsPropertySerialNumberAttributeIdRemoved(Boolean isPropertySerialNumberAttributeIdRemoved)
    {
        this.isPropertySerialNumberAttributeIdRemoved = isPropertySerialNumberAttributeIdRemoved;
    }

    private Boolean isPropertyLotAttributeIdRemoved;

    public Boolean getIsPropertyLotAttributeIdRemoved()
    {
        return this.isPropertyLotAttributeIdRemoved;
    }

    public void setIsPropertyLotAttributeIdRemoved(Boolean isPropertyLotAttributeIdRemoved)
    {
        this.isPropertyLotAttributeIdRemoved = isPropertyLotAttributeIdRemoved;
    }

    private Boolean isPropertyReferenceIdRemoved;

    public Boolean getIsPropertyReferenceIdRemoved()
    {
        return this.isPropertyReferenceIdRemoved;
    }

    public void setIsPropertyReferenceIdRemoved(Boolean isPropertyReferenceIdRemoved)
    {
        this.isPropertyReferenceIdRemoved = isPropertyReferenceIdRemoved;
    }

    private Boolean isPropertyActiveRemoved;

    public Boolean getIsPropertyActiveRemoved()
    {
        return this.isPropertyActiveRemoved;
    }

    public void setIsPropertyActiveRemoved(Boolean isPropertyActiveRemoved)
    {
        this.isPropertyActiveRemoved = isPropertyActiveRemoved;
    }


    public static class CreateAttributeSetDto extends CreateOrMergePatchAttributeSetDto
    {
        @Override
        public String getCommandType() {
            return AbstractCommandDto.COMMAND_TYPE_CREATE;
        }

    }

    public static class MergePatchAttributeSetDto extends CreateOrMergePatchAttributeSetDto
    {
        @Override
        public String getCommandType() {
            return AbstractCommandDto.COMMAND_TYPE_MERGE_PATCH;
        }

    }

}

