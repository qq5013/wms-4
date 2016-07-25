package org.dddml.wms.domain.hibernate;

import java.util.Date;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.dddml.wms.domain.*;
import org.dddml.wms.specialization.*;

public class HibernateAttributeSetInstanceExtensionFieldStateDao implements AttributeSetInstanceExtensionFieldStateDao
{
    public SessionFactory sessionFactory;

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    //[Transaction(ReadOnly = true)]
    @Override
    public AttributeSetInstanceExtensionFieldState get(AttributeSetInstanceExtensionFieldId id)
    {
        AttributeSetInstanceExtensionFieldState state = (AttributeSetInstanceExtensionFieldState) getCurrentSession().get(AttributeSetInstanceExtensionFieldState.class, id);
        if (state == null)
        {
            state = new AbstractAttributeSetInstanceExtensionFieldState.SimpleAttributeSetInstanceExtensionFieldState();
            state.setAttributeSetInstanceExtensionFieldId(id);
        }
        return state;
    }

    @Override
    public void save(AttributeSetInstanceExtensionFieldState state)
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
    public Iterable<AttributeSetInstanceExtensionFieldState> findByGroupId(String groupId)
    {
        Criteria criteria = getCurrentSession().createCriteria(AttributeSetInstanceExtensionFieldState.class);
        Junction partIdCondition = Restrictions.conjunction()
            .add(Restrictions.eq("attributeSetInstanceExtensionFieldId.groupId", groupId))
            ;
        return criteria.add(partIdCondition).list();
    }

    @Override
    public void delete(AttributeSetInstanceExtensionFieldState state)
    {
        if (state instanceof Saveable)
        {
            Saveable saveable = (Saveable) state;
            saveable.save();
        }
        getCurrentSession().delete(state);
    }

}

