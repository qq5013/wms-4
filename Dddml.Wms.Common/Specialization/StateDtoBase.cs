using System;
using System.Collections.Generic;


namespace Dddml.Wms.Specialization
{

    public abstract class StateDtoBase : IStateDto
    {

        private string _returnedFieldsString;

        private IDictionary<string, string> _returnedFields;

        protected virtual IDictionary<string, string> ReturnedFields
        {
            get
            {
                if (_returnedFields == null)
                {
                    return new Dictionary<string, string>();
                }
                return _returnedFields;
            }
        }

        public virtual bool AllFieldsReturned { get; set; }

        private IDictionary<string, string> _returnedFieldsExcludingCollection;

        protected virtual IDictionary<string, string> GetReturnedFieldsExcludingCollection()
        {
                if (_returnedFieldsExcludingCollection != null)
                {
                    return _returnedFieldsExcludingCollection;
                }
                var fsDic = new Dictionary<string, string>();
                foreach (var p in ReturnedFields)
                {
                    if (!IsCollectionField(p.Key))
                    {
                        fsDic.Add(p.Key, p.Value);
                    }
                }
                _returnedFieldsExcludingCollection = fsDic;
                return _returnedFieldsExcludingCollection;
        }

        // //////////////////////////////////////////////////////////

        public virtual string ReturnedFieldsString
        {
            protected internal get
            {
                return _returnedFieldsString;
            }
            set
            {
                _returnedFieldsString = value;
                var fsDic = new Dictionary<string, string>();
                if (_returnedFieldsString != null)
                {
                    var fs = _returnedFieldsString.Split(new string[]{ReturnedFieldsStringSeparator}, StringSplitOptions.RemoveEmptyEntries);
                    foreach (var f in fs)
                    {
                        if (!String.IsNullOrWhiteSpace(f))
                        {
                            var f1 = f.Trim();
                            int i = f.IndexOf('.');
                            if (i >= 0)
                            {
                                fsDic[f1.Substring(0, i)] = f1.Substring(i+1);
                            }
                            else
                            {
                                fsDic.Add(f1, null);
                            }
                        }
                    }
                }
                _returnedFields = fsDic;
                _returnedFieldsExcludingCollection = null;
            }
        }

        public virtual bool ReturnedFieldsContains(string fieldName)
        {
            if (AllFieldsReturned)
            {
                return true;
            }

            //对于集合类型的属性，需要显式地要求返回
            if (IsCollectionField(fieldName))
            {
                if (CollectionUtils.DictionaryContainsKeyIgnoringCase(ReturnedFields, fieldName))
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }

            //对于集合类型之外的属性，缺省就是都返回的
            var returnedFieldsExcludingCollection = GetReturnedFieldsExcludingCollection();
            if (returnedFieldsExcludingCollection.Count <= 0)
            {
                return true;
            }
            return CollectionUtils.DictionaryContainsKeyIgnoringCase(returnedFieldsExcludingCollection, fieldName);
        }
        
        protected abstract bool IsCollectionField(string fieldName);

        protected virtual string ReturnedFieldsStringSeparator 
        { 
            get 
            {
                return ",";
            } 
        }
    
    }

}
