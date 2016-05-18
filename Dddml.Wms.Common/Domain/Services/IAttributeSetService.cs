using System;
using System.Collections.Generic;
using System.Text;

namespace Dddml.Wms.Domain.Services
{
    public interface IAttributeSetService
    {
        IDictionary<string, string> GetExtensionPropertyFieldDictionary(string attributeSetId);

    }
}
