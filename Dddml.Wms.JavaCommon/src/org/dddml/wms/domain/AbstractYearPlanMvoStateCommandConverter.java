package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractYearPlanMvoStateCommandConverter<TCreateYearPlanMvo extends YearPlanMvoCommand.CreateYearPlanMvo, TMergePatchYearPlanMvo extends YearPlanMvoCommand.MergePatchYearPlanMvo, TDeleteYearPlanMvo extends YearPlanMvoCommand.DeleteYearPlanMvo>
{
    public YearPlanMvoCommand toCreateOrMergePatchYearPlanMvo(YearPlanMvoState state)
    {
        //where TCreateYearPlanMvo : ICreateYearPlanMvo, new()
        //where TMergePatchYearPlanMvo : IMergePatchYearPlanMvo, new()
        boolean bUnsaved = state.isStateUnsaved();
        if (bUnsaved)
        {
            return toCreateYearPlanMvo(state);
        }
        else 
        {
            return toMergePatchYearPlanMvo(state);
        }
    }

    public TDeleteYearPlanMvo toDeleteYearPlanMvo(YearPlanMvoState state) //where TDeleteYearPlanMvo : IDeleteYearPlanMvo, new()
    {
        TDeleteYearPlanMvo cmd = newDeleteYearPlanMvo();
        cmd.setYearPlanId(state.getYearPlanId());
        cmd.setPersonVersion(state.getPersonVersion());

        return cmd;
    }

    public TMergePatchYearPlanMvo toMergePatchYearPlanMvo(YearPlanMvoState state) //where TMergePatchYearPlanMvo : IMergePatchYearPlanMvo, new()
    {
        TMergePatchYearPlanMvo cmd = newMergePatchYearPlanMvo();

        cmd.setPersonVersion(state.getPersonVersion());

        cmd.setYearPlanId(state.getYearPlanId());
        cmd.setDescription(state.getDescription());
        cmd.setVersion(state.getVersion());
        cmd.setActive(state.getActive());
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

    public TCreateYearPlanMvo toCreateYearPlanMvo(YearPlanMvoState state) //where TCreateYearPlanMvo : ICreateYearPlanMvo, new()
    {
        TCreateYearPlanMvo cmd = newCreateYearPlanMvo();

        cmd.setPersonVersion(state.getPersonVersion());
        cmd.setYearPlanId(state.getYearPlanId());
        cmd.setDescription(state.getDescription());
        cmd.setVersion(state.getVersion());
        cmd.setActive(state.getActive());
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

    protected abstract TCreateYearPlanMvo newCreateYearPlanMvo();

    protected abstract TMergePatchYearPlanMvo newMergePatchYearPlanMvo(); 

    protected abstract TDeleteYearPlanMvo newDeleteYearPlanMvo();

    public static class SimpleYearPlanMvoStateCommandConverter extends AbstractYearPlanMvoStateCommandConverter<AbstractYearPlanMvoCommand.SimpleCreateYearPlanMvo, AbstractYearPlanMvoCommand.SimpleMergePatchYearPlanMvo, AbstractYearPlanMvoCommand.SimpleDeleteYearPlanMvo>
    {
        @Override
        protected AbstractYearPlanMvoCommand.SimpleCreateYearPlanMvo newCreateYearPlanMvo() {
            return new AbstractYearPlanMvoCommand.SimpleCreateYearPlanMvo();
        }

        @Override
        protected AbstractYearPlanMvoCommand.SimpleMergePatchYearPlanMvo newMergePatchYearPlanMvo() {
            return new AbstractYearPlanMvoCommand.SimpleMergePatchYearPlanMvo();
        }

        @Override
        protected AbstractYearPlanMvoCommand.SimpleDeleteYearPlanMvo newDeleteYearPlanMvo() {
            return new AbstractYearPlanMvoCommand.SimpleDeleteYearPlanMvo();
        }


    }

}

