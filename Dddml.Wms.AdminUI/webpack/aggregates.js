export default [
  {
    "name": "AttributeSetInstance",
    "plural": "AttributeSetInstances",
    "title": "Attribute Set Instance",
    "id": "attributeSetInstanceId"
  },
  {
    "name": "AttributeSetInstanceExtensionFieldGroup",
    "plural": "AttributeSetInstanceExtensionFieldGroups",
    "title": "Attribute Set Instance Extension Field Group",
    "id": "id"
    ,"entities": [
      {
        "name": "AttributeSetInstanceExtensionField",
        "plural": "AttributeSetInstanceExtensionFields",
        "title": "Attribute Set Instance Extension Field",
        "id": "index"
      }
    ]
  },
  {
    "name": "Role",
    "plural": "Roles",
    "title": "Role",
    "id": "roleId"
  },
  {
    "name": "Permission",
    "plural": "Permissions",
    "title": "Permission",
    "id": "permissionId"
  },
  {
    "name": "RolePermission",
    "plural": "RolePermissions",
    "title": "Role Permission",
    "id": { "name":"id", "properties": ["roleId", "permissionId"] }
  },
  {
    "name": "Attribute",
    "plural": "Attributes",
    "title": "Attribute",
    "id": "attributeId"
    ,"entities": [
      {
        "name": "AttributeValue",
        "plural": "AttributeValues",
        "title": "Attribute Value",
        "id": "value"
      }
    ]
  },
  {
    "name": "AttributeSet",
    "plural": "AttributeSets",
    "title": "Attribute Set",
    "id": "attributeSetId"
    ,"entities": [
      {
        "name": "AttributeUse",
        "plural": "AttributeUses",
        "title": "Attribute Use",
        "id": "attributeId"
      }
    ]
  },
  {
    "name": "Audience",
    "plural": "Audiences",
    "title": "Audience",
    "id": "clientId"
  },
  {
    "name": "User",
    "plural": "Users",
    "title": "User",
    "id": "userId"
    ,"entities": [
      {
        "name": "UserRole",
        "plural": "UserRoles",
        "title": "User Role",
        "id": "roleId"
      },
      {
        "name": "UserClaim",
        "plural": "UserClaims",
        "title": "User Claim",
        "id": "claimId"
      },
      {
        "name": "UserPermission",
        "plural": "UserPermissions",
        "title": "User Permission",
        "id": "permissionId"
      },
      {
        "name": "UserLogin",
        "plural": "UserLogins",
        "title": "User Login",
        "id": "loginKey"
      }
    ]
  },
  {
    "name": "InOut",
    "plural": "InOuts",
    "title": "In Out",
    "id": "documentNumber"
    ,"entities": [
      {
        "name": "InOutLine",
        "plural": "InOutLines",
        "title": "In Out Line",
        "id": "skuId"
      }
    ]
  },
  {
    "name": "Organization",
    "plural": "Organizations",
    "title": "Organization",
    "id": "organizationId"
  },
  {
    "name": "OrganizationStructureType",
    "plural": "OrganizationStructureTypes",
    "title": "Organization Structure Type",
    "id": "id"
  },
  {
    "name": "OrganizationStructure",
    "plural": "OrganizationStructures",
    "title": "Organization Structure",
    "id": { "name":"id", "properties": ["organizationStructureTypeId", "parentId", "subsidiaryId"] }
  },
  {
    "name": "Warehouse",
    "plural": "Warehouses",
    "title": "Warehouse",
    "id": "warehouseId"
  },
  {
    "name": "Locator",
    "plural": "Locators",
    "title": "Locator",
    "id": "locatorId"
  },
  {
    "name": "AttributeSetInstanceExtensionFieldMvo",
    "plural": "AttributeSetInstanceExtensionFieldMvos",
    "title": "Attribute Set Instance Extension Field Mvo",
    "id": { "name":"attributeSetInstanceExtensionFieldId", "properties": ["groupId", "index"] }
  },
  {
    "name": "AttributeValueMvo",
    "plural": "AttributeValueMvos",
    "title": "Attribute Value Mvo",
    "id": { "name":"attributeValueId", "properties": ["attributeId", "value"] }
  },
  {
    "name": "AttributeUseMvo",
    "plural": "AttributeUseMvos",
    "title": "Attribute Use Mvo",
    "id": { "name":"attributeSetAttributeUseId", "properties": ["attributeSetId", "attributeId"] }
  },
  {
    "name": "UserRoleMvo",
    "plural": "UserRoleMvos",
    "title": "User Role Mvo",
    "id": { "name":"userRoleId", "properties": ["userId", "roleId"] }
  },
  {
    "name": "UserClaimMvo",
    "plural": "UserClaimMvos",
    "title": "User Claim Mvo",
    "id": { "name":"userClaimId", "properties": ["userId", "claimId"] }
  },
  {
    "name": "UserPermissionMvo",
    "plural": "UserPermissionMvos",
    "title": "User Permission Mvo",
    "id": { "name":"userPermissionId", "properties": ["userId", "permissionId"] }
  },
  {
    "name": "UserLoginMvo",
    "plural": "UserLoginMvos",
    "title": "User Login Mvo",
    "id": { "name":"userLoginId", "properties": ["userId", "loginKeyLoginProvider", "loginKeyProviderKey"] }
  },
  {
    "name": "InOutLineMvo",
    "plural": "InOutLineMvos",
    "title": "In Out Line Mvo",
    "id": { "name":"inOutLineId", "properties": ["inOutDocumentNumber", "skuIdProductId", "skuIdAttributeSetInstanceId"] }
  }
]

