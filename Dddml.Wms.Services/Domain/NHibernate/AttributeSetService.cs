using Dddml.Wms.Domain;
using Dddml.Wms.Domain.Services;
using Dddml.Wms.Specialization;
using Spring.Transaction.Interceptor;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Dddml.Wms.Domain.Services.NHibernate
{

    public class AttributeSetService : IAttributeSetService
    {

        public IAttributeSetStateRepository AttributeSetStateRepository { get; set; }

        public IAttributeStateRepository AttributeStateRepository { get; set; }

        public AttributeSetService()
        {
        }

        [Transaction(ReadOnly = true)]
        public virtual IDictionary<string, string> GetExtensionPropertyFieldDictionary(string attributeSetId)
        {
            var attrSet = AttributeSetStateRepository.Get(attributeSetId);
            var pDic = new Dictionary<string, string>();
            if (attrSet != null)
            {
                foreach (var au in attrSet.AttributeUses)
                {
                    var a = AttributeStateRepository.Get(au.AttributeId);
                    pDic.Add(a.Name, a.FieldName);
                }
            }
            return pDic;
        }

    }

}
