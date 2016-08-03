<?php

namespace Dddml\Wms\HttpClient;


trait AudienceFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'ClientId' => 'string',
            'Name' => 'string',
            'Base64Secret' => 'string',
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

