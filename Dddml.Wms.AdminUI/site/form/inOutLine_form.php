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
    ->add('active', CheckboxType::class, [
        'required' => false,
        'label'    => 'Active',
    ])
    ->add('version', IntegerType::class, [
        'required' => false,
        'label'    => 'Version',
    ])
    ->add('inOutDocumentNumber', TextType::class, [
        'required' => false,
        'label'    => 'In Out Document Number',
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

