package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class OrganizationStructureStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "idOrganizationStructureTypeId",
            "idParentId",
            "idSubsidiaryId",
            "version",
        };

    public static final String[] propertyTypes = new String[]{
            "String",
            "String",
            "String",
            "Long",
        };

    public static final Map<String, String> propertyTypeMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }
	
    private OrganizationStructureStateEventId value;

    public OrganizationStructureStateEventIdFlattenedDto()
    {
        this(new OrganizationStructureStateEventId());
    }

    public OrganizationStructureStateEventIdFlattenedDto(OrganizationStructureStateEventId value)
    {
        this.value = value;
    }

    public OrganizationStructureStateEventId toOrganizationStructureStateEventId()
    {
        return this.value;
    }


    public String getIdOrganizationStructureTypeId()
    {
        return this.value.getId().getOrganizationStructureTypeId();
    }

    public void setIdOrganizationStructureTypeId(String idOrganizationStructureTypeId)
    {
        this.value.getId().setOrganizationStructureTypeId(idOrganizationStructureTypeId);
    }

    public String getIdParentId()
    {
        return this.value.getId().getParentId();
    }

    public void setIdParentId(String idParentId)
    {
        this.value.getId().setParentId(idParentId);
    }

    public String getIdSubsidiaryId()
    {
        return this.value.getId().getSubsidiaryId();
    }

    public void setIdSubsidiaryId(String idSubsidiaryId)
    {
        this.value.getId().setSubsidiaryId(idSubsidiaryId);
    }

    public Long getVersion()
    {
        return this.value.getVersion();
    }

    public void setVersion(Long version)
    {
        this.value.setVersion(version);
    }


    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        OrganizationStructureStateEventIdFlattenedDto other = (OrganizationStructureStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

