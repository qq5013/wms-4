<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\CommandTrait;

class CreateOrMergePatchAttributeSetInstance extends AbstractAttributeSetInstanceCommand
{

    use AttributeSetInstanceIsPropertyRemovedTrait;

    /**
     * @Type("string")
     */
    private $attributeSetId;

    /**
     * @return string
     */
    public function getAttributeSetId()
    {
        return $this->attributeSetId;
    }

    /**
     * @param string $attributeSetId
     */
    public function setAttributeSetId($attributeSetId)
    {
        $this->attributeSetId = $attributeSetId;
    }

    /**
     * @Type("string")
     */
    private $organizationId;

    /**
     * @return string
     */
    public function getOrganizationId()
    {
        return $this->organizationId;
    }

    /**
     * @param string $organizationId
     */
    public function setOrganizationId($organizationId)
    {
        $this->organizationId = $organizationId;
    }

    /**
     * @Type("string")
     */
    private $referenceId;

    /**
     * @return string
     */
    public function getReferenceId()
    {
        return $this->referenceId;
    }

    /**
     * @param string $referenceId
     */
    public function setReferenceId($referenceId)
    {
        $this->referenceId = $referenceId;
    }

    /**
     * @Type("string")
     */
    private $serialNumber;

    /**
     * @return string
     */
    public function getSerialNumber()
    {
        return $this->serialNumber;
    }

    /**
     * @param string $serialNumber
     */
    public function setSerialNumber($serialNumber)
    {
        $this->serialNumber = $serialNumber;
    }

    /**
     * @Type("string")
     */
    private $lot;

    /**
     * @return string
     */
    public function getLot()
    {
        return $this->lot;
    }

    /**
     * @param string $lot
     */
    public function setLot($lot)
    {
        $this->lot = $lot;
    }

    /**
     * @Type("string")
     */
    private $description;

    /**
     * @return string
     */
    public function getDescription()
    {
        return $this->description;
    }

    /**
     * @param string $description
     */
    public function setDescription($description)
    {
        $this->description = $description;
    }

    /**
     * @Type("string")
     */
    private $hash;

    /**
     * @return string
     */
    public function getHash()
    {
        return $this->hash;
    }

