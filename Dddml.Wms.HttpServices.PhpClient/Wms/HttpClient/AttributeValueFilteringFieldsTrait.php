<?php

namespace Wms\HttpClient;


trait AttributeValueFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'Value' => 'string',
            'Name' => 'string',
            'Description' => 'string',
            'ReferenceId' => 'string',
            'Version' => 'Long',
            'CreatedBy' => 'string',
            'CreatedAt' => '\DateTime',
            'UpdatedBy' => 'string',
            'UpdatedAt' => '\DateTime',
            'Active' => 'boolean',
            'Deleted' => 'boolean',
            'AttributeId' => 'string',
            'AttributeValueId.AttributeId' => 'string',
            'AttributeValueId.Value' => 'string',
        ];
    }

}

