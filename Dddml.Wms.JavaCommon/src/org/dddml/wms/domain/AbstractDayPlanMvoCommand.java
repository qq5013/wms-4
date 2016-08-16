package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractDayPlanMvoCommand extends AbstractCommand implements DayPlanMvoCommand
{
    private DayPlanId dayPlanId;

    public DayPlanId getDayPlanId()
    {
        return this.dayPlanId;
    }

    public void setDayPlanId(DayPlanId dayPlanId)
    {
        this.dayPlanId = dayPlanId;
    }

    private Long personVersion;

    public Long getPersonVersion()
    {
        return this.personVersion;
    }

    public void setPersonVersion(Long personVersion)
    {
        this.personVersion = personVersion;
    }


    public static abstract class AbstractCreateOrMergePatchDayPlanMvo extends AbstractDayPlanMvoCommand implements CreateOrMergePatchDayPlanMvo
    {
        private String description;

        public String getDescription()
        {
            return this.description;
        }

        public void setDescription(String description)
        {
            this.description = description;
        }

        private Long version;

        public Long getVersion()
        {
            return this.version;
        }

        public void setVersion(Long version)
        {
            this.version = version;
        }

        private Boolean active;

        public Boolean getActive()
        {
            return this.active;
        }

        public void setActive(Boolean active)
        {
            this.active = active;
        }

        private String monthPlanDescription;

        public String getMonthPlanDescription()
        {
            return this.monthPlanDescription;
        }

        public void setMonthPlanDescription(String monthPlanDescription)
        {
            this.monthPlanDescription = monthPlanDescription;
        }

        private Long monthPlanVersion;

        public Long getMonthPlanVersion()
        {
            return this.monthPlanVersion;
        }

        public void setMonthPlanVersion(Long monthPlanVersion)
        {
            this.monthPlanVersion = monthPlanVersion;
        }

        private String monthPlanCreatedBy;

        public String getMonthPlanCreatedBy()
        {
            return this.monthPlanCreatedBy;
        }

        public void setMonthPlanCreatedBy(String monthPlanCreatedBy)
        {
            this.monthPlanCreatedBy = monthPlanCreatedBy;
        }

        private Date monthPlanCreatedAt;

        public Date getMonthPlanCreatedAt()
        {
            return this.monthPlanCreatedAt;
        }

        public void setMonthPlanCreatedAt(Date monthPlanCreatedAt)
        {
            this.monthPlanCreatedAt = monthPlanCreatedAt;
        }

        private String monthPlanUpdatedBy;

        public String getMonthPlanUpdatedBy()
        {
            return this.monthPlanUpdatedBy;
        }

        public void setMonthPlanUpdatedBy(String monthPlanUpdatedBy)
        {
            this.monthPlanUpdatedBy = monthPlanUpdatedBy;
        }

        private Date monthPlanUpdatedAt;

        public Date getMonthPlanUpdatedAt()
        {
            return this.monthPlanUpdatedAt;
        }

        public void setMonthPlanUpdatedAt(Date monthPlanUpdatedAt)
        {
            this.monthPlanUpdatedAt = monthPlanUpdatedAt;
        }

        private Boolean monthPlanActive;

        public Boolean getMonthPlanActive()
        {
            return this.monthPlanActive;
        }

        public void setMonthPlanActive(Boolean monthPlanActive)
        {
            this.monthPlanActive = monthPlanActive;
        }

        private Boolean monthPlanDeleted;

        public Boolean getMonthPlanDeleted()
        {
            return this.monthPlanDeleted;
        }

        public void setMonthPlanDeleted(Boolean monthPlanDeleted)
        {
            this.monthPlanDeleted = monthPlanDeleted;
        }

        private String yearPlanDescription;

        public String getYearPlanDescription()
        {
            return this.yearPlanDescription;
        }

        public void setYearPlanDescription(String yearPlanDescription)
        {
            this.yearPlanDescription = yearPlanDescription;
        }

        private Long yearPlanVersion;

        public Long getYearPlanVersion()
        {
            return this.yearPlanVersion;
        }

        public void setYearPlanVersion(Long yearPlanVersion)
        {
            this.yearPlanVersion = yearPlanVersion;
        }

        private String yearPlanCreatedBy;

        public String getYearPlanCreatedBy()
        {
            return this.yearPlanCreatedBy;
        }

        public void setYearPlanCreatedBy(String yearPlanCreatedBy)
        {
            this.yearPlanCreatedBy = yearPlanCreatedBy;
        }

        private Date yearPlanCreatedAt;

        public Date getYearPlanCreatedAt()
        {
            return this.yearPlanCreatedAt;
        }

        public void setYearPlanCreatedAt(Date yearPlanCreatedAt)
        {
            this.yearPlanCreatedAt = yearPlanCreatedAt;
        }

        private String yearPlanUpdatedBy;

        public String getYearPlanUpdatedBy()
        {
            return this.yearPlanUpdatedBy;
        }

        public void setYearPlanUpdatedBy(String yearPlanUpdatedBy)
        {
            this.yearPlanUpdatedBy = yearPlanUpdatedBy;
        }

        private Date yearPlanUpdatedAt;

        public Date getYearPlanUpdatedAt()
        {
            return this.yearPlanUpdatedAt;
        }

        public void setYearPlanUpdatedAt(Date yearPlanUpdatedAt)
        {
            this.yearPlanUpdatedAt = yearPlanUpdatedAt;
        }

        private Boolean yearPlanActive;

        public Boolean getYearPlanActive()
        {
            return this.yearPlanActive;
        }

        public void setYearPlanActive(Boolean yearPlanActive)
        {
            this.yearPlanActive = yearPlanActive;
        }

        private Boolean yearPlanDeleted;

        public Boolean getYearPlanDeleted()
        {
            return this.yearPlanDeleted;
        }

        public void setYearPlanDeleted(Boolean yearPlanDeleted)
        {
            this.yearPlanDeleted = yearPlanDeleted;
        }

        private Date personBirthDate;

        public Date getPersonBirthDate()
        {
            return this.personBirthDate;
        }

        public void setPersonBirthDate(Date personBirthDate)
        {
            this.personBirthDate = personBirthDate;
        }

        private PersonalName personLoves;

        public PersonalName getPersonLoves()
        {
            return this.personLoves;
        }

        public void setPersonLoves(PersonalName personLoves)
        {
            this.personLoves = personLoves;
        }

        private String personCreatedBy;

        public String getPersonCreatedBy()
        {
            return this.personCreatedBy;
        }

        public void setPersonCreatedBy(String personCreatedBy)
        {
            this.personCreatedBy = personCreatedBy;
        }

        private Date personCreatedAt;

        public Date getPersonCreatedAt()
        {
            return this.personCreatedAt;
        }

        public void setPersonCreatedAt(Date personCreatedAt)
        {
            this.personCreatedAt = personCreatedAt;
        }

        private String personUpdatedBy;

        public String getPersonUpdatedBy()
        {
            return this.personUpdatedBy;
        }

        public void setPersonUpdatedBy(String personUpdatedBy)
        {
            this.personUpdatedBy = personUpdatedBy;
        }

        private Date personUpdatedAt;

        public Date getPersonUpdatedAt()
        {
            return this.personUpdatedAt;
        }

        public void setPersonUpdatedAt(Date personUpdatedAt)
        {
            this.personUpdatedAt = personUpdatedAt;
        }

        private Boolean personActive;

        public Boolean getPersonActive()
        {
            return this.personActive;
        }

        public void setPersonActive(Boolean personActive)
        {
            this.personActive = personActive;
        }

        private Boolean personDeleted;

        public Boolean getPersonDeleted()
        {
            return this.personDeleted;
        }

        public void setPersonDeleted(Boolean personDeleted)
        {
            this.personDeleted = personDeleted;
        }

    }

    public static abstract class AbstractCreateDayPlanMvo extends AbstractCreateOrMergePatchDayPlanMvo implements CreateDayPlanMvo
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

    }

    public static abstract class AbstractMergePatchDayPlanMvo extends AbstractCreateOrMergePatchDayPlanMvo implements MergePatchDayPlanMvo
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_MERGE_PATCH;
        }

        private Boolean isPropertyDescriptionRemoved;

        public Boolean getIsPropertyDescriptionRemoved()
        {
            return this.isPropertyDescriptionRemoved;
        }

        public void setIsPropertyDescriptionRemoved(Boolean removed)
        {
            this.isPropertyDescriptionRemoved = removed;
        }

        private Boolean isPropertyVersionRemoved;

        public Boolean getIsPropertyVersionRemoved()
        {
            return this.isPropertyVersionRemoved;
        }

        public void setIsPropertyVersionRemoved(Boolean removed)
        {
            this.isPropertyVersionRemoved = removed;
        }

        private Boolean isPropertyActiveRemoved;

        public Boolean getIsPropertyActiveRemoved()
        {
            return this.isPropertyActiveRemoved;
        }

        public void setIsPropertyActiveRemoved(Boolean removed)
        {
            this.isPropertyActiveRemoved = removed;
        }

        private Boolean isPropertyMonthPlanDescriptionRemoved;

        public Boolean getIsPropertyMonthPlanDescriptionRemoved()
        {
            return this.isPropertyMonthPlanDescriptionRemoved;
        }

        public void setIsPropertyMonthPlanDescriptionRemoved(Boolean removed)
        {
            this.isPropertyMonthPlanDescriptionRemoved = removed;
        }

        private Boolean isPropertyMonthPlanVersionRemoved;

        public Boolean getIsPropertyMonthPlanVersionRemoved()
        {
            return this.isPropertyMonthPlanVersionRemoved;
        }

        public void setIsPropertyMonthPlanVersionRemoved(Boolean removed)
        {
            this.isPropertyMonthPlanVersionRemoved = removed;
        }

        private Boolean isPropertyMonthPlanCreatedByRemoved;

        public Boolean getIsPropertyMonthPlanCreatedByRemoved()
        {
            return this.isPropertyMonthPlanCreatedByRemoved;
        }

        public void setIsPropertyMonthPlanCreatedByRemoved(Boolean removed)
        {
            this.isPropertyMonthPlanCreatedByRemoved = removed;
        }

        private Boolean isPropertyMonthPlanCreatedAtRemoved;

        public Boolean getIsPropertyMonthPlanCreatedAtRemoved()
        {
            return this.isPropertyMonthPlanCreatedAtRemoved;
        }

        public void setIsPropertyMonthPlanCreatedAtRemoved(Boolean removed)
        {
            this.isPropertyMonthPlanCreatedAtRemoved = removed;
        }

        private Boolean isPropertyMonthPlanUpdatedByRemoved;

        public Boolean getIsPropertyMonthPlanUpdatedByRemoved()
        {
            return this.isPropertyMonthPlanUpdatedByRemoved;
        }

        public void setIsPropertyMonthPlanUpdatedByRemoved(Boolean removed)
        {
            this.isPropertyMonthPlanUpdatedByRemoved = removed;
        }

        private Boolean isPropertyMonthPlanUpdatedAtRemoved;

        public Boolean getIsPropertyMonthPlanUpdatedAtRemoved()
        {
            return this.isPropertyMonthPlanUpdatedAtRemoved;
        }

        public void setIsPropertyMonthPlanUpdatedAtRemoved(Boolean removed)
        {
            this.isPropertyMonthPlanUpdatedAtRemoved = removed;
        }

        private Boolean isPropertyMonthPlanActiveRemoved;

        public Boolean getIsPropertyMonthPlanActiveRemoved()
        {
            return this.isPropertyMonthPlanActiveRemoved;
        }

        public void setIsPropertyMonthPlanActiveRemoved(Boolean removed)
        {
            this.isPropertyMonthPlanActiveRemoved = removed;
        }

        private Boolean isPropertyMonthPlanDeletedRemoved;

        public Boolean getIsPropertyMonthPlanDeletedRemoved()
        {
            return this.isPropertyMonthPlanDeletedRemoved;
        }

        public void setIsPropertyMonthPlanDeletedRemoved(Boolean removed)
        {
            this.isPropertyMonthPlanDeletedRemoved = removed;
        }

        private Boolean isPropertyYearPlanDescriptionRemoved;

        public Boolean getIsPropertyYearPlanDescriptionRemoved()
        {
            return this.isPropertyYearPlanDescriptionRemoved;
        }

        public void setIsPropertyYearPlanDescriptionRemoved(Boolean removed)
        {
            this.isPropertyYearPlanDescriptionRemoved = removed;
        }

        private Boolean isPropertyYearPlanVersionRemoved;

        public Boolean getIsPropertyYearPlanVersionRemoved()
        {
            return this.isPropertyYearPlanVersionRemoved;
        }

        public void setIsPropertyYearPlanVersionRemoved(Boolean removed)
        {
            this.isPropertyYearPlanVersionRemoved = removed;
        }

        private Boolean isPropertyYearPlanCreatedByRemoved;

        public Boolean getIsPropertyYearPlanCreatedByRemoved()
        {
            return this.isPropertyYearPlanCreatedByRemoved;
        }

        public void setIsPropertyYearPlanCreatedByRemoved(Boolean removed)
        {
            this.isPropertyYearPlanCreatedByRemoved = removed;
        }

        private Boolean isPropertyYearPlanCreatedAtRemoved;

        public Boolean getIsPropertyYearPlanCreatedAtRemoved()
        {
            return this.isPropertyYearPlanCreatedAtRemoved;
        }

        public void setIsPropertyYearPlanCreatedAtRemoved(Boolean removed)
        {
            this.isPropertyYearPlanCreatedAtRemoved = removed;
        }

        private Boolean isPropertyYearPlanUpdatedByRemoved;

        public Boolean getIsPropertyYearPlanUpdatedByRemoved()
        {
            return this.isPropertyYearPlanUpdatedByRemoved;
        }

        public void setIsPropertyYearPlanUpdatedByRemoved(Boolean removed)
        {
            this.isPropertyYearPlanUpdatedByRemoved = removed;
        }

        private Boolean isPropertyYearPlanUpdatedAtRemoved;

        public Boolean getIsPropertyYearPlanUpdatedAtRemoved()
        {
            return this.isPropertyYearPlanUpdatedAtRemoved;
        }

        public void setIsPropertyYearPlanUpdatedAtRemoved(Boolean removed)
        {
            this.isPropertyYearPlanUpdatedAtRemoved = removed;
        }

        private Boolean isPropertyYearPlanActiveRemoved;

        public Boolean getIsPropertyYearPlanActiveRemoved()
        {
            return this.isPropertyYearPlanActiveRemoved;
        }

        public void setIsPropertyYearPlanActiveRemoved(Boolean removed)
        {
            this.isPropertyYearPlanActiveRemoved = removed;
        }

        private Boolean isPropertyYearPlanDeletedRemoved;

        public Boolean getIsPropertyYearPlanDeletedRemoved()
        {
            return this.isPropertyYearPlanDeletedRemoved;
        }

        public void setIsPropertyYearPlanDeletedRemoved(Boolean removed)
        {
            this.isPropertyYearPlanDeletedRemoved = removed;
        }

        private Boolean isPropertyPersonBirthDateRemoved;

        public Boolean getIsPropertyPersonBirthDateRemoved()
        {
            return this.isPropertyPersonBirthDateRemoved;
        }

        public void setIsPropertyPersonBirthDateRemoved(Boolean removed)
        {
            this.isPropertyPersonBirthDateRemoved = removed;
        }

        private Boolean isPropertyPersonLovesRemoved;

        public Boolean getIsPropertyPersonLovesRemoved()
        {
            return this.isPropertyPersonLovesRemoved;
        }

        public void setIsPropertyPersonLovesRemoved(Boolean removed)
        {
            this.isPropertyPersonLovesRemoved = removed;
        }

        private Boolean isPropertyPersonCreatedByRemoved;

        public Boolean getIsPropertyPersonCreatedByRemoved()
        {
            return this.isPropertyPersonCreatedByRemoved;
        }

        public void setIsPropertyPersonCreatedByRemoved(Boolean removed)
        {
            this.isPropertyPersonCreatedByRemoved = removed;
        }

        private Boolean isPropertyPersonCreatedAtRemoved;

        public Boolean getIsPropertyPersonCreatedAtRemoved()
        {
            return this.isPropertyPersonCreatedAtRemoved;
        }

        public void setIsPropertyPersonCreatedAtRemoved(Boolean removed)
        {
            this.isPropertyPersonCreatedAtRemoved = removed;
        }

        private Boolean isPropertyPersonUpdatedByRemoved;

        public Boolean getIsPropertyPersonUpdatedByRemoved()
        {
            return this.isPropertyPersonUpdatedByRemoved;
        }

        public void setIsPropertyPersonUpdatedByRemoved(Boolean removed)
        {
            this.isPropertyPersonUpdatedByRemoved = removed;
        }

        private Boolean isPropertyPersonUpdatedAtRemoved;

        public Boolean getIsPropertyPersonUpdatedAtRemoved()
        {
            return this.isPropertyPersonUpdatedAtRemoved;
        }

        public void setIsPropertyPersonUpdatedAtRemoved(Boolean removed)
        {
            this.isPropertyPersonUpdatedAtRemoved = removed;
        }

        private Boolean isPropertyPersonActiveRemoved;

        public Boolean getIsPropertyPersonActiveRemoved()
        {
            return this.isPropertyPersonActiveRemoved;
        }

        public void setIsPropertyPersonActiveRemoved(Boolean removed)
        {
            this.isPropertyPersonActiveRemoved = removed;
        }

        private Boolean isPropertyPersonDeletedRemoved;

        public Boolean getIsPropertyPersonDeletedRemoved()
        {
            return this.isPropertyPersonDeletedRemoved;
        }

        public void setIsPropertyPersonDeletedRemoved(Boolean removed)
        {
            this.isPropertyPersonDeletedRemoved = removed;
        }

    }

    public static class SimpleCreateDayPlanMvo extends AbstractCreateDayPlanMvo
    {
    }

    public static class SimpleMergePatchDayPlanMvo extends AbstractMergePatchDayPlanMvo
    {
    }

	public static class SimpleDeleteDayPlanMvo extends AbstractDayPlanMvoCommand implements DeleteDayPlanMvo
	{
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_DELETE;
        }
	}


}

