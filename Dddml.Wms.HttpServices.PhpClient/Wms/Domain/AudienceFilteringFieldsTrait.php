<?php

namespace Wms\Domain;


trait AudienceFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'ClientId' => 'string',
            'Name' => 'string',
            'Base64Secret' => 'string',
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

