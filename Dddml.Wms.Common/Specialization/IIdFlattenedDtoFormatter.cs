using System;
using System.Collections.Generic;


namespace Dddml.Wms.Specialization
{

    public interface IIdFlattenedDtoFormatter<TDto> where TDto : IIdFlattenedDto
    {
        TDto Parse(string text);

        string ToString(TDto id);
    }

}
