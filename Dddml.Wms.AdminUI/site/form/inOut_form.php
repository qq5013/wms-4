<?php
use Symfony\Component\Form\Extension\Core\Type\FormType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

return $app['form.factory']->createBuilder(FormType::class, $data)
    ->add('documentNumber', TextType::class, [
        'required' => true,
        'label'    => 'DocumentNumber',
    ])
    ->add('isSOTransaction', TextType::class, [
        'required' => false,
        'label'    => 'IsSOTransaction',
    ])
    ->add('documentStatus', TextType::class, [
        'required' => false,
        'label'    => 'DocumentStatus',
    ])
    ->add('posted', TextType::class, [
        'required' => false,
        'label'    => 'Posted',
    ])
    ->add('processing', TextType::class, [
        'required' => false,
        'label'    => 'Processing',
    ])
    ->add('processed', TextType::class, [
        'required' => false,
        'label'    => 'Processed',
    ])
    ->add('documentType', TextType::class, [
        'required' => false,
        'label'    => 'DocumentType',
    ])
    ->add('description', TextType::class, [
        'required' => false,
        'label'    => 'Description',
    ])
    ->add('orderNumber', TextType::class, [
        'required' => false,
        'label'    => 'OrderNumber',
    ])
    ->add('dateOrdered', TextType::class, [
        'required' => false,
        'label'    => 'DateOrdered',
    ])
    ->add('isPrinted', TextType::class, [
        'required' => false,
        'label'    => 'IsPrinted',
    ])
    ->add('movementType', TextType::class, [
        'required' => false,
        'label'    => 'MovementType',
    ])
    ->add('movementDate', TextType::class, [
        'required' => false,
        'label'    => 'MovementDate',
    ])
    ->add('businessPartnerId', TextType::class, [
        'required' => false,
        'label'    => 'BusinessPartnerId',
    ])
    ->add('warehouseId', TextType::class, [
        'required' => false,
        'label'    => 'WarehouseId',
    ])
    ->add('poReference', TextType::class, [
        'required' => false,
        'label'    => 'POReference',
    ])
    ->add('freightAmount', TextType::class, [
        'required' => false,
        'label'    => 'FreightAmount',
    ])
    ->add('shipperId', TextType::class, [
        'required' => false,
        'label'    => 'ShipperId',
    ])
    ->add('chargeAmount', TextType::class, [
        'required' => false,
        'label'    => 'ChargeAmount',
    ])
    ->add('datePrinted', TextType::class, [
        'required' => false,
        'label'    => 'DatePrinted',
    ])
    ->add('salesRepresentative', TextType::class, [
        'required' => false,
        'label'    => 'SalesRepresentative',
    ])
    ->add('numberOfPackages', TextType::class, [
        'required' => false,
        'label'    => 'NumberOfPackages',
    ])
    ->add('pickDate', TextType::class, [
        'required' => false,
        'label'    => 'PickDate',
    ])
    ->add('shipDate', TextType::class, [
        'required' => false,
        'label'    => 'ShipDate',
    ])
    ->add('trackingNumber', TextType::class, [
        'required' => false,
        'label'    => 'TrackingNumber',
    ])
    ->add('dateReceived', TextType::class, [
        'required' => false,
        'label'    => 'DateReceived',
    ])
    ->add('isInTransit', TextType::class, [
        'required' => false,
        'label'    => 'IsInTransit',
    ])
    ->add('isApproved', TextType::class, [
        'required' => false,
        'label'    => 'IsApproved',
    ])
    ->add('isInDispute', TextType::class, [
        'required' => false,
        'label'    => 'IsInDispute',
    ])
    ->add('volume', TextType::class, [
        'required' => false,
        'label'    => 'Volume',
    ])
    ->add('weight', TextType::class, [
        'required' => false,
        'label'    => 'Weight',
    ])
    ->add('rmaNumber', TextType::class, [
        'required' => false,
        'label'    => 'RmaNumber',
    ])
    ->add('reversalNumber', TextType::class, [
        'required' => false,
        'label'    => 'ReversalNumber',
    ])
    ->add('isDropShip', TextType::class, [
        'required' => false,
        'label'    => 'IsDropShip',
    ])
    ->add('dropShipBusinessPartnerId', TextType::class, [
        'required' => false,
        'label'    => 'DropShipBusinessPartnerId',
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

