<?php
use Symfony\Component\Form\Extension\Core\Type\FormType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

return $app['form.factory']->createBuilder(FormType::class, $data)
    ->add('sequenceNumber', IntegerType::class, [
        'required' => false,
        'label'    => 'Sequence Number',
    ])
    ->add('version', IntegerType::class, [
        'required' => false,
        'label'    => 'Version',
    ])
    ->add('active', CheckboxType::class, [
        'required' => false,
        'label'    => 'Active',
    ])
    ->add('attributeSetName', TextType::class, [
        'required' => false,
        'label'    => 'Attribute Set Name',
    ])
    ->add('attributeSetOrganizationId', TextType::class, [
        'required' => false,
        'label'    => 'Attribute Set Organization Id',
    ])
    ->add('attributeSetDescription', TextType::class, [
        'required' => false,
        'label'    => 'Attribute Set Description',
    ])
    ->add('attributeSetSerialNumberAttributeId', TextType::class, [
        'required' => false,
        'label'    => 'Attribute Set Serial Number Attribute Id',
    ])
    ->add('attributeSetLotAttributeId', TextType::class, [
        'required' => false,
        'label'    => 'Attribute Set Lot Attribute Id',
    ])
    ->add('attributeSetReferenceId', TextType::class, [
        'required' => false,
        'label'    => 'Attribute Set Reference Id',
    ])
    ->add('attributeSetCreatedBy', TextType::class, [
        'required' => false,
        'label'    => 'Attribute Set Created By',
    ])
    ->add('attributeSetCreatedAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'Attribute Set Created At',
    ])
    ->add('attributeSetUpdatedBy', TextType::class, [
        'required' => false,
        'label'    => 'Attribute Set Updated By',
    ])
    ->add('attributeSetUpdatedAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'Attribute Set Updated At',
    ])
    ->add('attributeSetActive', CheckboxType::class, [
        'required' => false,
        'label'    => 'Attribute Set Active',
    ])
    ->add('attributeSetDeleted', CheckboxType::class, [
        'required' => false,
        'label'    => 'Attribute Set Deleted',
    ])
    ->add('attributeSetVersion', IntegerType::class, [
        'required' => false,
        'label'    => 'Attribute Set Version',
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

