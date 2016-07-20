package org.dddml.wms.domain;


public class AttributeSetInstanceExtensionFieldStateEventId
{
    private String groupId;

    public String getGroupId()
    {
        return this.groupId;
    }

    public void setGroupId(String groupId)
    {
        this.groupId = groupId;
    }

    private String index;

    public String getIndex()
    {
        return this.index;
    }

    public void setIndex(String index)
    {
        this.index = index;
    }

    private Long attributeSetInstanceExtensionFieldGroupVersion;

    public Long getAttributeSetInstanceExtensionFieldGroupVersion()
    {
        return this.attributeSetInstanceExtensionFieldGroupVersion;
    }

    public void setAttributeSetInstanceExtensionFieldGroupVersion(Long attributeSetInstanceExtensionFieldGroupVersion)
    {
        this.attributeSetInstanceExtensionFieldGroupVersion = attributeSetInstanceExtensionFieldGroupVersion;
    }

    AttributeSetInstanceExtensionFieldStateEventId ()
    {
    }

    public AttributeSetInstanceExtensionFieldStateEventId (String groupId, String index, Long attributeSetInstanceExtensionFieldGroupVersion)
    {
        this.groupId = groupId;
        this.index = index;
        this.attributeSetInstanceExtensionFieldGroupVersion = attributeSetInstanceExtensionFieldGroupVersion;
    }

}

