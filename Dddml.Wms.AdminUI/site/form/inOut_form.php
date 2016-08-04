<?php
use Symfony\Component\Form\Extension\Core\Type\FormType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

return $app['form.factory']->createBuilder(FormType::class, $data)
    ->add('documentNumber', TextType::class, [
        'required' => true,
        'label'    => 'Document Number',
    ])
    ->add('isSOTransaction', CheckboxType::class, [
        'required' => false,
        'label'    => 'Is SO Transaction',
    ])
    ->add('documentStatus', TextType::class, [
        'required' => false,
        'label'    => 'Document Status',
    ])
    ->add('posted', CheckboxType::class, [
        'required' => false,
        'label'    => 'Posted',
    ])
    ->add('processing', CheckboxType::class, [
        'required' => false,
        'label'    => 'Processing',
    ])
    ->add('processed', CheckboxType::class, [
        'required' => false,
        'label'    => 'Processed',
    ])
    ->add('documentType', IntegerType::class, [
        'required' => false,
        'label'    => 'Document Type',
    ])
    ->add('description', TextType::class, [
        'required' => false,
        'label'    => 'Description',
    ])
    ->add('orderNumber', TextType::class, [
        'required' => false,
        'label'    => 'Order Number',
    ])
    ->add('dateOrdered', DateTimeType::class, [
        'required' => false,
        'label'    => 'Date Ordered',
    ])
    ->add('isPrinted', CheckboxType::class, [
        'required' => false,
        'label'    => 'Is Printed',
    ])
    ->add('movementType', TextType::class, [
        'required' => false,
        'label'    => 'Movement Type',
    ])
    ->add('movementDate', DateTimeType::class, [
        'required' => false,
        'label'    => 'Movement Date',
    ])
    ->add('businessPartnerId', TextType::class, [
        'required' => false,
        'label'    => 'Business Partner Id',
    ])
    ->add('warehouseId', TextType::class, [
        'required' => false,
        'label'    => 'Warehouse Id',
    ])
    ->add('poReference', TextType::class, [
        'required' => false,
        'label'    => 'PO Reference',
    ])
    ->add('freightAmount', MoneyType::class, [
        'required' => false,
        'label'    => 'Freight Amount',
    ])
    ->add('shipperId', TextType::class, [
        'required' => false,
        'label'    => 'Shipper Id',
    ])
    ->add('chargeAmount', MoneyType::class, [
        'required' => false,
        'label'    => 'Charge Amount',
    ])
    ->add('datePrinted', DateTimeType::class, [
        'required' => false,
        'label'    => 'Date Printed',
    ])
    ->add('salesRepresentative', TextType::class, [
        'required' => false,
        'label'    => 'Sales Representative',
    ])
    ->add('numberOfPackages', IntegerType::class, [
        'required' => false,
        'label'    => 'Number Of Packages',
    ])
    ->add('pickDate', DateTimeType::class, [
        'required' => false,
        'label'    => 'Pick Date',
    ])
    ->add('shipDate', DateTimeType::class, [
        'required' => false,
        'label'    => 'Ship Date',
    ])
    ->add('trackingNumber', TextType::class, [
        'required' => false,
        'label'    => 'Tracking Number',
    ])
    ->add('dateReceived', DateTimeType::class, [
        'required' => false,
        'label'    => 'Date Received',
    ])
    ->add('isInTransit', CheckboxType::class, [
        'required' => false,
        'label'    => 'Is In Transit',
    ])
    ->add('isApproved', CheckboxType::class, [
        'required' => false,
        'label'    => 'Is Approved',
    ])
    ->add('isInDispute', CheckboxType::class, [
        'required' => false,
        'label'    => 'Is In Dispute',
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
        'label'    => 'Rma Number',
    ])
    ->add('reversalNumber', TextType::class, [
        'required' => false,
        'label'    => 'Reversal Number',
    ])
    ->add('isDropShip', CheckboxType::class, [
        'required' => false,
        'label'    => 'Is Drop Ship',
    ])
    ->add('dropShipBusinessPartnerId', TextType::class, [
        'required' => false,
        'label'    => 'Drop Ship Business Partner Id',
    ])
    ->add('active', CheckboxType::class, [
        'required' => false,
        'label'    => 'Active',
    ])
    ->add('version', IntegerType::class, [
        'required' => false,
        'label'    => 'Version',
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

