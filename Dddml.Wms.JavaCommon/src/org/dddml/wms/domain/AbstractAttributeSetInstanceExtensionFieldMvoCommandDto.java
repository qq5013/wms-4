package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.AbstractCommandDto;

public abstract class AbstractAttributeSetInstanceExtensionFieldMvoCommandDto extends AbstractCommandDto
{
    private AttributeSetInstanceExtensionFieldIdDto attributeSetInstanceExtensionFieldId;

    public AttributeSetInstanceExtensionFieldIdDto getAttributeSetInstanceExtensionFieldId()
    {
        return this.attributeSetInstanceExtensionFieldId;
    }

    public void setAttributeSetInstanceExtensionFieldId(AttributeSetInstanceExtensionFieldIdDto attributeSetInstanceExtensionFieldId)
    {
        this.attributeSetInstanceExtensionFieldId = attributeSetInstanceExtensionFieldId;
    }

    private Long attrSetInstEFGroupVersion;

    public Long getAttrSetInstEFGroupVersion()
    {
        return this.attrSetInstEFGroupVersion;
    }

    public void setAttrSetInstEFGroupVersion(Long attrSetInstEFGroupVersion)
    {
        this.attrSetInstEFGroupVersion = attrSetInstEFGroupVersion;
    }


}

