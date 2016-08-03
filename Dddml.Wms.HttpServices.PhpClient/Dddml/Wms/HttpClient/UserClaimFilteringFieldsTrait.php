<?php

namespace Dddml\Wms\HttpClient;


trait UserClaimFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'ClaimType' => 'string',
            'ClaimValue' => 'string',
            'Version' => 'Long',
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

