using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Dddml.Support.Criterion;
using NHibernateICriterion = NHibernate.Criterion.ICriterion;
using NHibernateRestrictions = NHibernate.Criterion.Restrictions;

namespace Dddml.Wms.Specialization.NHibernate
{
    public static class CriterionUtils
    {
        public static NHibernateICriterion ToNHibernateCriterion(Dddml.Support.Criterion.ICriterion criterion)
        {

            NHibernateICriterion cr = null;

            if (criterion is SimpleExpression)
            {
                var e = criterion as SimpleExpression;

                if (e.Op.Trim().Equals(Restrictions.OpEq, StringComparison.InvariantCultureIgnoreCase)) { cr = NHibernateRestrictions.Eq(e.PropertyName, e.Value); }
                if (e.Op.Trim().Equals(Restrictions.OpGt, StringComparison.InvariantCultureIgnoreCase)) { cr = NHibernateRestrictions.Gt(e.PropertyName, e.Value); }
                if (e.Op.Trim().Equals(Restrictions.OpLt, StringComparison.InvariantCultureIgnoreCase)) { cr = NHibernateRestrictions.Lt(e.PropertyName, e.Value); }
                if (e.Op.Trim().Equals(Restrictions.OpGe, StringComparison.InvariantCultureIgnoreCase)) { cr = NHibernateRestrictions.Ge(e.PropertyName, e.Value); }
                if (e.Op.Trim().Equals(Restrictions.OpLe, StringComparison.InvariantCultureIgnoreCase)) { cr = NHibernateRestrictions.Le(e.PropertyName, e.Value); }
                if (e.Op.Trim().Equals(Restrictions.OpLike, StringComparison.InvariantCultureIgnoreCase)) { cr = NHibernateRestrictions.Like(e.PropertyName, e.Value); }
            }
            else
            {
                if (criterion is InsensitiveLikeExpression) { var e = criterion as InsensitiveLikeExpression; cr = NHibernateRestrictions.InsensitiveLike(e.PropertyName, e.Value); }
                if (criterion is InExpression) { var e = criterion as InExpression; cr = NHibernateRestrictions.In(e.PropertyName, e.Values); }
                if (criterion is NullExpression) { var e = criterion as NullExpression; cr = NHibernateRestrictions.IsNull(e.PropertyName); }
                if (criterion is NotNullExpression) { var e = criterion as NotNullExpression; cr = NHibernateRestrictions.IsNotNull(e.PropertyName); }
                if (criterion is BetweenExpression) { var e = criterion as BetweenExpression; cr = NHibernateRestrictions.Between(e.PropertyName, e.Lo, e.Hi); }
                if (criterion is AndExpression) { var e = criterion as AndExpression; cr = NHibernateRestrictions.And(ToNHibernateCriterion(e.LeftHandSide), ToNHibernateCriterion(e.RightHandSide)); }
                if (criterion is OrExpression) { var e = criterion as OrExpression; cr = NHibernateRestrictions.Or(ToNHibernateCriterion(e.LeftHandSide), ToNHibernateCriterion(e.RightHandSide)); }
                if (criterion is NotExpression) { var e = criterion as NotExpression; cr = NHibernateRestrictions.Not(ToNHibernateCriterion(e.Criterion)); }
                if (criterion is Disjunction)
                {
                    var e = criterion as Disjunction;
                    var j = NHibernateRestrictions.Disjunction();
                    foreach (var c in e.Criteria) { j.Add(ToNHibernateCriterion(c)); }
                    cr = j;
                }
                if (criterion is Conjunction)
                {
                    var e = criterion as Conjunction;
                    var j = NHibernateRestrictions.Conjunction();
                    foreach (var c in e.Criteria) { j.Add(ToNHibernateCriterion(c)); }
                    cr = j;
                }

                if (criterion is EqPropertyExpression) { var e = criterion as EqPropertyExpression; cr = NHibernateRestrictions.EqProperty(e.LhsPropertyName, e.RhsPropertyName); }
                if (criterion is GtPropertyExpression) { var e = criterion as GtPropertyExpression; cr = NHibernateRestrictions.GtProperty(e.LhsPropertyName, e.RhsPropertyName); }
                if (criterion is LtPropertyExpression) { var e = criterion as LtPropertyExpression; cr = NHibernateRestrictions.LtProperty(e.LhsPropertyName, e.RhsPropertyName); }
                if (criterion is GePropertyExpression) { var e = criterion as GePropertyExpression; cr = NHibernateRestrictions.GeProperty(e.LhsPropertyName, e.RhsPropertyName); }
                if (criterion is LePropertyExpression) { var e = criterion as LePropertyExpression; cr = NHibernateRestrictions.LeProperty(e.LhsPropertyName, e.RhsPropertyName); }
            }
            if (cr == null)
            {
                throw new NotSupportedException(String.Format("Not supported criterion. type name: {0}, {1}", criterion.GetType().Name, criterion));
            }
            return cr;
        }
    }
}
