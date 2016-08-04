<?php
use Symfony\Component\Form\Extension\Core\Type\FormType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

return $app['form.factory']->createBuilder(FormType::class, $data)
    ->add('name', TextType::class, [
        'required' => false,
        'label'    => 'Name',
    ])
    ->add('type', TextType::class, [
        'required' => false,
        'label'    => 'Type',
    ])
    ->add('length', TextType::class, [
        'required' => false,
        'label'    => 'Length',
    ])
    ->add('alias', TextType::class, [
        'required' => false,
        'label'    => 'Alias',
    ])
    ->add('description', TextType::class, [
        'required' => false,
        'label'    => 'Description',
    ])
    ->add('version', TextType::class, [
        'required' => false,
        'label'    => 'Version',
    ])
    ->add('active', TextType::class, [
        'required' => false,
        'label'    => 'Active',
    ])
    ->add('attrSetInstEFGroupFieldType', TextType::class, [
        'required' => false,
        'label'    => 'AttrSetInstEFGroupFieldType',
    ])
    ->add('attrSetInstEFGroupFieldLength', TextType::class, [
        'required' => false,
        'label'    => 'AttrSetInstEFGroupFieldLength',
    ])
    ->add('attrSetInstEFGroupFieldCount', TextType::class, [
        'required' => false,
        'label'    => 'AttrSetInstEFGroupFieldCount',
    ])
    ->add('attrSetInstEFGroupNameFormat', TextType::class, [
        'required' => false,
        'label'    => 'AttrSetInstEFGroupNameFormat',
    ])
    ->add('attrSetInstEFGroupDescription', TextType::class, [
        'required' => false,
        'label'    => 'AttrSetInstEFGroupDescription',
    ])
    ->add('attrSetInstEFGroupCreatedBy', TextType::class, [
        'required' => false,
        'label'    => 'AttrSetInstEFGroupCreatedBy',
    ])
    ->add('attrSetInstEFGroupCreatedAt', TextType::class, [
        'required' => false,
        'label'    => 'AttrSetInstEFGroupCreatedAt',
    ])
    ->add('attrSetInstEFGroupUpdatedBy', TextType::class, [
        'required' => false,
        'label'    => 'AttrSetInstEFGroupUpdatedBy',
    ])
    ->add('attrSetInstEFGroupUpdatedAt', TextType::class, [
        'required' => false,
        'label'    => 'AttrSetInstEFGroupUpdatedAt',
    ])
    ->add('attrSetInstEFGroupActive', TextType::class, [
        'required' => false,
        'label'    => 'AttrSetInstEFGroupActive',
    ])
    ->add('attrSetInstEFGroupDeleted', TextType::class, [
        'required' => false,
        'label'    => 'AttrSetInstEFGroupDeleted',
    ])
    ->add('attrSetInstEFGroupVersion', TextType::class, [
        'required' => false,
        'label'    => 'AttrSetInstEFGroupVersion',
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

