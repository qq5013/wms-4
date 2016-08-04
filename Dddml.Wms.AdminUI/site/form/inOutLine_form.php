<?php
use Symfony\Component\Form\Extension\Core\Type\FormType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

return $app['form.factory']->createBuilder(FormType::class, $data)
    ->add('lineNumber', TextType::class, [
        'required' => false,
        'label'    => 'LineNumber',
    ])
    ->add('description', TextType::class, [
        'required' => false,
        'label'    => 'Description',
    ])
    ->add('locatorId', TextType::class, [
        'required' => false,
        'label'    => 'LocatorId',
    ])
    ->add('product', TextType::class, [
        'required' => false,
        'label'    => 'Product',
    ])
    ->add('uomId', TextType::class, [
        'required' => false,
        'label'    => 'UomId',
    ])
    ->add('movementQuantity', TextType::class, [
        'required' => false,
        'label'    => 'MovementQuantity',
    ])
    ->add('confirmedQuantity', TextType::class, [
        'required' => false,
        'label'    => 'ConfirmedQuantity',
    ])
    ->add('scrappedQuantity', TextType::class, [
        'required' => false,
        'label'    => 'ScrappedQuantity',
    ])
    ->add('targetQuantity', TextType::class, [
        'required' => false,
        'label'    => 'TargetQuantity',
    ])
    ->add('pickedQuantity', TextType::class, [
        'required' => false,
        'label'    => 'PickedQuantity',
    ])
    ->add('isInvoiced', TextType::class, [
        'required' => false,
        'label'    => 'IsInvoiced',
    ])
    ->add('attributeSetInstanceId', TextType::class, [
        'required' => false,
        'label'    => 'AttributeSetInstanceId',
    ])
    ->add('isDescription', TextType::class, [
        'required' => false,
        'label'    => 'IsDescription',
    ])
    ->add('processed', TextType::class, [
        'required' => false,
        'label'    => 'Processed',
    ])
    ->add('quantityEntered', TextType::class, [
        'required' => false,
        'label'    => 'QuantityEntered',
    ])
    ->add('rmaLineNumber', TextType::class, [
        'required' => false,
        'label'    => 'RmaLineNumber',
    ])
    ->add('reversalLineNumber', TextType::class, [
        'required' => false,
        'label'    => 'ReversalLineNumber',
    ])
    ->add('active', TextType::class, [
        'required' => false,
        'label'    => 'Active',
    ])
    ->add('version', TextType::class, [
        'required' => false,
        'label'    => 'Version',
    ])
    ->add('inOutDocumentNumber', TextType::class, [
        'required' => false,
        'label'    => 'InOutDocumentNumber',
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

