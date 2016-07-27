package org.dddml.wms.domain.hibernate;

import java.util.Date;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.dddml.wms.domain.*;
import org.dddml.wms.specialization.*;

public class HibernateAttributeSetInstanceExtensionFieldStateDao implements AttributeSetInstanceExtensionFieldStateDao
{
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() { return this.sessionFactory; }

    public void setSessionFactory(SessionFactory sessionFactory) { this.sessionFactory = sessionFactory; }

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    //[Transaction(ReadOnly = true)]
    @Override
    public AttributeSetInstanceExtensionFieldState get(AttributeSetInstanceExtensionFieldId id)
    {
        AttributeSetInstanceExtensionFieldState state = (AttributeSetInstanceExtensionFieldState) getCurrentSession().get(AbstractAttributeSetInstanceExtensionFieldState.SimpleAttributeSetInstanceExtensionFieldState.class, id);
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
        if(state.getVersion() == null || state.getVersion().equals(AttributeSetInstanceExtensionFieldState.VERSION_ZERO)) {
            getCurrentSession().save(state);
        }else {
            getCurrentSession().update(state);
        }

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
        Criteria criteria = getCurrentSession().createCriteria(AbstractAttributeSetInstanceExtensionFieldState.SimpleAttributeSetInstanceExtensionFieldState.class);
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

