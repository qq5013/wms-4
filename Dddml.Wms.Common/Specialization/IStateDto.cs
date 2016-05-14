using System;
using System.Collections.Generic;


namespace Dddml.Wms.Specialization
{
    public interface IStateDto
    {
        string ReturnedFieldsString { set; }

        bool ReturnedFieldsContains(string fieldName);

        bool AllFieldsReturned { get; set; }

    }
}
