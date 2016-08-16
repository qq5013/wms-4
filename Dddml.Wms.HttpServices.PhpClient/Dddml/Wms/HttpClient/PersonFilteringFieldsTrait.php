<?php

namespace Dddml\Wms\HttpClient;


trait PersonFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'BirthDate' => '\DateTime',
            'Version' => 'Long',
            'CreatedBy' => 'string',
            'CreatedAt' => '\DateTime',
            'UpdatedBy' => 'string',
            'UpdatedAt' => '\DateTime',
            'Active' => 'boolean',
            'Deleted' => 'boolean',
            'PersonalName.FirstName' => 'string',
            'PersonalName.LastName' => 'string',
            'Loves.FirstName' => 'string',
            'Loves.LastName' => 'string',
        ];
    }

}

