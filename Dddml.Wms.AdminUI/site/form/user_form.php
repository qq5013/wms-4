<?php
use Symfony\Component\Form\Extension\Core\Type\FormType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

return $app['form.factory']->createBuilder(FormType::class, $data)
    ->add('userId', TextType::class, [
        'required' => true,
        'label'    => 'User Id',
    ])
    ->add('userName', TextType::class, [
        'required' => false,
        'label'    => 'User Name',
    ])
    ->add('accessFailedCount', IntegerType::class, [
        'required' => false,
        'label'    => 'Access Failed Count',
    ])
    ->add('email', TextType::class, [
        'required' => false,
        'label'    => 'Email',
    ])
    ->add('emailConfirmed', CheckboxType::class, [
        'required' => false,
        'label'    => 'Email Confirmed',
    ])
    ->add('lockoutEnabled', CheckboxType::class, [
        'required' => false,
        'label'    => 'Lockout Enabled',
    ])
    ->add('lockoutEndDateUtc', DateTimeType::class, [
        'required' => false,
        'label'    => 'Lockout End Date Utc',
    ])
    ->add('passwordHash', TextType::class, [
        'required' => false,
        'label'    => 'Password Hash',
    ])
    ->add('phoneNumber', TextType::class, [
        'required' => false,
        'label'    => 'Phone Number',
    ])
    ->add('phoneNumberConfirmed', CheckboxType::class, [
        'required' => false,
        'label'    => 'Phone Number Confirmed',
    ])
    ->add('twoFactorEnabled', CheckboxType::class, [
        'required' => false,
        'label'    => 'Two Factor Enabled',
    ])
    ->add('securityStamp', TextType::class, [
        'required' => false,
        'label'    => 'Security Stamp',
    ])
    ->add('active', CheckboxType::class, [
        'required' => false,
        'label'    => 'Active',
    ])
    ->add('version', IntegerType::class, [
        'required' => false,
        'label'    => 'Version',
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

