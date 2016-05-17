using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;


namespace Dddml.Wms.Specialization
{

    public abstract class DynamicObjectMapperBase<TDynamicObject, TState, TCommandCreate, TCommandMergePatch>
    {
        public abstract TDynamicObject MapState(TState state);

        public abstract TCommandCreate ToCommandCreate(TDynamicObject dynamicObject);

        public abstract TCommandMergePatch ToCommandMergePatch(TDynamicObject dynamicObject);

    }

}
