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
    ->add('length', IntegerType::class, [
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
    ->add('version', IntegerType::class, [
        'required' => false,
        'label'    => 'Version',
    ])
    ->add('active', ChoiceType::class, [
        'required' => false,
        'label'    => 'Active',
    ])
    ->add('attrSetInstEFGroupFieldType', TextType::class, [
        'required' => false,
        'label'    => 'AttrSetInstEFGroupFieldType',
    ])
    ->add('attrSetInstEFGroupFieldLength', IntegerType::class, [
        'required' => false,
        'label'    => 'AttrSetInstEFGroupFieldLength',
    ])
    ->add('attrSetInstEFGroupFieldCount', IntegerType::class, [
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
    ->add('attrSetInstEFGroupCreatedAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'AttrSetInstEFGroupCreatedAt',
    ])
    ->add('attrSetInstEFGroupUpdatedBy', TextType::class, [
        'required' => false,
        'label'    => 'AttrSetInstEFGroupUpdatedBy',
    ])
    ->add('attrSetInstEFGroupUpdatedAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'AttrSetInstEFGroupUpdatedAt',
    ])
    ->add('attrSetInstEFGroupActive', ChoiceType::class, [
        'required' => false,
        'label'    => 'AttrSetInstEFGroupActive',
    ])
    ->add('attrSetInstEFGroupDeleted', ChoiceType::class, [
        'required' => false,
        'label'    => 'AttrSetInstEFGroupDeleted',
    ])
    ->add('attrSetInstEFGroupVersion', IntegerType::class, [
        'required' => false,
        'label'    => 'AttrSetInstEFGroupVersion',
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

