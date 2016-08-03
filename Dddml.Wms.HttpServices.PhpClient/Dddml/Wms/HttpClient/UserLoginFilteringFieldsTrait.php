<?php

namespace Dddml\Wms\HttpClient;


trait UserLoginFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'Version' => 'Long',
            'CreatedBy' => 'string',
            'CreatedAt' => '\DateTime',
            'UpdatedBy' => 'string',
            'UpdatedAt' => '\DateTime',
            'Active' => 'boolean',
            'Deleted' => 'boolean',
            'UserId' => 'string',
            'LoginKey.LoginProvider' => 'string',
            'LoginKey.ProviderKey' => 'string',
            'UserLoginId.UserId' => 'string',
            'UserLoginId.LoginKeyLoginProvider' => 'string',
            'UserLoginId.LoginKeyProviderKey' => 'string',
        ];
    }

}

