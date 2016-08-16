package org.dddml.wms.domain;

import java.util.Date;

public class CreateOrMergePatchPersonDto extends AbstractPersonCommandDto
{
    private Date birthDate;

    public Date getBirthDate()
    {
        return this.birthDate;
    }

    public void setBirthDate(Date birthDate)
    {
        this.birthDate = birthDate;
    }

    private PersonalNameDto loves;

    public PersonalNameDto getLoves()
    {
        return this.loves;
    }

    public void setLoves(PersonalNameDto loves)
    {
        this.loves = loves;
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

    private CreateOrMergePatchYearPlanDto[] yearPlans;

    public CreateOrMergePatchYearPlanDto[] getYearPlans()
    {
        return this.yearPlans;
    }

    public void setYearPlans(CreateOrMergePatchYearPlanDto[] yearPlans)
    {
        this.yearPlans = yearPlans;
    }

    private Boolean isPropertyBirthDateRemoved;

    public Boolean getIsPropertyBirthDateRemoved()
    {
        return this.isPropertyBirthDateRemoved;
    }

    public void setIsPropertyBirthDateRemoved(Boolean removed)
    {
        this.isPropertyBirthDateRemoved = removed;
    }

    private Boolean isPropertyLovesRemoved;

    public Boolean getIsPropertyLovesRemoved()
    {
        return this.isPropertyLovesRemoved;
    }

    public void setIsPropertyLovesRemoved(Boolean removed)
    {
        this.isPropertyLovesRemoved = removed;
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


    public static class CreatePersonDto extends CreateOrMergePatchPersonDto
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

    }

    public static class MergePatchPersonDto extends CreateOrMergePatchPersonDto
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_MERGE_PATCH;
        }

    }

}

