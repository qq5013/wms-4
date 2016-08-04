<?php
use Symfony\Component\Form\Extension\Core\Type\FormType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

return $app['form.factory']->createBuilder(FormType::class, $data)
    ->add('claimType', TextType::class, [
        'required' => false,
        'label'    => 'Claim Type',
    ])
    ->add('claimValue', TextType::class, [
        'required' => false,
        'label'    => 'Claim Value',
    ])
    ->add('version', IntegerType::class, [
        'required' => false,
        'label'    => 'Version',
    ])
    ->add('active', CheckboxType::class, [
        'required' => false,
        'label'    => 'Active',
    ])
    ->add('userUserName', TextType::class, [
        'required' => false,
        'label'    => 'User User Name',
    ])
    ->add('userAccessFailedCount', IntegerType::class, [
        'required' => false,
        'label'    => 'User Access Failed Count',
    ])
    ->add('userEmail', TextType::class, [
        'required' => false,
        'label'    => 'User Email',
    ])
    ->add('userEmailConfirmed', CheckboxType::class, [
        'required' => false,
        'label'    => 'User Email Confirmed',
    ])
    ->add('userLockoutEnabled', CheckboxType::class, [
        'required' => false,
        'label'    => 'User Lockout Enabled',
    ])
    ->add('userLockoutEndDateUtc', DateTimeType::class, [
        'required' => false,
        'label'    => 'User Lockout End Date Utc',
    ])
    ->add('userPasswordHash', TextType::class, [
        'required' => false,
        'label'    => 'User Password Hash',
    ])
    ->add('userPhoneNumber', TextType::class, [
        'required' => false,
        'label'    => 'User Phone Number',
    ])
    ->add('userPhoneNumberConfirmed', CheckboxType::class, [
        'required' => false,
        'label'    => 'User Phone Number Confirmed',
    ])
    ->add('userTwoFactorEnabled', CheckboxType::class, [
        'required' => false,
        'label'    => 'User Two Factor Enabled',
    ])
    ->add('userSecurityStamp', TextType::class, [
        'required' => false,
        'label'    => 'User Security Stamp',
    ])
    ->add('userCreatedBy', TextType::class, [
        'required' => false,
        'label'    => 'User Created By',
    ])
    ->add('userCreatedAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'User Created At',
    ])
    ->add('userUpdatedBy', TextType::class, [
        'required' => false,
        'label'    => 'User Updated By',
    ])
    ->add('userUpdatedAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'User Updated At',
    ])
    ->add('userActive', CheckboxType::class, [
        'required' => false,
        'label'    => 'User Active',
    ])
    ->add('userDeleted', CheckboxType::class, [
        'required' => false,
        'label'    => 'User Deleted',
    ])
    ->add('userVersion', IntegerType::class, [
        'required' => false,
        'label'    => 'User Version',
    ])
    ->add('createdBy', TextType::class, [
        'required' => false,
        'label'    => 'Created By',
    ])
    ->add('createdAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'Created At',
    ])
    ->add('updatedBy', TextType::class, [
        'required' => false,
        'label'    => 'Updated By',
    ])
    ->add('updatedAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'Updated At',
    ])
    ->getForm();

