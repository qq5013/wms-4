<?php

namespace Wms\HttpClient;


trait AttributeSetFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'AttributeSetId' => 'string',
            'Name' => 'string',
            'OrganizationId' => 'string',
            'Description' => 'string',
            'SerialNumberAttributeId' => 'string',
            'LotAttributeId' => 'string',
            'ReferenceId' => 'string',
            'Version' => 'Long',
            'CreatedBy' => 'string',
            'CreatedAt' => '\DateTime',
            'UpdatedBy' => 'string',
            'UpdatedAt' => '\DateTime',
            'Active' => 'boolean',
            'Deleted' => 'boolean',
        ];
    }

}

