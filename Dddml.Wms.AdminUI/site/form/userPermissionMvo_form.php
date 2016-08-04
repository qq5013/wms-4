<?php
use Symfony\Component\Form\Extension\Core\Type\FormType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

return $app['form.factory']->createBuilder(FormType::class, $data)
    ->add('version', IntegerType::class, [
        'required' => false,
        'label'    => 'Version',
    ])
    ->add('active', ChoiceType::class, [
        'required' => false,
        'label'    => 'Active',
    ])
    ->add('userUserName', TextType::class, [
        'required' => false,
        'label'    => 'UserUserName',
    ])
    ->add('userAccessFailedCount', IntegerType::class, [
        'required' => false,
        'label'    => 'UserAccessFailedCount',
    ])
    ->add('userEmail', TextType::class, [
        'required' => false,
        'label'    => 'UserEmail',
    ])
    ->add('userEmailConfirmed', ChoiceType::class, [
        'required' => false,
        'label'    => 'UserEmailConfirmed',
    ])
    ->add('userLockoutEnabled', ChoiceType::class, [
        'required' => false,
        'label'    => 'UserLockoutEnabled',
    ])
    ->add('userLockoutEndDateUtc', DateTimeType::class, [
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
    ->add('userPhoneNumberConfirmed', ChoiceType::class, [
        'required' => false,
        'label'    => 'UserPhoneNumberConfirmed',
    ])
    ->add('userTwoFactorEnabled', ChoiceType::class, [
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
    ->add('userCreatedAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'UserCreatedAt',
    ])
    ->add('userUpdatedBy', TextType::class, [
        'required' => false,
        'label'    => 'UserUpdatedBy',
    ])
    ->add('userUpdatedAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'UserUpdatedAt',
    ])
    ->add('userActive', ChoiceType::class, [
        'required' => false,
        'label'    => 'UserActive',
    ])
    ->add('userDeleted', ChoiceType::class, [
        'required' => false,
        'label'    => 'UserDeleted',
    ])
    ->add('userVersion', IntegerType::class, [
        'required' => false,
        'label'    => 'UserVersion',
    ])
    ->add('createdBy', TextType::class, [
        'required' => false,
        'label'    => 'CreatedBy',
    ])
    ->add('createdAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'CreatedAt',
    ])
    ->add('updatedBy', TextType::class, [
        'required' => false,
        'label'    => 'UpdatedBy',
    ])
    ->add('updatedAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'UpdatedAt',
    ])
    ->getForm();

