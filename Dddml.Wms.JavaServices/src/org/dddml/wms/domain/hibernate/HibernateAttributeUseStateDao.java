package org.dddml.wms.domain.hibernate;

import java.util.Date;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.dddml.wms.domain.*;
import org.dddml.wms.specialization.*;
import org.springframework.transaction.annotation.Transactional;

public class HibernateAttributeUseStateDao implements AttributeUseStateDao
{
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() { return this.sessionFactory; }

    public void setSessionFactory(SessionFactory sessionFactory) { this.sessionFactory = sessionFactory; }

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Transactional(readOnly = true)
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
        if(state.getVersion() == null) {
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

    @Transactional(readOnly = true)
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

