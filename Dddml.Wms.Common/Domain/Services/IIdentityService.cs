using System;
using System.Collections.Generic;


namespace Dddml.Wms.Domain.Services
{
    public partial interface IIdentityService
    {
        IEnumerable<string> GetUserRoleIds(string userId);
    }
}
