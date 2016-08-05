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
    ->add('active', CheckboxType::class, [
        'required' => false,
        'label'    => 'Active',
    ])
    ->add('attrSetInstEFGroupFieldType', TextType::class, [
        'required' => false,
        'label'    => 'Attr Set Inst EF Group Field Type',
    ])
    ->add('attrSetInstEFGroupFieldLength', IntegerType::class, [
        'required' => false,
        'label'    => 'Attr Set Inst EF Group Field Length',
    ])
    ->add('attrSetInstEFGroupFieldCount', IntegerType::class, [
        'required' => false,
        'label'    => 'Attr Set Inst EF Group Field Count',
    ])
    ->add('attrSetInstEFGroupNameFormat', TextType::class, [
        'required' => false,
        'label'    => 'Attr Set Inst EF Group Name Format',
    ])
    ->add('attrSetInstEFGroupDescription', TextType::class, [
        'required' => false,
        'label'    => 'Attr Set Inst EF Group Description',
    ])
    ->add('attrSetInstEFGroupCreatedBy', TextType::class, [
        'required' => false,
        'label'    => 'Attr Set Inst EF Group Created By',
    ])
    ->add('attrSetInstEFGroupCreatedAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'Attr Set Inst EF Group Created At',
    ])
    ->add('attrSetInstEFGroupUpdatedBy', TextType::class, [
        'required' => false,
        'label'    => 'Attr Set Inst EF Group Updated By',
    ])
    ->add('attrSetInstEFGroupUpdatedAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'Attr Set Inst EF Group Updated At',
    ])
    ->add('attrSetInstEFGroupActive', CheckboxType::class, [
        'required' => false,
        'label'    => 'Attr Set Inst EF Group Active',
    ])
    ->add('attrSetInstEFGroupDeleted', CheckboxType::class, [
        'required' => false,
        'label'    => 'Attr Set Inst EF Group Deleted',
    ])
    ->add('attrSetInstEFGroupVersion', IntegerType::class, [
        'required' => false,
        'label'    => 'Attr Set Inst EF Group Version',
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

