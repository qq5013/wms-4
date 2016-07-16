package org.dddml.wms.domain.meta;

public interface BoundedContextMetadata
{
    String REQUESTER_ID = "requesterId";
    String COMMAND_TYPE = "commandType";
    String COMMAND_ID   = "commandId";

    String HTTP_SERVICE_ORDERS_QUERY_NAME = "sort";
    String HTTP_SERVICE_FIRST_RESULT_QUERY_NAME = "firstResult";
    String HTTP_SERVICE_MAX_RESULTS_QUERY_NAME = "maxResults";
    String HTTP_SERVICE_RETURNED_FIELDS_QUERY_NAME = "fields";
    String HTTP_SERVICE_FILTER_QUERY_NAME = "filter";

}


