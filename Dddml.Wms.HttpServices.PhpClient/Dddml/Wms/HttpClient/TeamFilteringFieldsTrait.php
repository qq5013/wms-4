<?php

namespace Dddml\Wms\HttpClient;


trait TeamFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'TeamName' => 'string',
            'Description' => 'string',
            'Version' => 'Long',
            'CreatedBy' => 'string',
            'CreatedAt' => '\DateTime',
            'UpdatedBy' => 'string',
            'UpdatedAt' => '\DateTime',
            'Active' => 'boolean',
            'Deleted' => 'boolean',
        ];
    }

}

