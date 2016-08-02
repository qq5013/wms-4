package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public interface PermissionTree extends Tree<PermissionState>
{
    Iterable<PermissionTree> getPermissionTreeChildren();
}

