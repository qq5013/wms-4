package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractPersonStateCommandConverter<TCreatePerson extends PersonCommand.CreatePerson, TMergePatchPerson extends PersonCommand.MergePatchPerson, TDeletePerson extends PersonCommand.DeletePerson, TCreateYearPlan extends YearPlanCommand.CreateYearPlan, TMergePatchYearPlan extends YearPlanCommand.MergePatchYearPlan, TRemoveYearPlan extends YearPlanCommand.RemoveYearPlan, TCreateMonthPlan extends MonthPlanCommand.CreateMonthPlan, TMergePatchMonthPlan extends MonthPlanCommand.MergePatchMonthPlan, TRemoveMonthPlan extends MonthPlanCommand.RemoveMonthPlan, TCreateDayPlan extends DayPlanCommand.CreateDayPlan, TMergePatchDayPlan extends DayPlanCommand.MergePatchDayPlan, TRemoveDayPlan extends DayPlanCommand.RemoveDayPlan>
{
    public PersonCommand toCreateOrMergePatchPerson(PersonState state)
    {
        //where TCreatePerson : ICreatePerson, new()
        //where TMergePatchPerson : IMergePatchPerson, new()
        boolean bUnsaved = state.isStateUnsaved();
        if (bUnsaved)
        {
            return toCreatePerson(state);
        }
        else 
        {
            return toMergePatchPerson(state);
        }
    }

    public TDeletePerson toDeletePerson(PersonState state) //where TDeletePerson : IDeletePerson, new()
    {
        TDeletePerson cmd = newDeletePerson();
        cmd.setPersonalName(state.getPersonalName());
        cmd.setVersion(state.getVersion());

        return cmd;
    }

    public TMergePatchPerson toMergePatchPerson(PersonState state) //where TMergePatchPerson : IMergePatchPerson, new()
    {
        TMergePatchPerson cmd = newMergePatchPerson();

        cmd.setVersion(state.getVersion());

        cmd.setPersonalName(state.getPersonalName());
        cmd.setBirthDate(state.getBirthDate());
        cmd.setLoves(state.getLoves());
        cmd.setActive(state.getActive());
            
        if (state.getBirthDate() == null) { cmd.setIsPropertyBirthDateRemoved(true); }
        if (state.getLoves() == null) { cmd.setIsPropertyLovesRemoved(true); }
        if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
        for (YearPlanState d : state.getYearPlans())
        {
            YearPlanCommand c = getYearPlanStateCommandConverter().toCreateOrMergePatchYearPlan(d);
            cmd.getYearPlanCommands().add(c);
        }
        return cmd;
    }

    public TCreatePerson toCreatePerson(PersonState state) //where TCreatePerson : ICreatePerson, new()
    {
        TCreatePerson cmd = newCreatePerson();

        cmd.setVersion(state.getVersion());
        cmd.setPersonalName(state.getPersonalName());
        cmd.setBirthDate(state.getBirthDate());
        cmd.setLoves(state.getLoves());
        cmd.setActive(state.getActive());
        for (YearPlanState d : state.getYearPlans())
        {
            YearPlanCommand.CreateYearPlan c = getYearPlanStateCommandConverter().toCreateYearPlan(d);
            cmd.getYearPlans().add(c);
        }
        return cmd;
    }

    protected abstract AbstractYearPlanStateCommandConverter<TCreateYearPlan, TMergePatchYearPlan, TRemoveYearPlan, TCreateMonthPlan, TMergePatchMonthPlan, TRemoveMonthPlan, TCreateDayPlan, TMergePatchDayPlan, TRemoveDayPlan>
        getYearPlanStateCommandConverter();

    protected abstract TCreatePerson newCreatePerson();

    protected abstract TMergePatchPerson newMergePatchPerson(); 

    protected abstract TDeletePerson newDeletePerson();

    public static class SimplePersonStateCommandConverter extends AbstractPersonStateCommandConverter<AbstractPersonCommand.SimpleCreatePerson, AbstractPersonCommand.SimpleMergePatchPerson, AbstractPersonCommand.SimpleDeletePerson, AbstractYearPlanCommand.SimpleCreateYearPlan, AbstractYearPlanCommand.SimpleMergePatchYearPlan, AbstractYearPlanCommand.SimpleRemoveYearPlan, AbstractMonthPlanCommand.SimpleCreateMonthPlan, AbstractMonthPlanCommand.SimpleMergePatchMonthPlan, AbstractMonthPlanCommand.SimpleRemoveMonthPlan, AbstractDayPlanCommand.SimpleCreateDayPlan, AbstractDayPlanCommand.SimpleMergePatchDayPlan, AbstractDayPlanCommand.SimpleRemoveDayPlan>
    {
        @Override
        protected AbstractPersonCommand.SimpleCreatePerson newCreatePerson() {
            return new AbstractPersonCommand.SimpleCreatePerson();
        }

        @Override
        protected AbstractPersonCommand.SimpleMergePatchPerson newMergePatchPerson() {
            return new AbstractPersonCommand.SimpleMergePatchPerson();
        }

        @Override
        protected AbstractPersonCommand.SimpleDeletePerson newDeletePerson() {
            return new AbstractPersonCommand.SimpleDeletePerson();
        }

        @Override
        protected AbstractYearPlanStateCommandConverter<AbstractYearPlanCommand.SimpleCreateYearPlan, AbstractYearPlanCommand.SimpleMergePatchYearPlan, AbstractYearPlanCommand.SimpleRemoveYearPlan, AbstractMonthPlanCommand.SimpleCreateMonthPlan, AbstractMonthPlanCommand.SimpleMergePatchMonthPlan, AbstractMonthPlanCommand.SimpleRemoveMonthPlan, AbstractDayPlanCommand.SimpleCreateDayPlan, AbstractDayPlanCommand.SimpleMergePatchDayPlan, AbstractDayPlanCommand.SimpleRemoveDayPlan> getYearPlanStateCommandConverter()
        {
            return new AbstractYearPlanStateCommandConverter.SimpleYearPlanStateCommandConverter();
        }


    }

}

