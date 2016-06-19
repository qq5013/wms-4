using System.Collections.Generic;
using Microsoft.AspNet.Identity;
using Dddml.Wms.Domain;

namespace Dddml.Wms.AspNet.Identity
{
    public class IdentityRole : IRole
    {

        private RoleState _state;

        public RoleState State 
        {
            get { return _state; }
        }

        public string RoleId
        {
            get { return _state.RoleId; }
            set { _state.RoleId = value; }
        }

        public string Name
        {
            get { return _state.Name; }
            set { _state.Name = value; }
        }

        string IRole<string>.Id
        {
            get { return _state.RoleId; }
        }

        string IRole<string>.Name
        {
            get
            {
                return _state.Name;
            }
            set
            {
                _state.Name = value;
            }
        }

        public IdentityRole()
            : this(new RoleState())
        {
        }

        public IdentityRole(RoleState state)
        {
            this._state = state;
        }

        //public IdentityRole(string roleName) : this()
        //{
        //    _state.Name = roleName;
        //}

    }


}