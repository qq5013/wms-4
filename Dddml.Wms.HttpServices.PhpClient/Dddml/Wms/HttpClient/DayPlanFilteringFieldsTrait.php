<?php

namespace Dddml\Wms\HttpClient;


trait DayPlanFilteringFieldsTrait
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
            'Month' => 'integer',
            'DayPlanId.PersonalNameFirstName' => 'string',
            'DayPlanId.PersonalNameLastName' => 'string',
            'DayPlanId.Year' => 'integer',
            'DayPlanId.Month' => 'integer',
            'DayPlanId.Day' => 'integer',
            'PersonalName.FirstName' => 'string',
            'PersonalName.LastName' => 'string',
        ];
    }

}

