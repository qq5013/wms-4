using System;


namespace Dddml.Wms.Specialization
{
    public interface ICommandDto
    {
        string CommandType { get; }

        ICommand ToCommand();
    }

}
