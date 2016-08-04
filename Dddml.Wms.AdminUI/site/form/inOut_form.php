<?php
use Symfony\Component\Form\Extension\Core\Type\FormType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

return $app['form.factory']->createBuilder(FormType::class, $data)
    ->add('documentNumber', TextType::class, [
        'required' => true,
        'label'    => 'DocumentNumber',
    ])
    ->add('isSOTransaction', ChoiceType::class, [
        'required' => false,
        'label'    => 'IsSOTransaction',
    ])
    ->add('documentStatus', TextType::class, [
        'required' => false,
        'label'    => 'DocumentStatus',
    ])
    ->add('posted', ChoiceType::class, [
        'required' => false,
        'label'    => 'Posted',
    ])
    ->add('processing', ChoiceType::class, [
        'required' => false,
        'label'    => 'Processing',
    ])
    ->add('processed', ChoiceType::class, [
        'required' => false,
        'label'    => 'Processed',
    ])
    ->add('documentType', IntegerType::class, [
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
    ->add('dateOrdered', DateTimeType::class, [
        'required' => false,
        'label'    => 'DateOrdered',
    ])
    ->add('isPrinted', ChoiceType::class, [
        'required' => false,
        'label'    => 'IsPrinted',
    ])
    ->add('movementType', TextType::class, [
        'required' => false,
        'label'    => 'MovementType',
    ])
    ->add('movementDate', DateTimeType::class, [
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
    ->add('freightAmount', MoneyType::class, [
        'required' => false,
        'label'    => 'FreightAmount',
    ])
    ->add('shipperId', TextType::class, [
        'required' => false,
        'label'    => 'ShipperId',
    ])
    ->add('chargeAmount', MoneyType::class, [
        'required' => false,
        'label'    => 'ChargeAmount',
    ])
    ->add('datePrinted', DateTimeType::class, [
        'required' => false,
        'label'    => 'DatePrinted',
    ])
    ->add('salesRepresentative', TextType::class, [
        'required' => false,
        'label'    => 'SalesRepresentative',
    ])
    ->add('numberOfPackages', IntegerType::class, [
        'required' => false,
        'label'    => 'NumberOfPackages',
    ])
    ->add('pickDate', DateTimeType::class, [
        'required' => false,
        'label'    => 'PickDate',
    ])
    ->add('shipDate', DateTimeType::class, [
        'required' => false,
        'label'    => 'ShipDate',
    ])
    ->add('trackingNumber', TextType::class, [
        'required' => false,
        'label'    => 'TrackingNumber',
    ])
    ->add('dateReceived', DateTimeType::class, [
        'required' => false,
        'label'    => 'DateReceived',
    ])
    ->add('isInTransit', ChoiceType::class, [
        'required' => false,
        'label'    => 'IsInTransit',
    ])
    ->add('isApproved', ChoiceType::class, [
        'required' => false,
        'label'    => 'IsApproved',
    ])
    ->add('isInDispute', ChoiceType::class, [
        'required' => false,
        'label'    => 'IsInDispute',
    ])
    ->add('volume', NumberType::class, [
        'required' => false,
        'label'    => 'Volume',
    ])
    ->add('weight', NumberType::class, [
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
    ->add('isDropShip', ChoiceType::class, [
        'required' => false,
        'label'    => 'IsDropShip',
    ])
    ->add('dropShipBusinessPartnerId', TextType::class, [
        'required' => false,
        'label'    => 'DropShipBusinessPartnerId',
    ])
    ->add('active', ChoiceType::class, [
        'required' => false,
        'label'    => 'Active',
    ])
    ->add('version', IntegerType::class, [
        'required' => false,
        'label'    => 'Version',
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

