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
    ->add('version', IntegerType::class, [
        'required' => false,
        'label'    => 'Version',
    ])
    ->add('active', ChoiceType::class, [
        'required' => false,
        'label'    => 'Active',
    ])
    ->add('inOutIsSOTransaction', ChoiceType::class, [
        'required' => false,
        'label'    => 'InOutIsSOTransaction',
    ])
    ->add('inOutDocumentStatus', TextType::class, [
        'required' => false,
        'label'    => 'InOutDocumentStatus',
    ])
    ->add('inOutPosted', ChoiceType::class, [
        'required' => false,
        'label'    => 'InOutPosted',
    ])
    ->add('inOutProcessing', ChoiceType::class, [
        'required' => false,
        'label'    => 'InOutProcessing',
    ])
    ->add('inOutProcessed', ChoiceType::class, [
        'required' => false,
        'label'    => 'InOutProcessed',
    ])
    ->add('inOutDocumentType', IntegerType::class, [
        'required' => false,
        'label'    => 'InOutDocumentType',
    ])
    ->add('inOutDescription', TextType::class, [
        'required' => false,
        'label'    => 'InOutDescription',
    ])
    ->add('inOutOrderNumber', TextType::class, [
        'required' => false,
        'label'    => 'InOutOrderNumber',
    ])
    ->add('inOutDateOrdered', DateTimeType::class, [
        'required' => false,
        'label'    => 'InOutDateOrdered',
    ])
    ->add('inOutIsPrinted', ChoiceType::class, [
        'required' => false,
        'label'    => 'InOutIsPrinted',
    ])
    ->add('inOutMovementType', TextType::class, [
        'required' => false,
        'label'    => 'InOutMovementType',
    ])
    ->add('inOutMovementDate', DateTimeType::class, [
        'required' => false,
        'label'    => 'InOutMovementDate',
    ])
    ->add('inOutBusinessPartnerId', TextType::class, [
        'required' => false,
        'label'    => 'InOutBusinessPartnerId',
    ])
    ->add('inOutWarehouseId', TextType::class, [
        'required' => false,
        'label'    => 'InOutWarehouseId',
    ])
    ->add('inOutPOReference', TextType::class, [
        'required' => false,
        'label'    => 'InOutPOReference',
    ])
    ->add('inOutFreightAmount', MoneyType::class, [
        'required' => false,
        'label'    => 'InOutFreightAmount',
    ])
    ->add('inOutShipperId', TextType::class, [
        'required' => false,
        'label'    => 'InOutShipperId',
    ])
    ->add('inOutChargeAmount', MoneyType::class, [
        'required' => false,
        'label'    => 'InOutChargeAmount',
    ])
    ->add('inOutDatePrinted', DateTimeType::class, [
        'required' => false,
        'label'    => 'InOutDatePrinted',
    ])
    ->add('inOutSalesRepresentative', TextType::class, [
        'required' => false,
        'label'    => 'InOutSalesRepresentative',
    ])
    ->add('inOutNumberOfPackages', IntegerType::class, [
        'required' => false,
        'label'    => 'InOutNumberOfPackages',
    ])
    ->add('inOutPickDate', DateTimeType::class, [
        'required' => false,
        'label'    => 'InOutPickDate',
    ])
    ->add('inOutShipDate', DateTimeType::class, [
        'required' => false,
        'label'    => 'InOutShipDate',
    ])
    ->add('inOutTrackingNumber', TextType::class, [
        'required' => false,
        'label'    => 'InOutTrackingNumber',
    ])
    ->add('inOutDateReceived', DateTimeType::class, [
        'required' => false,
        'label'    => 'InOutDateReceived',
    ])
    ->add('inOutIsInTransit', ChoiceType::class, [
        'required' => false,
        'label'    => 'InOutIsInTransit',
    ])
    ->add('inOutIsApproved', ChoiceType::class, [
        'required' => false,
        'label'    => 'InOutIsApproved',
    ])
    ->add('inOutIsInDispute', ChoiceType::class, [
        'required' => false,
        'label'    => 'InOutIsInDispute',
    ])
    ->add('inOutVolume', NumberType::class, [
        'required' => false,
        'label'    => 'InOutVolume',
    ])
    ->add('inOutWeight', NumberType::class, [
        'required' => false,
        'label'    => 'InOutWeight',
    ])
    ->add('inOutRmaNumber', TextType::class, [
        'required' => false,
        'label'    => 'InOutRmaNumber',
    ])
    ->add('inOutReversalNumber', TextType::class, [
        'required' => false,
        'label'    => 'InOutReversalNumber',
    ])
    ->add('inOutIsDropShip', ChoiceType::class, [
        'required' => false,
        'label'    => 'InOutIsDropShip',
    ])
    ->add('inOutDropShipBusinessPartnerId', TextType::class, [
        'required' => false,
        'label'    => 'InOutDropShipBusinessPartnerId',
    ])
    ->add('inOutCreatedBy', TextType::class, [
        'required' => false,
        'label'    => 'InOutCreatedBy',
    ])
    ->add('inOutCreatedAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'InOutCreatedAt',
    ])
    ->add('inOutUpdatedBy', TextType::class, [
        'required' => false,
        'label'    => 'InOutUpdatedBy',
    ])
    ->add('inOutUpdatedAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'InOutUpdatedAt',
    ])
    ->add('inOutActive', ChoiceType::class, [
        'required' => false,
        'label'    => 'InOutActive',
    ])
    ->add('inOutDeleted', ChoiceType::class, [
        'required' => false,
        'label'    => 'InOutDeleted',
    ])
    ->add('inOutVersion', IntegerType::class, [
        'required' => false,
        'label'    => 'InOutVersion',
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

