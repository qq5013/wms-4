package org.dddml.wms.domain.hibernate;

import java.util.Date;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.dddml.wms.domain.*;
import org.dddml.wms.specialization.*;

public class HibernateAttributeValueStateDao implements AttributeValueStateDao
{
    public SessionFactory sessionFactory;

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    //[Transaction(ReadOnly = true)]
    @Override
    public AttributeValueState get(AttributeValueId id)
    {
        AttributeValueState state = (AttributeValueState) getCurrentSession().get(AbstractAttributeValueState.SimpleAttributeValueState.class, id);
        if (state == null)
        {
            state = new AbstractAttributeValueState.SimpleAttributeValueState();
            state.setAttributeValueId(id);
        }
        return state;
    }

    @Override
    public void save(AttributeValueState state)
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
    public Iterable<AttributeValueState> findByAttributeId(String attributeId)
    {
        Criteria criteria = getCurrentSession().createCriteria(AbstractAttributeValueState.SimpleAttributeValueState.class);
        Junction partIdCondition = Restrictions.conjunction()
            .add(Restrictions.eq("attributeValueId.attributeId", attributeId))
            ;
        return criteria.add(partIdCondition).list();
    }

    @Override
    public void delete(AttributeValueState state)
    {
        if (state instanceof Saveable)
        {
            Saveable saveable = (Saveable) state;
            saveable.save();
        }
        getCurrentSession().delete(state);
    }

}

