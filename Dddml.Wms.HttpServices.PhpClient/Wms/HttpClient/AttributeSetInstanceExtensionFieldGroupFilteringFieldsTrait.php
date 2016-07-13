<?php

namespace Wms\HttpClient;


trait AttributeSetInstanceExtensionFieldGroupFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'Id' => 'string',
            'FieldType' => 'string',
            'FieldLength' => 'integer',
            'FieldCount' => 'integer',
            'NameFormat' => 'string',
            'Description' => 'string',
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

