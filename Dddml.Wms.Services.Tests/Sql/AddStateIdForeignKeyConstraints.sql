alter TABLE `AttributeSetInstanceExtensionFields` add
  CONSTRAINT `FK_AttributeSetInstanceExtensionField_AttrSetInstEFGroup_StateId` 
  FOREIGN KEY 
    (`AttributeSetInstanceExtensionFieldIdGroupId`) 
  REFERENCES `AttributeSetInstanceExtensionFieldGroups` 
    (`Id`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION;

alter TABLE `AttributeValues` add
  CONSTRAINT `FK_AttributeValue_Attribute_StateId` 
  FOREIGN KEY 
    (`AttributeValueIdAttributeId`) 
  REFERENCES `Attributes` 
    (`AttributeId`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION;

alter TABLE `AttributeUses` add
  CONSTRAINT `FK_AttributeUse_AttributeSet_StateId` 
  FOREIGN KEY 
    (`AttributeSetAttributeUseIdAttributeSetId`) 
  REFERENCES `AttributeSets` 
    (`AttributeSetId`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION;

alter TABLE `UserRoles` add
  CONSTRAINT `FK_UserRole_User_StateId` 
  FOREIGN KEY 
    (`UserRoleIdUserId`) 
  REFERENCES `Users` 
    (`UserId`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION;

alter TABLE `UserClaims` add
  CONSTRAINT `FK_UserClaim_User_StateId` 
  FOREIGN KEY 
    (`UserClaimIdUserId`) 
  REFERENCES `Users` 
    (`UserId`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION;

alter TABLE `UserPermissions` add
  CONSTRAINT `FK_UserPermission_User_StateId` 
  FOREIGN KEY 
    (`UserPermissionIdUserId`) 
  REFERENCES `Users` 
    (`UserId`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION;

alter TABLE `UserLogins` add
  CONSTRAINT `FK_UserLogin_User_StateId` 
  FOREIGN KEY 
    (`UserLoginIdUserId`) 
  REFERENCES `Users` 
    (`UserId`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION;

alter TABLE `InOutLines` add
  CONSTRAINT `FK_InOutLine_InOut_StateId` 
  FOREIGN KEY 
    (`InOutLineIdInOutDocumentNumber`) 
  REFERENCES `InOuts` 
    (`DocumentNumber`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION;

alter TABLE `YearPlans` add
  CONSTRAINT `FK_YearPlan_Person_StateId` 
  FOREIGN KEY 
    (`YearPlanIdPersonalNameFirstName`, `YearPlanIdPersonalNameLastName`) 
  REFERENCES `People` 
    (`PersonalNameFirstName`, `PersonalNameLastName`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION;

alter TABLE `MonthPlans` add
  CONSTRAINT `FK_MonthPlan_YearPlan_StateId` 
  FOREIGN KEY 
    (`MonthPlanIdPersonalNameFirstName`, `MonthPlanIdPersonalNameLastName`, `MonthPlanIdYear`) 
  REFERENCES `YearPlans` 
    (`YearPlanIdPersonalNameFirstName`, `YearPlanIdPersonalNameLastName`, `YearPlanIdYear`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION;

alter TABLE `DayPlans` add
  CONSTRAINT `FK_DayPlan_MonthPlan_StateId` 
  FOREIGN KEY 
    (`DayPlanIdPersonalNameFirstName`, `DayPlanIdPersonalNameLastName`, `DayPlanIdYear`, `DayPlanIdMonth`) 
  REFERENCES `MonthPlans` 
    (`MonthPlanIdPersonalNameFirstName`, `MonthPlanIdPersonalNameLastName`, `MonthPlanIdYear`, `MonthPlanIdMonth`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION;

