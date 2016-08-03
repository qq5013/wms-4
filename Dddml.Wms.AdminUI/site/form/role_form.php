<?php
use Symfony\Component\Form\Extension\Core\Type\FormType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

return $app['form.factory']->createBuilder(FormType::class, $data)
    ->add('name', TextType::class, [
        'required' => true,
        'label'    => '名称',
    ])
    ->add('description', TextareaType::class, [
        'required' => true,
        'label'    => '描述',
    ])
    ->getForm();