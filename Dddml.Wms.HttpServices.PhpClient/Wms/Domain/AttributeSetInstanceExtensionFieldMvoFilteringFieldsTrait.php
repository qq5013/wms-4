<?php

namespace Wms\Domain;


trait AttributeSetInstanceExtensionFieldMvoFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'Name' => 'string',
            'Type' => 'string',
            'Length' => 'integer',
            'Alias' => 'string',
            'Description' => 'string',
            'Version' => 'long',
            'CreatedBy' => 'string',
            'CreatedAt' => '\DateTime',
            'UpdatedBy' => 'string',
            'UpdatedAt' => '\DateTime',
            'Active' => 'boolean',
            'Deleted' => 'boolean',
            'AttrSetInstEFGroupFieldType' => 'string',
            'AttrSetInstEFGroupFieldLength' => 'integer',
            'AttrSetInstEFGroupFieldCount' => 'integer',
            'AttrSetInstEFGroupNameFormat' => 'string',
            'AttrSetInstEFGroupDescription' => 'string',
            'AttrSetInstEFGroupVersion' => 'long',
            'AttrSetInstEFGroupCreatedBy' => 'string',
            'AttrSetInstEFGroupCreatedAt' => '\DateTime',
            'AttrSetInstEFGroupUpdatedBy' => 'string',
            'AttrSetInstEFGroupUpdatedAt' => '\DateTime',
            'AttrSetInstEFGroupActive' => 'boolean',
            'AttrSetInstEFGroupDeleted' => 'boolean',
            'AttributeSetInstanceExtensionFieldId.GroupId' => 'string',
            'AttributeSetInstanceExtensionFieldId.Index' => 'string',
        ];
    }

}

