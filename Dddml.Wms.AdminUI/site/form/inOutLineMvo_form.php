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
    ->add('version', TextType::class, [
        'required' => false,
        'label'    => 'Version',
    ])
    ->add('active', TextType::class, [
        'required' => false,
        'label'    => 'Active',
    ])
    ->add('inOutIsSOTransaction', TextType::class, [
        'required' => false,
        'label'    => 'InOutIsSOTransaction',
    ])
    ->add('inOutDocumentStatus', TextType::class, [
        'required' => false,
        'label'    => 'InOutDocumentStatus',
    ])
    ->add('inOutPosted', TextType::class, [
        'required' => false,
        'label'    => 'InOutPosted',
    ])
    ->add('inOutProcessing', TextType::class, [
        'required' => false,
        'label'    => 'InOutProcessing',
    ])
    ->add('inOutProcessed', TextType::class, [
        'required' => false,
        'label'    => 'InOutProcessed',
    ])
    ->add('inOutDocumentType', TextType::class, [
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
    ->add('inOutDateOrdered', TextType::class, [
        'required' => false,
        'label'    => 'InOutDateOrdered',
    ])
    ->add('inOutIsPrinted', TextType::class, [
        'required' => false,
        'label'    => 'InOutIsPrinted',
    ])
    ->add('inOutMovementType', TextType::class, [
        'required' => false,
        'label'    => 'InOutMovementType',
    ])
    ->add('inOutMovementDate', TextType::class, [
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
    ->add('inOutFreightAmount', TextType::class, [
        'required' => false,
        'label'    => 'InOutFreightAmount',
    ])
    ->add('inOutShipperId', TextType::class, [
        'required' => false,
        'label'    => 'InOutShipperId',
    ])
    ->add('inOutChargeAmount', TextType::class, [
        'required' => false,
        'label'    => 'InOutChargeAmount',
    ])
    ->add('inOutDatePrinted', TextType::class, [
        'required' => false,
        'label'    => 'InOutDatePrinted',
    ])
    ->add('inOutSalesRepresentative', TextType::class, [
        'required' => false,
        'label'    => 'InOutSalesRepresentative',
    ])
    ->add('inOutNumberOfPackages', TextType::class, [
        'required' => false,
        'label'    => 'InOutNumberOfPackages',
    ])
    ->add('inOutPickDate', TextType::class, [
        'required' => false,
        'label'    => 'InOutPickDate',
    ])
    ->add('inOutShipDate', TextType::class, [
        'required' => false,
        'label'    => 'InOutShipDate',
    ])
    ->add('inOutTrackingNumber', TextType::class, [
        'required' => false,
        'label'    => 'InOutTrackingNumber',
    ])
    ->add('inOutDateReceived', TextType::class, [
        'required' => false,
        'label'    => 'InOutDateReceived',
    ])
    ->add('inOutIsInTransit', TextType::class, [
        'required' => false,
        'label'    => 'InOutIsInTransit',
    ])
    ->add('inOutIsApproved', TextType::class, [
        'required' => false,
        'label'    => 'InOutIsApproved',
    ])
    ->add('inOutIsInDispute', TextType::class, [
        'required' => false,
        'label'    => 'InOutIsInDispute',
    ])
    ->add('inOutVolume', TextType::class, [
        'required' => false,
        'label'    => 'InOutVolume',
    ])
    ->add('inOutWeight', TextType::class, [
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
    ->add('inOutIsDropShip', TextType::class, [
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
    ->add('inOutCreatedAt', TextType::class, [
        'required' => false,
        'label'    => 'InOutCreatedAt',
    ])
    ->add('inOutUpdatedBy', TextType::class, [
        'required' => false,
        'label'    => 'InOutUpdatedBy',
    ])
    ->add('inOutUpdatedAt', TextType::class, [
        'required' => false,
        'label'    => 'InOutUpdatedAt',
    ])
    ->add('inOutActive', TextType::class, [
        'required' => false,
        'label'    => 'InOutActive',
    ])
    ->add('inOutDeleted', TextType::class, [
        'required' => false,
        'label'    => 'InOutDeleted',
    ])
    ->add('inOutVersion', TextType::class, [
        'required' => false,
        'label'    => 'InOutVersion',
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

