<?php
use Symfony\Component\Form\Extension\Core\Type\FormType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

return $app['form.factory']->createBuilder(FormType::class, $data)
    ->add('sequenceNumber', TextType::class, [
        'required' => false,
        'label'    => 'SequenceNumber',
    ])
    ->add('version', TextType::class, [
        'required' => false,
        'label'    => 'Version',
    ])
    ->add('active', TextType::class, [
        'required' => false,
        'label'    => 'Active',
    ])
    ->add('attributeSetName', TextType::class, [
        'required' => false,
        'label'    => 'AttributeSetName',
    ])
    ->add('attributeSetOrganizationId', TextType::class, [
        'required' => false,
        'label'    => 'AttributeSetOrganizationId',
    ])
    ->add('attributeSetDescription', TextType::class, [
        'required' => false,
        'label'    => 'AttributeSetDescription',
    ])
    ->add('attributeSetSerialNumberAttributeId', TextType::class, [
        'required' => false,
        'label'    => 'AttributeSetSerialNumberAttributeId',
    ])
    ->add('attributeSetLotAttributeId', TextType::class, [
        'required' => false,
        'label'    => 'AttributeSetLotAttributeId',
    ])
    ->add('attributeSetReferenceId', TextType::class, [
        'required' => false,
        'label'    => 'AttributeSetReferenceId',
    ])
    ->add('attributeSetCreatedBy', TextType::class, [
        'required' => false,
        'label'    => 'AttributeSetCreatedBy',
    ])
    ->add('attributeSetCreatedAt', TextType::class, [
        'required' => false,
        'label'    => 'AttributeSetCreatedAt',
    ])
    ->add('attributeSetUpdatedBy', TextType::class, [
        'required' => false,
        'label'    => 'AttributeSetUpdatedBy',
    ])
    ->add('attributeSetUpdatedAt', TextType::class, [
        'required' => false,
        'label'    => 'AttributeSetUpdatedAt',
    ])
    ->add('attributeSetActive', TextType::class, [
        'required' => false,
        'label'    => 'AttributeSetActive',
    ])
    ->add('attributeSetDeleted', TextType::class, [
        'required' => false,
        'label'    => 'AttributeSetDeleted',
    ])
    ->add('attributeSetVersion', TextType::class, [
        'required' => false,
        'label'    => 'AttributeSetVersion',
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

