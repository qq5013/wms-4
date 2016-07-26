package org.dddml.wms.domain.hibernate;

import java.util.Date;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.dddml.wms.domain.*;
import org.dddml.wms.specialization.*;

public class HibernateAttributeUseStateDao implements AttributeUseStateDao
{
    public SessionFactory sessionFactory;

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    //[Transaction(ReadOnly = true)]
    @Override
    public AttributeUseState get(AttributeSetAttributeUseId id)
    {
        AttributeUseState state = (AttributeUseState) getCurrentSession().get(AbstractAttributeUseState.SimpleAttributeUseState.class, id);
        if (state == null)
        {
            state = new AbstractAttributeUseState.SimpleAttributeUseState();
            state.setAttributeSetAttributeUseId(id);
        }
        return state;
    }

    @Override
    public void save(AttributeUseState state)
    {
        getCurrentSession().saveOrUpdate(state);
        if (state instanceof Saveable)
        {
            Saveable saveable = (Saveable) state;
            saveable.save();
        }
    }

    //[Transaction(ReadOnly = true)]
    @Override
    public Iterable<AttributeUseState> findByAttributeSetId(String attributeSetId)
    {
        Criteria criteria = getCurrentSession().createCriteria(AbstractAttributeUseState.SimpleAttributeUseState.class);
        Junction partIdCondition = Restrictions.conjunction()
            .add(Restrictions.eq("attributeSetAttributeUseId.attributeSetId", attributeSetId))
            ;
        return criteria.add(partIdCondition).list();
    }

    @Override
    public void delete(AttributeUseState state)
    {
        if (state instanceof Saveable)
        {
            Saveable saveable = (Saveable) state;
            saveable.save();
        }
        getCurrentSession().delete(state);
    }

}

