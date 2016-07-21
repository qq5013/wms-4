<?php

namespace Wms\HttpClient;


trait AttributeSetInstanceExtensionFieldFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'Name' => 'string',
            'Type' => 'string',
            'Length' => 'integer',
            'Alias' => 'string',
            'Description' => 'string',
            'Version' => 'Long',
            'CreatedBy' => 'string',
            'CreatedAt' => '\DateTime',
            'UpdatedBy' => 'string',
            'UpdatedAt' => '\DateTime',
            'Active' => 'boolean',
            'Deleted' => 'boolean',
            'GroupId' => 'string',
            'AttributeSetInstanceExtensionFieldId.GroupId' => 'string',
            'AttributeSetInstanceExtensionFieldId.Index' => 'string',
        ];
    }

}

