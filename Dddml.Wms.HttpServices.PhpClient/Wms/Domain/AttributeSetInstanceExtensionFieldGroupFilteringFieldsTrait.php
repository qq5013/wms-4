<?php

namespace Wms\Domain;


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
            'Version' => 'long',
            'CreatedBy' => 'string',
            'CreatedAt' => '\DateTime',
            'UpdatedBy' => 'string',
            'UpdatedAt' => '\DateTime',
            'Active' => 'boolean',
            'Deleted' => 'boolean',
        ];
    }

}

