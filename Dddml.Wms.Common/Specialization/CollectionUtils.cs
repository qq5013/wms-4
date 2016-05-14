using System;
using System.Collections.Generic;
using System.Linq;


namespace Dddml.Wms.Specialization
{
    public static class CollectionUtils
    {

        public static bool CollectionContainsIgnoringCase(ICollection<string> collection, string val)
        {
             if (collection.Contains(val))
            {
                return true;
            }
            foreach (var f in collection)
            {
                if (String.Equals(f, val, StringComparison.InvariantCultureIgnoreCase))
                {
                    return true;
                }
            }
            return false;
        }

        public static bool DictionaryContainsKeyIgnoringCase(IDictionary<string, string> dictionary, string key)
        {
            if (dictionary.ContainsKey(key))
            {
                return true;
            }
            foreach (var f in dictionary.Keys)
            {
                if (String.Equals(f, key, StringComparison.InvariantCultureIgnoreCase))
                {
                    return true;
                }
            }
            return false;
        }

        public static string DictionaryGetValueIgnoringCase(IDictionary<string, string> dictionary, string key)
        {
            if (dictionary.ContainsKey(key))
            {
                return dictionary[key];
            }
            foreach (var f in dictionary.Keys)
            {
                if (String.Equals(f, key, StringComparison.InvariantCultureIgnoreCase))
                {
                    return dictionary[f];
                }
            }
            return null;
        }

    }
}
