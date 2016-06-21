set @var=if((SELECT true FROM information_schema.TABLE_CONSTRAINTS WHERE
            CONSTRAINT_SCHEMA = DATABASE() AND
            TABLE_NAME        = 'AttributeValues' AND
            CONSTRAINT_NAME   = 'FK_AttributeValue_Attribute_StateId' AND
            CONSTRAINT_TYPE   = 'FOREIGN KEY') = true,'ALTER TABLE AttributeValues
            drop foreign key FK_AttributeValue_Attribute_StateId','select 1');

prepare stmt from @var;
execute stmt;
deallocate prepare stmt;

set @var=if((SELECT true FROM information_schema.TABLE_CONSTRAINTS WHERE
            CONSTRAINT_SCHEMA = DATABASE() AND
            TABLE_NAME        = 'AttributeUses' AND
            CONSTRAINT_NAME   = 'FK_AttributeUse_AttributeSet_StateId' AND
            CONSTRAINT_TYPE   = 'FOREIGN KEY') = true,'ALTER TABLE AttributeUses
            drop foreign key FK_AttributeUse_AttributeSet_StateId','select 1');

prepare stmt from @var;
execute stmt;
deallocate prepare stmt;

set @var=if((SELECT true FROM information_schema.TABLE_CONSTRAINTS WHERE
            CONSTRAINT_SCHEMA = DATABASE() AND
            TABLE_NAME        = 'AttributeSetInstanceExtensionFields' AND
            CONSTRAINT_NAME   = 'FK_AttributeSetInstanceExtensionField_AttrSetInstEFGroup_StateId' AND
            CONSTRAINT_TYPE   = 'FOREIGN KEY') = true,'ALTER TABLE AttributeSetInstanceExtensionFields
            drop foreign key FK_AttributeSetInstanceExtensionField_AttrSetInstEFGroup_StateId','select 1');

prepare stmt from @var;
execute stmt;
deallocate prepare stmt;

set @var=if((SELECT true FROM information_schema.TABLE_CONSTRAINTS WHERE
            CONSTRAINT_SCHEMA = DATABASE() AND
            TABLE_NAME        = 'InOutLines' AND
            CONSTRAINT_NAME   = 'FK_InOutLine_InOut_StateId' AND
            CONSTRAINT_TYPE   = 'FOREIGN KEY') = true,'ALTER TABLE InOutLines
            drop foreign key FK_InOutLine_InOut_StateId','select 1');

prepare stmt from @var;
execute stmt;
deallocate prepare stmt;

set @var=if((SELECT true FROM information_schema.TABLE_CONSTRAINTS WHERE
            CONSTRAINT_SCHEMA = DATABASE() AND
            TABLE_NAME        = 'UserRoles' AND
            CONSTRAINT_NAME   = 'FK_UserRole_User_StateId' AND
            CONSTRAINT_TYPE   = 'FOREIGN KEY') = true,'ALTER TABLE UserRoles
            drop foreign key FK_UserRole_User_StateId','select 1');

prepare stmt from @var;
execute stmt;
deallocate prepare stmt;

set @var=if((SELECT true FROM information_schema.TABLE_CONSTRAINTS WHERE
            CONSTRAINT_SCHEMA = DATABASE() AND
            TABLE_NAME        = 'UserClaims' AND
            CONSTRAINT_NAME   = 'FK_UserClaim_User_StateId' AND
            CONSTRAINT_TYPE   = 'FOREIGN KEY') = true,'ALTER TABLE UserClaims
            drop foreign key FK_UserClaim_User_StateId','select 1');

prepare stmt from @var;
execute stmt;
deallocate prepare stmt;

set @var=if((SELECT true FROM information_schema.TABLE_CONSTRAINTS WHERE
            CONSTRAINT_SCHEMA = DATABASE() AND
            TABLE_NAME        = 'UserPermissions' AND
            CONSTRAINT_NAME   = 'FK_UserPermission_User_StateId' AND
            CONSTRAINT_TYPE   = 'FOREIGN KEY') = true,'ALTER TABLE UserPermissions
            drop foreign key FK_UserPermission_User_StateId','select 1');

prepare stmt from @var;
execute stmt;
deallocate prepare stmt;

set @var=if((SELECT true FROM information_schema.TABLE_CONSTRAINTS WHERE
            CONSTRAINT_SCHEMA = DATABASE() AND
            TABLE_NAME        = 'UserLogins' AND
            CONSTRAINT_NAME   = 'FK_UserLogin_User_StateId' AND
            CONSTRAINT_TYPE   = 'FOREIGN KEY') = true,'ALTER TABLE UserLogins
            drop foreign key FK_UserLogin_User_StateId','select 1');

prepare stmt from @var;
execute stmt;
deallocate prepare stmt;

