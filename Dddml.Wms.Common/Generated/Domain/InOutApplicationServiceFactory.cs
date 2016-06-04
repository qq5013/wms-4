﻿// <autogenerated>
//   This file was generated by T4 code generator GenerateBoundedContextDomainAggregates.tt.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

using System;
using System.Collections.Generic;
using Dddml.Wms.Specialization;
using Dddml.Wms.Domain;

namespace Dddml.Wms.Domain
{

    public partial class InOutApplicationServiceFactory : IInOutApplicationServiceFactory
    {

        public virtual IInOutApplicationService InOutApplicationService 
        {
		    get
		    {
			    return ApplicationContext.Current["InOutApplicationService"] as IInOutApplicationService;
		    }
        }

        public virtual ICreateInOut NewCreateInOut()
        {
		    return new CreateInOut();
        }

        public virtual IMergePatchInOut NewMergePatchInOut()
        {
            return new MergePatchInOut();
        }

        public virtual IDeleteInOut NewDeleteInOut()
        {
            return new DeleteInOut();
        }

    }


}

