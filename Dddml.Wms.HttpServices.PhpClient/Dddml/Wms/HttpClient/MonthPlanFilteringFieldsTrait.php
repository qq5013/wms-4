<?php

namespace Dddml\Wms\HttpClient;


trait MonthPlanFilteringFieldsTrait
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
            'Year' => 'integer',
            'MonthPlanId.PersonalNameFirstName' => 'string',
            'MonthPlanId.PersonalNameLastName' => 'string',
            'MonthPlanId.Year' => 'integer',
            'MonthPlanId.Month' => 'integer',
            'PersonalName.FirstName' => 'string',
            'PersonalName.LastName' => 'string',
        ];
    }

}

