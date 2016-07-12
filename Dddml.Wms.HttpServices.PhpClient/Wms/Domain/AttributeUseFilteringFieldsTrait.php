<?php

namespace Wms\Domain;


trait AttributeUseFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'AttributeId' => 'string',
            'SequenceNumber' => 'integer',
            'Version' => 'long',
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