    /**
     * @param string $hash
     */
    public function setHash($hash)
    {
        $this->hash = $hash;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_0_;

    /**
     * @return boolean
     */
    public function get_F_B_0_()
    {
        return $this->_f_B_0_;
    }

    /**
     * @param boolean $_f_B_0_
     */
    public function set_F_B_0_($_f_B_0_)
    {
        $this->_f_B_0_ = $_f_B_0_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_0_;

    /**
     * @return integer
     */
    public function get_F_I_0_()
    {
        return $this->_f_I_0_;
    }

    /**
     * @param integer $_f_I_0_
     */
    public function set_F_I_0_($_f_I_0_)
    {
        $this->_f_I_0_ = $_f_I_0_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_0_;

    /**
     * @return Long
     */
    public function get_F_L_0_()
    {
        return $this->_f_L_0_;
    }

    /**
     * @param Long $_f_L_0_
     */
    public function set_F_L_0_($_f_L_0_)
    {
        $this->_f_L_0_ = $_f_L_0_;
    }

    /**
     * @Type("\DateTime")
     */
    private $_f_DT_0_;

    /**
     * @return \DateTime
     */
    public function get_F_DT_0_()
    {
        return $this->_f_DT_0_;
    }

    /**
     * @param \DateTime $_f_DT_0_
     */
    public function set_F_DT_0_($_f_DT_0_)
    {
        $this->_f_DT_0_ = $_f_DT_0_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_0_;

    /**
     * @return Decimal
     */
    public function get_F_N_0_()
    {
        return $this->_f_N_0_;
    }

    /**
     * @param Decimal $_f_N_0_
     */
    public function set_F_N_0_($_f_N_0_)
    {
        $this->_f_N_0_ = $_f_N_0_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_0_;

    /**
     * @return string
     */
    public function get_F_C5_0_()
    {
        return $this->_f_C5_0_;
    }

    /**
     * @param string $_f_C5_0_
     */
    public function set_F_C5_0_($_f_C5_0_)
    {
        $this->_f_C5_0_ = $_f_C5_0_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_0_;

    /**
     * @return string
     */
    public function get_F_C10_0_()
    {
        return $this->_f_C10_0_;
    }

    /**
     * @param string $_f_C10_0_
     */
    public function set_F_C10_0_($_f_C10_0_)
    {
        $this->_f_C10_0_ = $_f_C10_0_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_0_;

    /**
     * @return string
     */
    public function get_F_C20_0_()
    {
        return $this->_f_C20_0_;
    }

    /**
     * @param string $_f_C20_0_
     */
    public function set_F_C20_0_($_f_C20_0_)
    {
        $this->_f_C20_0_ = $_f_C20_0_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_0_;

    /**
     * @return string
     */
    public function get_F_C50_0_()
    {
        return $this->_f_C50_0_;
    }

    /**
     * @param string $_f_C50_0_
     */
    public function set_F_C50_0_($_f_C50_0_)
    {
        $this->_f_C50_0_ = $_f_C50_0_;
    }

    /**
     * @Type("string")
     */
    private $_f_C100_0_;

    /**
     * @return string
     */
    public function get_F_C100_0_()
    {
        return $this->_f_C100_0_;
    }

    /**
     * @param string $_f_C100_0_
     */
    public function set_F_C100_0_($_f_C100_0_)
    {
        $this->_f_C100_0_ = $_f_C100_0_;
    }

    /**
     * @Type("string")
     */
    private $_f_C200_0_;

    /**
     * @return string
     */
    public function get_F_C200_0_()
    {
        return $this->_f_C200_0_;
    }

    /**
     * @param string $_f_C200_0_
     */
    public function set_F_C200_0_($_f_C200_0_)
    {
        $this->_f_C200_0_ = $_f_C200_0_;
    }

    /**
     * @Type("string")
     */
    private $_f_C500_0_;

    /**
     * @return string
     */
    public function get_F_C500_0_()
    {
        return $this->_f_C500_0_;
    }

    /**
     * @param string $_f_C500_0_
     */
    public function set_F_C500_0_($_f_C500_0_)
    {
        $this->_f_C500_0_ = $_f_C500_0_;
    }

    /**
     * @Type("string")
     */
    private $_f_C1000_0_;

    /**
     * @return string
     */
    public function get_F_C1000_0_()
    {
        return $this->_f_C1000_0_;
    }

    /**
     * @param string $_f_C1000_0_
     */
    public function set_F_C1000_0_($_f_C1000_0_)
    {
        $this->_f_C1000_0_ = $_f_C1000_0_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_1_;

    /**
     * @return boolean
     */
    public function get_F_B_1_()
    {
        return $this->_f_B_1_;
    }

    /**
     * @param boolean $_f_B_1_
     */
    public function set_F_B_1_($_f_B_1_)
    {
        $this->_f_B_1_ = $_f_B_1_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_1_;

    /**
     * @return integer
     */
    public function get_F_I_1_()
    {
        return $this->_f_I_1_;
    }

    /**
     * @param integer $_f_I_1_
     */
    public function set_F_I_1_($_f_I_1_)
    {
        $this->_f_I_1_ = $_f_I_1_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_1_;

    /**
     * @return Long
     */
    public function get_F_L_1_()
    {
        return $this->_f_L_1_;
    }

    /**
     * @param Long $_f_L_1_
     */
    public function set_F_L_1_($_f_L_1_)
    {
        $this->_f_L_1_ = $_f_L_1_;
    }

    /**
     * @Type("\DateTime")
     */
    private $_f_DT_1_;

    /**
     * @return \DateTime
     */
    public function get_F_DT_1_()
    {
        return $this->_f_DT_1_;
    }

    /**
     * @param \DateTime $_f_DT_1_
     */
    public function set_F_DT_1_($_f_DT_1_)
    {
        $this->_f_DT_1_ = $_f_DT_1_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_1_;

    /**
     * @return Decimal
     */
    public function get_F_N_1_()
    {
        return $this->_f_N_1_;
    }

    /**
     * @param Decimal $_f_N_1_
     */
    public function set_F_N_1_($_f_N_1_)
    {
        $this->_f_N_1_ = $_f_N_1_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_1_;

    /**
     * @return string
     */
    public function get_F_C5_1_()
    {
        return $this->_f_C5_1_;
    }

    /**
     * @param string $_f_C5_1_
     */
    public function set_F_C5_1_($_f_C5_1_)
    {
        $this->_f_C5_1_ = $_f_C5_1_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_1_;

    /**
     * @return string
     */
    public function get_F_C10_1_()
    {
        return $this->_f_C10_1_;
    }

    /**
     * @param string $_f_C10_1_
     */
    public function set_F_C10_1_($_f_C10_1_)
    {
        $this->_f_C10_1_ = $_f_C10_1_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_1_;

    /**
     * @return string
     */
    public function get_F_C20_1_()
    {
        return $this->_f_C20_1_;
    }

    /**
     * @param string $_f_C20_1_
     */
    public function set_F_C20_1_($_f_C20_1_)
    {
        $this->_f_C20_1_ = $_f_C20_1_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_1_;

    /**
     * @return string
     */
    public function get_F_C50_1_()
    {
        return $this->_f_C50_1_;
    }

    /**
     * @param string $_f_C50_1_
     */
    public function set_F_C50_1_($_f_C50_1_)
    {
        $this->_f_C50_1_ = $_f_C50_1_;
    }

    /**
     * @Type("string")
     */
    private $_f_C100_1_;

    /**
     * @return string
     */
    public function get_F_C100_1_()
    {
        return $this->_f_C100_1_;
    }

    /**
     * @param string $_f_C100_1_
     */
    public function set_F_C100_1_($_f_C100_1_)
    {
        $this->_f_C100_1_ = $_f_C100_1_;
    }

    /**
     * @Type("string")
     */
    private $_f_C200_1_;

    /**
     * @return string
     */
    public function get_F_C200_1_()
    {
        return $this->_f_C200_1_;
    }

    /**
     * @param string $_f_C200_1_
     */
    public function set_F_C200_1_($_f_C200_1_)
    {
        $this->_f_C200_1_ = $_f_C200_1_;
    }

    /**
     * @Type("string")
     */
    private $_f_C500_1_;

    /**
     * @return string
     */
    public function get_F_C500_1_()
    {
        return $this->_f_C500_1_;
    }

    /**
     * @param string $_f_C500_1_
     */
    public function set_F_C500_1_($_f_C500_1_)
    {
        $this->_f_C500_1_ = $_f_C500_1_;
    }

    /**
     * @Type("string")
     */
    private $_f_C1000_1_;

    /**
     * @return string
     */
    public function get_F_C1000_1_()
    {
        return $this->_f_C1000_1_;
    }

    /**
     * @param string $_f_C1000_1_
     */
    public function set_F_C1000_1_($_f_C1000_1_)
    {
        $this->_f_C1000_1_ = $_f_C1000_1_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_2_;

    /**
     * @return boolean
     */
    public function get_F_B_2_()
    {
        return $this->_f_B_2_;
    }

    /**
     * @param boolean $_f_B_2_
     */
    public function set_F_B_2_($_f_B_2_)
    {
        $this->_f_B_2_ = $_f_B_2_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_2_;

    /**
     * @return integer
     */
    public function get_F_I_2_()
    {
        return $this->_f_I_2_;
    }

    /**
     * @param integer $_f_I_2_
     */
    public function set_F_I_2_($_f_I_2_)
    {
        $this->_f_I_2_ = $_f_I_2_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_2_;

    /**
     * @return Long
     */
    public function get_F_L_2_()
    {
        return $this->_f_L_2_;
    }

    /**
     * @param Long $_f_L_2_
     */
    public function set_F_L_2_($_f_L_2_)
    {
        $this->_f_L_2_ = $_f_L_2_;
    }

    /**
     * @Type("\DateTime")
     */
    private $_f_DT_2_;

    /**
     * @return \DateTime
     */
    public function get_F_DT_2_()
    {
        return $this->_f_DT_2_;
    }

    /**
     * @param \DateTime $_f_DT_2_
     */
    public function set_F_DT_2_($_f_DT_2_)
    {
        $this->_f_DT_2_ = $_f_DT_2_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_2_;

    /**
     * @return Decimal
     */
    public function get_F_N_2_()
    {
        return $this->_f_N_2_;
    }

    /**
     * @param Decimal $_f_N_2_
     */
    public function set_F_N_2_($_f_N_2_)
    {
        $this->_f_N_2_ = $_f_N_2_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_2_;

    /**
     * @return string
     */
    public function get_F_C5_2_()
    {
        return $this->_f_C5_2_;
    }

    /**
     * @param string $_f_C5_2_
     */
    public function set_F_C5_2_($_f_C5_2_)
    {
        $this->_f_C5_2_ = $_f_C5_2_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_2_;

    /**
     * @return string
     */
    public function get_F_C10_2_()
    {
        return $this->_f_C10_2_;
    }

    /**
     * @param string $_f_C10_2_
     */
    public function set_F_C10_2_($_f_C10_2_)
    {
        $this->_f_C10_2_ = $_f_C10_2_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_2_;

    /**
     * @return string
     */
    public function get_F_C20_2_()
    {
        return $this->_f_C20_2_;
    }

    /**
     * @param string $_f_C20_2_
     */
    public function set_F_C20_2_($_f_C20_2_)
    {
        $this->_f_C20_2_ = $_f_C20_2_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_2_;

    /**
     * @return string
     */
    public function get_F_C50_2_()
    {
        return $this->_f_C50_2_;
    }

    /**
     * @param string $_f_C50_2_
     */
    public function set_F_C50_2_($_f_C50_2_)
    {
        $this->_f_C50_2_ = $_f_C50_2_;
    }

    /**
     * @Type("string")
     */
    private $_f_C100_2_;

    /**
     * @return string
     */
    public function get_F_C100_2_()
    {
        return $this->_f_C100_2_;
    }

    /**
     * @param string $_f_C100_2_
     */
    public function set_F_C100_2_($_f_C100_2_)
    {
        $this->_f_C100_2_ = $_f_C100_2_;
    }

    /**
     * @Type("string")
     */
    private $_f_C200_2_;

    /**
     * @return string
     */
    public function get_F_C200_2_()
    {
        return $this->_f_C200_2_;
    }

    /**
     * @param string $_f_C200_2_
     */
    public function set_F_C200_2_($_f_C200_2_)
    {
        $this->_f_C200_2_ = $_f_C200_2_;
    }

    /**
     * @Type("string")
     */
    private $_f_C500_2_;

    /**
     * @return string
     */
    public function get_F_C500_2_()
    {
        return $this->_f_C500_2_;
    }

    /**
     * @param string $_f_C500_2_
     */
    public function set_F_C500_2_($_f_C500_2_)
    {
        $this->_f_C500_2_ = $_f_C500_2_;
    }

    /**
     * @Type("string")
     */
    private $_f_C1000_2_;

    /**
     * @return string
     */
    public function get_F_C1000_2_()
    {
        return $this->_f_C1000_2_;
    }

    /**
     * @param string $_f_C1000_2_
     */
    public function set_F_C1000_2_($_f_C1000_2_)
    {
        $this->_f_C1000_2_ = $_f_C1000_2_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_3_;

    /**
     * @return boolean
     */
    public function get_F_B_3_()
    {
        return $this->_f_B_3_;
    }

    /**
     * @param boolean $_f_B_3_
     */
    public function set_F_B_3_($_f_B_3_)
    {
        $this->_f_B_3_ = $_f_B_3_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_3_;

    /**
     * @return integer
     */
    public function get_F_I_3_()
    {
        return $this->_f_I_3_;
    }

    /**
     * @param integer $_f_I_3_
     */
    public function set_F_I_3_($_f_I_3_)
    {
        $this->_f_I_3_ = $_f_I_3_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_3_;

    /**
     * @return Long
     */
    public function get_F_L_3_()
    {
        return $this->_f_L_3_;
    }

    /**
     * @param Long $_f_L_3_
     */
    public function set_F_L_3_($_f_L_3_)
    {
        $this->_f_L_3_ = $_f_L_3_;
    }

    /**
     * @Type("\DateTime")
     */
    private $_f_DT_3_;

    /**
     * @return \DateTime
     */
    public function get_F_DT_3_()
    {
        return $this->_f_DT_3_;
    }

    /**
     * @param \DateTime $_f_DT_3_
     */
    public function set_F_DT_3_($_f_DT_3_)
    {
        $this->_f_DT_3_ = $_f_DT_3_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_3_;

    /**
     * @return Decimal
     */
    public function get_F_N_3_()
    {
        return $this->_f_N_3_;
    }

    /**
     * @param Decimal $_f_N_3_
     */
    public function set_F_N_3_($_f_N_3_)
    {
        $this->_f_N_3_ = $_f_N_3_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_3_;

    /**
     * @return string
     */
    public function get_F_C5_3_()
    {
        return $this->_f_C5_3_;
    }

    /**
     * @param string $_f_C5_3_
     */
    public function set_F_C5_3_($_f_C5_3_)
    {
        $this->_f_C5_3_ = $_f_C5_3_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_3_;

    /**
     * @return string
     */
    public function get_F_C10_3_()
    {
        return $this->_f_C10_3_;
    }

    /**
     * @param string $_f_C10_3_
     */
    public function set_F_C10_3_($_f_C10_3_)
    {
        $this->_f_C10_3_ = $_f_C10_3_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_3_;

    /**
     * @return string
     */
    public function get_F_C20_3_()
    {
        return $this->_f_C20_3_;
    }

    /**
     * @param string $_f_C20_3_
     */
    public function set_F_C20_3_($_f_C20_3_)
    {
        $this->_f_C20_3_ = $_f_C20_3_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_3_;

    /**
     * @return string
     */
    public function get_F_C50_3_()
    {
        return $this->_f_C50_3_;
    }

    /**
     * @param string $_f_C50_3_
     */
    public function set_F_C50_3_($_f_C50_3_)
    {
        $this->_f_C50_3_ = $_f_C50_3_;
    }

    /**
     * @Type("string")
     */
    private $_f_C100_3_;

    /**
     * @return string
     */
    public function get_F_C100_3_()
    {
        return $this->_f_C100_3_;
    }

    /**
     * @param string $_f_C100_3_
     */
    public function set_F_C100_3_($_f_C100_3_)
    {
        $this->_f_C100_3_ = $_f_C100_3_;
    }

    /**
     * @Type("string")
     */
    private $_f_C200_3_;

    /**
     * @return string
     */
    public function get_F_C200_3_()
    {
        return $this->_f_C200_3_;
    }

    /**
     * @param string $_f_C200_3_
     */
    public function set_F_C200_3_($_f_C200_3_)
    {
        $this->_f_C200_3_ = $_f_C200_3_;
    }

    /**
     * @Type("string")
     */
    private $_f_C500_3_;

    /**
     * @return string
     */
    public function get_F_C500_3_()
    {
        return $this->_f_C500_3_;
    }

    /**
     * @param string $_f_C500_3_
     */
    public function set_F_C500_3_($_f_C500_3_)
    {
        $this->_f_C500_3_ = $_f_C500_3_;
    }

    /**
     * @Type("string")
     */
    private $_f_C1000_3_;

    /**
     * @return string
     */
    public function get_F_C1000_3_()
    {
        return $this->_f_C1000_3_;
    }

    /**
     * @param string $_f_C1000_3_
     */
    public function set_F_C1000_3_($_f_C1000_3_)
    {
        $this->_f_C1000_3_ = $_f_C1000_3_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_4_;

    /**
     * @return boolean
     */
    public function get_F_B_4_()
    {
        return $this->_f_B_4_;
    }

    /**
     * @param boolean $_f_B_4_
     */
    public function set_F_B_4_($_f_B_4_)
    {
        $this->_f_B_4_ = $_f_B_4_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_4_;

    /**
     * @return integer
     */
    public function get_F_I_4_()
    {
        return $this->_f_I_4_;
    }

    /**
     * @param integer $_f_I_4_
     */
    public function set_F_I_4_($_f_I_4_)
    {
        $this->_f_I_4_ = $_f_I_4_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_4_;

    /**
     * @return Long
     */
    public function get_F_L_4_()
    {
        return $this->_f_L_4_;
    }

    /**
     * @param Long $_f_L_4_
     */
    public function set_F_L_4_($_f_L_4_)
    {
        $this->_f_L_4_ = $_f_L_4_;
    }

    /**
     * @Type("\DateTime")
     */
    private $_f_DT_4_;

    /**
     * @return \DateTime
     */
    public function get_F_DT_4_()
    {
        return $this->_f_DT_4_;
    }

    /**
     * @param \DateTime $_f_DT_4_
     */
    public function set_F_DT_4_($_f_DT_4_)
    {
        $this->_f_DT_4_ = $_f_DT_4_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_4_;

    /**
     * @return Decimal
     */
    public function get_F_N_4_()
    {
        return $this->_f_N_4_;
    }

    /**
     * @param Decimal $_f_N_4_
     */
    public function set_F_N_4_($_f_N_4_)
    {
        $this->_f_N_4_ = $_f_N_4_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_4_;

    /**
     * @return string
     */
    public function get_F_C5_4_()
    {
        return $this->_f_C5_4_;
    }

    /**
     * @param string $_f_C5_4_
     */
    public function set_F_C5_4_($_f_C5_4_)
    {
        $this->_f_C5_4_ = $_f_C5_4_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_4_;

    /**
     * @return string
     */
    public function get_F_C10_4_()
    {
        return $this->_f_C10_4_;
    }

    /**
     * @param string $_f_C10_4_
     */
    public function set_F_C10_4_($_f_C10_4_)
    {
        $this->_f_C10_4_ = $_f_C10_4_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_4_;

    /**
     * @return string
     */
    public function get_F_C20_4_()
    {
        return $this->_f_C20_4_;
    }

    /**
     * @param string $_f_C20_4_
     */
    public function set_F_C20_4_($_f_C20_4_)
    {
        $this->_f_C20_4_ = $_f_C20_4_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_4_;

    /**
     * @return string
     */
    public function get_F_C50_4_()
    {
        return $this->_f_C50_4_;
    }

    /**
     * @param string $_f_C50_4_
     */
    public function set_F_C50_4_($_f_C50_4_)
    {
        $this->_f_C50_4_ = $_f_C50_4_;
    }

    /**
     * @Type("string")
     */
    private $_f_C100_4_;

    /**
     * @return string
     */
    public function get_F_C100_4_()
    {
        return $this->_f_C100_4_;
    }

    /**
     * @param string $_f_C100_4_
     */
    public function set_F_C100_4_($_f_C100_4_)
    {
        $this->_f_C100_4_ = $_f_C100_4_;
    }

    /**
     * @Type("string")
     */
    private $_f_C200_4_;

    /**
     * @return string
     */
    public function get_F_C200_4_()
    {
        return $this->_f_C200_4_;
    }

    /**
     * @param string $_f_C200_4_
     */
    public function set_F_C200_4_($_f_C200_4_)
    {
        $this->_f_C200_4_ = $_f_C200_4_;
    }

    /**
     * @Type("string")
     */
    private $_f_C500_4_;

    /**
     * @return string
     */
    public function get_F_C500_4_()
    {
        return $this->_f_C500_4_;
    }

    /**
     * @param string $_f_C500_4_
     */
    public function set_F_C500_4_($_f_C500_4_)
    {
        $this->_f_C500_4_ = $_f_C500_4_;
    }

    /**
     * @Type("string")
     */
    private $_f_C1000_4_;

    /**
     * @return string
     */
    public function get_F_C1000_4_()
    {
        return $this->_f_C1000_4_;
    }

    /**
     * @param string $_f_C1000_4_
     */
    public function set_F_C1000_4_($_f_C1000_4_)
    {
        $this->_f_C1000_4_ = $_f_C1000_4_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_5_;

    /**
     * @return boolean
     */
    public function get_F_B_5_()
    {
        return $this->_f_B_5_;
    }

    /**
     * @param boolean $_f_B_5_
     */
    public function set_F_B_5_($_f_B_5_)
    {
        $this->_f_B_5_ = $_f_B_5_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_5_;

    /**
     * @return integer
     */
    public function get_F_I_5_()
    {
        return $this->_f_I_5_;
    }

    /**
     * @param integer $_f_I_5_
     */
    public function set_F_I_5_($_f_I_5_)
    {
        $this->_f_I_5_ = $_f_I_5_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_5_;

    /**
     * @return Long
     */
    public function get_F_L_5_()
    {
        return $this->_f_L_5_;
    }

    /**
     * @param Long $_f_L_5_
     */
    public function set_F_L_5_($_f_L_5_)
    {
        $this->_f_L_5_ = $_f_L_5_;
    }

    /**
     * @Type("\DateTime")
     */
    private $_f_DT_5_;

    /**
     * @return \DateTime
     */
    public function get_F_DT_5_()
    {
        return $this->_f_DT_5_;
    }

    /**
     * @param \DateTime $_f_DT_5_
     */
    public function set_F_DT_5_($_f_DT_5_)
    {
        $this->_f_DT_5_ = $_f_DT_5_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_5_;

    /**
     * @return Decimal
     */
    public function get_F_N_5_()
    {
        return $this->_f_N_5_;
    }

    /**
     * @param Decimal $_f_N_5_
     */
    public function set_F_N_5_($_f_N_5_)
    {
        $this->_f_N_5_ = $_f_N_5_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_5_;

    /**
     * @return string
     */
    public function get_F_C5_5_()
    {
        return $this->_f_C5_5_;
    }

    /**
     * @param string $_f_C5_5_
     */
    public function set_F_C5_5_($_f_C5_5_)
    {
        $this->_f_C5_5_ = $_f_C5_5_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_5_;

    /**
     * @return string
     */
    public function get_F_C10_5_()
    {
        return $this->_f_C10_5_;
    }

    /**
     * @param string $_f_C10_5_
     */
    public function set_F_C10_5_($_f_C10_5_)
    {
        $this->_f_C10_5_ = $_f_C10_5_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_5_;

    /**
     * @return string
     */
    public function get_F_C20_5_()
    {
        return $this->_f_C20_5_;
    }

    /**
     * @param string $_f_C20_5_
     */
    public function set_F_C20_5_($_f_C20_5_)
    {
        $this->_f_C20_5_ = $_f_C20_5_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_5_;

    /**
     * @return string
     */
    public function get_F_C50_5_()
    {
        return $this->_f_C50_5_;
    }

    /**
     * @param string $_f_C50_5_
     */
    public function set_F_C50_5_($_f_C50_5_)
    {
        $this->_f_C50_5_ = $_f_C50_5_;
    }

    /**
     * @Type("string")
     */
    private $_f_C100_5_;

    /**
     * @return string
     */
    public function get_F_C100_5_()
    {
        return $this->_f_C100_5_;
    }

    /**
     * @param string $_f_C100_5_
     */
    public function set_F_C100_5_($_f_C100_5_)
    {
        $this->_f_C100_5_ = $_f_C100_5_;
    }

    /**
     * @Type("string")
     */
    private $_f_C200_5_;

    /**
     * @return string
     */
    public function get_F_C200_5_()
    {
        return $this->_f_C200_5_;
    }

    /**
     * @param string $_f_C200_5_
     */
    public function set_F_C200_5_($_f_C200_5_)
    {
        $this->_f_C200_5_ = $_f_C200_5_;
    }

    /**
     * @Type("string")
     */
    private $_f_C500_5_;

    /**
     * @return string
     */
    public function get_F_C500_5_()
    {
        return $this->_f_C500_5_;
    }

    /**
     * @param string $_f_C500_5_
     */
    public function set_F_C500_5_($_f_C500_5_)
    {
        $this->_f_C500_5_ = $_f_C500_5_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_6_;

    /**
     * @return boolean
     */
    public function get_F_B_6_()
    {
        return $this->_f_B_6_;
    }

    /**
     * @param boolean $_f_B_6_
     */
    public function set_F_B_6_($_f_B_6_)
    {
        $this->_f_B_6_ = $_f_B_6_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_6_;

    /**
     * @return integer
     */
    public function get_F_I_6_()
    {
        return $this->_f_I_6_;
    }

    /**
     * @param integer $_f_I_6_
     */
    public function set_F_I_6_($_f_I_6_)
    {
        $this->_f_I_6_ = $_f_I_6_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_6_;

    /**
     * @return Long
     */
    public function get_F_L_6_()
    {
        return $this->_f_L_6_;
    }

    /**
     * @param Long $_f_L_6_
     */
    public function set_F_L_6_($_f_L_6_)
    {
        $this->_f_L_6_ = $_f_L_6_;
    }

    /**
     * @Type("\DateTime")
     */
    private $_f_DT_6_;

    /**
     * @return \DateTime
     */
    public function get_F_DT_6_()
    {
        return $this->_f_DT_6_;
    }

    /**
     * @param \DateTime $_f_DT_6_
     */
    public function set_F_DT_6_($_f_DT_6_)
    {
        $this->_f_DT_6_ = $_f_DT_6_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_6_;

    /**
     * @return Decimal
     */
    public function get_F_N_6_()
    {
        return $this->_f_N_6_;
    }

    /**
     * @param Decimal $_f_N_6_
     */
    public function set_F_N_6_($_f_N_6_)
    {
        $this->_f_N_6_ = $_f_N_6_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_6_;

    /**
     * @return string
     */
    public function get_F_C5_6_()
    {
        return $this->_f_C5_6_;
    }

    /**
     * @param string $_f_C5_6_
     */
    public function set_F_C5_6_($_f_C5_6_)
    {
        $this->_f_C5_6_ = $_f_C5_6_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_6_;

    /**
     * @return string
     */
    public function get_F_C10_6_()
    {
        return $this->_f_C10_6_;
    }

    /**
     * @param string $_f_C10_6_
     */
    public function set_F_C10_6_($_f_C10_6_)
    {
        $this->_f_C10_6_ = $_f_C10_6_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_6_;

    /**
     * @return string
     */
    public function get_F_C20_6_()
    {
        return $this->_f_C20_6_;
    }

    /**
     * @param string $_f_C20_6_
     */
    public function set_F_C20_6_($_f_C20_6_)
    {
        $this->_f_C20_6_ = $_f_C20_6_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_6_;

    /**
     * @return string
     */
    public function get_F_C50_6_()
    {
        return $this->_f_C50_6_;
    }

    /**
     * @param string $_f_C50_6_
     */
    public function set_F_C50_6_($_f_C50_6_)
    {
        $this->_f_C50_6_ = $_f_C50_6_;
    }

    /**
     * @Type("string")
     */
    private $_f_C100_6_;

    /**
     * @return string
     */
    public function get_F_C100_6_()
    {
        return $this->_f_C100_6_;
    }

    /**
     * @param string $_f_C100_6_
     */
    public function set_F_C100_6_($_f_C100_6_)
    {
        $this->_f_C100_6_ = $_f_C100_6_;
    }

    /**
     * @Type("string")
     */
    private $_f_C200_6_;

    /**
     * @return string
     */
    public function get_F_C200_6_()
    {
        return $this->_f_C200_6_;
    }

    /**
     * @param string $_f_C200_6_
     */
    public function set_F_C200_6_($_f_C200_6_)
    {
        $this->_f_C200_6_ = $_f_C200_6_;
    }

    /**
     * @Type("string")
     */
    private $_f_C500_6_;

    /**
     * @return string
     */
    public function get_F_C500_6_()
    {
        return $this->_f_C500_6_;
    }

    /**
     * @param string $_f_C500_6_
     */
    public function set_F_C500_6_($_f_C500_6_)
    {
        $this->_f_C500_6_ = $_f_C500_6_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_7_;

    /**
     * @return boolean
     */
    public function get_F_B_7_()
    {
        return $this->_f_B_7_;
    }

    /**
     * @param boolean $_f_B_7_
     */
    public function set_F_B_7_($_f_B_7_)
    {
        $this->_f_B_7_ = $_f_B_7_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_7_;

    /**
     * @return integer
     */
    public function get_F_I_7_()
    {
        return $this->_f_I_7_;
    }

    /**
     * @param integer $_f_I_7_
     */
    public function set_F_I_7_($_f_I_7_)
    {
        $this->_f_I_7_ = $_f_I_7_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_7_;

    /**
     * @return Long
     */
    public function get_F_L_7_()
    {
        return $this->_f_L_7_;
    }

    /**
     * @param Long $_f_L_7_
     */
    public function set_F_L_7_($_f_L_7_)
    {
        $this->_f_L_7_ = $_f_L_7_;
    }

    /**
     * @Type("\DateTime")
     */
    private $_f_DT_7_;

    /**
     * @return \DateTime
     */
    public function get_F_DT_7_()
    {
        return $this->_f_DT_7_;
    }

    /**
     * @param \DateTime $_f_DT_7_
     */
    public function set_F_DT_7_($_f_DT_7_)
    {
        $this->_f_DT_7_ = $_f_DT_7_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_7_;

    /**
     * @return Decimal
     */
    public function get_F_N_7_()
    {
        return $this->_f_N_7_;
    }

    /**
     * @param Decimal $_f_N_7_
     */
    public function set_F_N_7_($_f_N_7_)
    {
        $this->_f_N_7_ = $_f_N_7_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_7_;

    /**
     * @return string
     */
    public function get_F_C5_7_()
    {
        return $this->_f_C5_7_;
    }

    /**
     * @param string $_f_C5_7_
     */
    public function set_F_C5_7_($_f_C5_7_)
    {
        $this->_f_C5_7_ = $_f_C5_7_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_7_;

    /**
     * @return string
     */
    public function get_F_C10_7_()
    {
        return $this->_f_C10_7_;
    }

    /**
     * @param string $_f_C10_7_
     */
    public function set_F_C10_7_($_f_C10_7_)
    {
        $this->_f_C10_7_ = $_f_C10_7_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_7_;

    /**
     * @return string
     */
    public function get_F_C20_7_()
    {
        return $this->_f_C20_7_;
    }

    /**
     * @param string $_f_C20_7_
     */
    public function set_F_C20_7_($_f_C20_7_)
    {
        $this->_f_C20_7_ = $_f_C20_7_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_7_;

    /**
     * @return string
     */
    public function get_F_C50_7_()
    {
        return $this->_f_C50_7_;
    }

    /**
     * @param string $_f_C50_7_
     */
    public function set_F_C50_7_($_f_C50_7_)
    {
        $this->_f_C50_7_ = $_f_C50_7_;
    }

    /**
     * @Type("string")
     */
    private $_f_C100_7_;

    /**
     * @return string
     */
    public function get_F_C100_7_()
    {
        return $this->_f_C100_7_;
    }

    /**
     * @param string $_f_C100_7_
     */
    public function set_F_C100_7_($_f_C100_7_)
    {
        $this->_f_C100_7_ = $_f_C100_7_;
    }

    /**
     * @Type("string")
     */
    private $_f_C200_7_;

    /**
     * @return string
     */
    public function get_F_C200_7_()
    {
        return $this->_f_C200_7_;
    }

    /**
     * @param string $_f_C200_7_
     */
    public function set_F_C200_7_($_f_C200_7_)
    {
        $this->_f_C200_7_ = $_f_C200_7_;
    }

    /**
     * @Type("string")
     */
    private $_f_C500_7_;

    /**
     * @return string
     */
    public function get_F_C500_7_()
    {
        return $this->_f_C500_7_;
    }

    /**
     * @param string $_f_C500_7_
     */
    public function set_F_C500_7_($_f_C500_7_)
    {
        $this->_f_C500_7_ = $_f_C500_7_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_8_;

    /**
     * @return boolean
     */
    public function get_F_B_8_()
    {
        return $this->_f_B_8_;
    }

    /**
     * @param boolean $_f_B_8_
     */
    public function set_F_B_8_($_f_B_8_)
    {
        $this->_f_B_8_ = $_f_B_8_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_8_;

    /**
     * @return integer
     */
    public function get_F_I_8_()
    {
        return $this->_f_I_8_;
    }

    /**
     * @param integer $_f_I_8_
     */
    public function set_F_I_8_($_f_I_8_)
    {
        $this->_f_I_8_ = $_f_I_8_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_8_;

    /**
     * @return Long
     */
    public function get_F_L_8_()
    {
        return $this->_f_L_8_;
    }

    /**
     * @param Long $_f_L_8_
     */
    public function set_F_L_8_($_f_L_8_)
    {
        $this->_f_L_8_ = $_f_L_8_;
    }

    /**
     * @Type("\DateTime")
     */
    private $_f_DT_8_;

    /**
     * @return \DateTime
     */
    public function get_F_DT_8_()
    {
        return $this->_f_DT_8_;
    }

    /**
     * @param \DateTime $_f_DT_8_
     */
    public function set_F_DT_8_($_f_DT_8_)
    {
        $this->_f_DT_8_ = $_f_DT_8_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_8_;

    /**
     * @return Decimal
     */
    public function get_F_N_8_()
    {
        return $this->_f_N_8_;
    }

    /**
     * @param Decimal $_f_N_8_
     */
    public function set_F_N_8_($_f_N_8_)
    {
        $this->_f_N_8_ = $_f_N_8_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_8_;

    /**
     * @return string
     */
    public function get_F_C5_8_()
    {
        return $this->_f_C5_8_;
    }

    /**
     * @param string $_f_C5_8_
     */
    public function set_F_C5_8_($_f_C5_8_)
    {
        $this->_f_C5_8_ = $_f_C5_8_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_8_;

    /**
     * @return string
     */
    public function get_F_C10_8_()
    {
        return $this->_f_C10_8_;
    }

    /**
     * @param string $_f_C10_8_
     */
    public function set_F_C10_8_($_f_C10_8_)
    {
        $this->_f_C10_8_ = $_f_C10_8_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_8_;

    /**
     * @return string
     */
    public function get_F_C20_8_()
    {
        return $this->_f_C20_8_;
    }

    /**
     * @param string $_f_C20_8_
     */
    public function set_F_C20_8_($_f_C20_8_)
    {
        $this->_f_C20_8_ = $_f_C20_8_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_8_;

    /**
     * @return string
     */
    public function get_F_C50_8_()
    {
        return $this->_f_C50_8_;
    }

    /**
     * @param string $_f_C50_8_
     */
    public function set_F_C50_8_($_f_C50_8_)
    {
        $this->_f_C50_8_ = $_f_C50_8_;
    }

    /**
     * @Type("string")
     */
    private $_f_C100_8_;

    /**
     * @return string
     */
    public function get_F_C100_8_()
    {
        return $this->_f_C100_8_;
    }

    /**
     * @param string $_f_C100_8_
     */
    public function set_F_C100_8_($_f_C100_8_)
    {
        $this->_f_C100_8_ = $_f_C100_8_;
    }

    /**
     * @Type("string")
     */
    private $_f_C200_8_;

    /**
     * @return string
     */
    public function get_F_C200_8_()
    {
        return $this->_f_C200_8_;
    }

    /**
     * @param string $_f_C200_8_
     */
    public function set_F_C200_8_($_f_C200_8_)
    {
        $this->_f_C200_8_ = $_f_C200_8_;
    }

    /**
     * @Type("string")
     */
    private $_f_C500_8_;

    /**
     * @return string
     */
    public function get_F_C500_8_()
    {
        return $this->_f_C500_8_;
    }

    /**
     * @param string $_f_C500_8_
     */
    public function set_F_C500_8_($_f_C500_8_)
    {
        $this->_f_C500_8_ = $_f_C500_8_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_9_;

    /**
     * @return boolean
     */
    public function get_F_B_9_()
    {
        return $this->_f_B_9_;
    }

    /**
     * @param boolean $_f_B_9_
     */
    public function set_F_B_9_($_f_B_9_)
    {
        $this->_f_B_9_ = $_f_B_9_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_9_;

    /**
     * @return integer
     */
    public function get_F_I_9_()
    {
        return $this->_f_I_9_;
    }

    /**
     * @param integer $_f_I_9_
     */
    public function set_F_I_9_($_f_I_9_)
    {
        $this->_f_I_9_ = $_f_I_9_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_9_;

    /**
     * @return Long
     */
    public function get_F_L_9_()
    {
        return $this->_f_L_9_;
    }

    /**
     * @param Long $_f_L_9_
     */
    public function set_F_L_9_($_f_L_9_)
    {
        $this->_f_L_9_ = $_f_L_9_;
    }

    /**
     * @Type("\DateTime")
     */
    private $_f_DT_9_;

    /**
     * @return \DateTime
     */
    public function get_F_DT_9_()
    {
        return $this->_f_DT_9_;
    }

    /**
     * @param \DateTime $_f_DT_9_
     */
    public function set_F_DT_9_($_f_DT_9_)
    {
        $this->_f_DT_9_ = $_f_DT_9_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_9_;

    /**
     * @return Decimal
     */
    public function get_F_N_9_()
    {
        return $this->_f_N_9_;
    }

    /**
     * @param Decimal $_f_N_9_
     */
    public function set_F_N_9_($_f_N_9_)
    {
        $this->_f_N_9_ = $_f_N_9_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_9_;

    /**
     * @return string
     */
    public function get_F_C5_9_()
    {
        return $this->_f_C5_9_;
    }

    /**
     * @param string $_f_C5_9_
     */
    public function set_F_C5_9_($_f_C5_9_)
    {
        $this->_f_C5_9_ = $_f_C5_9_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_9_;

    /**
     * @return string
     */
    public function get_F_C10_9_()
    {
        return $this->_f_C10_9_;
    }

    /**
     * @param string $_f_C10_9_
     */
    public function set_F_C10_9_($_f_C10_9_)
    {
        $this->_f_C10_9_ = $_f_C10_9_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_9_;

    /**
     * @return string
     */
    public function get_F_C20_9_()
    {
        return $this->_f_C20_9_;
    }

    /**
     * @param string $_f_C20_9_
     */
    public function set_F_C20_9_($_f_C20_9_)
    {
        $this->_f_C20_9_ = $_f_C20_9_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_9_;

    /**
     * @return string
     */
    public function get_F_C50_9_()
    {
        return $this->_f_C50_9_;
    }

    /**
     * @param string $_f_C50_9_
     */
    public function set_F_C50_9_($_f_C50_9_)
    {
        $this->_f_C50_9_ = $_f_C50_9_;
    }

    /**
     * @Type("string")
     */
    private $_f_C100_9_;

    /**
     * @return string
     */
    public function get_F_C100_9_()
    {
        return $this->_f_C100_9_;
    }

    /**
     * @param string $_f_C100_9_
     */
    public function set_F_C100_9_($_f_C100_9_)
    {
        $this->_f_C100_9_ = $_f_C100_9_;
    }

    /**
     * @Type("string")
     */
    private $_f_C200_9_;

    /**
     * @return string
     */
    public function get_F_C200_9_()
    {
        return $this->_f_C200_9_;
    }

    /**
     * @param string $_f_C200_9_
     */
    public function set_F_C200_9_($_f_C200_9_)
    {
        $this->_f_C200_9_ = $_f_C200_9_;
    }

    /**
     * @Type("string")
     */
    private $_f_C500_9_;

    /**
     * @return string
     */
    public function get_F_C500_9_()
    {
        return $this->_f_C500_9_;
    }

    /**
     * @param string $_f_C500_9_
     */
    public function set_F_C500_9_($_f_C500_9_)
    {
        $this->_f_C500_9_ = $_f_C500_9_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_10_;

    /**
     * @return boolean
     */
    public function get_F_B_10_()
    {
        return $this->_f_B_10_;
    }

    /**
     * @param boolean $_f_B_10_
     */
    public function set_F_B_10_($_f_B_10_)
    {
        $this->_f_B_10_ = $_f_B_10_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_10_;

    /**
     * @return integer
     */
    public function get_F_I_10_()
    {
        return $this->_f_I_10_;
    }

    /**
     * @param integer $_f_I_10_
     */
    public function set_F_I_10_($_f_I_10_)
    {
        $this->_f_I_10_ = $_f_I_10_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_10_;

    /**
     * @return Long
     */
    public function get_F_L_10_()
    {
        return $this->_f_L_10_;
    }

    /**
     * @param Long $_f_L_10_
     */
    public function set_F_L_10_($_f_L_10_)
    {
        $this->_f_L_10_ = $_f_L_10_;
    }

    /**
     * @Type("\DateTime")
     */
    private $_f_DT_10_;

    /**
     * @return \DateTime
     */
    public function get_F_DT_10_()
    {
        return $this->_f_DT_10_;
    }

    /**
     * @param \DateTime $_f_DT_10_
     */
    public function set_F_DT_10_($_f_DT_10_)
    {
        $this->_f_DT_10_ = $_f_DT_10_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_10_;

    /**
     * @return Decimal
     */
    public function get_F_N_10_()
    {
        return $this->_f_N_10_;
    }

    /**
     * @param Decimal $_f_N_10_
     */
    public function set_F_N_10_($_f_N_10_)
    {
        $this->_f_N_10_ = $_f_N_10_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_10_;

    /**
     * @return string
     */
    public function get_F_C5_10_()
    {
        return $this->_f_C5_10_;
    }

    /**
     * @param string $_f_C5_10_
     */
    public function set_F_C5_10_($_f_C5_10_)
    {
        $this->_f_C5_10_ = $_f_C5_10_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_10_;

    /**
     * @return string
     */
    public function get_F_C10_10_()
    {
        return $this->_f_C10_10_;
    }

    /**
     * @param string $_f_C10_10_
     */
    public function set_F_C10_10_($_f_C10_10_)
    {
        $this->_f_C10_10_ = $_f_C10_10_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_10_;

    /**
     * @return string
     */
    public function get_F_C20_10_()
    {
        return $this->_f_C20_10_;
    }

    /**
     * @param string $_f_C20_10_
     */
    public function set_F_C20_10_($_f_C20_10_)
    {
        $this->_f_C20_10_ = $_f_C20_10_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_10_;

    /**
     * @return string
     */
    public function get_F_C50_10_()
    {
        return $this->_f_C50_10_;
    }

    /**
     * @param string $_f_C50_10_
     */
    public function set_F_C50_10_($_f_C50_10_)
    {
        $this->_f_C50_10_ = $_f_C50_10_;
    }

    /**
     * @Type("string")
     */
    private $_f_C100_10_;

    /**
     * @return string
     */
    public function get_F_C100_10_()
    {
        return $this->_f_C100_10_;
    }

    /**
     * @param string $_f_C100_10_
     */
    public function set_F_C100_10_($_f_C100_10_)
    {
        $this->_f_C100_10_ = $_f_C100_10_;
    }

    /**
     * @Type("string")
     */
    private $_f_C200_10_;

    /**
     * @return string
     */
    public function get_F_C200_10_()
    {
        return $this->_f_C200_10_;
    }

    /**
     * @param string $_f_C200_10_
     */
    public function set_F_C200_10_($_f_C200_10_)
    {
        $this->_f_C200_10_ = $_f_C200_10_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_11_;

    /**
     * @return boolean
     */
    public function get_F_B_11_()
    {
        return $this->_f_B_11_;
    }

    /**
     * @param boolean $_f_B_11_
     */
    public function set_F_B_11_($_f_B_11_)
    {
        $this->_f_B_11_ = $_f_B_11_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_11_;

    /**
     * @return integer
     */
    public function get_F_I_11_()
    {
        return $this->_f_I_11_;
    }

    /**
     * @param integer $_f_I_11_
     */
    public function set_F_I_11_($_f_I_11_)
    {
        $this->_f_I_11_ = $_f_I_11_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_11_;

    /**
     * @return Long
     */
    public function get_F_L_11_()
    {
        return $this->_f_L_11_;
    }

    /**
     * @param Long $_f_L_11_
     */
    public function set_F_L_11_($_f_L_11_)
    {
        $this->_f_L_11_ = $_f_L_11_;
    }

    /**
     * @Type("\DateTime")
     */
    private $_f_DT_11_;

    /**
     * @return \DateTime
     */
    public function get_F_DT_11_()
    {
        return $this->_f_DT_11_;
    }

    /**
     * @param \DateTime $_f_DT_11_
     */
    public function set_F_DT_11_($_f_DT_11_)
    {
        $this->_f_DT_11_ = $_f_DT_11_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_11_;

    /**
     * @return Decimal
     */
    public function get_F_N_11_()
    {
        return $this->_f_N_11_;
    }

    /**
     * @param Decimal $_f_N_11_
     */
    public function set_F_N_11_($_f_N_11_)
    {
        $this->_f_N_11_ = $_f_N_11_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_11_;

    /**
     * @return string
     */
    public function get_F_C5_11_()
    {
        return $this->_f_C5_11_;
    }

    /**
     * @param string $_f_C5_11_
     */
    public function set_F_C5_11_($_f_C5_11_)
    {
        $this->_f_C5_11_ = $_f_C5_11_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_11_;

    /**
     * @return string
     */
    public function get_F_C10_11_()
    {
        return $this->_f_C10_11_;
    }

    /**
     * @param string $_f_C10_11_
     */
    public function set_F_C10_11_($_f_C10_11_)
    {
        $this->_f_C10_11_ = $_f_C10_11_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_11_;

    /**
     * @return string
     */
    public function get_F_C20_11_()
    {
        return $this->_f_C20_11_;
    }

    /**
     * @param string $_f_C20_11_
     */
    public function set_F_C20_11_($_f_C20_11_)
    {
        $this->_f_C20_11_ = $_f_C20_11_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_11_;

    /**
     * @return string
     */
    public function get_F_C50_11_()
    {
        return $this->_f_C50_11_;
    }

    /**
     * @param string $_f_C50_11_
     */
    public function set_F_C50_11_($_f_C50_11_)
    {
        $this->_f_C50_11_ = $_f_C50_11_;
    }

    /**
     * @Type("string")
     */
    private $_f_C100_11_;

    /**
     * @return string
     */
    public function get_F_C100_11_()
    {
        return $this->_f_C100_11_;
    }

    /**
     * @param string $_f_C100_11_
     */
    public function set_F_C100_11_($_f_C100_11_)
    {
        $this->_f_C100_11_ = $_f_C100_11_;
    }

    /**
     * @Type("string")
     */
    private $_f_C200_11_;

    /**
     * @return string
     */
    public function get_F_C200_11_()
    {
        return $this->_f_C200_11_;
    }

    /**
     * @param string $_f_C200_11_
     */
    public function set_F_C200_11_($_f_C200_11_)
    {
        $this->_f_C200_11_ = $_f_C200_11_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_12_;

    /**
     * @return boolean
     */
    public function get_F_B_12_()
    {
        return $this->_f_B_12_;
    }

    /**
     * @param boolean $_f_B_12_
     */
    public function set_F_B_12_($_f_B_12_)
    {
        $this->_f_B_12_ = $_f_B_12_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_12_;

    /**
     * @return integer
     */
    public function get_F_I_12_()
    {
        return $this->_f_I_12_;
    }

    /**
     * @param integer $_f_I_12_
     */
    public function set_F_I_12_($_f_I_12_)
    {
        $this->_f_I_12_ = $_f_I_12_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_12_;

    /**
     * @return Long
     */
    public function get_F_L_12_()
    {
        return $this->_f_L_12_;
    }

    /**
     * @param Long $_f_L_12_
     */
    public function set_F_L_12_($_f_L_12_)
    {
        $this->_f_L_12_ = $_f_L_12_;
    }

    /**
     * @Type("\DateTime")
     */
    private $_f_DT_12_;

    /**
     * @return \DateTime
     */
    public function get_F_DT_12_()
    {
        return $this->_f_DT_12_;
    }

    /**
     * @param \DateTime $_f_DT_12_
     */
    public function set_F_DT_12_($_f_DT_12_)
    {
        $this->_f_DT_12_ = $_f_DT_12_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_12_;

    /**
     * @return Decimal
     */
    public function get_F_N_12_()
    {
        return $this->_f_N_12_;
    }

    /**
     * @param Decimal $_f_N_12_
     */
    public function set_F_N_12_($_f_N_12_)
    {
        $this->_f_N_12_ = $_f_N_12_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_12_;

    /**
     * @return string
     */
    public function get_F_C5_12_()
    {
        return $this->_f_C5_12_;
    }

    /**
     * @param string $_f_C5_12_
     */
    public function set_F_C5_12_($_f_C5_12_)
    {
        $this->_f_C5_12_ = $_f_C5_12_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_12_;

    /**
     * @return string
     */
    public function get_F_C10_12_()
    {
        return $this->_f_C10_12_;
    }

    /**
     * @param string $_f_C10_12_
     */
    public function set_F_C10_12_($_f_C10_12_)
    {
        $this->_f_C10_12_ = $_f_C10_12_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_12_;

    /**
     * @return string
     */
    public function get_F_C20_12_()
    {
        return $this->_f_C20_12_;
    }

    /**
     * @param string $_f_C20_12_
     */
    public function set_F_C20_12_($_f_C20_12_)
    {
        $this->_f_C20_12_ = $_f_C20_12_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_12_;

    /**
     * @return string
     */
    public function get_F_C50_12_()
    {
        return $this->_f_C50_12_;
    }

    /**
     * @param string $_f_C50_12_
     */
    public function set_F_C50_12_($_f_C50_12_)
    {
        $this->_f_C50_12_ = $_f_C50_12_;
    }

    /**
     * @Type("string")
     */
    private $_f_C100_12_;

    /**
     * @return string
     */
    public function get_F_C100_12_()
    {
        return $this->_f_C100_12_;
    }

    /**
     * @param string $_f_C100_12_
     */
    public function set_F_C100_12_($_f_C100_12_)
    {
        $this->_f_C100_12_ = $_f_C100_12_;
    }

    /**
     * @Type("string")
     */
    private $_f_C200_12_;

    /**
     * @return string
     */
    public function get_F_C200_12_()
    {
        return $this->_f_C200_12_;
    }

    /**
     * @param string $_f_C200_12_
     */
    public function set_F_C200_12_($_f_C200_12_)
    {
        $this->_f_C200_12_ = $_f_C200_12_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_13_;

    /**
     * @return boolean
     */
    public function get_F_B_13_()
    {
        return $this->_f_B_13_;
    }

    /**
     * @param boolean $_f_B_13_
     */
    public function set_F_B_13_($_f_B_13_)
    {
        $this->_f_B_13_ = $_f_B_13_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_13_;

    /**
     * @return integer
     */
    public function get_F_I_13_()
    {
        return $this->_f_I_13_;
    }

    /**
     * @param integer $_f_I_13_
     */
    public function set_F_I_13_($_f_I_13_)
    {
        $this->_f_I_13_ = $_f_I_13_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_13_;

    /**
     * @return Long
     */
    public function get_F_L_13_()
    {
        return $this->_f_L_13_;
    }

    /**
     * @param Long $_f_L_13_
     */
    public function set_F_L_13_($_f_L_13_)
    {
        $this->_f_L_13_ = $_f_L_13_;
    }

    /**
     * @Type("\DateTime")
     */
    private $_f_DT_13_;

    /**
     * @return \DateTime
     */
    public function get_F_DT_13_()
    {
        return $this->_f_DT_13_;
    }

    /**
     * @param \DateTime $_f_DT_13_
     */
    public function set_F_DT_13_($_f_DT_13_)
    {
        $this->_f_DT_13_ = $_f_DT_13_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_13_;

    /**
     * @return Decimal
     */
    public function get_F_N_13_()
    {
        return $this->_f_N_13_;
    }

    /**
     * @param Decimal $_f_N_13_
     */
    public function set_F_N_13_($_f_N_13_)
    {
        $this->_f_N_13_ = $_f_N_13_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_13_;

    /**
     * @return string
     */
    public function get_F_C5_13_()
    {
        return $this->_f_C5_13_;
    }

    /**
     * @param string $_f_C5_13_
     */
    public function set_F_C5_13_($_f_C5_13_)
    {
        $this->_f_C5_13_ = $_f_C5_13_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_13_;

    /**
     * @return string
     */
    public function get_F_C10_13_()
    {
        return $this->_f_C10_13_;
    }

    /**
     * @param string $_f_C10_13_
     */
    public function set_F_C10_13_($_f_C10_13_)
    {
        $this->_f_C10_13_ = $_f_C10_13_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_13_;

    /**
     * @return string
     */
    public function get_F_C20_13_()
    {
        return $this->_f_C20_13_;
    }

    /**
     * @param string $_f_C20_13_
     */
    public function set_F_C20_13_($_f_C20_13_)
    {
        $this->_f_C20_13_ = $_f_C20_13_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_13_;

    /**
     * @return string
     */
    public function get_F_C50_13_()
    {
        return $this->_f_C50_13_;
    }

    /**
     * @param string $_f_C50_13_
     */
    public function set_F_C50_13_($_f_C50_13_)
    {
        $this->_f_C50_13_ = $_f_C50_13_;
    }

    /**
     * @Type("string")
     */
    private $_f_C100_13_;

    /**
     * @return string
     */
    public function get_F_C100_13_()
    {
        return $this->_f_C100_13_;
    }

    /**
     * @param string $_f_C100_13_
     */
    public function set_F_C100_13_($_f_C100_13_)
    {
        $this->_f_C100_13_ = $_f_C100_13_;
    }

    /**
     * @Type("string")
     */
    private $_f_C200_13_;

    /**
     * @return string
     */
    public function get_F_C200_13_()
    {
        return $this->_f_C200_13_;
    }

    /**
     * @param string $_f_C200_13_
     */
    public function set_F_C200_13_($_f_C200_13_)
    {
        $this->_f_C200_13_ = $_f_C200_13_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_14_;

    /**
     * @return boolean
     */
    public function get_F_B_14_()
    {
        return $this->_f_B_14_;
    }

    /**
     * @param boolean $_f_B_14_
     */
    public function set_F_B_14_($_f_B_14_)
    {
        $this->_f_B_14_ = $_f_B_14_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_14_;

    /**
     * @return integer
     */
    public function get_F_I_14_()
    {
        return $this->_f_I_14_;
    }

    /**
     * @param integer $_f_I_14_
     */
    public function set_F_I_14_($_f_I_14_)
    {
        $this->_f_I_14_ = $_f_I_14_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_14_;

    /**
     * @return Long
     */
    public function get_F_L_14_()
    {
        return $this->_f_L_14_;
    }

    /**
     * @param Long $_f_L_14_
     */
    public function set_F_L_14_($_f_L_14_)
    {
        $this->_f_L_14_ = $_f_L_14_;
    }

    /**
     * @Type("\DateTime")
     */
    private $_f_DT_14_;

    /**
     * @return \DateTime
     */
    public function get_F_DT_14_()
    {
        return $this->_f_DT_14_;
    }

    /**
     * @param \DateTime $_f_DT_14_
     */
    public function set_F_DT_14_($_f_DT_14_)
    {
        $this->_f_DT_14_ = $_f_DT_14_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_14_;

    /**
     * @return Decimal
     */
    public function get_F_N_14_()
    {
        return $this->_f_N_14_;
    }

    /**
     * @param Decimal $_f_N_14_
     */
    public function set_F_N_14_($_f_N_14_)
    {
        $this->_f_N_14_ = $_f_N_14_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_14_;

    /**
     * @return string
     */
    public function get_F_C5_14_()
    {
        return $this->_f_C5_14_;
    }

    /**
     * @param string $_f_C5_14_
     */
    public function set_F_C5_14_($_f_C5_14_)
    {
        $this->_f_C5_14_ = $_f_C5_14_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_14_;

    /**
     * @return string
     */
    public function get_F_C10_14_()
    {
        return $this->_f_C10_14_;
    }

    /**
     * @param string $_f_C10_14_
     */
    public function set_F_C10_14_($_f_C10_14_)
    {
        $this->_f_C10_14_ = $_f_C10_14_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_14_;

    /**
     * @return string
     */
    public function get_F_C20_14_()
    {
        return $this->_f_C20_14_;
    }

    /**
     * @param string $_f_C20_14_
     */
    public function set_F_C20_14_($_f_C20_14_)
    {
        $this->_f_C20_14_ = $_f_C20_14_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_14_;

    /**
     * @return string
     */
    public function get_F_C50_14_()
    {
        return $this->_f_C50_14_;
    }

    /**
     * @param string $_f_C50_14_
     */
    public function set_F_C50_14_($_f_C50_14_)
    {
        $this->_f_C50_14_ = $_f_C50_14_;
    }

    /**
     * @Type("string")
     */
    private $_f_C100_14_;

    /**
     * @return string
     */
    public function get_F_C100_14_()
    {
        return $this->_f_C100_14_;
    }

    /**
     * @param string $_f_C100_14_
     */
    public function set_F_C100_14_($_f_C100_14_)
    {
        $this->_f_C100_14_ = $_f_C100_14_;
    }

    /**
     * @Type("string")
     */
    private $_f_C200_14_;

    /**
     * @return string
     */
    public function get_F_C200_14_()
    {
        return $this->_f_C200_14_;
    }

    /**
     * @param string $_f_C200_14_
     */
    public function set_F_C200_14_($_f_C200_14_)
    {
        $this->_f_C200_14_ = $_f_C200_14_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_15_;

    /**
     * @return boolean
     */
    public function get_F_B_15_()
    {
        return $this->_f_B_15_;
    }

    /**
     * @param boolean $_f_B_15_
     */
    public function set_F_B_15_($_f_B_15_)
    {
        $this->_f_B_15_ = $_f_B_15_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_15_;

    /**
     * @return integer
     */
    public function get_F_I_15_()
    {
        return $this->_f_I_15_;
    }

    /**
     * @param integer $_f_I_15_
     */
    public function set_F_I_15_($_f_I_15_)
    {
        $this->_f_I_15_ = $_f_I_15_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_15_;

    /**
     * @return Long
     */
    public function get_F_L_15_()
    {
        return $this->_f_L_15_;
    }

    /**
     * @param Long $_f_L_15_
     */
    public function set_F_L_15_($_f_L_15_)
    {
        $this->_f_L_15_ = $_f_L_15_;
    }

    /**
     * @Type("\DateTime")
     */
    private $_f_DT_15_;

    /**
     * @return \DateTime
     */
    public function get_F_DT_15_()
    {
        return $this->_f_DT_15_;
    }

    /**
     * @param \DateTime $_f_DT_15_
     */
    public function set_F_DT_15_($_f_DT_15_)
    {
        $this->_f_DT_15_ = $_f_DT_15_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_15_;

    /**
     * @return Decimal
     */
    public function get_F_N_15_()
    {
        return $this->_f_N_15_;
    }

    /**
     * @param Decimal $_f_N_15_
     */
    public function set_F_N_15_($_f_N_15_)
    {
        $this->_f_N_15_ = $_f_N_15_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_15_;

    /**
     * @return string
     */
    public function get_F_C5_15_()
    {
        return $this->_f_C5_15_;
    }

    /**
     * @param string $_f_C5_15_
     */
    public function set_F_C5_15_($_f_C5_15_)
    {
        $this->_f_C5_15_ = $_f_C5_15_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_15_;

    /**
     * @return string
     */
    public function get_F_C10_15_()
    {
        return $this->_f_C10_15_;
    }

    /**
     * @param string $_f_C10_15_
     */
    public function set_F_C10_15_($_f_C10_15_)
    {
        $this->_f_C10_15_ = $_f_C10_15_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_15_;

    /**
     * @return string
     */
    public function get_F_C20_15_()
    {
        return $this->_f_C20_15_;
    }

    /**
     * @param string $_f_C20_15_
     */
    public function set_F_C20_15_($_f_C20_15_)
    {
        $this->_f_C20_15_ = $_f_C20_15_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_15_;

    /**
     * @return string
     */
    public function get_F_C50_15_()
    {
        return $this->_f_C50_15_;
    }

    /**
     * @param string $_f_C50_15_
     */
    public function set_F_C50_15_($_f_C50_15_)
    {
        $this->_f_C50_15_ = $_f_C50_15_;
    }

    /**
     * @Type("string")
     */
    private $_f_C100_15_;

    /**
     * @return string
     */
    public function get_F_C100_15_()
    {
        return $this->_f_C100_15_;
    }

    /**
     * @param string $_f_C100_15_
     */
    public function set_F_C100_15_($_f_C100_15_)
    {
        $this->_f_C100_15_ = $_f_C100_15_;
    }

    /**
     * @Type("string")
     */
    private $_f_C200_15_;

    /**
     * @return string
     */
    public function get_F_C200_15_()
    {
        return $this->_f_C200_15_;
    }

    /**
     * @param string $_f_C200_15_
     */
    public function set_F_C200_15_($_f_C200_15_)
    {
        $this->_f_C200_15_ = $_f_C200_15_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_16_;

    /**
     * @return boolean
     */
    public function get_F_B_16_()
    {
        return $this->_f_B_16_;
    }

    /**
     * @param boolean $_f_B_16_
     */
    public function set_F_B_16_($_f_B_16_)
    {
        $this->_f_B_16_ = $_f_B_16_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_16_;

    /**
     * @return integer
     */
    public function get_F_I_16_()
    {
        return $this->_f_I_16_;
    }

    /**
     * @param integer $_f_I_16_
     */
    public function set_F_I_16_($_f_I_16_)
    {
        $this->_f_I_16_ = $_f_I_16_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_16_;

    /**
     * @return Long
     */
    public function get_F_L_16_()
    {
        return $this->_f_L_16_;
    }

    /**
     * @param Long $_f_L_16_
     */
    public function set_F_L_16_($_f_L_16_)
    {
        $this->_f_L_16_ = $_f_L_16_;
    }

    /**
     * @Type("\DateTime")
     */
    private $_f_DT_16_;

    /**
     * @return \DateTime
     */
    public function get_F_DT_16_()
    {
        return $this->_f_DT_16_;
    }

    /**
     * @param \DateTime $_f_DT_16_
     */
    public function set_F_DT_16_($_f_DT_16_)
    {
        $this->_f_DT_16_ = $_f_DT_16_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_16_;

    /**
     * @return Decimal
     */
    public function get_F_N_16_()
    {
        return $this->_f_N_16_;
    }

    /**
     * @param Decimal $_f_N_16_
     */
    public function set_F_N_16_($_f_N_16_)
    {
        $this->_f_N_16_ = $_f_N_16_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_16_;

    /**
     * @return string
     */
    public function get_F_C5_16_()
    {
        return $this->_f_C5_16_;
    }

    /**
     * @param string $_f_C5_16_
     */
    public function set_F_C5_16_($_f_C5_16_)
    {
        $this->_f_C5_16_ = $_f_C5_16_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_16_;

    /**
     * @return string
     */
    public function get_F_C10_16_()
    {
        return $this->_f_C10_16_;
    }

    /**
     * @param string $_f_C10_16_
     */
    public function set_F_C10_16_($_f_C10_16_)
    {
        $this->_f_C10_16_ = $_f_C10_16_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_16_;

    /**
     * @return string
     */
    public function get_F_C20_16_()
    {
        return $this->_f_C20_16_;
    }

    /**
     * @param string $_f_C20_16_
     */
    public function set_F_C20_16_($_f_C20_16_)
    {
        $this->_f_C20_16_ = $_f_C20_16_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_16_;

    /**
     * @return string
     */
    public function get_F_C50_16_()
    {
        return $this->_f_C50_16_;
    }

    /**
     * @param string $_f_C50_16_
     */
    public function set_F_C50_16_($_f_C50_16_)
    {
        $this->_f_C50_16_ = $_f_C50_16_;
    }

    /**
     * @Type("string")
     */
    private $_f_C100_16_;

    /**
     * @return string
     */
    public function get_F_C100_16_()
    {
        return $this->_f_C100_16_;
    }

    /**
     * @param string $_f_C100_16_
     */
    public function set_F_C100_16_($_f_C100_16_)
    {
        $this->_f_C100_16_ = $_f_C100_16_;
    }

    /**
     * @Type("string")
     */
    private $_f_C200_16_;

    /**
     * @return string
     */
    public function get_F_C200_16_()
    {
        return $this->_f_C200_16_;
    }

    /**
     * @param string $_f_C200_16_
     */
    public function set_F_C200_16_($_f_C200_16_)
    {
        $this->_f_C200_16_ = $_f_C200_16_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_17_;

    /**
     * @return boolean
     */
    public function get_F_B_17_()
    {
        return $this->_f_B_17_;
    }

    /**
     * @param boolean $_f_B_17_
     */
    public function set_F_B_17_($_f_B_17_)
    {
        $this->_f_B_17_ = $_f_B_17_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_17_;

    /**
     * @return integer
     */
    public function get_F_I_17_()
    {
        return $this->_f_I_17_;
    }

    /**
     * @param integer $_f_I_17_
     */
    public function set_F_I_17_($_f_I_17_)
    {
        $this->_f_I_17_ = $_f_I_17_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_17_;

    /**
     * @return Long
     */
    public function get_F_L_17_()
    {
        return $this->_f_L_17_;
    }

    /**
     * @param Long $_f_L_17_
     */
    public function set_F_L_17_($_f_L_17_)
    {
        $this->_f_L_17_ = $_f_L_17_;
    }

    /**
     * @Type("\DateTime")
     */
    private $_f_DT_17_;

    /**
     * @return \DateTime
     */
    public function get_F_DT_17_()
    {
        return $this->_f_DT_17_;
    }

    /**
     * @param \DateTime $_f_DT_17_
     */
    public function set_F_DT_17_($_f_DT_17_)
    {
        $this->_f_DT_17_ = $_f_DT_17_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_17_;

    /**
     * @return Decimal
     */
    public function get_F_N_17_()
    {
        return $this->_f_N_17_;
    }

    /**
     * @param Decimal $_f_N_17_
     */
    public function set_F_N_17_($_f_N_17_)
    {
        $this->_f_N_17_ = $_f_N_17_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_17_;

    /**
     * @return string
     */
    public function get_F_C5_17_()
    {
        return $this->_f_C5_17_;
    }

    /**
     * @param string $_f_C5_17_
     */
    public function set_F_C5_17_($_f_C5_17_)
    {
        $this->_f_C5_17_ = $_f_C5_17_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_17_;

    /**
     * @return string
     */
    public function get_F_C10_17_()
    {
        return $this->_f_C10_17_;
    }

    /**
     * @param string $_f_C10_17_
     */
    public function set_F_C10_17_($_f_C10_17_)
    {
        $this->_f_C10_17_ = $_f_C10_17_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_17_;

    /**
     * @return string
     */
    public function get_F_C20_17_()
    {
        return $this->_f_C20_17_;
    }

    /**
     * @param string $_f_C20_17_
     */
    public function set_F_C20_17_($_f_C20_17_)
    {
        $this->_f_C20_17_ = $_f_C20_17_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_17_;

    /**
     * @return string
     */
    public function get_F_C50_17_()
    {
        return $this->_f_C50_17_;
    }

    /**
     * @param string $_f_C50_17_
     */
    public function set_F_C50_17_($_f_C50_17_)
    {
        $this->_f_C50_17_ = $_f_C50_17_;
    }

    /**
     * @Type("string")
     */
    private $_f_C100_17_;

    /**
     * @return string
     */
    public function get_F_C100_17_()
    {
        return $this->_f_C100_17_;
    }

    /**
     * @param string $_f_C100_17_
     */
    public function set_F_C100_17_($_f_C100_17_)
    {
        $this->_f_C100_17_ = $_f_C100_17_;
    }

    /**
     * @Type("string")
     */
    private $_f_C200_17_;

    /**
     * @return string
     */
    public function get_F_C200_17_()
    {
        return $this->_f_C200_17_;
    }

    /**
     * @param string $_f_C200_17_
     */
    public function set_F_C200_17_($_f_C200_17_)
    {
        $this->_f_C200_17_ = $_f_C200_17_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_18_;

    /**
     * @return boolean
     */
    public function get_F_B_18_()
    {
        return $this->_f_B_18_;
    }

    /**
     * @param boolean $_f_B_18_
     */
    public function set_F_B_18_($_f_B_18_)
    {
        $this->_f_B_18_ = $_f_B_18_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_18_;

    /**
     * @return integer
     */
    public function get_F_I_18_()
    {
        return $this->_f_I_18_;
    }

    /**
     * @param integer $_f_I_18_
     */
    public function set_F_I_18_($_f_I_18_)
    {
        $this->_f_I_18_ = $_f_I_18_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_18_;

    /**
     * @return Long
     */
    public function get_F_L_18_()
    {
        return $this->_f_L_18_;
    }

    /**
     * @param Long $_f_L_18_
     */
    public function set_F_L_18_($_f_L_18_)
    {
        $this->_f_L_18_ = $_f_L_18_;
    }

    /**
     * @Type("\DateTime")
     */
    private $_f_DT_18_;

    /**
     * @return \DateTime
     */
    public function get_F_DT_18_()
    {
        return $this->_f_DT_18_;
    }

    /**
     * @param \DateTime $_f_DT_18_
     */
    public function set_F_DT_18_($_f_DT_18_)
    {
        $this->_f_DT_18_ = $_f_DT_18_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_18_;

    /**
     * @return Decimal
     */
    public function get_F_N_18_()
    {
        return $this->_f_N_18_;
    }

    /**
     * @param Decimal $_f_N_18_
     */
    public function set_F_N_18_($_f_N_18_)
    {
        $this->_f_N_18_ = $_f_N_18_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_18_;

    /**
     * @return string
     */
    public function get_F_C5_18_()
    {
        return $this->_f_C5_18_;
    }

    /**
     * @param string $_f_C5_18_
     */
    public function set_F_C5_18_($_f_C5_18_)
    {
        $this->_f_C5_18_ = $_f_C5_18_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_18_;

    /**
     * @return string
     */
    public function get_F_C10_18_()
    {
        return $this->_f_C10_18_;
    }

    /**
     * @param string $_f_C10_18_
     */
    public function set_F_C10_18_($_f_C10_18_)
    {
        $this->_f_C10_18_ = $_f_C10_18_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_18_;

    /**
     * @return string
     */
    public function get_F_C20_18_()
    {
        return $this->_f_C20_18_;
    }

    /**
     * @param string $_f_C20_18_
     */
    public function set_F_C20_18_($_f_C20_18_)
    {
        $this->_f_C20_18_ = $_f_C20_18_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_18_;

    /**
     * @return string
     */
    public function get_F_C50_18_()
    {
        return $this->_f_C50_18_;
    }

    /**
     * @param string $_f_C50_18_
     */
    public function set_F_C50_18_($_f_C50_18_)
    {
        $this->_f_C50_18_ = $_f_C50_18_;
    }

    /**
     * @Type("string")
     */
    private $_f_C100_18_;

    /**
     * @return string
     */
    public function get_F_C100_18_()
    {
        return $this->_f_C100_18_;
    }

    /**
     * @param string $_f_C100_18_
     */
    public function set_F_C100_18_($_f_C100_18_)
    {
        $this->_f_C100_18_ = $_f_C100_18_;
    }

    /**
     * @Type("string")
     */
    private $_f_C200_18_;

    /**
     * @return string
     */
    public function get_F_C200_18_()
    {
        return $this->_f_C200_18_;
    }

    /**
     * @param string $_f_C200_18_
     */
    public function set_F_C200_18_($_f_C200_18_)
    {
        $this->_f_C200_18_ = $_f_C200_18_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_19_;

    /**
     * @return boolean
     */
    public function get_F_B_19_()
    {
        return $this->_f_B_19_;
    }

    /**
     * @param boolean $_f_B_19_
     */
    public function set_F_B_19_($_f_B_19_)
    {
        $this->_f_B_19_ = $_f_B_19_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_19_;

    /**
     * @return integer
     */
    public function get_F_I_19_()
    {
        return $this->_f_I_19_;
    }

    /**
     * @param integer $_f_I_19_
     */
    public function set_F_I_19_($_f_I_19_)
    {
        $this->_f_I_19_ = $_f_I_19_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_19_;

    /**
     * @return Long
     */
    public function get_F_L_19_()
    {
        return $this->_f_L_19_;
    }

    /**
     * @param Long $_f_L_19_
     */
    public function set_F_L_19_($_f_L_19_)
    {
        $this->_f_L_19_ = $_f_L_19_;
    }

    /**
     * @Type("\DateTime")
     */
    private $_f_DT_19_;

    /**
     * @return \DateTime
     */
    public function get_F_DT_19_()
    {
        return $this->_f_DT_19_;
    }

    /**
     * @param \DateTime $_f_DT_19_
     */
    public function set_F_DT_19_($_f_DT_19_)
    {
        $this->_f_DT_19_ = $_f_DT_19_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_19_;

    /**
     * @return Decimal
     */
    public function get_F_N_19_()
    {
        return $this->_f_N_19_;
    }

    /**
     * @param Decimal $_f_N_19_
     */
    public function set_F_N_19_($_f_N_19_)
    {
        $this->_f_N_19_ = $_f_N_19_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_19_;

    /**
     * @return string
     */
    public function get_F_C5_19_()
    {
        return $this->_f_C5_19_;
    }

    /**
     * @param string $_f_C5_19_
     */
    public function set_F_C5_19_($_f_C5_19_)
    {
        $this->_f_C5_19_ = $_f_C5_19_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_19_;

    /**
     * @return string
     */
    public function get_F_C10_19_()
    {
        return $this->_f_C10_19_;
    }

    /**
     * @param string $_f_C10_19_
     */
    public function set_F_C10_19_($_f_C10_19_)
    {
        $this->_f_C10_19_ = $_f_C10_19_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_19_;

    /**
     * @return string
     */
    public function get_F_C20_19_()
    {
        return $this->_f_C20_19_;
    }

    /**
     * @param string $_f_C20_19_
     */
    public function set_F_C20_19_($_f_C20_19_)
    {
        $this->_f_C20_19_ = $_f_C20_19_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_19_;

    /**
     * @return string
     */
    public function get_F_C50_19_()
    {
        return $this->_f_C50_19_;
    }

    /**
     * @param string $_f_C50_19_
     */
    public function set_F_C50_19_($_f_C50_19_)
    {
        $this->_f_C50_19_ = $_f_C50_19_;
    }

    /**
     * @Type("string")
     */
    private $_f_C100_19_;

    /**
     * @return string
     */
    public function get_F_C100_19_()
    {
        return $this->_f_C100_19_;
    }

    /**
     * @param string $_f_C100_19_
     */
    public function set_F_C100_19_($_f_C100_19_)
    {
        $this->_f_C100_19_ = $_f_C100_19_;
    }

    /**
     * @Type("string")
     */
    private $_f_C200_19_;

    /**
     * @return string
     */
    public function get_F_C200_19_()
    {
        return $this->_f_C200_19_;
    }

    /**
     * @param string $_f_C200_19_
     */
    public function set_F_C200_19_($_f_C200_19_)
    {
        $this->_f_C200_19_ = $_f_C200_19_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_20_;

    /**
     * @return boolean
     */
    public function get_F_B_20_()
    {
        return $this->_f_B_20_;
    }

    /**
     * @param boolean $_f_B_20_
     */
    public function set_F_B_20_($_f_B_20_)
    {
        $this->_f_B_20_ = $_f_B_20_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_20_;

    /**
     * @return integer
     */
    public function get_F_I_20_()
    {
        return $this->_f_I_20_;
    }

    /**
     * @param integer $_f_I_20_
     */
    public function set_F_I_20_($_f_I_20_)
    {
        $this->_f_I_20_ = $_f_I_20_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_20_;

    /**
     * @return Long
     */
    public function get_F_L_20_()
    {
        return $this->_f_L_20_;
    }

    /**
     * @param Long $_f_L_20_
     */
    public function set_F_L_20_($_f_L_20_)
    {
        $this->_f_L_20_ = $_f_L_20_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_20_;

    /**
     * @return Decimal
     */
    public function get_F_N_20_()
    {
        return $this->_f_N_20_;
    }

    /**
     * @param Decimal $_f_N_20_
     */
    public function set_F_N_20_($_f_N_20_)
    {
        $this->_f_N_20_ = $_f_N_20_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_20_;

    /**
     * @return string
     */
    public function get_F_C5_20_()
    {
        return $this->_f_C5_20_;
    }

    /**
     * @param string $_f_C5_20_
     */
    public function set_F_C5_20_($_f_C5_20_)
    {
        $this->_f_C5_20_ = $_f_C5_20_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_20_;

    /**
     * @return string
     */
    public function get_F_C10_20_()
    {
        return $this->_f_C10_20_;
    }

    /**
     * @param string $_f_C10_20_
     */
    public function set_F_C10_20_($_f_C10_20_)
    {
        $this->_f_C10_20_ = $_f_C10_20_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_20_;

    /**
     * @return string
     */
    public function get_F_C20_20_()
    {
        return $this->_f_C20_20_;
    }

    /**
     * @param string $_f_C20_20_
     */
    public function set_F_C20_20_($_f_C20_20_)
    {
        $this->_f_C20_20_ = $_f_C20_20_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_20_;

    /**
     * @return string
     */
    public function get_F_C50_20_()
    {
        return $this->_f_C50_20_;
    }

    /**
     * @param string $_f_C50_20_
     */
    public function set_F_C50_20_($_f_C50_20_)
    {
        $this->_f_C50_20_ = $_f_C50_20_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_21_;

    /**
     * @return boolean
     */
    public function get_F_B_21_()
    {
        return $this->_f_B_21_;
    }

    /**
     * @param boolean $_f_B_21_
     */
    public function set_F_B_21_($_f_B_21_)
    {
        $this->_f_B_21_ = $_f_B_21_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_21_;

    /**
     * @return integer
     */
    public function get_F_I_21_()
    {
        return $this->_f_I_21_;
    }

    /**
     * @param integer $_f_I_21_
     */
    public function set_F_I_21_($_f_I_21_)
    {
        $this->_f_I_21_ = $_f_I_21_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_21_;

    /**
     * @return Long
     */
    public function get_F_L_21_()
    {
        return $this->_f_L_21_;
    }

    /**
     * @param Long $_f_L_21_
     */
    public function set_F_L_21_($_f_L_21_)
    {
        $this->_f_L_21_ = $_f_L_21_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_21_;

    /**
     * @return Decimal
     */
    public function get_F_N_21_()
    {
        return $this->_f_N_21_;
    }

    /**
     * @param Decimal $_f_N_21_
     */
    public function set_F_N_21_($_f_N_21_)
    {
        $this->_f_N_21_ = $_f_N_21_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_21_;

    /**
     * @return string
     */
    public function get_F_C5_21_()
    {
        return $this->_f_C5_21_;
    }

    /**
     * @param string $_f_C5_21_
     */
    public function set_F_C5_21_($_f_C5_21_)
    {
        $this->_f_C5_21_ = $_f_C5_21_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_21_;

    /**
     * @return string
     */
    public function get_F_C10_21_()
    {
        return $this->_f_C10_21_;
    }

    /**
     * @param string $_f_C10_21_
     */
    public function set_F_C10_21_($_f_C10_21_)
    {
        $this->_f_C10_21_ = $_f_C10_21_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_21_;

    /**
     * @return string
     */
    public function get_F_C20_21_()
    {
        return $this->_f_C20_21_;
    }

    /**
     * @param string $_f_C20_21_
     */
    public function set_F_C20_21_($_f_C20_21_)
    {
        $this->_f_C20_21_ = $_f_C20_21_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_21_;

    /**
     * @return string
     */
    public function get_F_C50_21_()
    {
        return $this->_f_C50_21_;
    }

    /**
     * @param string $_f_C50_21_
     */
    public function set_F_C50_21_($_f_C50_21_)
    {
        $this->_f_C50_21_ = $_f_C50_21_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_22_;

    /**
     * @return boolean
     */
    public function get_F_B_22_()
    {
        return $this->_f_B_22_;
    }

    /**
     * @param boolean $_f_B_22_
     */
    public function set_F_B_22_($_f_B_22_)
    {
        $this->_f_B_22_ = $_f_B_22_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_22_;

    /**
     * @return integer
     */
    public function get_F_I_22_()
    {
        return $this->_f_I_22_;
    }

    /**
     * @param integer $_f_I_22_
     */
    public function set_F_I_22_($_f_I_22_)
    {
        $this->_f_I_22_ = $_f_I_22_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_22_;

    /**
     * @return Long
     */
    public function get_F_L_22_()
    {
        return $this->_f_L_22_;
    }

    /**
     * @param Long $_f_L_22_
     */
    public function set_F_L_22_($_f_L_22_)
    {
        $this->_f_L_22_ = $_f_L_22_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_22_;

    /**
     * @return Decimal
     */
    public function get_F_N_22_()
    {
        return $this->_f_N_22_;
    }

    /**
     * @param Decimal $_f_N_22_
     */
    public function set_F_N_22_($_f_N_22_)
    {
        $this->_f_N_22_ = $_f_N_22_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_22_;

    /**
     * @return string
     */
    public function get_F_C5_22_()
    {
        return $this->_f_C5_22_;
    }

    /**
     * @param string $_f_C5_22_
     */
    public function set_F_C5_22_($_f_C5_22_)
    {
        $this->_f_C5_22_ = $_f_C5_22_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_22_;

    /**
     * @return string
     */
    public function get_F_C10_22_()
    {
        return $this->_f_C10_22_;
    }

    /**
     * @param string $_f_C10_22_
     */
    public function set_F_C10_22_($_f_C10_22_)
    {
        $this->_f_C10_22_ = $_f_C10_22_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_22_;

    /**
     * @return string
     */
    public function get_F_C20_22_()
    {
        return $this->_f_C20_22_;
    }

    /**
     * @param string $_f_C20_22_
     */
    public function set_F_C20_22_($_f_C20_22_)
    {
        $this->_f_C20_22_ = $_f_C20_22_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_22_;

    /**
     * @return string
     */
    public function get_F_C50_22_()
    {
        return $this->_f_C50_22_;
    }

    /**
     * @param string $_f_C50_22_
     */
    public function set_F_C50_22_($_f_C50_22_)
    {
        $this->_f_C50_22_ = $_f_C50_22_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_23_;

    /**
     * @return boolean
     */
    public function get_F_B_23_()
    {
        return $this->_f_B_23_;
    }

    /**
     * @param boolean $_f_B_23_
     */
    public function set_F_B_23_($_f_B_23_)
    {
        $this->_f_B_23_ = $_f_B_23_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_23_;

    /**
     * @return integer
     */
    public function get_F_I_23_()
    {
        return $this->_f_I_23_;
    }

    /**
     * @param integer $_f_I_23_
     */
    public function set_F_I_23_($_f_I_23_)
    {
        $this->_f_I_23_ = $_f_I_23_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_23_;

    /**
     * @return Long
     */
    public function get_F_L_23_()
    {
        return $this->_f_L_23_;
    }

    /**
     * @param Long $_f_L_23_
     */
    public function set_F_L_23_($_f_L_23_)
    {
        $this->_f_L_23_ = $_f_L_23_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_23_;

    /**
     * @return Decimal
     */
    public function get_F_N_23_()
    {
        return $this->_f_N_23_;
    }

    /**
     * @param Decimal $_f_N_23_
     */
    public function set_F_N_23_($_f_N_23_)
    {
        $this->_f_N_23_ = $_f_N_23_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_23_;

    /**
     * @return string
     */
    public function get_F_C5_23_()
    {
        return $this->_f_C5_23_;
    }

    /**
     * @param string $_f_C5_23_
     */
    public function set_F_C5_23_($_f_C5_23_)
    {
        $this->_f_C5_23_ = $_f_C5_23_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_23_;

    /**
     * @return string
     */
    public function get_F_C10_23_()
    {
        return $this->_f_C10_23_;
    }

    /**
     * @param string $_f_C10_23_
     */
    public function set_F_C10_23_($_f_C10_23_)
    {
        $this->_f_C10_23_ = $_f_C10_23_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_23_;

    /**
     * @return string
     */
    public function get_F_C20_23_()
    {
        return $this->_f_C20_23_;
    }

    /**
     * @param string $_f_C20_23_
     */
    public function set_F_C20_23_($_f_C20_23_)
    {
        $this->_f_C20_23_ = $_f_C20_23_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_23_;

    /**
     * @return string
     */
    public function get_F_C50_23_()
    {
        return $this->_f_C50_23_;
    }

    /**
     * @param string $_f_C50_23_
     */
    public function set_F_C50_23_($_f_C50_23_)
    {
        $this->_f_C50_23_ = $_f_C50_23_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_24_;

    /**
     * @return boolean
     */
    public function get_F_B_24_()
    {
        return $this->_f_B_24_;
    }

    /**
     * @param boolean $_f_B_24_
     */
    public function set_F_B_24_($_f_B_24_)
    {
        $this->_f_B_24_ = $_f_B_24_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_24_;

    /**
     * @return integer
     */
    public function get_F_I_24_()
    {
        return $this->_f_I_24_;
    }

    /**
     * @param integer $_f_I_24_
     */
    public function set_F_I_24_($_f_I_24_)
    {
        $this->_f_I_24_ = $_f_I_24_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_24_;

    /**
     * @return Long
     */
    public function get_F_L_24_()
    {
        return $this->_f_L_24_;
    }

    /**
     * @param Long $_f_L_24_
     */
    public function set_F_L_24_($_f_L_24_)
    {
        $this->_f_L_24_ = $_f_L_24_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_24_;

    /**
     * @return Decimal
     */
    public function get_F_N_24_()
    {
        return $this->_f_N_24_;
    }

    /**
     * @param Decimal $_f_N_24_
     */
    public function set_F_N_24_($_f_N_24_)
    {
        $this->_f_N_24_ = $_f_N_24_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_24_;

    /**
     * @return string
     */
    public function get_F_C5_24_()
    {
        return $this->_f_C5_24_;
    }

    /**
     * @param string $_f_C5_24_
     */
    public function set_F_C5_24_($_f_C5_24_)
    {
        $this->_f_C5_24_ = $_f_C5_24_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_24_;

    /**
     * @return string
     */
    public function get_F_C10_24_()
    {
        return $this->_f_C10_24_;
    }

    /**
     * @param string $_f_C10_24_
     */
    public function set_F_C10_24_($_f_C10_24_)
    {
        $this->_f_C10_24_ = $_f_C10_24_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_24_;

    /**
     * @return string
     */
    public function get_F_C20_24_()
    {
        return $this->_f_C20_24_;
    }

    /**
     * @param string $_f_C20_24_
     */
    public function set_F_C20_24_($_f_C20_24_)
    {
        $this->_f_C20_24_ = $_f_C20_24_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_24_;

    /**
     * @return string
     */
    public function get_F_C50_24_()
    {
        return $this->_f_C50_24_;
    }

    /**
     * @param string $_f_C50_24_
     */
    public function set_F_C50_24_($_f_C50_24_)
    {
        $this->_f_C50_24_ = $_f_C50_24_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_25_;

    /**
     * @return boolean
     */
    public function get_F_B_25_()
    {
        return $this->_f_B_25_;
    }

    /**
     * @param boolean $_f_B_25_
     */
    public function set_F_B_25_($_f_B_25_)
    {
        $this->_f_B_25_ = $_f_B_25_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_25_;

    /**
     * @return integer
     */
    public function get_F_I_25_()
    {
        return $this->_f_I_25_;
    }

    /**
     * @param integer $_f_I_25_
     */
    public function set_F_I_25_($_f_I_25_)
    {
        $this->_f_I_25_ = $_f_I_25_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_25_;

    /**
     * @return Long
     */
    public function get_F_L_25_()
    {
        return $this->_f_L_25_;
    }

    /**
     * @param Long $_f_L_25_
     */
    public function set_F_L_25_($_f_L_25_)
    {
        $this->_f_L_25_ = $_f_L_25_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_25_;

    /**
     * @return Decimal
     */
    public function get_F_N_25_()
    {
        return $this->_f_N_25_;
    }

    /**
     * @param Decimal $_f_N_25_
     */
    public function set_F_N_25_($_f_N_25_)
    {
        $this->_f_N_25_ = $_f_N_25_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_25_;

    /**
     * @return string
     */
    public function get_F_C5_25_()
    {
        return $this->_f_C5_25_;
    }

    /**
     * @param string $_f_C5_25_
     */
    public function set_F_C5_25_($_f_C5_25_)
    {
        $this->_f_C5_25_ = $_f_C5_25_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_25_;

    /**
     * @return string
     */
    public function get_F_C10_25_()
    {
        return $this->_f_C10_25_;
    }

    /**
     * @param string $_f_C10_25_
     */
    public function set_F_C10_25_($_f_C10_25_)
    {
        $this->_f_C10_25_ = $_f_C10_25_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_25_;

    /**
     * @return string
     */
    public function get_F_C20_25_()
    {
        return $this->_f_C20_25_;
    }

    /**
     * @param string $_f_C20_25_
     */
    public function set_F_C20_25_($_f_C20_25_)
    {
        $this->_f_C20_25_ = $_f_C20_25_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_25_;

    /**
     * @return string
     */
    public function get_F_C50_25_()
    {
        return $this->_f_C50_25_;
    }

    /**
     * @param string $_f_C50_25_
     */
    public function set_F_C50_25_($_f_C50_25_)
    {
        $this->_f_C50_25_ = $_f_C50_25_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_26_;

    /**
     * @return boolean
     */
    public function get_F_B_26_()
    {
        return $this->_f_B_26_;
    }

    /**
     * @param boolean $_f_B_26_
     */
    public function set_F_B_26_($_f_B_26_)
    {
        $this->_f_B_26_ = $_f_B_26_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_26_;

    /**
     * @return integer
     */
    public function get_F_I_26_()
    {
        return $this->_f_I_26_;
    }

    /**
     * @param integer $_f_I_26_
     */
    public function set_F_I_26_($_f_I_26_)
    {
        $this->_f_I_26_ = $_f_I_26_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_26_;

    /**
     * @return Long
     */
    public function get_F_L_26_()
    {
        return $this->_f_L_26_;
    }

    /**
     * @param Long $_f_L_26_
     */
    public function set_F_L_26_($_f_L_26_)
    {
        $this->_f_L_26_ = $_f_L_26_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_26_;

    /**
     * @return Decimal
     */
    public function get_F_N_26_()
    {
        return $this->_f_N_26_;
    }

    /**
     * @param Decimal $_f_N_26_
     */
    public function set_F_N_26_($_f_N_26_)
    {
        $this->_f_N_26_ = $_f_N_26_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_26_;

    /**
     * @return string
     */
    public function get_F_C5_26_()
    {
        return $this->_f_C5_26_;
    }

    /**
     * @param string $_f_C5_26_
     */
    public function set_F_C5_26_($_f_C5_26_)
    {
        $this->_f_C5_26_ = $_f_C5_26_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_26_;

    /**
     * @return string
     */
    public function get_F_C10_26_()
    {
        return $this->_f_C10_26_;
    }

    /**
     * @param string $_f_C10_26_
     */
    public function set_F_C10_26_($_f_C10_26_)
    {
        $this->_f_C10_26_ = $_f_C10_26_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_26_;

    /**
     * @return string
     */
    public function get_F_C20_26_()
    {
        return $this->_f_C20_26_;
    }

    /**
     * @param string $_f_C20_26_
     */
    public function set_F_C20_26_($_f_C20_26_)
    {
        $this->_f_C20_26_ = $_f_C20_26_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_26_;

    /**
     * @return string
     */
    public function get_F_C50_26_()
    {
        return $this->_f_C50_26_;
    }

    /**
     * @param string $_f_C50_26_
     */
    public function set_F_C50_26_($_f_C50_26_)
    {
        $this->_f_C50_26_ = $_f_C50_26_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_27_;

    /**
     * @return boolean
     */
    public function get_F_B_27_()
    {
        return $this->_f_B_27_;
    }

    /**
     * @param boolean $_f_B_27_
     */
    public function set_F_B_27_($_f_B_27_)
    {
        $this->_f_B_27_ = $_f_B_27_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_27_;

    /**
     * @return integer
     */
    public function get_F_I_27_()
    {
        return $this->_f_I_27_;
    }

    /**
     * @param integer $_f_I_27_
     */
    public function set_F_I_27_($_f_I_27_)
    {
        $this->_f_I_27_ = $_f_I_27_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_27_;

    /**
     * @return Long
     */
    public function get_F_L_27_()
    {
        return $this->_f_L_27_;
    }

    /**
     * @param Long $_f_L_27_
     */
    public function set_F_L_27_($_f_L_27_)
    {
        $this->_f_L_27_ = $_f_L_27_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_27_;

    /**
     * @return Decimal
     */
    public function get_F_N_27_()
    {
        return $this->_f_N_27_;
    }

    /**
     * @param Decimal $_f_N_27_
     */
    public function set_F_N_27_($_f_N_27_)
    {
        $this->_f_N_27_ = $_f_N_27_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_27_;

    /**
     * @return string
     */
    public function get_F_C5_27_()
    {
        return $this->_f_C5_27_;
    }

    /**
     * @param string $_f_C5_27_
     */
    public function set_F_C5_27_($_f_C5_27_)
    {
        $this->_f_C5_27_ = $_f_C5_27_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_27_;

    /**
     * @return string
     */
    public function get_F_C10_27_()
    {
        return $this->_f_C10_27_;
    }

    /**
     * @param string $_f_C10_27_
     */
    public function set_F_C10_27_($_f_C10_27_)
    {
        $this->_f_C10_27_ = $_f_C10_27_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_27_;

    /**
     * @return string
     */
    public function get_F_C20_27_()
    {
        return $this->_f_C20_27_;
    }

    /**
     * @param string $_f_C20_27_
     */
    public function set_F_C20_27_($_f_C20_27_)
    {
        $this->_f_C20_27_ = $_f_C20_27_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_27_;

    /**
     * @return string
     */
    public function get_F_C50_27_()
    {
        return $this->_f_C50_27_;
    }

    /**
     * @param string $_f_C50_27_
     */
    public function set_F_C50_27_($_f_C50_27_)
    {
        $this->_f_C50_27_ = $_f_C50_27_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_28_;

    /**
     * @return boolean
     */
    public function get_F_B_28_()
    {
        return $this->_f_B_28_;
    }

    /**
     * @param boolean $_f_B_28_
     */
    public function set_F_B_28_($_f_B_28_)
    {
        $this->_f_B_28_ = $_f_B_28_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_28_;

    /**
     * @return integer
     */
    public function get_F_I_28_()
    {
        return $this->_f_I_28_;
    }

    /**
     * @param integer $_f_I_28_
     */
    public function set_F_I_28_($_f_I_28_)
    {
        $this->_f_I_28_ = $_f_I_28_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_28_;

    /**
     * @return Long
     */
    public function get_F_L_28_()
    {
        return $this->_f_L_28_;
    }

    /**
     * @param Long $_f_L_28_
     */
    public function set_F_L_28_($_f_L_28_)
    {
        $this->_f_L_28_ = $_f_L_28_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_28_;

    /**
     * @return Decimal
     */
    public function get_F_N_28_()
    {
        return $this->_f_N_28_;
    }

    /**
     * @param Decimal $_f_N_28_
     */
    public function set_F_N_28_($_f_N_28_)
    {
        $this->_f_N_28_ = $_f_N_28_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_28_;

    /**
     * @return string
     */
    public function get_F_C5_28_()
    {
        return $this->_f_C5_28_;
    }

    /**
     * @param string $_f_C5_28_
     */
    public function set_F_C5_28_($_f_C5_28_)
    {
        $this->_f_C5_28_ = $_f_C5_28_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_28_;

    /**
     * @return string
     */
    public function get_F_C10_28_()
    {
        return $this->_f_C10_28_;
    }

    /**
     * @param string $_f_C10_28_
     */
    public function set_F_C10_28_($_f_C10_28_)
    {
        $this->_f_C10_28_ = $_f_C10_28_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_28_;

    /**
     * @return string
     */
    public function get_F_C20_28_()
    {
        return $this->_f_C20_28_;
    }

    /**
     * @param string $_f_C20_28_
     */
    public function set_F_C20_28_($_f_C20_28_)
    {
        $this->_f_C20_28_ = $_f_C20_28_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_28_;

    /**
     * @return string
     */
    public function get_F_C50_28_()
    {
        return $this->_f_C50_28_;
    }

    /**
     * @param string $_f_C50_28_
     */
    public function set_F_C50_28_($_f_C50_28_)
    {
        $this->_f_C50_28_ = $_f_C50_28_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_29_;

    /**
     * @return boolean
     */
    public function get_F_B_29_()
    {
        return $this->_f_B_29_;
    }

    /**
     * @param boolean $_f_B_29_
     */
    public function set_F_B_29_($_f_B_29_)
    {
        $this->_f_B_29_ = $_f_B_29_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_29_;

    /**
     * @return integer
     */
    public function get_F_I_29_()
    {
        return $this->_f_I_29_;
    }

    /**
     * @param integer $_f_I_29_
     */
    public function set_F_I_29_($_f_I_29_)
    {
        $this->_f_I_29_ = $_f_I_29_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Long")
     */
    private $_f_L_29_;

    /**
     * @return Long
     */
    public function get_F_L_29_()
    {
        return $this->_f_L_29_;
    }

    /**
     * @param Long $_f_L_29_
     */
    public function set_F_L_29_($_f_L_29_)
    {
        $this->_f_L_29_ = $_f_L_29_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_29_;

    /**
     * @return Decimal
     */
    public function get_F_N_29_()
    {
        return $this->_f_N_29_;
    }

    /**
     * @param Decimal $_f_N_29_
     */
    public function set_F_N_29_($_f_N_29_)
    {
        $this->_f_N_29_ = $_f_N_29_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_29_;

    /**
     * @return string
     */
    public function get_F_C5_29_()
    {
        return $this->_f_C5_29_;
    }

    /**
     * @param string $_f_C5_29_
     */
    public function set_F_C5_29_($_f_C5_29_)
    {
        $this->_f_C5_29_ = $_f_C5_29_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_29_;

    /**
     * @return string
     */
    public function get_F_C10_29_()
    {
        return $this->_f_C10_29_;
    }

    /**
     * @param string $_f_C10_29_
     */
    public function set_F_C10_29_($_f_C10_29_)
    {
        $this->_f_C10_29_ = $_f_C10_29_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_29_;

    /**
     * @return string
     */
    public function get_F_C20_29_()
    {
        return $this->_f_C20_29_;
    }

    /**
     * @param string $_f_C20_29_
     */
    public function set_F_C20_29_($_f_C20_29_)
    {
        $this->_f_C20_29_ = $_f_C20_29_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_29_;

    /**
     * @return string
     */
    public function get_F_C50_29_()
    {
        return $this->_f_C50_29_;
    }

    /**
     * @param string $_f_C50_29_
     */
    public function set_F_C50_29_($_f_C50_29_)
    {
        $this->_f_C50_29_ = $_f_C50_29_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_30_;

    /**
     * @return boolean
     */
    public function get_F_B_30_()
    {
        return $this->_f_B_30_;
    }

    /**
     * @param boolean $_f_B_30_
     */
    public function set_F_B_30_($_f_B_30_)
    {
        $this->_f_B_30_ = $_f_B_30_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_30_;

    /**
     * @return integer
     */
    public function get_F_I_30_()
    {
        return $this->_f_I_30_;
    }

    /**
     * @param integer $_f_I_30_
     */
    public function set_F_I_30_($_f_I_30_)
    {
        $this->_f_I_30_ = $_f_I_30_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_30_;

    /**
     * @return Decimal
     */
    public function get_F_N_30_()
    {
        return $this->_f_N_30_;
    }

    /**
     * @param Decimal $_f_N_30_
     */
    public function set_F_N_30_($_f_N_30_)
    {
        $this->_f_N_30_ = $_f_N_30_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_30_;

    /**
     * @return string
     */
    public function get_F_C5_30_()
    {
        return $this->_f_C5_30_;
    }

    /**
     * @param string $_f_C5_30_
     */
    public function set_F_C5_30_($_f_C5_30_)
    {
        $this->_f_C5_30_ = $_f_C5_30_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_30_;

    /**
     * @return string
     */
    public function get_F_C10_30_()
    {
        return $this->_f_C10_30_;
    }

    /**
     * @param string $_f_C10_30_
     */
    public function set_F_C10_30_($_f_C10_30_)
    {
        $this->_f_C10_30_ = $_f_C10_30_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_30_;

    /**
     * @return string
     */
    public function get_F_C20_30_()
    {
        return $this->_f_C20_30_;
    }

    /**
     * @param string $_f_C20_30_
     */
    public function set_F_C20_30_($_f_C20_30_)
    {
        $this->_f_C20_30_ = $_f_C20_30_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_30_;

    /**
     * @return string
     */
    public function get_F_C50_30_()
    {
        return $this->_f_C50_30_;
    }

    /**
     * @param string $_f_C50_30_
     */
    public function set_F_C50_30_($_f_C50_30_)
    {
        $this->_f_C50_30_ = $_f_C50_30_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_31_;

    /**
     * @return boolean
     */
    public function get_F_B_31_()
    {
        return $this->_f_B_31_;
    }

    /**
     * @param boolean $_f_B_31_
     */
    public function set_F_B_31_($_f_B_31_)
    {
        $this->_f_B_31_ = $_f_B_31_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_31_;

    /**
     * @return integer
     */
    public function get_F_I_31_()
    {
        return $this->_f_I_31_;
    }

    /**
     * @param integer $_f_I_31_
     */
    public function set_F_I_31_($_f_I_31_)
    {
        $this->_f_I_31_ = $_f_I_31_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_31_;

    /**
     * @return Decimal
     */
    public function get_F_N_31_()
    {
        return $this->_f_N_31_;
    }

    /**
     * @param Decimal $_f_N_31_
     */
    public function set_F_N_31_($_f_N_31_)
    {
        $this->_f_N_31_ = $_f_N_31_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_31_;

    /**
     * @return string
     */
    public function get_F_C5_31_()
    {
        return $this->_f_C5_31_;
    }

    /**
     * @param string $_f_C5_31_
     */
    public function set_F_C5_31_($_f_C5_31_)
    {
        $this->_f_C5_31_ = $_f_C5_31_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_31_;

    /**
     * @return string
     */
    public function get_F_C10_31_()
    {
        return $this->_f_C10_31_;
    }

    /**
     * @param string $_f_C10_31_
     */
    public function set_F_C10_31_($_f_C10_31_)
    {
        $this->_f_C10_31_ = $_f_C10_31_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_31_;

    /**
     * @return string
     */
    public function get_F_C20_31_()
    {
        return $this->_f_C20_31_;
    }

    /**
     * @param string $_f_C20_31_
     */
    public function set_F_C20_31_($_f_C20_31_)
    {
        $this->_f_C20_31_ = $_f_C20_31_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_31_;

    /**
     * @return string
     */
    public function get_F_C50_31_()
    {
        return $this->_f_C50_31_;
    }

    /**
     * @param string $_f_C50_31_
     */
    public function set_F_C50_31_($_f_C50_31_)
    {
        $this->_f_C50_31_ = $_f_C50_31_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_32_;

    /**
     * @return boolean
     */
    public function get_F_B_32_()
    {
        return $this->_f_B_32_;
    }

    /**
     * @param boolean $_f_B_32_
     */
    public function set_F_B_32_($_f_B_32_)
    {
        $this->_f_B_32_ = $_f_B_32_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_32_;

    /**
     * @return integer
     */
    public function get_F_I_32_()
    {
        return $this->_f_I_32_;
    }

    /**
     * @param integer $_f_I_32_
     */
    public function set_F_I_32_($_f_I_32_)
    {
        $this->_f_I_32_ = $_f_I_32_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_32_;

    /**
     * @return Decimal
     */
    public function get_F_N_32_()
    {
        return $this->_f_N_32_;
    }

    /**
     * @param Decimal $_f_N_32_
     */
    public function set_F_N_32_($_f_N_32_)
    {
        $this->_f_N_32_ = $_f_N_32_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_32_;

    /**
     * @return string
     */
    public function get_F_C5_32_()
    {
        return $this->_f_C5_32_;
    }

    /**
     * @param string $_f_C5_32_
     */
    public function set_F_C5_32_($_f_C5_32_)
    {
        $this->_f_C5_32_ = $_f_C5_32_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_32_;

    /**
     * @return string
     */
    public function get_F_C10_32_()
    {
        return $this->_f_C10_32_;
    }

    /**
     * @param string $_f_C10_32_
     */
    public function set_F_C10_32_($_f_C10_32_)
    {
        $this->_f_C10_32_ = $_f_C10_32_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_32_;

    /**
     * @return string
     */
    public function get_F_C20_32_()
    {
        return $this->_f_C20_32_;
    }

    /**
     * @param string $_f_C20_32_
     */
    public function set_F_C20_32_($_f_C20_32_)
    {
        $this->_f_C20_32_ = $_f_C20_32_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_32_;

    /**
     * @return string
     */
    public function get_F_C50_32_()
    {
        return $this->_f_C50_32_;
    }

    /**
     * @param string $_f_C50_32_
     */
    public function set_F_C50_32_($_f_C50_32_)
    {
        $this->_f_C50_32_ = $_f_C50_32_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_33_;

    /**
     * @return boolean
     */
    public function get_F_B_33_()
    {
        return $this->_f_B_33_;
    }

    /**
     * @param boolean $_f_B_33_
     */
    public function set_F_B_33_($_f_B_33_)
    {
        $this->_f_B_33_ = $_f_B_33_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_33_;

    /**
     * @return integer
     */
    public function get_F_I_33_()
    {
        return $this->_f_I_33_;
    }

    /**
     * @param integer $_f_I_33_
     */
    public function set_F_I_33_($_f_I_33_)
    {
        $this->_f_I_33_ = $_f_I_33_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_33_;

    /**
     * @return Decimal
     */
    public function get_F_N_33_()
    {
        return $this->_f_N_33_;
    }

    /**
     * @param Decimal $_f_N_33_
     */
    public function set_F_N_33_($_f_N_33_)
    {
        $this->_f_N_33_ = $_f_N_33_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_33_;

    /**
     * @return string
     */
    public function get_F_C5_33_()
    {
        return $this->_f_C5_33_;
    }

    /**
     * @param string $_f_C5_33_
     */
    public function set_F_C5_33_($_f_C5_33_)
    {
        $this->_f_C5_33_ = $_f_C5_33_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_33_;

    /**
     * @return string
     */
    public function get_F_C10_33_()
    {
        return $this->_f_C10_33_;
    }

    /**
     * @param string $_f_C10_33_
     */
    public function set_F_C10_33_($_f_C10_33_)
    {
        $this->_f_C10_33_ = $_f_C10_33_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_33_;

    /**
     * @return string
     */
    public function get_F_C20_33_()
    {
        return $this->_f_C20_33_;
    }

    /**
     * @param string $_f_C20_33_
     */
    public function set_F_C20_33_($_f_C20_33_)
    {
        $this->_f_C20_33_ = $_f_C20_33_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_33_;

    /**
     * @return string
     */
    public function get_F_C50_33_()
    {
        return $this->_f_C50_33_;
    }

    /**
     * @param string $_f_C50_33_
     */
    public function set_F_C50_33_($_f_C50_33_)
    {
        $this->_f_C50_33_ = $_f_C50_33_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_34_;

    /**
     * @return boolean
     */
    public function get_F_B_34_()
    {
        return $this->_f_B_34_;
    }

    /**
     * @param boolean $_f_B_34_
     */
    public function set_F_B_34_($_f_B_34_)
    {
        $this->_f_B_34_ = $_f_B_34_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_34_;

    /**
     * @return integer
     */
    public function get_F_I_34_()
    {
        return $this->_f_I_34_;
    }

    /**
     * @param integer $_f_I_34_
     */
    public function set_F_I_34_($_f_I_34_)
    {
        $this->_f_I_34_ = $_f_I_34_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_34_;

    /**
     * @return Decimal
     */
    public function get_F_N_34_()
    {
        return $this->_f_N_34_;
    }

    /**
     * @param Decimal $_f_N_34_
     */
    public function set_F_N_34_($_f_N_34_)
    {
        $this->_f_N_34_ = $_f_N_34_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_34_;

    /**
     * @return string
     */
    public function get_F_C5_34_()
    {
        return $this->_f_C5_34_;
    }

    /**
     * @param string $_f_C5_34_
     */
    public function set_F_C5_34_($_f_C5_34_)
    {
        $this->_f_C5_34_ = $_f_C5_34_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_34_;

    /**
     * @return string
     */
    public function get_F_C10_34_()
    {
        return $this->_f_C10_34_;
    }

    /**
     * @param string $_f_C10_34_
     */
    public function set_F_C10_34_($_f_C10_34_)
    {
        $this->_f_C10_34_ = $_f_C10_34_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_34_;

    /**
     * @return string
     */
    public function get_F_C20_34_()
    {
        return $this->_f_C20_34_;
    }

    /**
     * @param string $_f_C20_34_
     */
    public function set_F_C20_34_($_f_C20_34_)
    {
        $this->_f_C20_34_ = $_f_C20_34_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_34_;

    /**
     * @return string
     */
    public function get_F_C50_34_()
    {
        return $this->_f_C50_34_;
    }

    /**
     * @param string $_f_C50_34_
     */
    public function set_F_C50_34_($_f_C50_34_)
    {
        $this->_f_C50_34_ = $_f_C50_34_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_35_;

    /**
     * @return boolean
     */
    public function get_F_B_35_()
    {
        return $this->_f_B_35_;
    }

    /**
     * @param boolean $_f_B_35_
     */
    public function set_F_B_35_($_f_B_35_)
    {
        $this->_f_B_35_ = $_f_B_35_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_35_;

    /**
     * @return integer
     */
    public function get_F_I_35_()
    {
        return $this->_f_I_35_;
    }

    /**
     * @param integer $_f_I_35_
     */
    public function set_F_I_35_($_f_I_35_)
    {
        $this->_f_I_35_ = $_f_I_35_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_35_;

    /**
     * @return Decimal
     */
    public function get_F_N_35_()
    {
        return $this->_f_N_35_;
    }

    /**
     * @param Decimal $_f_N_35_
     */
    public function set_F_N_35_($_f_N_35_)
    {
        $this->_f_N_35_ = $_f_N_35_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_35_;

    /**
     * @return string
     */
    public function get_F_C5_35_()
    {
        return $this->_f_C5_35_;
    }

    /**
     * @param string $_f_C5_35_
     */
    public function set_F_C5_35_($_f_C5_35_)
    {
        $this->_f_C5_35_ = $_f_C5_35_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_35_;

    /**
     * @return string
     */
    public function get_F_C10_35_()
    {
        return $this->_f_C10_35_;
    }

    /**
     * @param string $_f_C10_35_
     */
    public function set_F_C10_35_($_f_C10_35_)
    {
        $this->_f_C10_35_ = $_f_C10_35_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_35_;

    /**
     * @return string
     */
    public function get_F_C20_35_()
    {
        return $this->_f_C20_35_;
    }

    /**
     * @param string $_f_C20_35_
     */
    public function set_F_C20_35_($_f_C20_35_)
    {
        $this->_f_C20_35_ = $_f_C20_35_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_35_;

    /**
     * @return string
     */
    public function get_F_C50_35_()
    {
        return $this->_f_C50_35_;
    }

    /**
     * @param string $_f_C50_35_
     */
    public function set_F_C50_35_($_f_C50_35_)
    {
        $this->_f_C50_35_ = $_f_C50_35_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_36_;

    /**
     * @return boolean
     */
    public function get_F_B_36_()
    {
        return $this->_f_B_36_;
    }

    /**
     * @param boolean $_f_B_36_
     */
    public function set_F_B_36_($_f_B_36_)
    {
        $this->_f_B_36_ = $_f_B_36_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_36_;

    /**
     * @return integer
     */
    public function get_F_I_36_()
    {
        return $this->_f_I_36_;
    }

    /**
     * @param integer $_f_I_36_
     */
    public function set_F_I_36_($_f_I_36_)
    {
        $this->_f_I_36_ = $_f_I_36_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_36_;

    /**
     * @return Decimal
     */
    public function get_F_N_36_()
    {
        return $this->_f_N_36_;
    }

    /**
     * @param Decimal $_f_N_36_
     */
    public function set_F_N_36_($_f_N_36_)
    {
        $this->_f_N_36_ = $_f_N_36_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_36_;

    /**
     * @return string
     */
    public function get_F_C5_36_()
    {
        return $this->_f_C5_36_;
    }

    /**
     * @param string $_f_C5_36_
     */
    public function set_F_C5_36_($_f_C5_36_)
    {
        $this->_f_C5_36_ = $_f_C5_36_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_36_;

    /**
     * @return string
     */
    public function get_F_C10_36_()
    {
        return $this->_f_C10_36_;
    }

    /**
     * @param string $_f_C10_36_
     */
    public function set_F_C10_36_($_f_C10_36_)
    {
        $this->_f_C10_36_ = $_f_C10_36_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_36_;

    /**
     * @return string
     */
    public function get_F_C20_36_()
    {
        return $this->_f_C20_36_;
    }

    /**
     * @param string $_f_C20_36_
     */
    public function set_F_C20_36_($_f_C20_36_)
    {
        $this->_f_C20_36_ = $_f_C20_36_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_36_;

    /**
     * @return string
     */
    public function get_F_C50_36_()
    {
        return $this->_f_C50_36_;
    }

    /**
     * @param string $_f_C50_36_
     */
    public function set_F_C50_36_($_f_C50_36_)
    {
        $this->_f_C50_36_ = $_f_C50_36_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_37_;

    /**
     * @return boolean
     */
    public function get_F_B_37_()
    {
        return $this->_f_B_37_;
    }

    /**
     * @param boolean $_f_B_37_
     */
    public function set_F_B_37_($_f_B_37_)
    {
        $this->_f_B_37_ = $_f_B_37_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_37_;

    /**
     * @return integer
     */
    public function get_F_I_37_()
    {
        return $this->_f_I_37_;
    }

    /**
     * @param integer $_f_I_37_
     */
    public function set_F_I_37_($_f_I_37_)
    {
        $this->_f_I_37_ = $_f_I_37_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_37_;

    /**
     * @return Decimal
     */
    public function get_F_N_37_()
    {
        return $this->_f_N_37_;
    }

    /**
     * @param Decimal $_f_N_37_
     */
    public function set_F_N_37_($_f_N_37_)
    {
        $this->_f_N_37_ = $_f_N_37_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_37_;

    /**
     * @return string
     */
    public function get_F_C5_37_()
    {
        return $this->_f_C5_37_;
    }

    /**
     * @param string $_f_C5_37_
     */
    public function set_F_C5_37_($_f_C5_37_)
    {
        $this->_f_C5_37_ = $_f_C5_37_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_37_;

    /**
     * @return string
     */
    public function get_F_C10_37_()
    {
        return $this->_f_C10_37_;
    }

    /**
     * @param string $_f_C10_37_
     */
    public function set_F_C10_37_($_f_C10_37_)
    {
        $this->_f_C10_37_ = $_f_C10_37_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_37_;

    /**
     * @return string
     */
    public function get_F_C20_37_()
    {
        return $this->_f_C20_37_;
    }

    /**
     * @param string $_f_C20_37_
     */
    public function set_F_C20_37_($_f_C20_37_)
    {
        $this->_f_C20_37_ = $_f_C20_37_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_37_;

    /**
     * @return string
     */
    public function get_F_C50_37_()
    {
        return $this->_f_C50_37_;
    }

    /**
     * @param string $_f_C50_37_
     */
    public function set_F_C50_37_($_f_C50_37_)
    {
        $this->_f_C50_37_ = $_f_C50_37_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_38_;

    /**
     * @return boolean
     */
    public function get_F_B_38_()
    {
        return $this->_f_B_38_;
    }

    /**
     * @param boolean $_f_B_38_
     */
    public function set_F_B_38_($_f_B_38_)
    {
        $this->_f_B_38_ = $_f_B_38_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_38_;

    /**
     * @return integer
     */
    public function get_F_I_38_()
    {
        return $this->_f_I_38_;
    }

    /**
     * @param integer $_f_I_38_
     */
    public function set_F_I_38_($_f_I_38_)
    {
        $this->_f_I_38_ = $_f_I_38_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_38_;

    /**
     * @return Decimal
     */
    public function get_F_N_38_()
    {
        return $this->_f_N_38_;
    }

    /**
     * @param Decimal $_f_N_38_
     */
    public function set_F_N_38_($_f_N_38_)
    {
        $this->_f_N_38_ = $_f_N_38_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_38_;

    /**
     * @return string
     */
    public function get_F_C5_38_()
    {
        return $this->_f_C5_38_;
    }

    /**
     * @param string $_f_C5_38_
     */
    public function set_F_C5_38_($_f_C5_38_)
    {
        $this->_f_C5_38_ = $_f_C5_38_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_38_;

    /**
     * @return string
     */
    public function get_F_C10_38_()
    {
        return $this->_f_C10_38_;
    }

    /**
     * @param string $_f_C10_38_
     */
    public function set_F_C10_38_($_f_C10_38_)
    {
        $this->_f_C10_38_ = $_f_C10_38_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_38_;

    /**
     * @return string
     */
    public function get_F_C20_38_()
    {
        return $this->_f_C20_38_;
    }

    /**
     * @param string $_f_C20_38_
     */
    public function set_F_C20_38_($_f_C20_38_)
    {
        $this->_f_C20_38_ = $_f_C20_38_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_38_;

    /**
     * @return string
     */
    public function get_F_C50_38_()
    {
        return $this->_f_C50_38_;
    }

    /**
     * @param string $_f_C50_38_
     */
    public function set_F_C50_38_($_f_C50_38_)
    {
        $this->_f_C50_38_ = $_f_C50_38_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_39_;

    /**
     * @return boolean
     */
    public function get_F_B_39_()
    {
        return $this->_f_B_39_;
    }

    /**
     * @param boolean $_f_B_39_
     */
    public function set_F_B_39_($_f_B_39_)
    {
        $this->_f_B_39_ = $_f_B_39_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_39_;

    /**
     * @return integer
     */
    public function get_F_I_39_()
    {
        return $this->_f_I_39_;
    }

    /**
     * @param integer $_f_I_39_
     */
    public function set_F_I_39_($_f_I_39_)
    {
        $this->_f_I_39_ = $_f_I_39_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_39_;

    /**
     * @return Decimal
     */
    public function get_F_N_39_()
    {
        return $this->_f_N_39_;
    }

    /**
     * @param Decimal $_f_N_39_
     */
    public function set_F_N_39_($_f_N_39_)
    {
        $this->_f_N_39_ = $_f_N_39_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_39_;

    /**
     * @return string
     */
    public function get_F_C5_39_()
    {
        return $this->_f_C5_39_;
    }

    /**
     * @param string $_f_C5_39_
     */
    public function set_F_C5_39_($_f_C5_39_)
    {
        $this->_f_C5_39_ = $_f_C5_39_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_39_;

    /**
     * @return string
     */
    public function get_F_C10_39_()
    {
        return $this->_f_C10_39_;
    }

    /**
     * @param string $_f_C10_39_
     */
    public function set_F_C10_39_($_f_C10_39_)
    {
        $this->_f_C10_39_ = $_f_C10_39_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_39_;

    /**
     * @return string
     */
    public function get_F_C20_39_()
    {
        return $this->_f_C20_39_;
    }

    /**
     * @param string $_f_C20_39_
     */
    public function set_F_C20_39_($_f_C20_39_)
    {
        $this->_f_C20_39_ = $_f_C20_39_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_39_;

    /**
     * @return string
     */
    public function get_F_C50_39_()
    {
        return $this->_f_C50_39_;
    }

    /**
     * @param string $_f_C50_39_
     */
    public function set_F_C50_39_($_f_C50_39_)
    {
        $this->_f_C50_39_ = $_f_C50_39_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_40_;

    /**
     * @return boolean
     */
    public function get_F_B_40_()
    {
        return $this->_f_B_40_;
    }

    /**
     * @param boolean $_f_B_40_
     */
    public function set_F_B_40_($_f_B_40_)
    {
        $this->_f_B_40_ = $_f_B_40_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_40_;

    /**
     * @return integer
     */
    public function get_F_I_40_()
    {
        return $this->_f_I_40_;
    }

    /**
     * @param integer $_f_I_40_
     */
    public function set_F_I_40_($_f_I_40_)
    {
        $this->_f_I_40_ = $_f_I_40_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_40_;

    /**
     * @return Decimal
     */
    public function get_F_N_40_()
    {
        return $this->_f_N_40_;
    }

    /**
     * @param Decimal $_f_N_40_
     */
    public function set_F_N_40_($_f_N_40_)
    {
        $this->_f_N_40_ = $_f_N_40_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_40_;

    /**
     * @return string
     */
    public function get_F_C5_40_()
    {
        return $this->_f_C5_40_;
    }

    /**
     * @param string $_f_C5_40_
     */
    public function set_F_C5_40_($_f_C5_40_)
    {
        $this->_f_C5_40_ = $_f_C5_40_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_40_;

    /**
     * @return string
     */
    public function get_F_C10_40_()
    {
        return $this->_f_C10_40_;
    }

    /**
     * @param string $_f_C10_40_
     */
    public function set_F_C10_40_($_f_C10_40_)
    {
        $this->_f_C10_40_ = $_f_C10_40_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_40_;

    /**
     * @return string
     */
    public function get_F_C20_40_()
    {
        return $this->_f_C20_40_;
    }

    /**
     * @param string $_f_C20_40_
     */
    public function set_F_C20_40_($_f_C20_40_)
    {
        $this->_f_C20_40_ = $_f_C20_40_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_40_;

    /**
     * @return string
     */
    public function get_F_C50_40_()
    {
        return $this->_f_C50_40_;
    }

    /**
     * @param string $_f_C50_40_
     */
    public function set_F_C50_40_($_f_C50_40_)
    {
        $this->_f_C50_40_ = $_f_C50_40_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_41_;

    /**
     * @return boolean
     */
    public function get_F_B_41_()
    {
        return $this->_f_B_41_;
    }

    /**
     * @param boolean $_f_B_41_
     */
    public function set_F_B_41_($_f_B_41_)
    {
        $this->_f_B_41_ = $_f_B_41_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_41_;

    /**
     * @return integer
     */
    public function get_F_I_41_()
    {
        return $this->_f_I_41_;
    }

    /**
     * @param integer $_f_I_41_
     */
    public function set_F_I_41_($_f_I_41_)
    {
        $this->_f_I_41_ = $_f_I_41_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_41_;

    /**
     * @return Decimal
     */
    public function get_F_N_41_()
    {
        return $this->_f_N_41_;
    }

    /**
     * @param Decimal $_f_N_41_
     */
    public function set_F_N_41_($_f_N_41_)
    {
        $this->_f_N_41_ = $_f_N_41_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_41_;

    /**
     * @return string
     */
    public function get_F_C5_41_()
    {
        return $this->_f_C5_41_;
    }

    /**
     * @param string $_f_C5_41_
     */
    public function set_F_C5_41_($_f_C5_41_)
    {
        $this->_f_C5_41_ = $_f_C5_41_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_41_;

    /**
     * @return string
     */
    public function get_F_C10_41_()
    {
        return $this->_f_C10_41_;
    }

    /**
     * @param string $_f_C10_41_
     */
    public function set_F_C10_41_($_f_C10_41_)
    {
        $this->_f_C10_41_ = $_f_C10_41_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_41_;

    /**
     * @return string
     */
    public function get_F_C20_41_()
    {
        return $this->_f_C20_41_;
    }

    /**
     * @param string $_f_C20_41_
     */
    public function set_F_C20_41_($_f_C20_41_)
    {
        $this->_f_C20_41_ = $_f_C20_41_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_41_;

    /**
     * @return string
     */
    public function get_F_C50_41_()
    {
        return $this->_f_C50_41_;
    }

    /**
     * @param string $_f_C50_41_
     */
    public function set_F_C50_41_($_f_C50_41_)
    {
        $this->_f_C50_41_ = $_f_C50_41_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_42_;

    /**
     * @return boolean
     */
    public function get_F_B_42_()
    {
        return $this->_f_B_42_;
    }

    /**
     * @param boolean $_f_B_42_
     */
    public function set_F_B_42_($_f_B_42_)
    {
        $this->_f_B_42_ = $_f_B_42_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_42_;

    /**
     * @return integer
     */
    public function get_F_I_42_()
    {
        return $this->_f_I_42_;
    }

    /**
     * @param integer $_f_I_42_
     */
    public function set_F_I_42_($_f_I_42_)
    {
        $this->_f_I_42_ = $_f_I_42_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_42_;

    /**
     * @return Decimal
     */
    public function get_F_N_42_()
    {
        return $this->_f_N_42_;
    }

    /**
     * @param Decimal $_f_N_42_
     */
    public function set_F_N_42_($_f_N_42_)
    {
        $this->_f_N_42_ = $_f_N_42_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_42_;

    /**
     * @return string
     */
    public function get_F_C5_42_()
    {
        return $this->_f_C5_42_;
    }

    /**
     * @param string $_f_C5_42_
     */
    public function set_F_C5_42_($_f_C5_42_)
    {
        $this->_f_C5_42_ = $_f_C5_42_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_42_;

    /**
     * @return string
     */
    public function get_F_C10_42_()
    {
        return $this->_f_C10_42_;
    }

    /**
     * @param string $_f_C10_42_
     */
    public function set_F_C10_42_($_f_C10_42_)
    {
        $this->_f_C10_42_ = $_f_C10_42_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_42_;

    /**
     * @return string
     */
    public function get_F_C20_42_()
    {
        return $this->_f_C20_42_;
    }

    /**
     * @param string $_f_C20_42_
     */
    public function set_F_C20_42_($_f_C20_42_)
    {
        $this->_f_C20_42_ = $_f_C20_42_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_42_;

    /**
     * @return string
     */
    public function get_F_C50_42_()
    {
        return $this->_f_C50_42_;
    }

    /**
     * @param string $_f_C50_42_
     */
    public function set_F_C50_42_($_f_C50_42_)
    {
        $this->_f_C50_42_ = $_f_C50_42_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_43_;

    /**
     * @return boolean
     */
    public function get_F_B_43_()
    {
        return $this->_f_B_43_;
    }

    /**
     * @param boolean $_f_B_43_
     */
    public function set_F_B_43_($_f_B_43_)
    {
        $this->_f_B_43_ = $_f_B_43_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_43_;

    /**
     * @return integer
     */
    public function get_F_I_43_()
    {
        return $this->_f_I_43_;
    }

    /**
     * @param integer $_f_I_43_
     */
    public function set_F_I_43_($_f_I_43_)
    {
        $this->_f_I_43_ = $_f_I_43_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_43_;

    /**
     * @return Decimal
     */
    public function get_F_N_43_()
    {
        return $this->_f_N_43_;
    }

    /**
     * @param Decimal $_f_N_43_
     */
    public function set_F_N_43_($_f_N_43_)
    {
        $this->_f_N_43_ = $_f_N_43_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_43_;

    /**
     * @return string
     */
    public function get_F_C5_43_()
    {
        return $this->_f_C5_43_;
    }

    /**
     * @param string $_f_C5_43_
     */
    public function set_F_C5_43_($_f_C5_43_)
    {
        $this->_f_C5_43_ = $_f_C5_43_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_43_;

    /**
     * @return string
     */
    public function get_F_C10_43_()
    {
        return $this->_f_C10_43_;
    }

    /**
     * @param string $_f_C10_43_
     */
    public function set_F_C10_43_($_f_C10_43_)
    {
        $this->_f_C10_43_ = $_f_C10_43_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_43_;

    /**
     * @return string
     */
    public function get_F_C20_43_()
    {
        return $this->_f_C20_43_;
    }

    /**
     * @param string $_f_C20_43_
     */
    public function set_F_C20_43_($_f_C20_43_)
    {
        $this->_f_C20_43_ = $_f_C20_43_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_43_;

    /**
     * @return string
     */
    public function get_F_C50_43_()
    {
        return $this->_f_C50_43_;
    }

    /**
     * @param string $_f_C50_43_
     */
    public function set_F_C50_43_($_f_C50_43_)
    {
        $this->_f_C50_43_ = $_f_C50_43_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_44_;

    /**
     * @return boolean
     */
    public function get_F_B_44_()
    {
        return $this->_f_B_44_;
    }

    /**
     * @param boolean $_f_B_44_
     */
    public function set_F_B_44_($_f_B_44_)
    {
        $this->_f_B_44_ = $_f_B_44_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_44_;

    /**
     * @return integer
     */
    public function get_F_I_44_()
    {
        return $this->_f_I_44_;
    }

    /**
     * @param integer $_f_I_44_
     */
    public function set_F_I_44_($_f_I_44_)
    {
        $this->_f_I_44_ = $_f_I_44_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_44_;

    /**
     * @return Decimal
     */
    public function get_F_N_44_()
    {
        return $this->_f_N_44_;
    }

    /**
     * @param Decimal $_f_N_44_
     */
    public function set_F_N_44_($_f_N_44_)
    {
        $this->_f_N_44_ = $_f_N_44_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_44_;

    /**
     * @return string
     */
    public function get_F_C5_44_()
    {
        return $this->_f_C5_44_;
    }

    /**
     * @param string $_f_C5_44_
     */
    public function set_F_C5_44_($_f_C5_44_)
    {
        $this->_f_C5_44_ = $_f_C5_44_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_44_;

    /**
     * @return string
     */
    public function get_F_C10_44_()
    {
        return $this->_f_C10_44_;
    }

    /**
     * @param string $_f_C10_44_
     */
    public function set_F_C10_44_($_f_C10_44_)
    {
        $this->_f_C10_44_ = $_f_C10_44_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_44_;

    /**
     * @return string
     */
    public function get_F_C20_44_()
    {
        return $this->_f_C20_44_;
    }

    /**
     * @param string $_f_C20_44_
     */
    public function set_F_C20_44_($_f_C20_44_)
    {
        $this->_f_C20_44_ = $_f_C20_44_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_44_;

    /**
     * @return string
     */
    public function get_F_C50_44_()
    {
        return $this->_f_C50_44_;
    }

    /**
     * @param string $_f_C50_44_
     */
    public function set_F_C50_44_($_f_C50_44_)
    {
        $this->_f_C50_44_ = $_f_C50_44_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_45_;

    /**
     * @return boolean
     */
    public function get_F_B_45_()
    {
        return $this->_f_B_45_;
    }

    /**
     * @param boolean $_f_B_45_
     */
    public function set_F_B_45_($_f_B_45_)
    {
        $this->_f_B_45_ = $_f_B_45_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_45_;

    /**
     * @return integer
     */
    public function get_F_I_45_()
    {
        return $this->_f_I_45_;
    }

    /**
     * @param integer $_f_I_45_
     */
    public function set_F_I_45_($_f_I_45_)
    {
        $this->_f_I_45_ = $_f_I_45_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_45_;

    /**
     * @return Decimal
     */
    public function get_F_N_45_()
    {
        return $this->_f_N_45_;
    }

    /**
     * @param Decimal $_f_N_45_
     */
    public function set_F_N_45_($_f_N_45_)
    {
        $this->_f_N_45_ = $_f_N_45_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_45_;

    /**
     * @return string
     */
    public function get_F_C5_45_()
    {
        return $this->_f_C5_45_;
    }

    /**
     * @param string $_f_C5_45_
     */
    public function set_F_C5_45_($_f_C5_45_)
    {
        $this->_f_C5_45_ = $_f_C5_45_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_45_;

    /**
     * @return string
     */
    public function get_F_C10_45_()
    {
        return $this->_f_C10_45_;
    }

    /**
     * @param string $_f_C10_45_
     */
    public function set_F_C10_45_($_f_C10_45_)
    {
        $this->_f_C10_45_ = $_f_C10_45_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_45_;

    /**
     * @return string
     */
    public function get_F_C20_45_()
    {
        return $this->_f_C20_45_;
    }

    /**
     * @param string $_f_C20_45_
     */
    public function set_F_C20_45_($_f_C20_45_)
    {
        $this->_f_C20_45_ = $_f_C20_45_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_45_;

    /**
     * @return string
     */
    public function get_F_C50_45_()
    {
        return $this->_f_C50_45_;
    }

    /**
     * @param string $_f_C50_45_
     */
    public function set_F_C50_45_($_f_C50_45_)
    {
        $this->_f_C50_45_ = $_f_C50_45_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_46_;

    /**
     * @return boolean
     */
    public function get_F_B_46_()
    {
        return $this->_f_B_46_;
    }

    /**
     * @param boolean $_f_B_46_
     */
    public function set_F_B_46_($_f_B_46_)
    {
        $this->_f_B_46_ = $_f_B_46_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_46_;

    /**
     * @return integer
     */
    public function get_F_I_46_()
    {
        return $this->_f_I_46_;
    }

    /**
     * @param integer $_f_I_46_
     */
    public function set_F_I_46_($_f_I_46_)
    {
        $this->_f_I_46_ = $_f_I_46_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_46_;

    /**
     * @return Decimal
     */
    public function get_F_N_46_()
    {
        return $this->_f_N_46_;
    }

    /**
     * @param Decimal $_f_N_46_
     */
    public function set_F_N_46_($_f_N_46_)
    {
        $this->_f_N_46_ = $_f_N_46_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_46_;

    /**
     * @return string
     */
    public function get_F_C5_46_()
    {
        return $this->_f_C5_46_;
    }

    /**
     * @param string $_f_C5_46_
     */
    public function set_F_C5_46_($_f_C5_46_)
    {
        $this->_f_C5_46_ = $_f_C5_46_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_46_;

    /**
     * @return string
     */
    public function get_F_C10_46_()
    {
        return $this->_f_C10_46_;
    }

    /**
     * @param string $_f_C10_46_
     */
    public function set_F_C10_46_($_f_C10_46_)
    {
        $this->_f_C10_46_ = $_f_C10_46_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_46_;

    /**
     * @return string
     */
    public function get_F_C20_46_()
    {
        return $this->_f_C20_46_;
    }

    /**
     * @param string $_f_C20_46_
     */
    public function set_F_C20_46_($_f_C20_46_)
    {
        $this->_f_C20_46_ = $_f_C20_46_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_46_;

    /**
     * @return string
     */
    public function get_F_C50_46_()
    {
        return $this->_f_C50_46_;
    }

    /**
     * @param string $_f_C50_46_
     */
    public function set_F_C50_46_($_f_C50_46_)
    {
        $this->_f_C50_46_ = $_f_C50_46_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_47_;

    /**
     * @return boolean
     */
    public function get_F_B_47_()
    {
        return $this->_f_B_47_;
    }

    /**
     * @param boolean $_f_B_47_
     */
    public function set_F_B_47_($_f_B_47_)
    {
        $this->_f_B_47_ = $_f_B_47_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_47_;

    /**
     * @return integer
     */
    public function get_F_I_47_()
    {
        return $this->_f_I_47_;
    }

    /**
     * @param integer $_f_I_47_
     */
    public function set_F_I_47_($_f_I_47_)
    {
        $this->_f_I_47_ = $_f_I_47_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_47_;

    /**
     * @return Decimal
     */
    public function get_F_N_47_()
    {
        return $this->_f_N_47_;
    }

    /**
     * @param Decimal $_f_N_47_
     */
    public function set_F_N_47_($_f_N_47_)
    {
        $this->_f_N_47_ = $_f_N_47_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_47_;

    /**
     * @return string
     */
    public function get_F_C5_47_()
    {
        return $this->_f_C5_47_;
    }

    /**
     * @param string $_f_C5_47_
     */
    public function set_F_C5_47_($_f_C5_47_)
    {
        $this->_f_C5_47_ = $_f_C5_47_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_47_;

    /**
     * @return string
     */
    public function get_F_C10_47_()
    {
        return $this->_f_C10_47_;
    }

    /**
     * @param string $_f_C10_47_
     */
    public function set_F_C10_47_($_f_C10_47_)
    {
        $this->_f_C10_47_ = $_f_C10_47_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_47_;

    /**
     * @return string
     */
    public function get_F_C20_47_()
    {
        return $this->_f_C20_47_;
    }

    /**
     * @param string $_f_C20_47_
     */
    public function set_F_C20_47_($_f_C20_47_)
    {
        $this->_f_C20_47_ = $_f_C20_47_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_47_;

    /**
     * @return string
     */
    public function get_F_C50_47_()
    {
        return $this->_f_C50_47_;
    }

    /**
     * @param string $_f_C50_47_
     */
    public function set_F_C50_47_($_f_C50_47_)
    {
        $this->_f_C50_47_ = $_f_C50_47_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_48_;

    /**
     * @return boolean
     */
    public function get_F_B_48_()
    {
        return $this->_f_B_48_;
    }

    /**
     * @param boolean $_f_B_48_
     */
    public function set_F_B_48_($_f_B_48_)
    {
        $this->_f_B_48_ = $_f_B_48_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_48_;

    /**
     * @return integer
     */
    public function get_F_I_48_()
    {
        return $this->_f_I_48_;
    }

    /**
     * @param integer $_f_I_48_
     */
    public function set_F_I_48_($_f_I_48_)
    {
        $this->_f_I_48_ = $_f_I_48_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_48_;

    /**
     * @return Decimal
     */
    public function get_F_N_48_()
    {
        return $this->_f_N_48_;
    }

    /**
     * @param Decimal $_f_N_48_
     */
    public function set_F_N_48_($_f_N_48_)
    {
        $this->_f_N_48_ = $_f_N_48_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_48_;

    /**
     * @return string
     */
    public function get_F_C5_48_()
    {
        return $this->_f_C5_48_;
    }

    /**
     * @param string $_f_C5_48_
     */
    public function set_F_C5_48_($_f_C5_48_)
    {
        $this->_f_C5_48_ = $_f_C5_48_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_48_;

    /**
     * @return string
     */
    public function get_F_C10_48_()
    {
        return $this->_f_C10_48_;
    }

    /**
     * @param string $_f_C10_48_
     */
    public function set_F_C10_48_($_f_C10_48_)
    {
        $this->_f_C10_48_ = $_f_C10_48_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_48_;

    /**
     * @return string
     */
    public function get_F_C20_48_()
    {
        return $this->_f_C20_48_;
    }

    /**
     * @param string $_f_C20_48_
     */
    public function set_F_C20_48_($_f_C20_48_)
    {
        $this->_f_C20_48_ = $_f_C20_48_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_48_;

    /**
     * @return string
     */
    public function get_F_C50_48_()
    {
        return $this->_f_C50_48_;
    }

    /**
     * @param string $_f_C50_48_
     */
    public function set_F_C50_48_($_f_C50_48_)
    {
        $this->_f_C50_48_ = $_f_C50_48_;
    }

    /**
     * @Type("boolean")
     */
    private $_f_B_49_;

    /**
     * @return boolean
     */
    public function get_F_B_49_()
    {
        return $this->_f_B_49_;
    }

    /**
     * @param boolean $_f_B_49_
     */
    public function set_F_B_49_($_f_B_49_)
    {
        $this->_f_B_49_ = $_f_B_49_;
    }

    /**
     * @Type("integer")
     */
    private $_f_I_49_;

    /**
     * @return integer
     */
    public function get_F_I_49_()
    {
        return $this->_f_I_49_;
    }

    /**
     * @param integer $_f_I_49_
     */
    public function set_F_I_49_($_f_I_49_)
    {
        $this->_f_I_49_ = $_f_I_49_;
    }

    /**
     * @Type("Dddml\Serializer\Type\Decimal")
     */
    private $_f_N_49_;

    /**
     * @return Decimal
     */
    public function get_F_N_49_()
    {
        return $this->_f_N_49_;
    }

    /**
     * @param Decimal $_f_N_49_
     */
    public function set_F_N_49_($_f_N_49_)
    {
        $this->_f_N_49_ = $_f_N_49_;
    }

    /**
     * @Type("string")
     */
    private $_f_C5_49_;

    /**
     * @return string
     */
    public function get_F_C5_49_()
    {
        return $this->_f_C5_49_;
    }

    /**
     * @param string $_f_C5_49_
     */
    public function set_F_C5_49_($_f_C5_49_)
    {
        $this->_f_C5_49_ = $_f_C5_49_;
    }

    /**
     * @Type("string")
     */
    private $_f_C10_49_;

    /**
     * @return string
     */
    public function get_F_C10_49_()
    {
        return $this->_f_C10_49_;
    }

    /**
     * @param string $_f_C10_49_
     */
    public function set_F_C10_49_($_f_C10_49_)
    {
        $this->_f_C10_49_ = $_f_C10_49_;
    }

    /**
     * @Type("string")
     */
    private $_f_C20_49_;

    /**
     * @return string
     */
    public function get_F_C20_49_()
    {
        return $this->_f_C20_49_;
    }

    /**
     * @param string $_f_C20_49_
     */
    public function set_F_C20_49_($_f_C20_49_)
    {
        $this->_f_C20_49_ = $_f_C20_49_;
    }

    /**
     * @Type("string")
     */
    private $_f_C50_49_;

    /**
     * @return string
     */
    public function get_F_C50_49_()
    {
        return $this->_f_C50_49_;
    }

    /**
     * @param string $_f_C50_49_
     */
    public function set_F_C50_49_($_f_C50_49_)
    {
        $this->_f_C50_49_ = $_f_C50_49_;
    }

    /**
     * @Type("boolean")
     */
    private $active;

    /**
     * @return boolean
     */
    public function getActive()
    {
        return $this->active;
    }

    /**
     * @param boolean $active
     */
    public function setActive($active)
    {
        $this->active = $active;
    }


}

