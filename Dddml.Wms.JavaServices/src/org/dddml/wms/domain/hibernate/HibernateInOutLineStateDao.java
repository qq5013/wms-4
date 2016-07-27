package org.dddml.wms.domain.hibernate;

import java.math.BigDecimal;
import java.util.Date;
import org.hibernate.*;
import org.hibernate.criterion.*;
import org.dddml.wms.domain.*;
import org.dddml.wms.specialization.*;

public class HibernateInOutLineStateDao implements InOutLineStateDao
{
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() { return this.sessionFactory; }

    public void setSessionFactory(SessionFactory sessionFactory) { this.sessionFactory = sessionFactory; }

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    //[Transaction(ReadOnly = true)]
    @Override
    public InOutLineState get(InOutLineId id)
    {
        InOutLineState state = (InOutLineState) getCurrentSession().get(AbstractInOutLineState.SimpleInOutLineState.class, id);
        if (state == null)
        {
            state = new AbstractInOutLineState.SimpleInOutLineState();
            state.setInOutLineId(id);
        }
        return state;
    }

    @Override
    public void save(InOutLineState state)
    {
        if(state.getVersion() == null || state.getVersion().equals(InOutLineState.VERSION_ZERO)) {
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
    public Iterable<InOutLineState> findByInOutDocumentNumber(String inOutDocumentNumber)
    {
        Criteria criteria = getCurrentSession().createCriteria(AbstractInOutLineState.SimpleInOutLineState.class);
        Junction partIdCondition = Restrictions.conjunction()
            .add(Restrictions.eq("inOutLineId.inOutDocumentNumber", inOutDocumentNumber))
            ;
        return criteria.add(partIdCondition).list();
    }

    @Override
    public void delete(InOutLineState state)
    {
        if (state instanceof Saveable)
        {
            Saveable saveable = (Saveable) state;
            saveable.save();
        }
        getCurrentSession().delete(state);
    }

}

