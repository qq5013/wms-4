// <autogenerated>
//   This file was generated by T4 code generator GenerateBoundedContextDomainAggregates.tt.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.support.criterion.Criterion;
import org.dddml.wms.specialization.*;

public interface TreePermissionStateRepository extends PermissionStateRepository
{
    Iterable<PermissionState> getPermissionTreeRoots(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<PermissionState> getPermissionTreeChildren(String parentId, Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<PermissionState> getPermissionTreeRoots(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<PermissionState> getPermissionTreeChildren(String parentId, Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

}

