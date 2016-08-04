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
    ->add('accessFailedCount', TextType::class, [
        'required' => false,
        'label'    => 'AccessFailedCount',
    ])
    ->add('email', TextType::class, [
        'required' => false,
        'label'    => 'Email',
    ])
    ->add('emailConfirmed', TextType::class, [
        'required' => false,
        'label'    => 'EmailConfirmed',
    ])
    ->add('lockoutEnabled', TextType::class, [
        'required' => false,
        'label'    => 'LockoutEnabled',
    ])
    ->add('lockoutEndDateUtc', TextType::class, [
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
    ->add('phoneNumberConfirmed', TextType::class, [
        'required' => false,
        'label'    => 'PhoneNumberConfirmed',
    ])
    ->add('twoFactorEnabled', TextType::class, [
        'required' => false,
        'label'    => 'TwoFactorEnabled',
    ])
    ->add('securityStamp', TextType::class, [
        'required' => false,
        'label'    => 'SecurityStamp',
    ])
    ->add('active', TextType::class, [
        'required' => false,
        'label'    => 'Active',
    ])
    ->add('version', TextType::class, [
        'required' => false,
        'label'    => 'Version',
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

