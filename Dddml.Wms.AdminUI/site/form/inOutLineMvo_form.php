<?php
use Symfony\Component\Form\Extension\Core\Type\FormType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

return $app['form.factory']->createBuilder(FormType::class, $data)
    ->add('lineNumber', IntegerType::class, [
        'required' => false,
        'label'    => 'Line Number',
    ])
    ->add('description', TextType::class, [
        'required' => false,
        'label'    => 'Description',
    ])
    ->add('locatorId', TextType::class, [
        'required' => false,
        'label'    => 'Locator Id',
    ])
    ->add('product', TextType::class, [
        'required' => false,
        'label'    => 'Product',
    ])
    ->add('uomId', TextType::class, [
        'required' => false,
        'label'    => 'Uom Id',
    ])
    ->add('movementQuantity', NumberType::class, [
        'required' => false,
        'label'    => 'Movement Quantity',
    ])
    ->add('confirmedQuantity', NumberType::class, [
        'required' => false,
        'label'    => 'Confirmed Quantity',
    ])
    ->add('scrappedQuantity', NumberType::class, [
        'required' => false,
        'label'    => 'Scrapped Quantity',
    ])
    ->add('targetQuantity', NumberType::class, [
        'required' => false,
        'label'    => 'Target Quantity',
    ])
    ->add('pickedQuantity', NumberType::class, [
        'required' => false,
        'label'    => 'Picked Quantity',
    ])
    ->add('isInvoiced', CheckboxType::class, [
        'required' => false,
        'label'    => 'Is Invoiced',
    ])
    ->add('attributeSetInstanceId', TextType::class, [
        'required' => false,
        'label'    => 'Attribute Set Instance Id',
    ])
    ->add('isDescription', CheckboxType::class, [
        'required' => false,
        'label'    => 'Is Description',
    ])
    ->add('processed', CheckboxType::class, [
        'required' => false,
        'label'    => 'Processed',
    ])
    ->add('quantityEntered', NumberType::class, [
        'required' => false,
        'label'    => 'Quantity Entered',
    ])
    ->add('rmaLineNumber', IntegerType::class, [
        'required' => false,
        'label'    => 'Rma Line Number',
    ])
    ->add('reversalLineNumber', IntegerType::class, [
        'required' => false,
        'label'    => 'Reversal Line Number',
    ])
    ->add('version', IntegerType::class, [
        'required' => false,
        'label'    => 'Version',
    ])
    ->add('active', CheckboxType::class, [
        'required' => false,
        'label'    => 'Active',
    ])
    ->add('inOutIsSOTransaction', CheckboxType::class, [
        'required' => false,
        'label'    => 'In Out Is SO Transaction',
    ])
    ->add('inOutDocumentStatus', TextType::class, [
        'required' => false,
        'label'    => 'In Out Document Status',
    ])
    ->add('inOutPosted', CheckboxType::class, [
        'required' => false,
        'label'    => 'In Out Posted',
    ])
    ->add('inOutProcessing', CheckboxType::class, [
        'required' => false,
        'label'    => 'In Out Processing',
    ])
    ->add('inOutProcessed', CheckboxType::class, [
        'required' => false,
        'label'    => 'In Out Processed',
    ])
    ->add('inOutDocumentType', IntegerType::class, [
        'required' => false,
        'label'    => 'In Out Document Type',
    ])
    ->add('inOutDescription', TextType::class, [
        'required' => false,
        'label'    => 'In Out Description',
    ])
    ->add('inOutOrderNumber', TextType::class, [
        'required' => false,
        'label'    => 'In Out Order Number',
    ])
    ->add('inOutDateOrdered', DateTimeType::class, [
        'required' => false,
        'label'    => 'In Out Date Ordered',
    ])
    ->add('inOutIsPrinted', CheckboxType::class, [
        'required' => false,
        'label'    => 'In Out Is Printed',
    ])
    ->add('inOutMovementType', TextType::class, [
        'required' => false,
        'label'    => 'In Out Movement Type',
    ])
    ->add('inOutMovementDate', DateTimeType::class, [
        'required' => false,
        'label'    => 'In Out Movement Date',
    ])
    ->add('inOutBusinessPartnerId', TextType::class, [
        'required' => false,
        'label'    => 'In Out Business Partner Id',
    ])
    ->add('inOutWarehouseId', TextType::class, [
        'required' => false,
        'label'    => 'In Out Warehouse Id',
    ])
    ->add('inOutPOReference', TextType::class, [
        'required' => false,
        'label'    => 'In Out PO Reference',
    ])
    ->add('inOutFreightAmount', MoneyType::class, [
        'required' => false,
        'label'    => 'In Out Freight Amount',
    ])
    ->add('inOutShipperId', TextType::class, [
        'required' => false,
        'label'    => 'In Out Shipper Id',
    ])
    ->add('inOutChargeAmount', MoneyType::class, [
        'required' => false,
        'label'    => 'In Out Charge Amount',
    ])
    ->add('inOutDatePrinted', DateTimeType::class, [
        'required' => false,
        'label'    => 'In Out Date Printed',
    ])
    ->add('inOutSalesRepresentative', TextType::class, [
        'required' => false,
        'label'    => 'In Out Sales Representative',
    ])
    ->add('inOutNumberOfPackages', IntegerType::class, [
        'required' => false,
        'label'    => 'In Out Number Of Packages',
    ])
    ->add('inOutPickDate', DateTimeType::class, [
        'required' => false,
        'label'    => 'In Out Pick Date',
    ])
    ->add('inOutShipDate', DateTimeType::class, [
        'required' => false,
        'label'    => 'In Out Ship Date',
    ])
    ->add('inOutTrackingNumber', TextType::class, [
        'required' => false,
        'label'    => 'In Out Tracking Number',
    ])
    ->add('inOutDateReceived', DateTimeType::class, [
        'required' => false,
        'label'    => 'In Out Date Received',
    ])
    ->add('inOutIsInTransit', CheckboxType::class, [
        'required' => false,
        'label'    => 'In Out Is In Transit',
    ])
    ->add('inOutIsApproved', CheckboxType::class, [
        'required' => false,
        'label'    => 'In Out Is Approved',
    ])
    ->add('inOutIsInDispute', CheckboxType::class, [
        'required' => false,
        'label'    => 'In Out Is In Dispute',
    ])
    ->add('inOutVolume', NumberType::class, [
        'required' => false,
        'label'    => 'In Out Volume',
    ])
    ->add('inOutWeight', NumberType::class, [
        'required' => false,
        'label'    => 'In Out Weight',
    ])
    ->add('inOutRmaNumber', TextType::class, [
        'required' => false,
        'label'    => 'In Out Rma Number',
    ])
    ->add('inOutReversalNumber', TextType::class, [
        'required' => false,
        'label'    => 'In Out Reversal Number',
    ])
    ->add('inOutIsDropShip', CheckboxType::class, [
        'required' => false,
        'label'    => 'In Out Is Drop Ship',
    ])
    ->add('inOutDropShipBusinessPartnerId', TextType::class, [
        'required' => false,
        'label'    => 'In Out Drop Ship Business Partner Id',
    ])
    ->add('inOutCreatedBy', TextType::class, [
        'required' => false,
        'label'    => 'In Out Created By',
    ])
    ->add('inOutCreatedAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'In Out Created At',
    ])
    ->add('inOutUpdatedBy', TextType::class, [
        'required' => false,
        'label'    => 'In Out Updated By',
    ])
    ->add('inOutUpdatedAt', DateTimeType::class, [
        'required' => false,
        'label'    => 'In Out Updated At',
    ])
    ->add('inOutActive', CheckboxType::class, [
        'required' => false,
        'label'    => 'In Out Active',
    ])
    ->add('inOutDeleted', CheckboxType::class, [
        'required' => false,
        'label'    => 'In Out Deleted',
    ])
    ->add('inOutVersion', IntegerType::class, [
        'required' => false,
        'label'    => 'In Out Version',
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

