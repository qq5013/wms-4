package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractYearPlanStateCommandConverter<TCreateYearPlan extends YearPlanCommand.CreateYearPlan, TMergePatchYearPlan extends YearPlanCommand.MergePatchYearPlan, TRemoveYearPlan extends YearPlanCommand.RemoveYearPlan, TCreateMonthPlan extends MonthPlanCommand.CreateMonthPlan, TMergePatchMonthPlan extends MonthPlanCommand.MergePatchMonthPlan, TRemoveMonthPlan extends MonthPlanCommand.RemoveMonthPlan, TCreateDayPlan extends DayPlanCommand.CreateDayPlan, TMergePatchDayPlan extends DayPlanCommand.MergePatchDayPlan, TRemoveDayPlan extends DayPlanCommand.RemoveDayPlan>
{
    public YearPlanCommand toCreateOrMergePatchYearPlan(YearPlanState state)
    {
        //where TCreateYearPlan : ICreateYearPlan, new()
        //where TMergePatchYearPlan : IMergePatchYearPlan, new()
        boolean bUnsaved = state.isStateUnsaved();
        if (bUnsaved)
        {
            return toCreateYearPlan(state);
        }
        else 
        {
            return toMergePatchYearPlan(state);
        }
    }

    public TRemoveYearPlan toRemoveYearPlan(YearPlanState state) //where TRemoveYearPlan : IRemoveYearPlan, new()
    {
        TRemoveYearPlan cmd = newRemoveYearPlan();
        cmd.setYear(state.getYear());
        return cmd;
    }

    public TMergePatchYearPlan toMergePatchYearPlan(YearPlanState state) //where TMergePatchYearPlan : IMergePatchYearPlan, new()
    {
        TMergePatchYearPlan cmd = newMergePatchYearPlan();

        cmd.setYear(state.getYear());
        cmd.setDescription(state.getDescription());
        cmd.setActive(state.getActive());
        cmd.setPersonalName(state.getPersonalName());
            
        if (state.getDescription() == null) { cmd.setIsPropertyDescriptionRemoved(true); }
        if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
        for (MonthPlanState d : state.getMonthPlans())
        {
            MonthPlanCommand c = getMonthPlanStateCommandConverter().toCreateOrMergePatchMonthPlan(d);
            cmd.getMonthPlanCommands().add(c);
        }
        return cmd;
    }

    public TCreateYearPlan toCreateYearPlan(YearPlanState state) //where TCreateYearPlan : ICreateYearPlan, new()
    {
        TCreateYearPlan cmd = newCreateYearPlan();

        cmd.setYear(state.getYear());
        cmd.setDescription(state.getDescription());
        cmd.setActive(state.getActive());
        cmd.setPersonalName(state.getPersonalName());
        for (MonthPlanState d : state.getMonthPlans())
        {
            MonthPlanCommand.CreateMonthPlan c = getMonthPlanStateCommandConverter().toCreateMonthPlan(d);
            cmd.getMonthPlans().add(c);
        }
        return cmd;
    }

    protected abstract AbstractMonthPlanStateCommandConverter<TCreateMonthPlan, TMergePatchMonthPlan, TRemoveMonthPlan, TCreateDayPlan, TMergePatchDayPlan, TRemoveDayPlan>
        getMonthPlanStateCommandConverter();

    protected abstract TCreateYearPlan newCreateYearPlan();

    protected abstract TMergePatchYearPlan newMergePatchYearPlan(); 

    protected abstract TRemoveYearPlan newRemoveYearPlan();

    public static class SimpleYearPlanStateCommandConverter extends AbstractYearPlanStateCommandConverter<AbstractYearPlanCommand.SimpleCreateYearPlan, AbstractYearPlanCommand.SimpleMergePatchYearPlan, AbstractYearPlanCommand.SimpleRemoveYearPlan, AbstractMonthPlanCommand.SimpleCreateMonthPlan, AbstractMonthPlanCommand.SimpleMergePatchMonthPlan, AbstractMonthPlanCommand.SimpleRemoveMonthPlan, AbstractDayPlanCommand.SimpleCreateDayPlan, AbstractDayPlanCommand.SimpleMergePatchDayPlan, AbstractDayPlanCommand.SimpleRemoveDayPlan>
    {
        @Override
        protected AbstractYearPlanCommand.SimpleCreateYearPlan newCreateYearPlan() {
            return new AbstractYearPlanCommand.SimpleCreateYearPlan();
        }

        @Override
        protected AbstractYearPlanCommand.SimpleMergePatchYearPlan newMergePatchYearPlan() {
            return new AbstractYearPlanCommand.SimpleMergePatchYearPlan();
        }

        @Override
        protected AbstractYearPlanCommand.SimpleRemoveYearPlan newRemoveYearPlan() {
            return new AbstractYearPlanCommand.SimpleRemoveYearPlan();
        }

        @Override
        protected AbstractMonthPlanStateCommandConverter<AbstractMonthPlanCommand.SimpleCreateMonthPlan, AbstractMonthPlanCommand.SimpleMergePatchMonthPlan, AbstractMonthPlanCommand.SimpleRemoveMonthPlan, AbstractDayPlanCommand.SimpleCreateDayPlan, AbstractDayPlanCommand.SimpleMergePatchDayPlan, AbstractDayPlanCommand.SimpleRemoveDayPlan> getMonthPlanStateCommandConverter()
        {
            return new AbstractMonthPlanStateCommandConverter.SimpleMonthPlanStateCommandConverter();
        }


    }

}

