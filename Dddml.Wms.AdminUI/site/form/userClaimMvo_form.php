<?php
use Symfony\Component\Form\Extension\Core\Type\FormType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

return $app['form.factory']->createBuilder(FormType::class, $data)
    ->add('claimType', TextType::class, [
        'required' => false,
        'label'    => 'ClaimType',
    ])
    ->add('claimValue', TextType::class, [
        'required' => false,
        'label'    => 'ClaimValue',
    ])
    ->add('version', TextType::class, [
        'required' => false,
        'label'    => 'Version',
    ])
    ->add('active', TextType::class, [
        'required' => false,
        'label'    => 'Active',
    ])
    ->add('userUserName', TextType::class, [
        'required' => false,
        'label'    => 'UserUserName',
    ])
    ->add('userAccessFailedCount', TextType::class, [
        'required' => false,
        'label'    => 'UserAccessFailedCount',
    ])
    ->add('userEmail', TextType::class, [
        'required' => false,
        'label'    => 'UserEmail',
    ])
    ->add('userEmailConfirmed', TextType::class, [
        'required' => false,
        'label'    => 'UserEmailConfirmed',
    ])
    ->add('userLockoutEnabled', TextType::class, [
        'required' => false,
        'label'    => 'UserLockoutEnabled',
    ])
    ->add('userLockoutEndDateUtc', TextType::class, [
        'required' => false,
        'label'    => 'UserLockoutEndDateUtc',
    ])
    ->add('userPasswordHash', TextType::class, [
        'required' => false,
        'label'    => 'UserPasswordHash',
    ])
    ->add('userPhoneNumber', TextType::class, [
        'required' => false,
        'label'    => 'UserPhoneNumber',
    ])
    ->add('userPhoneNumberConfirmed', TextType::class, [
        'required' => false,
        'label'    => 'UserPhoneNumberConfirmed',
    ])
    ->add('userTwoFactorEnabled', TextType::class, [
        'required' => false,
        'label'    => 'UserTwoFactorEnabled',
    ])
    ->add('userSecurityStamp', TextType::class, [
        'required' => false,
        'label'    => 'UserSecurityStamp',
    ])
    ->add('userCreatedBy', TextType::class, [
        'required' => false,
        'label'    => 'UserCreatedBy',
    ])
    ->add('userCreatedAt', TextType::class, [
        'required' => false,
        'label'    => 'UserCreatedAt',
    ])
    ->add('userUpdatedBy', TextType::class, [
        'required' => false,
        'label'    => 'UserUpdatedBy',
    ])
    ->add('userUpdatedAt', TextType::class, [
        'required' => false,
        'label'    => 'UserUpdatedAt',
    ])
    ->add('userActive', TextType::class, [
        'required' => false,
        'label'    => 'UserActive',
    ])
    ->add('userDeleted', TextType::class, [
        'required' => false,
        'label'    => 'UserDeleted',
    ])
    ->add('userVersion', TextType::class, [
        'required' => false,
        'label'    => 'UserVersion',
    ])
    ->add('createdBy', TextType::class, [
        'required' => false,
        'label'    => 'CreatedBy',
    ])
    ->add('createdAt', TextType::class, [
        'required' => false,
        'label'    => 'CreatedAt',
    ])
    ->add('updatedBy', TextType::class, [
        'required' => false,
        'label'    => 'UpdatedBy',
    ])
    ->add('updatedAt', TextType::class, [
        'required' => false,
        'label'    => 'UpdatedAt',
    ])
    ->getForm();

