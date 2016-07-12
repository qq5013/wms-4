<?php

namespace Wms\Domain;


trait UserClaimFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'ClaimId' => 'integer',
            'ClaimType' => 'string',
            'ClaimValue' => 'string',
            'Version' => 'long',
            'CreatedBy' => 'string',
            'CreatedAt' => '\DateTime',
            'UpdatedBy' => 'string',
            'UpdatedAt' => '\DateTime',
            'Active' => 'boolean',
            'Deleted' => 'boolean',
            'UserId' => 'string',
            'UserClaimId.UserId' => 'string',
            'UserClaimId.ClaimId' => 'integer',
        ];
    }

}

