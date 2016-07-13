<?php

namespace Wms\Domain\Metadata;

class BoundedContextMetadata
{
    const REQUESTER_ID = 'requesterId';
    const COMMAND_TYPE = 'commandType';
    const COMMAND_ID   = 'commandId';

    const HTTP_SERVICE_ORDERS_QUERY_NAME = 'sort';
    const HTTP_SERVICE_FIRST_RESULT_QUERY_NAME = 'firstResult';
    const HTTP_SERVICE_MAX_RESULTS_QUERY_NAME = 'maxResults';
    const HTTP_SERVICE_RETURNED_FIELDS_QUERY_NAME = 'fields';
    const HTTP_SERVICE_FILTER_QUERY_NAME = 'filter';

}


