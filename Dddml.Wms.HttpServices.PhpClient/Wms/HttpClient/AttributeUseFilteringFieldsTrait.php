<?php

namespace Wms\HttpClient;


trait AttributeUseFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'AttributeId' => 'string',
            'SequenceNumber' => 'integer',
            'Version' => 'Long',
            'CreatedBy' => 'string',
            'CreatedAt' => '\DateTime',
            'UpdatedBy' => 'string',
            'UpdatedAt' => '\DateTime',
            'Active' => 'boolean',
            'Deleted' => 'boolean',
            'AttributeSetId' => 'string',
            'AttributeSetAttributeUseId.AttributeSetId' => 'string',
            'AttributeSetAttributeUseId.AttributeId' => 'string',
        ];
    }

}

