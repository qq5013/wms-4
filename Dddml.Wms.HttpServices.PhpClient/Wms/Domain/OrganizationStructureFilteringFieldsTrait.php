<?php

namespace Wms\Domain;


trait OrganizationStructureFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'Version' => 'Long',
            'CreatedBy' => 'string',
            'CreatedAt' => '\DateTime',
            'UpdatedBy' => 'string',
            'UpdatedAt' => '\DateTime',
            'Active' => 'boolean',
            'Deleted' => 'boolean',
            'Id.OrganizationStructureTypeId' => 'string',
            'Id.ParentId' => 'string',
            'Id.SubsidiaryId' => 'string',
        ];
    }

}

