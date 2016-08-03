<?php

namespace Dddml\Wms\HttpClient;


trait AttributeValueMvoFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
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
            'AttributeName' => 'string',
            'AttributeOrganizationId' => 'string',
            'AttributeDescription' => 'string',
            'AttributeIsMandatory' => 'boolean',
            'AttributeIsInstanceAttribute' => 'boolean',
            'AttributeAttributeValueType' => 'string',
            'AttributeAttributeValueLength' => 'integer',
            'AttributeIsList' => 'boolean',
            'AttributeFieldName' => 'string',
            'AttributeReferenceId' => 'string',
            'AttributeVersion' => 'Long',
            'AttributeCreatedBy' => 'string',
            'AttributeCreatedAt' => '\DateTime',
            'AttributeUpdatedBy' => 'string',
            'AttributeUpdatedAt' => '\DateTime',
            'AttributeActive' => 'boolean',
            'AttributeDeleted' => 'boolean',
            'AttributeValueId.AttributeId' => 'string',
            'AttributeValueId.Value' => 'string',
        ];
    }

}

