using System;
using System.Collections.Generic;
using System.Text;
using System.ComponentModel;


namespace Dddml.Wms.Specialization
{
    public abstract class IdFlattenedDtoFormatterBase<TDto> : IIdFlattenedDtoFormatter<TDto> where TDto : IIdFlattenedDto, new()
    {

        public TDto Parse(string text)
        {
            string[] strValues = text.Split(new string[] { FieldSeparator }, StringSplitOptions.RemoveEmptyEntries);
            var obj = new TDto();

            var fieldNames = obj.FieldNames;
            if (strValues.Length != fieldNames.Length)
            {
                throw new ArgumentException(String.Format("The fields count in argument \"{0}\" is NOT right.", "text"));
            }
            for (int i = 0; i < fieldNames.Length; i++)
            {
                var fieldName = fieldNames[i];
                var strVal = strValues[i].Trim();
                var converter = TypeDescriptor.GetConverter(obj.GetFieldType(fieldName));
                var val = converter.ConvertFromString(strVal);
                obj.SetFieldValue(fieldName, val);
            }
            return obj;
        }

        public virtual string ToString(TDto value)
        {
            StringBuilder sb = new StringBuilder();
            foreach (var f in value.FieldNames)
            {
                var fVal = value.GetFieldValue(f);
                sb.Append(TypeDescriptor.GetConverter(fVal).ConvertToString(fVal));
            }
            return sb.ToString();
        }


        protected virtual string FieldSeparator
        {
            get
            {
                return ",";
            }
        }
    }


}
