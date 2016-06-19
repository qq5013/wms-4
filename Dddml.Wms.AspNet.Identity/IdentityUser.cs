using System;
using System.Collections.Generic;
using Microsoft.AspNet.Identity;
using Dddml.Wms.Domain;

namespace Dddml.Wms.AspNet.Identity
{
    public class IdentityUser : IUser
    {
        private UserState _state;

        public UserState State
        {
            get { return _state; }
        }

        public string UserId
        {
            get { return _state.UserId; }
            set { _state.UserId = value; }
        }

        string IUser<string>.Id
        {
            get { return _state.UserId; }
        }

        public string UserName
        {
            get { return _state.UserName; }
            set { _state.UserName = value; }
        }

        string IUser<string>.UserName
        {
            get
            {
                return _state.UserName;
            }
            set
            {
                _state.UserName = value;
            }
        }

        public int AccessFailedCount { get { return _state.AccessFailedCount; } set { _state.AccessFailedCount = value; } }

        public string Email { get { return _state.Email; } set { _state.Email = value; } }

        public bool EmailConfirmed { get { return _state.EmailConfirmed; } set { _state.EmailConfirmed = value; } }

        public bool LockoutEnabled { get { return _state.LockoutEnabled; } set { _state.LockoutEnabled = value; } }

        public DateTime? LockoutEndDateUtc { get { return _state.LockoutEndDateUtc; } set { _state.LockoutEndDateUtc = value; } }

        public string PasswordHash { get { return _state.PasswordHash; } set { _state.PasswordHash = value; } }

        public string PhoneNumber { get { return _state.PhoneNumber; } set { _state.PhoneNumber = value; } }

        public bool PhoneNumberConfirmed { get { return _state.PhoneNumberConfirmed; } set { _state.PhoneNumberConfirmed = value; } }

        public bool TwoFactorEnabled { get { return _state.TwoFactorEnabled; } set { _state.TwoFactorEnabled = value; } }

        public string SecurityStamp { get { return _state.SecurityStamp; } set { _state.SecurityStamp = value; } }

        //public ICollection<IdentityRole> Roles { get; protected set; }

        //public ICollection<IdentityUserClaim> Claims { get; protected set; }

        //public ICollection<IdentityUserLogin> Logins { get; protected set; }

        public IdentityUser()
            : this(new UserState())
        {
        }

        public IdentityUser(UserState state)
        {
            if (state == null)
            {
                this._state = new UserState();
            }
            else
            {
                this._state = state;
            }
            //this.Roles = new List<IdentityRole>();
            //this.Claims = new List<IdentityUserClaim>();
            //this.Logins = new List<IdentityUserLogin>();
        }


        //public IdentityUser(string userName)
        //    : this()
        //{
        //    _state.UserName = userName;
        //}

    }

}