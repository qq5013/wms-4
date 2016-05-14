using System;
using System.Collections.Generic;


namespace Dddml.Wms.Specialization
{
    public interface IIdFlattenedDto
    {
        string[] FieldNames { get; }

        object GetFieldValue(string fieldName);

        void SetFieldValue(string fieldName, object fieldValue);

        Type GetFieldType(string fieldName);

    }


   

}
