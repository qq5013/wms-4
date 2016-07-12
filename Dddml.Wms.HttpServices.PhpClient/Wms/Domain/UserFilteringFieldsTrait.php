<?php

namespace Wms\Domain;


trait UserFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'UserId' => 'string',
            'UserName' => 'string',
            'AccessFailedCount' => 'integer',
            'Email' => 'string',
            'EmailConfirmed' => 'boolean',
            'LockoutEnabled' => 'boolean',
            'LockoutEndDateUtc' => '\DateTime',
            'PasswordHash' => 'string',
            'PhoneNumber' => 'string',
            'PhoneNumberConfirmed' => 'boolean',
            'TwoFactorEnabled' => 'boolean',
            'SecurityStamp' => 'string',
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

