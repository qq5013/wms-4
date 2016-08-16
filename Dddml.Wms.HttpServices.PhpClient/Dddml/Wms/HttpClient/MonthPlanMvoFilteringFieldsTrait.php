<?php

namespace Dddml\Wms\HttpClient;


trait MonthPlanMvoFilteringFieldsTrait
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
            'MonthPlanId.PersonalNameFirstName' => 'string',
            'MonthPlanId.PersonalNameLastName' => 'string',
            'MonthPlanId.Year' => 'integer',
            'MonthPlanId.Month' => 'integer',
            'PersonLoves.FirstName' => 'string',
            'PersonLoves.LastName' => 'string',
        ];
    }

}

