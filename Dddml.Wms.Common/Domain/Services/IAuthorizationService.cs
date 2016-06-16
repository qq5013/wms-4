using System;
using System.Collections.Generic;


namespace Dddml.Wms.Domain.Services
{
    public partial interface IAuthorizationService
    {
        IEnumerable<string> GetUserAllPermissionIds(string userId);
    }
}
