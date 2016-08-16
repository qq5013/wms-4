package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.Command;

public interface YearPlanMvoCommand extends Command
{
    YearPlanId getYearPlanId();

    void setYearPlanId(YearPlanId yearPlanId);

    Long getPersonVersion();

    void setPersonVersion(Long personVersion);


    interface CreateOrMergePatchYearPlanMvo extends YearPlanMvoCommand
    {
        String getDescription();

        void setDescription(String description);

        Long getVersion();

        void setVersion(Long version);

        Boolean getActive();

        void setActive(Boolean active);

        Date getPersonBirthDate();

        void setPersonBirthDate(Date personBirthDate);

        PersonalName getPersonLoves();

        void setPersonLoves(PersonalName personLoves);

        String getPersonCreatedBy();

        void setPersonCreatedBy(String personCreatedBy);

        Date getPersonCreatedAt();

        void setPersonCreatedAt(Date personCreatedAt);

        String getPersonUpdatedBy();

        void setPersonUpdatedBy(String personUpdatedBy);

        Date getPersonUpdatedAt();

        void setPersonUpdatedAt(Date personUpdatedAt);

        Boolean getPersonActive();

        void setPersonActive(Boolean personActive);

        Boolean getPersonDeleted();

        void setPersonDeleted(Boolean personDeleted);

    }

    interface CreateYearPlanMvo extends CreateOrMergePatchYearPlanMvo
    {
    }

    interface MergePatchYearPlanMvo extends CreateOrMergePatchYearPlanMvo
    {
        Boolean getIsPropertyDescriptionRemoved();

        void setIsPropertyDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyVersionRemoved();

        void setIsPropertyVersionRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

        Boolean getIsPropertyPersonBirthDateRemoved();

        void setIsPropertyPersonBirthDateRemoved(Boolean removed);

        Boolean getIsPropertyPersonLovesRemoved();

        void setIsPropertyPersonLovesRemoved(Boolean removed);

        Boolean getIsPropertyPersonCreatedByRemoved();

        void setIsPropertyPersonCreatedByRemoved(Boolean removed);

        Boolean getIsPropertyPersonCreatedAtRemoved();

        void setIsPropertyPersonCreatedAtRemoved(Boolean removed);

        Boolean getIsPropertyPersonUpdatedByRemoved();

        void setIsPropertyPersonUpdatedByRemoved(Boolean removed);

        Boolean getIsPropertyPersonUpdatedAtRemoved();

        void setIsPropertyPersonUpdatedAtRemoved(Boolean removed);

        Boolean getIsPropertyPersonActiveRemoved();

        void setIsPropertyPersonActiveRemoved(Boolean removed);

        Boolean getIsPropertyPersonDeletedRemoved();

        void setIsPropertyPersonDeletedRemoved(Boolean removed);

    }

	interface DeleteYearPlanMvo extends YearPlanMvoCommand
	{
	}

}

