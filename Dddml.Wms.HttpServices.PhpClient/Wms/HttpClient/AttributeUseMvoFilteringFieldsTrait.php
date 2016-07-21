<?php

namespace Wms\HttpClient;


trait AttributeUseMvoFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'SequenceNumber' => 'integer',
            'Version' => 'Long',
            'CreatedBy' => 'string',
            'CreatedAt' => '\DateTime',
            'UpdatedBy' => 'string',
            'UpdatedAt' => '\DateTime',
            'Active' => 'boolean',
            'Deleted' => 'boolean',
            'AttributeSetName' => 'string',
            'AttributeSetOrganizationId' => 'string',
            'AttributeSetDescription' => 'string',
            'AttributeSetSerialNumberAttributeId' => 'string',
            'AttributeSetLotAttributeId' => 'string',
            'AttributeSetReferenceId' => 'string',
            'AttributeSetVersion' => 'Long',
            'AttributeSetCreatedBy' => 'string',
            'AttributeSetCreatedAt' => '\DateTime',
            'AttributeSetUpdatedBy' => 'string',
            'AttributeSetUpdatedAt' => '\DateTime',
            'AttributeSetActive' => 'boolean',
            'AttributeSetDeleted' => 'boolean',
            'AttributeSetAttributeUseId.AttributeSetId' => 'string',
            'AttributeSetAttributeUseId.AttributeId' => 'string',
        ];
    }

}

