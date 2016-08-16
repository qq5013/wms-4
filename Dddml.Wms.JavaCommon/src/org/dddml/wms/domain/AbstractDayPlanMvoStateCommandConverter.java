package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractDayPlanMvoStateCommandConverter<TCreateDayPlanMvo extends DayPlanMvoCommand.CreateDayPlanMvo, TMergePatchDayPlanMvo extends DayPlanMvoCommand.MergePatchDayPlanMvo, TDeleteDayPlanMvo extends DayPlanMvoCommand.DeleteDayPlanMvo>
{
    public DayPlanMvoCommand toCreateOrMergePatchDayPlanMvo(DayPlanMvoState state)
    {
        //where TCreateDayPlanMvo : ICreateDayPlanMvo, new()
        //where TMergePatchDayPlanMvo : IMergePatchDayPlanMvo, new()
        boolean bUnsaved = state.isStateUnsaved();
        if (bUnsaved)
        {
            return toCreateDayPlanMvo(state);
        }
        else 
        {
            return toMergePatchDayPlanMvo(state);
        }
    }

    public TDeleteDayPlanMvo toDeleteDayPlanMvo(DayPlanMvoState state) //where TDeleteDayPlanMvo : IDeleteDayPlanMvo, new()
    {
        TDeleteDayPlanMvo cmd = newDeleteDayPlanMvo();
        cmd.setDayPlanId(state.getDayPlanId());
        cmd.setPersonVersion(state.getPersonVersion());

        return cmd;
    }

    public TMergePatchDayPlanMvo toMergePatchDayPlanMvo(DayPlanMvoState state) //where TMergePatchDayPlanMvo : IMergePatchDayPlanMvo, new()
    {
        TMergePatchDayPlanMvo cmd = newMergePatchDayPlanMvo();

        cmd.setPersonVersion(state.getPersonVersion());

        cmd.setDayPlanId(state.getDayPlanId());
        cmd.setDescription(state.getDescription());
        cmd.setVersion(state.getVersion());
        cmd.setActive(state.getActive());
        cmd.setMonthPlanDescription(state.getMonthPlanDescription());
        cmd.setMonthPlanVersion(state.getMonthPlanVersion());
        cmd.setMonthPlanCreatedBy(state.getMonthPlanCreatedBy());
        cmd.setMonthPlanCreatedAt(state.getMonthPlanCreatedAt());
        cmd.setMonthPlanUpdatedBy(state.getMonthPlanUpdatedBy());
        cmd.setMonthPlanUpdatedAt(state.getMonthPlanUpdatedAt());
        cmd.setMonthPlanActive(state.getMonthPlanActive());
        cmd.setMonthPlanDeleted(state.getMonthPlanDeleted());
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
        if (state.getMonthPlanDescription() == null) { cmd.setIsPropertyMonthPlanDescriptionRemoved(true); }
        if (state.getMonthPlanVersion() == null) { cmd.setIsPropertyMonthPlanVersionRemoved(true); }
        if (state.getMonthPlanCreatedBy() == null) { cmd.setIsPropertyMonthPlanCreatedByRemoved(true); }
        if (state.getMonthPlanCreatedAt() == null) { cmd.setIsPropertyMonthPlanCreatedAtRemoved(true); }
        if (state.getMonthPlanUpdatedBy() == null) { cmd.setIsPropertyMonthPlanUpdatedByRemoved(true); }
        if (state.getMonthPlanUpdatedAt() == null) { cmd.setIsPropertyMonthPlanUpdatedAtRemoved(true); }
        if (state.getMonthPlanActive() == null) { cmd.setIsPropertyMonthPlanActiveRemoved(true); }
        if (state.getMonthPlanDeleted() == null) { cmd.setIsPropertyMonthPlanDeletedRemoved(true); }
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

    public TCreateDayPlanMvo toCreateDayPlanMvo(DayPlanMvoState state) //where TCreateDayPlanMvo : ICreateDayPlanMvo, new()
    {
        TCreateDayPlanMvo cmd = newCreateDayPlanMvo();

        cmd.setPersonVersion(state.getPersonVersion());
        cmd.setDayPlanId(state.getDayPlanId());
        cmd.setDescription(state.getDescription());
        cmd.setVersion(state.getVersion());
        cmd.setActive(state.getActive());
        cmd.setMonthPlanDescription(state.getMonthPlanDescription());
        cmd.setMonthPlanVersion(state.getMonthPlanVersion());
        cmd.setMonthPlanCreatedBy(state.getMonthPlanCreatedBy());
        cmd.setMonthPlanCreatedAt(state.getMonthPlanCreatedAt());
        cmd.setMonthPlanUpdatedBy(state.getMonthPlanUpdatedBy());
        cmd.setMonthPlanUpdatedAt(state.getMonthPlanUpdatedAt());
        cmd.setMonthPlanActive(state.getMonthPlanActive());
        cmd.setMonthPlanDeleted(state.getMonthPlanDeleted());
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

    protected abstract TCreateDayPlanMvo newCreateDayPlanMvo();

    protected abstract TMergePatchDayPlanMvo newMergePatchDayPlanMvo(); 

    protected abstract TDeleteDayPlanMvo newDeleteDayPlanMvo();

    public static class SimpleDayPlanMvoStateCommandConverter extends AbstractDayPlanMvoStateCommandConverter<AbstractDayPlanMvoCommand.SimpleCreateDayPlanMvo, AbstractDayPlanMvoCommand.SimpleMergePatchDayPlanMvo, AbstractDayPlanMvoCommand.SimpleDeleteDayPlanMvo>
    {
        @Override
        protected AbstractDayPlanMvoCommand.SimpleCreateDayPlanMvo newCreateDayPlanMvo() {
            return new AbstractDayPlanMvoCommand.SimpleCreateDayPlanMvo();
        }

        @Override
        protected AbstractDayPlanMvoCommand.SimpleMergePatchDayPlanMvo newMergePatchDayPlanMvo() {
            return new AbstractDayPlanMvoCommand.SimpleMergePatchDayPlanMvo();
        }

        @Override
        protected AbstractDayPlanMvoCommand.SimpleDeleteDayPlanMvo newDeleteDayPlanMvo() {
            return new AbstractDayPlanMvoCommand.SimpleDeleteDayPlanMvo();
        }


    }

}

