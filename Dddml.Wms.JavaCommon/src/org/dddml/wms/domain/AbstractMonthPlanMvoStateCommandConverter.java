package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractMonthPlanMvoStateCommandConverter<TCreateMonthPlanMvo extends MonthPlanMvoCommand.CreateMonthPlanMvo, TMergePatchMonthPlanMvo extends MonthPlanMvoCommand.MergePatchMonthPlanMvo, TDeleteMonthPlanMvo extends MonthPlanMvoCommand.DeleteMonthPlanMvo>
{
    public MonthPlanMvoCommand toCreateOrMergePatchMonthPlanMvo(MonthPlanMvoState state)
    {
        //where TCreateMonthPlanMvo : ICreateMonthPlanMvo, new()
        //where TMergePatchMonthPlanMvo : IMergePatchMonthPlanMvo, new()
        boolean bUnsaved = state.isStateUnsaved();
        if (bUnsaved)
        {
            return toCreateMonthPlanMvo(state);
        }
        else 
        {
            return toMergePatchMonthPlanMvo(state);
        }
    }

    public TDeleteMonthPlanMvo toDeleteMonthPlanMvo(MonthPlanMvoState state) //where TDeleteMonthPlanMvo : IDeleteMonthPlanMvo, new()
    {
        TDeleteMonthPlanMvo cmd = newDeleteMonthPlanMvo();
        cmd.setMonthPlanId(state.getMonthPlanId());
        cmd.setPersonVersion(state.getPersonVersion());

        return cmd;
    }

    public TMergePatchMonthPlanMvo toMergePatchMonthPlanMvo(MonthPlanMvoState state) //where TMergePatchMonthPlanMvo : IMergePatchMonthPlanMvo, new()
    {
        TMergePatchMonthPlanMvo cmd = newMergePatchMonthPlanMvo();

        cmd.setPersonVersion(state.getPersonVersion());

        cmd.setMonthPlanId(state.getMonthPlanId());
        cmd.setDescription(state.getDescription());
        cmd.setVersion(state.getVersion());
        cmd.setActive(state.getActive());
        cmd.setYearPlanDescription(state.getYearPlanDescription());
        cmd.setYearPlanVersion(state.getYearPlanVersion());
        cmd.setYearPlanCreatedBy(state.getYearPlanCreatedBy());
        cmd.setYearPlanCreatedAt(state.getYearPlanCreatedAt());
        cmd.setYearPlanUpdatedBy(state.getYearPlanUpdatedBy());
        cmd.setYearPlanUpdatedAt(state.getYearPlanUpdatedAt());
        cmd.setYearPlanActive(state.getYearPlanActive());
        cmd.setYearPlanDeleted(state.getYearPlanDeleted());
        cmd.setPersonBirthDate(state.getPersonBirthDate());
        cmd.setPersonLoves(state.getPersonLoves());
        cmd.setPersonCreatedBy(state.getPersonCreatedBy());
        cmd.setPersonCreatedAt(state.getPersonCreatedAt());
        cmd.setPersonUpdatedBy(state.getPersonUpdatedBy());
        cmd.setPersonUpdatedAt(state.getPersonUpdatedAt());
        cmd.setPersonActive(state.getPersonActive());
        cmd.setPersonDeleted(state.getPersonDeleted());
            
        if (state.getDescription() == null) { cmd.setIsPropertyDescriptionRemoved(true); }
        if (state.getVersion() == null) { cmd.setIsPropertyVersionRemoved(true); }
        if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
        if (state.getYearPlanDescription() == null) { cmd.setIsPropertyYearPlanDescriptionRemoved(true); }
        if (state.getYearPlanVersion() == null) { cmd.setIsPropertyYearPlanVersionRemoved(true); }
        if (state.getYearPlanCreatedBy() == null) { cmd.setIsPropertyYearPlanCreatedByRemoved(true); }
        if (state.getYearPlanCreatedAt() == null) { cmd.setIsPropertyYearPlanCreatedAtRemoved(true); }
        if (state.getYearPlanUpdatedBy() == null) { cmd.setIsPropertyYearPlanUpdatedByRemoved(true); }
        if (state.getYearPlanUpdatedAt() == null) { cmd.setIsPropertyYearPlanUpdatedAtRemoved(true); }
        if (state.getYearPlanActive() == null) { cmd.setIsPropertyYearPlanActiveRemoved(true); }
        if (state.getYearPlanDeleted() == null) { cmd.setIsPropertyYearPlanDeletedRemoved(true); }
        if (state.getPersonBirthDate() == null) { cmd.setIsPropertyPersonBirthDateRemoved(true); }
        if (state.getPersonLoves() == null) { cmd.setIsPropertyPersonLovesRemoved(true); }
        if (state.getPersonCreatedBy() == null) { cmd.setIsPropertyPersonCreatedByRemoved(true); }
        if (state.getPersonCreatedAt() == null) { cmd.setIsPropertyPersonCreatedAtRemoved(true); }
        if (state.getPersonUpdatedBy() == null) { cmd.setIsPropertyPersonUpdatedByRemoved(true); }
        if (state.getPersonUpdatedAt() == null) { cmd.setIsPropertyPersonUpdatedAtRemoved(true); }
        if (state.getPersonActive() == null) { cmd.setIsPropertyPersonActiveRemoved(true); }
        if (state.getPersonDeleted() == null) { cmd.setIsPropertyPersonDeletedRemoved(true); }
        return cmd;
    }

    public TCreateMonthPlanMvo toCreateMonthPlanMvo(MonthPlanMvoState state) //where TCreateMonthPlanMvo : ICreateMonthPlanMvo, new()
    {
        TCreateMonthPlanMvo cmd = newCreateMonthPlanMvo();

        cmd.setPersonVersion(state.getPersonVersion());
        cmd.setMonthPlanId(state.getMonthPlanId());
        cmd.setDescription(state.getDescription());
        cmd.setVersion(state.getVersion());
        cmd.setActive(state.getActive());
        cmd.setYearPlanDescription(state.getYearPlanDescription());
        cmd.setYearPlanVersion(state.getYearPlanVersion());
        cmd.setYearPlanCreatedBy(state.getYearPlanCreatedBy());
        cmd.setYearPlanCreatedAt(state.getYearPlanCreatedAt());
        cmd.setYearPlanUpdatedBy(state.getYearPlanUpdatedBy());
        cmd.setYearPlanUpdatedAt(state.getYearPlanUpdatedAt());
        cmd.setYearPlanActive(state.getYearPlanActive());
        cmd.setYearPlanDeleted(state.getYearPlanDeleted());
        cmd.setPersonBirthDate(state.getPersonBirthDate());
        cmd.setPersonLoves(state.getPersonLoves());
        cmd.setPersonCreatedBy(state.getPersonCreatedBy());
        cmd.setPersonCreatedAt(state.getPersonCreatedAt());
        cmd.setPersonUpdatedBy(state.getPersonUpdatedBy());
        cmd.setPersonUpdatedAt(state.getPersonUpdatedAt());
        cmd.setPersonActive(state.getPersonActive());
        cmd.setPersonDeleted(state.getPersonDeleted());
        return cmd;
    }

    protected abstract TCreateMonthPlanMvo newCreateMonthPlanMvo();

    protected abstract TMergePatchMonthPlanMvo newMergePatchMonthPlanMvo(); 

    protected abstract TDeleteMonthPlanMvo newDeleteMonthPlanMvo();

    public static class SimpleMonthPlanMvoStateCommandConverter extends AbstractMonthPlanMvoStateCommandConverter<AbstractMonthPlanMvoCommand.SimpleCreateMonthPlanMvo, AbstractMonthPlanMvoCommand.SimpleMergePatchMonthPlanMvo, AbstractMonthPlanMvoCommand.SimpleDeleteMonthPlanMvo>
    {
        @Override
        protected AbstractMonthPlanMvoCommand.SimpleCreateMonthPlanMvo newCreateMonthPlanMvo() {
            return new AbstractMonthPlanMvoCommand.SimpleCreateMonthPlanMvo();
        }

        @Override
        protected AbstractMonthPlanMvoCommand.SimpleMergePatchMonthPlanMvo newMergePatchMonthPlanMvo() {
            return new AbstractMonthPlanMvoCommand.SimpleMergePatchMonthPlanMvo();
        }

        @Override
        protected AbstractMonthPlanMvoCommand.SimpleDeleteMonthPlanMvo newDeleteMonthPlanMvo() {
            return new AbstractMonthPlanMvoCommand.SimpleDeleteMonthPlanMvo();
        }


    }

}

