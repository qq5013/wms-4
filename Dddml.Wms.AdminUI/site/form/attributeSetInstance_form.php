<?php
use Symfony\Component\Form\Extension\Core\Type\FormType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

return $app['form.factory']->createBuilder(FormType::class, $data)
    ->add('attributeSetInstanceId', TextType::class, [
        'required' => true,
        'label'    => 'Attribute Set Instance Id',
    ])
    ->add('attributeSetId', TextType::class, [
        'required' => false,
        'label'    => 'Attribute Set Id',
    ])
    ->add('organizationId', TextType::class, [
        'required' => false,
        'label'    => 'Organization Id',
    ])
    ->add('referenceId', TextType::class, [
        'required' => false,
        'label'    => 'Reference Id',
    ])
    ->add('serialNumber', TextType::class, [
        'required' => false,
        'label'    => 'Serial Number',
    ])
    ->add('lot', TextType::class, [
        'required' => false,
        'label'    => 'Lot',
    ])
    ->add('description', TextType::class, [
        'required' => false,
        'label'    => 'Description',
    ])
    ->add('hash', TextType::class, [
        'required' => false,
        'label'    => 'Hash',
    ])
    ->add('_F_B_0_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 0',
    ])
    ->add('_F_I_0_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 0',
    ])
    ->add('_F_L_0_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 0',
    ])
    ->add('_F_DT_0_', DateTimeType::class, [
        'required' => false,
        'label'    => 'F DT 0',
    ])
    ->add('_F_N_0_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 0',
    ])
    ->add('_F_C5_0_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 0',
    ])
    ->add('_F_C10_0_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 0',
    ])
    ->add('_F_C20_0_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 0',
    ])
    ->add('_F_C50_0_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 0',
    ])
    ->add('_F_C100_0_', TextType::class, [
        'required' => false,
        'label'    => 'F C100 0',
    ])
    ->add('_F_C200_0_', TextType::class, [
        'required' => false,
        'label'    => 'F C200 0',
    ])
    ->add('_F_C500_0_', TextType::class, [
        'required' => false,
        'label'    => 'F C500 0',
    ])
    ->add('_F_C1000_0_', TextType::class, [
        'required' => false,
        'label'    => 'F C1000 0',
    ])
    ->add('_F_B_1_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 1',
    ])
    ->add('_F_I_1_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 1',
    ])
    ->add('_F_L_1_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 1',
    ])
    ->add('_F_DT_1_', DateTimeType::class, [
        'required' => false,
        'label'    => 'F DT 1',
    ])
    ->add('_F_N_1_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 1',
    ])
    ->add('_F_C5_1_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 1',
    ])
    ->add('_F_C10_1_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 1',
    ])
    ->add('_F_C20_1_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 1',
    ])
    ->add('_F_C50_1_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 1',
    ])
    ->add('_F_C100_1_', TextType::class, [
        'required' => false,
        'label'    => 'F C100 1',
    ])
    ->add('_F_C200_1_', TextType::class, [
        'required' => false,
        'label'    => 'F C200 1',
    ])
    ->add('_F_C500_1_', TextType::class, [
        'required' => false,
        'label'    => 'F C500 1',
    ])
    ->add('_F_C1000_1_', TextType::class, [
        'required' => false,
        'label'    => 'F C1000 1',
    ])
    ->add('_F_B_2_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 2',
    ])
    ->add('_F_I_2_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 2',
    ])
    ->add('_F_L_2_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 2',
    ])
    ->add('_F_DT_2_', DateTimeType::class, [
        'required' => false,
        'label'    => 'F DT 2',
    ])
    ->add('_F_N_2_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 2',
    ])
    ->add('_F_C5_2_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 2',
    ])
    ->add('_F_C10_2_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 2',
    ])
    ->add('_F_C20_2_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 2',
    ])
    ->add('_F_C50_2_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 2',
    ])
    ->add('_F_C100_2_', TextType::class, [
        'required' => false,
        'label'    => 'F C100 2',
    ])
    ->add('_F_C200_2_', TextType::class, [
        'required' => false,
        'label'    => 'F C200 2',
    ])
    ->add('_F_C500_2_', TextType::class, [
        'required' => false,
        'label'    => 'F C500 2',
    ])
    ->add('_F_C1000_2_', TextType::class, [
        'required' => false,
        'label'    => 'F C1000 2',
    ])
    ->add('_F_B_3_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 3',
    ])
    ->add('_F_I_3_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 3',
    ])
    ->add('_F_L_3_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 3',
    ])
    ->add('_F_DT_3_', DateTimeType::class, [
        'required' => false,
        'label'    => 'F DT 3',
    ])
    ->add('_F_N_3_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 3',
    ])
    ->add('_F_C5_3_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 3',
    ])
    ->add('_F_C10_3_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 3',
    ])
    ->add('_F_C20_3_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 3',
    ])
    ->add('_F_C50_3_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 3',
    ])
    ->add('_F_C100_3_', TextType::class, [
        'required' => false,
        'label'    => 'F C100 3',
    ])
    ->add('_F_C200_3_', TextType::class, [
        'required' => false,
        'label'    => 'F C200 3',
    ])
    ->add('_F_C500_3_', TextType::class, [
        'required' => false,
        'label'    => 'F C500 3',
    ])
    ->add('_F_C1000_3_', TextType::class, [
        'required' => false,
        'label'    => 'F C1000 3',
    ])
    ->add('_F_B_4_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 4',
    ])
    ->add('_F_I_4_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 4',
    ])
    ->add('_F_L_4_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 4',
    ])
    ->add('_F_DT_4_', DateTimeType::class, [
        'required' => false,
        'label'    => 'F DT 4',
    ])
    ->add('_F_N_4_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 4',
    ])
    ->add('_F_C5_4_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 4',
    ])
    ->add('_F_C10_4_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 4',
    ])
    ->add('_F_C20_4_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 4',
    ])
    ->add('_F_C50_4_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 4',
    ])
    ->add('_F_C100_4_', TextType::class, [
        'required' => false,
        'label'    => 'F C100 4',
    ])
    ->add('_F_C200_4_', TextType::class, [
        'required' => false,
        'label'    => 'F C200 4',
    ])
    ->add('_F_C500_4_', TextType::class, [
        'required' => false,
        'label'    => 'F C500 4',
    ])
    ->add('_F_C1000_4_', TextType::class, [
        'required' => false,
        'label'    => 'F C1000 4',
    ])
    ->add('_F_B_5_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 5',
    ])
    ->add('_F_I_5_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 5',
    ])
    ->add('_F_L_5_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 5',
    ])
    ->add('_F_DT_5_', DateTimeType::class, [
        'required' => false,
        'label'    => 'F DT 5',
    ])
    ->add('_F_N_5_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 5',
    ])
    ->add('_F_C5_5_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 5',
    ])
    ->add('_F_C10_5_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 5',
    ])
    ->add('_F_C20_5_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 5',
    ])
    ->add('_F_C50_5_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 5',
    ])
    ->add('_F_C100_5_', TextType::class, [
        'required' => false,
        'label'    => 'F C100 5',
    ])
    ->add('_F_C200_5_', TextType::class, [
        'required' => false,
        'label'    => 'F C200 5',
    ])
    ->add('_F_C500_5_', TextType::class, [
        'required' => false,
        'label'    => 'F C500 5',
    ])
    ->add('_F_B_6_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 6',
    ])
    ->add('_F_I_6_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 6',
    ])
    ->add('_F_L_6_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 6',
    ])
    ->add('_F_DT_6_', DateTimeType::class, [
        'required' => false,
        'label'    => 'F DT 6',
    ])
    ->add('_F_N_6_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 6',
    ])
    ->add('_F_C5_6_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 6',
    ])
    ->add('_F_C10_6_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 6',
    ])
    ->add('_F_C20_6_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 6',
    ])
    ->add('_F_C50_6_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 6',
    ])
    ->add('_F_C100_6_', TextType::class, [
        'required' => false,
        'label'    => 'F C100 6',
    ])
    ->add('_F_C200_6_', TextType::class, [
        'required' => false,
        'label'    => 'F C200 6',
    ])
    ->add('_F_C500_6_', TextType::class, [
        'required' => false,
        'label'    => 'F C500 6',
    ])
    ->add('_F_B_7_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 7',
    ])
    ->add('_F_I_7_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 7',
    ])
    ->add('_F_L_7_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 7',
    ])
    ->add('_F_DT_7_', DateTimeType::class, [
        'required' => false,
        'label'    => 'F DT 7',
    ])
    ->add('_F_N_7_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 7',
    ])
    ->add('_F_C5_7_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 7',
    ])
    ->add('_F_C10_7_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 7',
    ])
    ->add('_F_C20_7_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 7',
    ])
    ->add('_F_C50_7_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 7',
    ])
    ->add('_F_C100_7_', TextType::class, [
        'required' => false,
        'label'    => 'F C100 7',
    ])
    ->add('_F_C200_7_', TextType::class, [
        'required' => false,
        'label'    => 'F C200 7',
    ])
    ->add('_F_C500_7_', TextType::class, [
        'required' => false,
        'label'    => 'F C500 7',
    ])
    ->add('_F_B_8_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 8',
    ])
    ->add('_F_I_8_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 8',
    ])
    ->add('_F_L_8_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 8',
    ])
    ->add('_F_DT_8_', DateTimeType::class, [
        'required' => false,
        'label'    => 'F DT 8',
    ])
    ->add('_F_N_8_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 8',
    ])
    ->add('_F_C5_8_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 8',
    ])
    ->add('_F_C10_8_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 8',
    ])
    ->add('_F_C20_8_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 8',
    ])
    ->add('_F_C50_8_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 8',
    ])
    ->add('_F_C100_8_', TextType::class, [
        'required' => false,
        'label'    => 'F C100 8',
    ])
    ->add('_F_C200_8_', TextType::class, [
        'required' => false,
        'label'    => 'F C200 8',
    ])
    ->add('_F_C500_8_', TextType::class, [
        'required' => false,
        'label'    => 'F C500 8',
    ])
    ->add('_F_B_9_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 9',
    ])
    ->add('_F_I_9_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 9',
    ])
    ->add('_F_L_9_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 9',
    ])
    ->add('_F_DT_9_', DateTimeType::class, [
        'required' => false,
        'label'    => 'F DT 9',
    ])
    ->add('_F_N_9_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 9',
    ])
    ->add('_F_C5_9_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 9',
    ])
    ->add('_F_C10_9_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 9',
    ])
    ->add('_F_C20_9_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 9',
    ])
    ->add('_F_C50_9_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 9',
    ])
    ->add('_F_C100_9_', TextType::class, [
        'required' => false,
        'label'    => 'F C100 9',
    ])
    ->add('_F_C200_9_', TextType::class, [
        'required' => false,
        'label'    => 'F C200 9',
    ])
    ->add('_F_C500_9_', TextType::class, [
        'required' => false,
        'label'    => 'F C500 9',
    ])
    ->add('_F_B_10_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 10',
    ])
    ->add('_F_I_10_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 10',
    ])
    ->add('_F_L_10_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 10',
    ])
    ->add('_F_DT_10_', DateTimeType::class, [
        'required' => false,
        'label'    => 'F DT 10',
    ])
    ->add('_F_N_10_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 10',
    ])
    ->add('_F_C5_10_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 10',
    ])
    ->add('_F_C10_10_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 10',
    ])
    ->add('_F_C20_10_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 10',
    ])
    ->add('_F_C50_10_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 10',
    ])
    ->add('_F_C100_10_', TextType::class, [
        'required' => false,
        'label'    => 'F C100 10',
    ])
    ->add('_F_C200_10_', TextType::class, [
        'required' => false,
        'label'    => 'F C200 10',
    ])
    ->add('_F_B_11_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 11',
    ])
    ->add('_F_I_11_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 11',
    ])
    ->add('_F_L_11_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 11',
    ])
    ->add('_F_DT_11_', DateTimeType::class, [
        'required' => false,
        'label'    => 'F DT 11',
    ])
    ->add('_F_N_11_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 11',
    ])
    ->add('_F_C5_11_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 11',
    ])
    ->add('_F_C10_11_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 11',
    ])
    ->add('_F_C20_11_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 11',
    ])
    ->add('_F_C50_11_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 11',
    ])
    ->add('_F_C100_11_', TextType::class, [
        'required' => false,
        'label'    => 'F C100 11',
    ])
    ->add('_F_C200_11_', TextType::class, [
        'required' => false,
        'label'    => 'F C200 11',
    ])
    ->add('_F_B_12_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 12',
    ])
    ->add('_F_I_12_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 12',
    ])
    ->add('_F_L_12_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 12',
    ])
    ->add('_F_DT_12_', DateTimeType::class, [
        'required' => false,
        'label'    => 'F DT 12',
    ])
    ->add('_F_N_12_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 12',
    ])
    ->add('_F_C5_12_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 12',
    ])
    ->add('_F_C10_12_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 12',
    ])
    ->add('_F_C20_12_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 12',
    ])
    ->add('_F_C50_12_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 12',
    ])
    ->add('_F_C100_12_', TextType::class, [
        'required' => false,
        'label'    => 'F C100 12',
    ])
    ->add('_F_C200_12_', TextType::class, [
        'required' => false,
        'label'    => 'F C200 12',
    ])
    ->add('_F_B_13_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 13',
    ])
    ->add('_F_I_13_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 13',
    ])
    ->add('_F_L_13_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 13',
    ])
    ->add('_F_DT_13_', DateTimeType::class, [
        'required' => false,
        'label'    => 'F DT 13',
    ])
    ->add('_F_N_13_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 13',
    ])
    ->add('_F_C5_13_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 13',
    ])
    ->add('_F_C10_13_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 13',
    ])
    ->add('_F_C20_13_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 13',
    ])
    ->add('_F_C50_13_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 13',
    ])
    ->add('_F_C100_13_', TextType::class, [
        'required' => false,
        'label'    => 'F C100 13',
    ])
    ->add('_F_C200_13_', TextType::class, [
        'required' => false,
        'label'    => 'F C200 13',
    ])
    ->add('_F_B_14_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 14',
    ])
    ->add('_F_I_14_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 14',
    ])
    ->add('_F_L_14_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 14',
    ])
    ->add('_F_DT_14_', DateTimeType::class, [
        'required' => false,
        'label'    => 'F DT 14',
    ])
    ->add('_F_N_14_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 14',
    ])
    ->add('_F_C5_14_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 14',
    ])
    ->add('_F_C10_14_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 14',
    ])
    ->add('_F_C20_14_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 14',
    ])
    ->add('_F_C50_14_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 14',
    ])
    ->add('_F_C100_14_', TextType::class, [
        'required' => false,
        'label'    => 'F C100 14',
    ])
    ->add('_F_C200_14_', TextType::class, [
        'required' => false,
        'label'    => 'F C200 14',
    ])
    ->add('_F_B_15_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 15',
    ])
    ->add('_F_I_15_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 15',
    ])
    ->add('_F_L_15_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 15',
    ])
    ->add('_F_DT_15_', DateTimeType::class, [
        'required' => false,
        'label'    => 'F DT 15',
    ])
    ->add('_F_N_15_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 15',
    ])
    ->add('_F_C5_15_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 15',
    ])
    ->add('_F_C10_15_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 15',
    ])
    ->add('_F_C20_15_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 15',
    ])
    ->add('_F_C50_15_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 15',
    ])
    ->add('_F_C100_15_', TextType::class, [
        'required' => false,
        'label'    => 'F C100 15',
    ])
    ->add('_F_C200_15_', TextType::class, [
        'required' => false,
        'label'    => 'F C200 15',
    ])
    ->add('_F_B_16_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 16',
    ])
    ->add('_F_I_16_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 16',
    ])
    ->add('_F_L_16_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 16',
    ])
    ->add('_F_DT_16_', DateTimeType::class, [
        'required' => false,
        'label'    => 'F DT 16',
    ])
    ->add('_F_N_16_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 16',
    ])
    ->add('_F_C5_16_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 16',
    ])
    ->add('_F_C10_16_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 16',
    ])
    ->add('_F_C20_16_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 16',
    ])
    ->add('_F_C50_16_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 16',
    ])
    ->add('_F_C100_16_', TextType::class, [
        'required' => false,
        'label'    => 'F C100 16',
    ])
    ->add('_F_C200_16_', TextType::class, [
        'required' => false,
        'label'    => 'F C200 16',
    ])
    ->add('_F_B_17_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 17',
    ])
    ->add('_F_I_17_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 17',
    ])
    ->add('_F_L_17_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 17',
    ])
    ->add('_F_DT_17_', DateTimeType::class, [
        'required' => false,
        'label'    => 'F DT 17',
    ])
    ->add('_F_N_17_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 17',
    ])
    ->add('_F_C5_17_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 17',
    ])
    ->add('_F_C10_17_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 17',
    ])
    ->add('_F_C20_17_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 17',
    ])
    ->add('_F_C50_17_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 17',
    ])
    ->add('_F_C100_17_', TextType::class, [
        'required' => false,
        'label'    => 'F C100 17',
    ])
    ->add('_F_C200_17_', TextType::class, [
        'required' => false,
        'label'    => 'F C200 17',
    ])
    ->add('_F_B_18_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 18',
    ])
    ->add('_F_I_18_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 18',
    ])
    ->add('_F_L_18_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 18',
    ])
    ->add('_F_DT_18_', DateTimeType::class, [
        'required' => false,
        'label'    => 'F DT 18',
    ])
    ->add('_F_N_18_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 18',
    ])
    ->add('_F_C5_18_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 18',
    ])
    ->add('_F_C10_18_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 18',
    ])
    ->add('_F_C20_18_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 18',
    ])
    ->add('_F_C50_18_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 18',
    ])
    ->add('_F_C100_18_', TextType::class, [
        'required' => false,
        'label'    => 'F C100 18',
    ])
    ->add('_F_C200_18_', TextType::class, [
        'required' => false,
        'label'    => 'F C200 18',
    ])
    ->add('_F_B_19_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 19',
    ])
    ->add('_F_I_19_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 19',
    ])
    ->add('_F_L_19_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 19',
    ])
    ->add('_F_DT_19_', DateTimeType::class, [
        'required' => false,
        'label'    => 'F DT 19',
    ])
    ->add('_F_N_19_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 19',
    ])
    ->add('_F_C5_19_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 19',
    ])
    ->add('_F_C10_19_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 19',
    ])
    ->add('_F_C20_19_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 19',
    ])
    ->add('_F_C50_19_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 19',
    ])
    ->add('_F_C100_19_', TextType::class, [
        'required' => false,
        'label'    => 'F C100 19',
    ])
    ->add('_F_C200_19_', TextType::class, [
        'required' => false,
        'label'    => 'F C200 19',
    ])
    ->add('_F_B_20_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 20',
    ])
    ->add('_F_I_20_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 20',
    ])
    ->add('_F_L_20_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 20',
    ])
    ->add('_F_N_20_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 20',
    ])
    ->add('_F_C5_20_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 20',
    ])
    ->add('_F_C10_20_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 20',
    ])
    ->add('_F_C20_20_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 20',
    ])
    ->add('_F_C50_20_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 20',
    ])
    ->add('_F_B_21_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 21',
    ])
    ->add('_F_I_21_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 21',
    ])
    ->add('_F_L_21_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 21',
    ])
    ->add('_F_N_21_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 21',
    ])
    ->add('_F_C5_21_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 21',
    ])
    ->add('_F_C10_21_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 21',
    ])
    ->add('_F_C20_21_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 21',
    ])
    ->add('_F_C50_21_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 21',
    ])
    ->add('_F_B_22_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 22',
    ])
    ->add('_F_I_22_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 22',
    ])
    ->add('_F_L_22_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 22',
    ])
    ->add('_F_N_22_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 22',
    ])
    ->add('_F_C5_22_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 22',
    ])
    ->add('_F_C10_22_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 22',
    ])
    ->add('_F_C20_22_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 22',
    ])
    ->add('_F_C50_22_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 22',
    ])
    ->add('_F_B_23_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 23',
    ])
    ->add('_F_I_23_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 23',
    ])
    ->add('_F_L_23_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 23',
    ])
    ->add('_F_N_23_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 23',
    ])
    ->add('_F_C5_23_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 23',
    ])
    ->add('_F_C10_23_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 23',
    ])
    ->add('_F_C20_23_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 23',
    ])
    ->add('_F_C50_23_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 23',
    ])
    ->add('_F_B_24_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 24',
    ])
    ->add('_F_I_24_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 24',
    ])
    ->add('_F_L_24_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 24',
    ])
    ->add('_F_N_24_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 24',
    ])
    ->add('_F_C5_24_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 24',
    ])
    ->add('_F_C10_24_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 24',
    ])
    ->add('_F_C20_24_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 24',
    ])
    ->add('_F_C50_24_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 24',
    ])
    ->add('_F_B_25_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 25',
    ])
    ->add('_F_I_25_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 25',
    ])
    ->add('_F_L_25_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 25',
    ])
    ->add('_F_N_25_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 25',
    ])
    ->add('_F_C5_25_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 25',
    ])
    ->add('_F_C10_25_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 25',
    ])
    ->add('_F_C20_25_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 25',
    ])
    ->add('_F_C50_25_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 25',
    ])
    ->add('_F_B_26_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 26',
    ])
    ->add('_F_I_26_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 26',
    ])
    ->add('_F_L_26_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 26',
    ])
    ->add('_F_N_26_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 26',
    ])
    ->add('_F_C5_26_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 26',
    ])
    ->add('_F_C10_26_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 26',
    ])
    ->add('_F_C20_26_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 26',
    ])
    ->add('_F_C50_26_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 26',
    ])
    ->add('_F_B_27_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 27',
    ])
    ->add('_F_I_27_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 27',
    ])
    ->add('_F_L_27_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 27',
    ])
    ->add('_F_N_27_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 27',
    ])
    ->add('_F_C5_27_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 27',
    ])
    ->add('_F_C10_27_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 27',
    ])
    ->add('_F_C20_27_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 27',
    ])
    ->add('_F_C50_27_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 27',
    ])
    ->add('_F_B_28_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 28',
    ])
    ->add('_F_I_28_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 28',
    ])
    ->add('_F_L_28_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 28',
    ])
    ->add('_F_N_28_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 28',
    ])
    ->add('_F_C5_28_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 28',
    ])
    ->add('_F_C10_28_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 28',
    ])
    ->add('_F_C20_28_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 28',
    ])
    ->add('_F_C50_28_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 28',
    ])
    ->add('_F_B_29_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 29',
    ])
    ->add('_F_I_29_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 29',
    ])
    ->add('_F_L_29_', IntegerType::class, [
        'required' => false,
        'label'    => 'F L 29',
    ])
    ->add('_F_N_29_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 29',
    ])
    ->add('_F_C5_29_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 29',
    ])
    ->add('_F_C10_29_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 29',
    ])
    ->add('_F_C20_29_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 29',
    ])
    ->add('_F_C50_29_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 29',
    ])
    ->add('_F_B_30_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 30',
    ])
    ->add('_F_I_30_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 30',
    ])
    ->add('_F_N_30_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 30',
    ])
    ->add('_F_C5_30_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 30',
    ])
    ->add('_F_C10_30_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 30',
    ])
    ->add('_F_C20_30_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 30',
    ])
    ->add('_F_C50_30_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 30',
    ])
    ->add('_F_B_31_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 31',
    ])
    ->add('_F_I_31_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 31',
    ])
    ->add('_F_N_31_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 31',
    ])
    ->add('_F_C5_31_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 31',
    ])
    ->add('_F_C10_31_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 31',
    ])
    ->add('_F_C20_31_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 31',
    ])
    ->add('_F_C50_31_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 31',
    ])
    ->add('_F_B_32_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 32',
    ])
    ->add('_F_I_32_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 32',
    ])
    ->add('_F_N_32_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 32',
    ])
    ->add('_F_C5_32_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 32',
    ])
    ->add('_F_C10_32_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 32',
    ])
    ->add('_F_C20_32_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 32',
    ])
    ->add('_F_C50_32_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 32',
    ])
    ->add('_F_B_33_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 33',
    ])
    ->add('_F_I_33_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 33',
    ])
    ->add('_F_N_33_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 33',
    ])
    ->add('_F_C5_33_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 33',
    ])
    ->add('_F_C10_33_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 33',
    ])
    ->add('_F_C20_33_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 33',
    ])
    ->add('_F_C50_33_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 33',
    ])
    ->add('_F_B_34_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 34',
    ])
    ->add('_F_I_34_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 34',
    ])
    ->add('_F_N_34_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 34',
    ])
    ->add('_F_C5_34_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 34',
    ])
    ->add('_F_C10_34_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 34',
    ])
    ->add('_F_C20_34_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 34',
    ])
    ->add('_F_C50_34_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 34',
    ])
    ->add('_F_B_35_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 35',
    ])
    ->add('_F_I_35_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 35',
    ])
    ->add('_F_N_35_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 35',
    ])
    ->add('_F_C5_35_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 35',
    ])
    ->add('_F_C10_35_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 35',
    ])
    ->add('_F_C20_35_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 35',
    ])
    ->add('_F_C50_35_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 35',
    ])
    ->add('_F_B_36_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 36',
    ])
    ->add('_F_I_36_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 36',
    ])
    ->add('_F_N_36_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 36',
    ])
    ->add('_F_C5_36_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 36',
    ])
    ->add('_F_C10_36_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 36',
    ])
    ->add('_F_C20_36_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 36',
    ])
    ->add('_F_C50_36_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 36',
    ])
    ->add('_F_B_37_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 37',
    ])
    ->add('_F_I_37_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 37',
    ])
    ->add('_F_N_37_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 37',
    ])
    ->add('_F_C5_37_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 37',
    ])
    ->add('_F_C10_37_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 37',
    ])
    ->add('_F_C20_37_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 37',
    ])
    ->add('_F_C50_37_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 37',
    ])
    ->add('_F_B_38_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 38',
    ])
    ->add('_F_I_38_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 38',
    ])
    ->add('_F_N_38_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 38',
    ])
    ->add('_F_C5_38_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 38',
    ])
    ->add('_F_C10_38_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 38',
    ])
    ->add('_F_C20_38_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 38',
    ])
    ->add('_F_C50_38_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 38',
    ])
    ->add('_F_B_39_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 39',
    ])
    ->add('_F_I_39_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 39',
    ])
    ->add('_F_N_39_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 39',
    ])
    ->add('_F_C5_39_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 39',
    ])
    ->add('_F_C10_39_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 39',
    ])
    ->add('_F_C20_39_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 39',
    ])
    ->add('_F_C50_39_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 39',
    ])
    ->add('_F_B_40_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 40',
    ])
    ->add('_F_I_40_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 40',
    ])
    ->add('_F_N_40_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 40',
    ])
    ->add('_F_C5_40_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 40',
    ])
    ->add('_F_C10_40_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 40',
    ])
    ->add('_F_C20_40_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 40',
    ])
    ->add('_F_C50_40_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 40',
    ])
    ->add('_F_B_41_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 41',
    ])
    ->add('_F_I_41_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 41',
    ])
    ->add('_F_N_41_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 41',
    ])
    ->add('_F_C5_41_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 41',
    ])
    ->add('_F_C10_41_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 41',
    ])
    ->add('_F_C20_41_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 41',
    ])
    ->add('_F_C50_41_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 41',
    ])
    ->add('_F_B_42_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 42',
    ])
    ->add('_F_I_42_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 42',
    ])
    ->add('_F_N_42_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 42',
    ])
    ->add('_F_C5_42_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 42',
    ])
    ->add('_F_C10_42_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 42',
    ])
    ->add('_F_C20_42_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 42',
    ])
    ->add('_F_C50_42_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 42',
    ])
    ->add('_F_B_43_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 43',
    ])
    ->add('_F_I_43_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 43',
    ])
    ->add('_F_N_43_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 43',
    ])
    ->add('_F_C5_43_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 43',
    ])
    ->add('_F_C10_43_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 43',
    ])
    ->add('_F_C20_43_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 43',
    ])
    ->add('_F_C50_43_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 43',
    ])
    ->add('_F_B_44_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 44',
    ])
    ->add('_F_I_44_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 44',
    ])
    ->add('_F_N_44_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 44',
    ])
    ->add('_F_C5_44_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 44',
    ])
    ->add('_F_C10_44_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 44',
    ])
    ->add('_F_C20_44_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 44',
    ])
    ->add('_F_C50_44_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 44',
    ])
    ->add('_F_B_45_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 45',
    ])
    ->add('_F_I_45_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 45',
    ])
    ->add('_F_N_45_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 45',
    ])
    ->add('_F_C5_45_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 45',
    ])
    ->add('_F_C10_45_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 45',
    ])
    ->add('_F_C20_45_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 45',
    ])
    ->add('_F_C50_45_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 45',
    ])
    ->add('_F_B_46_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 46',
    ])
    ->add('_F_I_46_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 46',
    ])
    ->add('_F_N_46_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 46',
    ])
    ->add('_F_C5_46_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 46',
    ])
    ->add('_F_C10_46_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 46',
    ])
    ->add('_F_C20_46_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 46',
    ])
    ->add('_F_C50_46_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 46',
    ])
    ->add('_F_B_47_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 47',
    ])
    ->add('_F_I_47_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 47',
    ])
    ->add('_F_N_47_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 47',
    ])
    ->add('_F_C5_47_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 47',
    ])
    ->add('_F_C10_47_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 47',
    ])
    ->add('_F_C20_47_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 47',
    ])
    ->add('_F_C50_47_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 47',
    ])
    ->add('_F_B_48_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 48',
    ])
    ->add('_F_I_48_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 48',
    ])
    ->add('_F_N_48_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 48',
    ])
    ->add('_F_C5_48_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 48',
    ])
    ->add('_F_C10_48_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 48',
    ])
    ->add('_F_C20_48_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 48',
    ])
    ->add('_F_C50_48_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 48',
    ])
    ->add('_F_B_49_', CheckboxType::class, [
        'required' => false,
        'label'    => 'F B 49',
    ])
    ->add('_F_I_49_', IntegerType::class, [
        'required' => false,
        'label'    => 'F I 49',
    ])
    ->add('_F_N_49_', NumberType::class, [
        'required' => false,
        'label'    => 'F N 49',
    ])
    ->add('_F_C5_49_', TextType::class, [
        'required' => false,
        'label'    => 'F C5 49',
    ])
    ->add('_F_C10_49_', TextType::class, [
        'required' => false,
        'label'    => 'F C10 49',
    ])
    ->add('_F_C20_49_', TextType::class, [
        'required' => false,
        'label'    => 'F C20 49',
    ])
    ->add('_F_C50_49_', TextType::class, [
        'required' => false,
        'label'    => 'F C50 49',
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

