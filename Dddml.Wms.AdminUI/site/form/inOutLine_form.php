<?php
use Symfony\Component\Form\Extension\Core\Type\FormType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

return $app['form.factory']->createBuilder(FormType::class, $data)
    ->add('lineNumber', IntegerType::class, [
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
    ->add('movementQuantity', NumberType::class, [
        'required' => false,
        'label'    => 'MovementQuantity',
    ])
    ->add('confirmedQuantity', NumberType::class, [
        'required' => false,
        'label'    => 'ConfirmedQuantity',
    ])
    ->add('scrappedQuantity', NumberType::class, [
        'required' => false,
        'label'    => 'ScrappedQuantity',
    ])
    ->add('targetQuantity', NumberType::class, [
        'required' => false,
        'label'    => 'TargetQuantity',
    ])
    ->add('pickedQuantity', NumberType::class, [
        'required' => false,
        'label'    => 'PickedQuantity',
    ])
    ->add('isInvoiced', ChoiceType::class, [
        'required' => false,
        'label'    => 'IsInvoiced',
    ])
    ->add('attributeSetInstanceId', TextType::class, [
        'required' => false,
        'label'    => 'AttributeSetInstanceId',
    ])
    ->add('isDescription', ChoiceType::class, [
        'required' => false,
        'label'    => 'IsDescription',
    ])
    ->add('processed', ChoiceType::class, [
        'required' => false,
        'label'    => 'Processed',
    ])
    ->add('quantityEntered', NumberType::class, [
        'required' => false,
        'label'    => 'QuantityEntered',
    ])
    ->add('rmaLineNumber', IntegerType::class, [
        'required' => false,
        'label'    => 'RmaLineNumber',
    ])
    ->add('reversalLineNumber', IntegerType::class, [
        'required' => false,
        'label'    => 'ReversalLineNumber',
    ])
    ->add('active', ChoiceType::class, [
        'required' => false,
        'label'    => 'Active',
    ])
    ->add('version', IntegerType::class, [
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

