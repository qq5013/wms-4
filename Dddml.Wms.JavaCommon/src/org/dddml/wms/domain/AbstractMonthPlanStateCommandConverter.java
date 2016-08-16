package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractMonthPlanStateCommandConverter<TCreateMonthPlan extends MonthPlanCommand.CreateMonthPlan, TMergePatchMonthPlan extends MonthPlanCommand.MergePatchMonthPlan, TRemoveMonthPlan extends MonthPlanCommand.RemoveMonthPlan, TCreateDayPlan extends DayPlanCommand.CreateDayPlan, TMergePatchDayPlan extends DayPlanCommand.MergePatchDayPlan, TRemoveDayPlan extends DayPlanCommand.RemoveDayPlan>
{
    public MonthPlanCommand toCreateOrMergePatchMonthPlan(MonthPlanState state)
    {
        //where TCreateMonthPlan : ICreateMonthPlan, new()
        //where TMergePatchMonthPlan : IMergePatchMonthPlan, new()
        boolean bUnsaved = state.isStateUnsaved();
        if (bUnsaved)
        {
            return toCreateMonthPlan(state);
        }
        else 
        {
            return toMergePatchMonthPlan(state);
        }
    }

    public TRemoveMonthPlan toRemoveMonthPlan(MonthPlanState state) //where TRemoveMonthPlan : IRemoveMonthPlan, new()
    {
        TRemoveMonthPlan cmd = newRemoveMonthPlan();
        cmd.setMonth(state.getMonth());
        return cmd;
    }

    public TMergePatchMonthPlan toMergePatchMonthPlan(MonthPlanState state) //where TMergePatchMonthPlan : IMergePatchMonthPlan, new()
    {
        TMergePatchMonthPlan cmd = newMergePatchMonthPlan();

        cmd.setMonth(state.getMonth());
        cmd.setDescription(state.getDescription());
        cmd.setActive(state.getActive());
        cmd.setPersonalName(state.getPersonalName());
        cmd.setYear(state.getYear());
            
        if (state.getDescription() == null) { cmd.setIsPropertyDescriptionRemoved(true); }
        if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
        for (DayPlanState d : state.getDayPlans())
        {
            DayPlanCommand c = getDayPlanStateCommandConverter().toCreateOrMergePatchDayPlan(d);
            cmd.getDayPlanCommands().add(c);
        }
        return cmd;
    }

    public TCreateMonthPlan toCreateMonthPlan(MonthPlanState state) //where TCreateMonthPlan : ICreateMonthPlan, new()
    {
        TCreateMonthPlan cmd = newCreateMonthPlan();

        cmd.setMonth(state.getMonth());
        cmd.setDescription(state.getDescription());
        cmd.setActive(state.getActive());
        cmd.setPersonalName(state.getPersonalName());
        cmd.setYear(state.getYear());
        for (DayPlanState d : state.getDayPlans())
        {
            DayPlanCommand.CreateDayPlan c = getDayPlanStateCommandConverter().toCreateDayPlan(d);
            cmd.getDayPlans().add(c);
        }
        return cmd;
    }

    protected abstract AbstractDayPlanStateCommandConverter<TCreateDayPlan, TMergePatchDayPlan, TRemoveDayPlan>
        getDayPlanStateCommandConverter();

    protected abstract TCreateMonthPlan newCreateMonthPlan();

    protected abstract TMergePatchMonthPlan newMergePatchMonthPlan(); 

    protected abstract TRemoveMonthPlan newRemoveMonthPlan();

    public static class SimpleMonthPlanStateCommandConverter extends AbstractMonthPlanStateCommandConverter<AbstractMonthPlanCommand.SimpleCreateMonthPlan, AbstractMonthPlanCommand.SimpleMergePatchMonthPlan, AbstractMonthPlanCommand.SimpleRemoveMonthPlan, AbstractDayPlanCommand.SimpleCreateDayPlan, AbstractDayPlanCommand.SimpleMergePatchDayPlan, AbstractDayPlanCommand.SimpleRemoveDayPlan>
    {
        @Override
        protected AbstractMonthPlanCommand.SimpleCreateMonthPlan newCreateMonthPlan() {
            return new AbstractMonthPlanCommand.SimpleCreateMonthPlan();
        }

        @Override
        protected AbstractMonthPlanCommand.SimpleMergePatchMonthPlan newMergePatchMonthPlan() {
            return new AbstractMonthPlanCommand.SimpleMergePatchMonthPlan();
        }

        @Override
        protected AbstractMonthPlanCommand.SimpleRemoveMonthPlan newRemoveMonthPlan() {
            return new AbstractMonthPlanCommand.SimpleRemoveMonthPlan();
        }

        @Override
        protected AbstractDayPlanStateCommandConverter<AbstractDayPlanCommand.SimpleCreateDayPlan, AbstractDayPlanCommand.SimpleMergePatchDayPlan, AbstractDayPlanCommand.SimpleRemoveDayPlan> getDayPlanStateCommandConverter()
        {
            return new AbstractDayPlanStateCommandConverter.SimpleDayPlanStateCommandConverter();
        }


    }

}

