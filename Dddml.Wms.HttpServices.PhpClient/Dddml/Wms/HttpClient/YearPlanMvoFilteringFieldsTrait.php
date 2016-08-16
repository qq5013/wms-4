<?php

namespace Dddml\Wms\HttpClient;


trait YearPlanMvoFilteringFieldsTrait
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
            'PersonBirthDate' => '\DateTime',
            'PersonVersion' => 'Long',
            'PersonCreatedBy' => 'string',
            'PersonCreatedAt' => '\DateTime',
            'PersonUpdatedBy' => 'string',
            'PersonUpdatedAt' => '\DateTime',
            'PersonActive' => 'boolean',
            'PersonDeleted' => 'boolean',
            'YearPlanId.PersonalNameFirstName' => 'string',
            'YearPlanId.PersonalNameLastName' => 'string',
            'YearPlanId.Year' => 'integer',
            'PersonLoves.FirstName' => 'string',
            'PersonLoves.LastName' => 'string',
        ];
    }

}

