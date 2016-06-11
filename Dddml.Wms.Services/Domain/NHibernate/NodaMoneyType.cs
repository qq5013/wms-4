using NHibernate.UserTypes;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NHibernate.Engine;
using NHibernate.Type;
using NodaMoney;


namespace Dddml.Wms.Services.Domain.NHibernate
{
    public class NodaMoneyType : ICompositeUserType
    {

        public string[] PropertyNames
        {
            get { return new string[] { "Amount", "Currency" }; }
        }

        public IType[] PropertyTypes
        {
            get { return new IType[] { new DecimalType(), TypeFactory.GetStringType(10) }; }
        }
        
        public new bool Equals(object x, object y)
        {
            if (x == null) { return y == null; }
            return x.Equals(y);
        }

        public int GetHashCode(object x)
        {
            return x.GetHashCode();
        }

        public bool IsMutable
        {
            get { return false; }
        }

        public Type ReturnedClass
        {
            get { return typeof(Money); }
        }

        public object GetPropertyValue(object component, int property)
        {
            if (component == null)
            {
                return null;
            }
            Money money = (Money)component;
            switch (property)
            {
                case 0:
                    return money.Amount;
                case 1:
                    return money.Currency.Code;
                default:
                    throw new IndexOutOfRangeException(String.Format("Invalid property index [{0}].", property));
            }

        }

        public void SetPropertyValue(object component, int property, object value)
        {
            throw new InvalidOperationException();
        }

        public object NullSafeGet(System.Data.IDataReader dr, string[] names, ISessionImplementor session, object owner)
        {
            object amount = PropertyTypes[0].NullSafeGet(dr, names[0], session, owner);
            string currencyCode = (string)PropertyTypes[1].NullSafeGet(dr, names[1], session, owner);
            return amount == null && currencyCode == null ? default(Money) : new Money((decimal)amount, currencyCode);
        }

        public void NullSafeSet(System.Data.IDbCommand cmd, object value, int index, bool[] settable, ISessionImplementor session)
        {
            if (value == null)
            {
                if (settable[index]) { PropertyTypes[0].NullSafeSet(cmd, null, index, session); }
                if (settable[index + 1]) { PropertyTypes[0].NullSafeSet(cmd, null, index + 1, session); }
            }
            else 
            {
                Money money = (Money)value;
                if (settable[index]) { PropertyTypes[0].NullSafeSet(cmd, money.Amount, index, session); }
                if (settable[index + 1]) { PropertyTypes[0].NullSafeSet(cmd, money.Currency.Code, index + 1, session); }
            }

        }

        public object Replace(object original, object target, ISessionImplementor session, object owner)
        {
            return DeepCopy(original);
        }

        public object DeepCopy(object value)
        {
            if (value == null) { return null; }

            Money money = (Money)value;
            return new Money(money.Amount, money.Currency);
        }

        public object Assemble(object cached, ISessionImplementor session, object owner)
        {
            return cached;
        }

        public object Disassemble(object value, ISessionImplementor session)
        {
            return value;
        }

    }
}
