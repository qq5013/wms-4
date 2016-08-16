<?php

namespace Dddml\Wms\HttpClient;


trait YearPlanFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'Description' => 'string',
            'Version' => 'Long',
            'CreatedBy' => 'string',
            'CreatedAt' => '\DateTime',
            'UpdatedBy' => 'string',
            'UpdatedAt' => '\DateTime',
            'Active' => 'boolean',
            'Deleted' => 'boolean',
            'YearPlanId.PersonalNameFirstName' => 'string',
            'YearPlanId.PersonalNameLastName' => 'string',
            'YearPlanId.Year' => 'integer',
            'PersonalName.FirstName' => 'string',
            'PersonalName.LastName' => 'string',
        ];
    }

}

