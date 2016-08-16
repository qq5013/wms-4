package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractDayPlanStateCommandConverter<TCreateDayPlan extends DayPlanCommand.CreateDayPlan, TMergePatchDayPlan extends DayPlanCommand.MergePatchDayPlan, TRemoveDayPlan extends DayPlanCommand.RemoveDayPlan>
{
    public DayPlanCommand toCreateOrMergePatchDayPlan(DayPlanState state)
    {
        //where TCreateDayPlan : ICreateDayPlan, new()
        //where TMergePatchDayPlan : IMergePatchDayPlan, new()
        boolean bUnsaved = state.isStateUnsaved();
        if (bUnsaved)
        {
            return toCreateDayPlan(state);
        }
        else 
        {
            return toMergePatchDayPlan(state);
        }
    }

    public TRemoveDayPlan toRemoveDayPlan(DayPlanState state) //where TRemoveDayPlan : IRemoveDayPlan, new()
    {
        TRemoveDayPlan cmd = newRemoveDayPlan();
        cmd.setDay(state.getDay());
        return cmd;
    }

    public TMergePatchDayPlan toMergePatchDayPlan(DayPlanState state) //where TMergePatchDayPlan : IMergePatchDayPlan, new()
    {
        TMergePatchDayPlan cmd = newMergePatchDayPlan();

        cmd.setDay(state.getDay());
        cmd.setDescription(state.getDescription());
        cmd.setActive(state.getActive());
        cmd.setPersonalName(state.getPersonalName());
        cmd.setYear(state.getYear());
        cmd.setMonth(state.getMonth());
            
        if (state.getDescription() == null) { cmd.setIsPropertyDescriptionRemoved(true); }
        if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
        return cmd;
    }

    public TCreateDayPlan toCreateDayPlan(DayPlanState state) //where TCreateDayPlan : ICreateDayPlan, new()
    {
        TCreateDayPlan cmd = newCreateDayPlan();

        cmd.setDay(state.getDay());
        cmd.setDescription(state.getDescription());
        cmd.setActive(state.getActive());
        cmd.setPersonalName(state.getPersonalName());
        cmd.setYear(state.getYear());
        cmd.setMonth(state.getMonth());
        return cmd;
    }

    protected abstract TCreateDayPlan newCreateDayPlan();

    protected abstract TMergePatchDayPlan newMergePatchDayPlan(); 

    protected abstract TRemoveDayPlan newRemoveDayPlan();

    public static class SimpleDayPlanStateCommandConverter extends AbstractDayPlanStateCommandConverter<AbstractDayPlanCommand.SimpleCreateDayPlan, AbstractDayPlanCommand.SimpleMergePatchDayPlan, AbstractDayPlanCommand.SimpleRemoveDayPlan>
    {
        @Override
        protected AbstractDayPlanCommand.SimpleCreateDayPlan newCreateDayPlan() {
            return new AbstractDayPlanCommand.SimpleCreateDayPlan();
        }

        @Override
        protected AbstractDayPlanCommand.SimpleMergePatchDayPlan newMergePatchDayPlan() {
            return new AbstractDayPlanCommand.SimpleMergePatchDayPlan();
        }

        @Override
        protected AbstractDayPlanCommand.SimpleRemoveDayPlan newRemoveDayPlan() {
            return new AbstractDayPlanCommand.SimpleRemoveDayPlan();
        }


    }

}

