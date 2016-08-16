<?php

namespace Dddml\Wms\HttpClient;


trait DayPlanMvoFilteringFieldsTrait
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
            'MonthPlanDescription' => 'string',
            'MonthPlanVersion' => 'Long',
            'MonthPlanCreatedBy' => 'string',
            'MonthPlanCreatedAt' => '\DateTime',
            'MonthPlanUpdatedBy' => 'string',
            'MonthPlanUpdatedAt' => '\DateTime',
            'MonthPlanActive' => 'boolean',
            'MonthPlanDeleted' => 'boolean',
            'YearPlanDescription' => 'string',
            'YearPlanVersion' => 'Long',
            'YearPlanCreatedBy' => 'string',
            'YearPlanCreatedAt' => '\DateTime',
            'YearPlanUpdatedBy' => 'string',
            'YearPlanUpdatedAt' => '\DateTime',
            'YearPlanActive' => 'boolean',
            'YearPlanDeleted' => 'boolean',
            'PersonBirthDate' => '\DateTime',
            'PersonVersion' => 'Long',
            'PersonCreatedBy' => 'string',
            'PersonCreatedAt' => '\DateTime',
            'PersonUpdatedBy' => 'string',
            'PersonUpdatedAt' => '\DateTime',
            'PersonActive' => 'boolean',
            'PersonDeleted' => 'boolean',
            'DayPlanId.PersonalNameFirstName' => 'string',
            'DayPlanId.PersonalNameLastName' => 'string',
            'DayPlanId.Year' => 'integer',
            'DayPlanId.Month' => 'integer',
            'DayPlanId.Day' => 'integer',
            'PersonLoves.FirstName' => 'string',
            'PersonLoves.LastName' => 'string',
        ];
    }

}

