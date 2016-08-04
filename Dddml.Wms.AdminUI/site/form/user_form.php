<?php
use Symfony\Component\Form\Extension\Core\Type\FormType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

return $app['form.factory']->createBuilder(FormType::class, $data)
    ->add('userId', TextType::class, [
        'required' => true,
        'label'    => 'UserId',
    ])
    ->add('userName', TextType::class, [
        'required' => false,
        'label'    => 'UserName',
    ])
    ->add('accessFailedCount', IntegerType::class, [
        'required' => false,
        'label'    => 'AccessFailedCount',
    ])
    ->add('email', TextType::class, [
        'required' => false,
        'label'    => 'Email',
    ])
    ->add('emailConfirmed', ChoiceType::class, [
        'required' => false,
        'label'    => 'EmailConfirmed',
    ])
    ->add('lockoutEnabled', ChoiceType::class, [
        'required' => false,
        'label'    => 'LockoutEnabled',
    ])
    ->add('lockoutEndDateUtc', DateTimeType::class, [
        'required' => false,
        'label'    => 'LockoutEndDateUtc',
    ])
    ->add('passwordHash', TextType::class, [
        'required' => false,
        'label'    => 'PasswordHash',
    ])
    ->add('phoneNumber', TextType::class, [
        'required' => false,
        'label'    => 'PhoneNumber',
    ])
    ->add('phoneNumberConfirmed', ChoiceType::class, [
        'required' => false,
        'label'    => 'PhoneNumberConfirmed',
    ])
    ->add('twoFactorEnabled', ChoiceType::class, [
        'required' => false,
        'label'    => 'TwoFactorEnabled',
    ])
    ->add('securityStamp', TextType::class, [
        'required' => false,
        'label'    => 'SecurityStamp',
    ])
    ->add('active', ChoiceType::class, [
        'required' => false,
        'label'    => 'Active',
    ])
    ->add('version', IntegerType::class, [
        'required' => false,
        'label'    => 'Version',
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

