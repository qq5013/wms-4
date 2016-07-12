<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;


trait AttributeSetInstanceStatePropertiesTrait
{

    /**
     * @Type("string")
     */
    private $attributeSetInstanceId;

    /**
     * @return string
     */
    public function getAttributeSetInstanceId()
    {
        return $this->attributeSetInstanceId;
    }

    /**
     * @param string $attributeSetInstanceId
     */
    public function setAttributeSetInstanceId($attributeSetInstanceId)
    {
        $this->attributeSetInstanceId = $attributeSetInstanceId;
    }

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
    private $fB0;

    /**
     * @return boolean
     */
    public function getFB0()
    {
        return $this->fB0;
    }

    /**
     * @param boolean $fB0
     */
    public function setFB0($fB0)
    {
        $this->fB0 = $fB0;
    }

    /**
     * @Type("integer")
     */
    private $fI0;

    /**
     * @return integer
     */
    public function getFI0()
    {
        return $this->fI0;
    }

    /**
     * @param integer $fI0
     */
    public function setFI0($fI0)
    {
        $this->fI0 = $fI0;
    }

    /**
     * @Type("long")
     */
    private $fL0;

    /**
     * @return long
     */
    public function getFL0()
    {
        return $this->fL0;
    }

    /**
     * @param long $fL0
     */
    public function setFL0($fL0)
    {
        $this->fL0 = $fL0;
    }

    /**
     * @Type("\DateTime")
     */
    private $fDt0;

    /**
     * @return \DateTime
     */
    public function getFDt0()
    {
        return $this->fDt0;
    }

    /**
     * @param \DateTime $fDt0
     */
    public function setFDt0($fDt0)
    {
        $this->fDt0 = $fDt0;
    }

    /**
     * @Type("decimal")
     */
    private $fN0;

    /**
     * @return decimal
     */
    public function getFN0()
    {
        return $this->fN0;
    }

    /**
     * @param decimal $fN0
     */
    public function setFN0($fN0)
    {
        $this->fN0 = $fN0;
    }

    /**
     * @Type("string")
     */
    private $fC50;

    /**
     * @return string
     */
    public function getFC50()
    {
        return $this->fC50;
    }

    /**
     * @param string $fC50
     */
    public function setFC50($fC50)
    {
        $this->fC50 = $fC50;
    }

    /**
     * @Type("string")
     */
    private $fC100;

    /**
     * @return string
     */
    public function getFC100()
    {
        return $this->fC100;
    }

    /**
     * @param string $fC100
     */
    public function setFC100($fC100)
    {
        $this->fC100 = $fC100;
    }

    /**
     * @Type("string")
     */
    private $fC200;

    /**
     * @return string
     */
    public function getFC200()
    {
        return $this->fC200;
    }

    /**
     * @param string $fC200
     */
    public function setFC200($fC200)
    {
        $this->fC200 = $fC200;
    }

    /**
     * @Type("string")
     */
    private $fC500;

    /**
     * @return string
     */
    public function getFC500()
    {
        return $this->fC500;
    }

    /**
     * @param string $fC500
     */
    public function setFC500($fC500)
    {
        $this->fC500 = $fC500;
    }

    /**
     * @Type("string")
     */
    private $fC1000;

    /**
     * @return string
     */
    public function getFC1000()
    {
        return $this->fC1000;
    }

    /**
     * @param string $fC1000
     */
    public function setFC1000($fC1000)
    {
        $this->fC1000 = $fC1000;
    }

    /**
     * @Type("string")
     */
    private $fC2000;

    /**
     * @return string
     */
    public function getFC2000()
    {
        return $this->fC2000;
    }

    /**
     * @param string $fC2000
     */
    public function setFC2000($fC2000)
    {
        $this->fC2000 = $fC2000;
    }

    /**
     * @Type("string")
     */
    private $fC5000;

    /**
     * @return string
     */
    public function getFC5000()
    {
        return $this->fC5000;
    }

    /**
     * @param string $fC5000
     */
    public function setFC5000($fC5000)
    {
        $this->fC5000 = $fC5000;
    }

    /**
     * @Type("string")
     */
    private $fC10000;

    /**
     * @return string
     */
    public function getFC10000()
    {
        return $this->fC10000;
    }

    /**
     * @param string $fC10000
     */
    public function setFC10000($fC10000)
    {
        $this->fC10000 = $fC10000;
    }

    /**
     * @Type("boolean")
     */
    private $fB1;

    /**
     * @return boolean
     */
    public function getFB1()
    {
        return $this->fB1;
    }

    /**
     * @param boolean $fB1
     */
    public function setFB1($fB1)
    {
        $this->fB1 = $fB1;
    }

    /**
     * @Type("integer")
     */
    private $fI1;

    /**
     * @return integer
     */
    public function getFI1()
    {
        return $this->fI1;
    }

    /**
     * @param integer $fI1
     */
    public function setFI1($fI1)
    {
        $this->fI1 = $fI1;
    }

    /**
     * @Type("long")
     */
    private $fL1;

    /**
     * @return long
     */
    public function getFL1()
    {
        return $this->fL1;
    }

    /**
     * @param long $fL1
     */
    public function setFL1($fL1)
    {
        $this->fL1 = $fL1;
    }

    /**
     * @Type("\DateTime")
     */
    private $fDt1;

    /**
     * @return \DateTime
     */
    public function getFDt1()
    {
        return $this->fDt1;
    }

    /**
     * @param \DateTime $fDt1
     */
    public function setFDt1($fDt1)
    {
        $this->fDt1 = $fDt1;
    }

    /**
     * @Type("decimal")
     */
    private $fN1;

    /**
     * @return decimal
     */
    public function getFN1()
    {
        return $this->fN1;
    }

    /**
     * @param decimal $fN1
     */
    public function setFN1($fN1)
    {
        $this->fN1 = $fN1;
    }

    /**
     * @Type("string")
     */
    private $fC51;

    /**
     * @return string
     */
    public function getFC51()
    {
        return $this->fC51;
    }

    /**
     * @param string $fC51
     */
    public function setFC51($fC51)
    {
        $this->fC51 = $fC51;
    }

    /**
     * @Type("string")
     */
    private $fC101;

    /**
     * @return string
     */
    public function getFC101()
    {
        return $this->fC101;
    }

    /**
     * @param string $fC101
     */
    public function setFC101($fC101)
    {
        $this->fC101 = $fC101;
    }

    /**
     * @Type("string")
     */
    private $fC201;

    /**
     * @return string
     */
    public function getFC201()
    {
        return $this->fC201;
    }

    /**
     * @param string $fC201
     */
    public function setFC201($fC201)
    {
        $this->fC201 = $fC201;
    }

    /**
     * @Type("string")
     */
    private $fC501;

    /**
     * @return string
     */
    public function getFC501()
    {
        return $this->fC501;
    }

    /**
     * @param string $fC501
     */
    public function setFC501($fC501)
    {
        $this->fC501 = $fC501;
    }

    /**
     * @Type("string")
     */
    private $fC1001;

    /**
     * @return string
     */
    public function getFC1001()
    {
        return $this->fC1001;
    }

    /**
     * @param string $fC1001
     */
    public function setFC1001($fC1001)
    {
        $this->fC1001 = $fC1001;
    }

    /**
     * @Type("string")
     */
    private $fC2001;

    /**
     * @return string
     */
    public function getFC2001()
    {
        return $this->fC2001;
    }

    /**
     * @param string $fC2001
     */
    public function setFC2001($fC2001)
    {
        $this->fC2001 = $fC2001;
    }

    /**
     * @Type("string")
     */
    private $fC5001;

    /**
     * @return string
     */
    public function getFC5001()
    {
        return $this->fC5001;
    }

    /**
     * @param string $fC5001
     */
    public function setFC5001($fC5001)
    {
        $this->fC5001 = $fC5001;
    }

    /**
     * @Type("string")
     */
    private $fC10001;

    /**
     * @return string
     */
    public function getFC10001()
    {
        return $this->fC10001;
    }

    /**
     * @param string $fC10001
     */
    public function setFC10001($fC10001)
    {
        $this->fC10001 = $fC10001;
    }

    /**
     * @Type("boolean")
     */
    private $fB2;

    /**
     * @return boolean
     */
    public function getFB2()
    {
        return $this->fB2;
    }

    /**
     * @param boolean $fB2
     */
    public function setFB2($fB2)
    {
        $this->fB2 = $fB2;
    }

    /**
     * @Type("integer")
     */
    private $fI2;

    /**
     * @return integer
     */
    public function getFI2()
    {
        return $this->fI2;
    }

    /**
     * @param integer $fI2
     */
    public function setFI2($fI2)
    {
        $this->fI2 = $fI2;
    }

    /**
     * @Type("long")
     */
    private $fL2;

    /**
     * @return long
     */
    public function getFL2()
    {
        return $this->fL2;
    }

    /**
     * @param long $fL2
     */
    public function setFL2($fL2)
    {
        $this->fL2 = $fL2;
    }

    /**
     * @Type("\DateTime")
     */
    private $fDt2;

    /**
     * @return \DateTime
     */
    public function getFDt2()
    {
        return $this->fDt2;
    }

    /**
     * @param \DateTime $fDt2
     */
    public function setFDt2($fDt2)
    {
        $this->fDt2 = $fDt2;
    }

    /**
     * @Type("decimal")
     */
    private $fN2;

    /**
     * @return decimal
     */
    public function getFN2()
    {
        return $this->fN2;
    }

    /**
     * @param decimal $fN2
     */
    public function setFN2($fN2)
    {
        $this->fN2 = $fN2;
    }

    /**
     * @Type("string")
     */
    private $fC52;

    /**
     * @return string
     */
    public function getFC52()
    {
        return $this->fC52;
    }

    /**
     * @param string $fC52
     */
    public function setFC52($fC52)
    {
        $this->fC52 = $fC52;
    }

    /**
     * @Type("string")
     */
    private $fC102;

    /**
     * @return string
     */
    public function getFC102()
    {
        return $this->fC102;
    }

    /**
     * @param string $fC102
     */
    public function setFC102($fC102)
    {
        $this->fC102 = $fC102;
    }

    /**
     * @Type("string")
     */
    private $fC202;

    /**
     * @return string
     */
    public function getFC202()
    {
        return $this->fC202;
    }

    /**
     * @param string $fC202
     */
    public function setFC202($fC202)
    {
        $this->fC202 = $fC202;
    }

    /**
     * @Type("string")
     */
    private $fC502;

    /**
     * @return string
     */
    public function getFC502()
    {
        return $this->fC502;
    }

    /**
     * @param string $fC502
     */
    public function setFC502($fC502)
    {
        $this->fC502 = $fC502;
    }

    /**
     * @Type("string")
     */
    private $fC1002;

    /**
     * @return string
     */
    public function getFC1002()
    {
        return $this->fC1002;
    }

    /**
     * @param string $fC1002
     */
    public function setFC1002($fC1002)
    {
        $this->fC1002 = $fC1002;
    }

    /**
     * @Type("string")
     */
    private $fC2002;

    /**
     * @return string
     */
    public function getFC2002()
    {
        return $this->fC2002;
    }

    /**
     * @param string $fC2002
     */
    public function setFC2002($fC2002)
    {
        $this->fC2002 = $fC2002;
    }

    /**
     * @Type("string")
     */
    private $fC5002;

    /**
     * @return string
     */
    public function getFC5002()
    {
        return $this->fC5002;
    }

    /**
     * @param string $fC5002
     */
    public function setFC5002($fC5002)
    {
        $this->fC5002 = $fC5002;
    }

    /**
     * @Type("string")
     */
    private $fC10002;

    /**
     * @return string
     */
    public function getFC10002()
    {
        return $this->fC10002;
    }

    /**
     * @param string $fC10002
     */
    public function setFC10002($fC10002)
    {
        $this->fC10002 = $fC10002;
    }

    /**
     * @Type("boolean")
     */
    private $fB3;

    /**
     * @return boolean
     */
    public function getFB3()
    {
        return $this->fB3;
    }

    /**
     * @param boolean $fB3
     */
    public function setFB3($fB3)
    {
        $this->fB3 = $fB3;
    }

    /**
     * @Type("integer")
     */
    private $fI3;

    /**
     * @return integer
     */
    public function getFI3()
    {
        return $this->fI3;
    }

    /**
     * @param integer $fI3
     */
    public function setFI3($fI3)
    {
        $this->fI3 = $fI3;
    }

    /**
     * @Type("long")
     */
    private $fL3;

    /**
     * @return long
     */
    public function getFL3()
    {
        return $this->fL3;
    }

    /**
     * @param long $fL3
     */
    public function setFL3($fL3)
    {
        $this->fL3 = $fL3;
    }

    /**
     * @Type("\DateTime")
     */
    private $fDt3;

    /**
     * @return \DateTime
     */
    public function getFDt3()
    {
        return $this->fDt3;
    }

    /**
     * @param \DateTime $fDt3
     */
    public function setFDt3($fDt3)
    {
        $this->fDt3 = $fDt3;
    }

    /**
     * @Type("decimal")
     */
    private $fN3;

    /**
     * @return decimal
     */
    public function getFN3()
    {
        return $this->fN3;
    }

    /**
     * @param decimal $fN3
     */
    public function setFN3($fN3)
    {
        $this->fN3 = $fN3;
    }

    /**
     * @Type("string")
     */
    private $fC53;

    /**
     * @return string
     */
    public function getFC53()
    {
        return $this->fC53;
    }

    /**
     * @param string $fC53
     */
    public function setFC53($fC53)
    {
        $this->fC53 = $fC53;
    }

    /**
     * @Type("string")
     */
    private $fC103;

    /**
     * @return string
     */
    public function getFC103()
    {
        return $this->fC103;
    }

    /**
     * @param string $fC103
     */
    public function setFC103($fC103)
    {
        $this->fC103 = $fC103;
    }

    /**
     * @Type("string")
     */
    private $fC203;

    /**
     * @return string
     */
    public function getFC203()
    {
        return $this->fC203;
    }

    /**
     * @param string $fC203
     */
    public function setFC203($fC203)
    {
        $this->fC203 = $fC203;
    }

    /**
     * @Type("string")
     */
    private $fC503;

    /**
     * @return string
     */
    public function getFC503()
    {
        return $this->fC503;
    }

    /**
     * @param string $fC503
     */
    public function setFC503($fC503)
    {
        $this->fC503 = $fC503;
    }

    /**
     * @Type("string")
     */
    private $fC1003;

    /**
     * @return string
     */
    public function getFC1003()
    {
        return $this->fC1003;
    }

    /**
     * @param string $fC1003
     */
    public function setFC1003($fC1003)
    {
        $this->fC1003 = $fC1003;
    }

    /**
     * @Type("string")
     */
    private $fC2003;

    /**
     * @return string
     */
    public function getFC2003()
    {
        return $this->fC2003;
    }

    /**
     * @param string $fC2003
     */
    public function setFC2003($fC2003)
    {
        $this->fC2003 = $fC2003;
    }

    /**
     * @Type("string")
     */
    private $fC5003;

    /**
     * @return string
     */
    public function getFC5003()
    {
        return $this->fC5003;
    }

    /**
     * @param string $fC5003
     */
    public function setFC5003($fC5003)
    {
        $this->fC5003 = $fC5003;
    }

    /**
     * @Type("string")
     */
    private $fC10003;

    /**
     * @return string
     */
    public function getFC10003()
    {
        return $this->fC10003;
    }

    /**
     * @param string $fC10003
     */
    public function setFC10003($fC10003)
    {
        $this->fC10003 = $fC10003;
    }

    /**
     * @Type("boolean")
     */
    private $fB4;

    /**
     * @return boolean
     */
    public function getFB4()
    {
        return $this->fB4;
    }

    /**
     * @param boolean $fB4
     */
    public function setFB4($fB4)
    {
        $this->fB4 = $fB4;
    }

    /**
     * @Type("integer")
     */
    private $fI4;

    /**
     * @return integer
     */
    public function getFI4()
    {
        return $this->fI4;
    }

    /**
     * @param integer $fI4
     */
    public function setFI4($fI4)
    {
        $this->fI4 = $fI4;
    }

    /**
     * @Type("long")
     */
    private $fL4;

    /**
     * @return long
     */
    public function getFL4()
    {
        return $this->fL4;
    }

    /**
     * @param long $fL4
     */
    public function setFL4($fL4)
    {
        $this->fL4 = $fL4;
    }

    /**
     * @Type("\DateTime")
     */
    private $fDt4;

    /**
     * @return \DateTime
     */
    public function getFDt4()
    {
        return $this->fDt4;
    }

    /**
     * @param \DateTime $fDt4
     */
    public function setFDt4($fDt4)
    {
        $this->fDt4 = $fDt4;
    }

    /**
     * @Type("decimal")
     */
    private $fN4;

    /**
     * @return decimal
     */
    public function getFN4()
    {
        return $this->fN4;
    }

    /**
     * @param decimal $fN4
     */
    public function setFN4($fN4)
    {
        $this->fN4 = $fN4;
    }

    /**
     * @Type("string")
     */
    private $fC54;

    /**
     * @return string
     */
    public function getFC54()
    {
        return $this->fC54;
    }

    /**
     * @param string $fC54
     */
    public function setFC54($fC54)
    {
        $this->fC54 = $fC54;
    }

    /**
     * @Type("string")
     */
    private $fC104;

    /**
     * @return string
     */
    public function getFC104()
    {
        return $this->fC104;
    }

    /**
     * @param string $fC104
     */
    public function setFC104($fC104)
    {
        $this->fC104 = $fC104;
    }

    /**
     * @Type("string")
     */
    private $fC204;

    /**
     * @return string
     */
    public function getFC204()
    {
        return $this->fC204;
    }

    /**
     * @param string $fC204
     */
    public function setFC204($fC204)
    {
        $this->fC204 = $fC204;
    }

    /**
     * @Type("string")
     */
    private $fC504;

    /**
     * @return string
     */
    public function getFC504()
    {
        return $this->fC504;
    }

    /**
     * @param string $fC504
     */
    public function setFC504($fC504)
    {
        $this->fC504 = $fC504;
    }

    /**
     * @Type("string")
     */
    private $fC1004;

    /**
     * @return string
     */
    public function getFC1004()
    {
        return $this->fC1004;
    }

    /**
     * @param string $fC1004
     */
    public function setFC1004($fC1004)
    {
        $this->fC1004 = $fC1004;
    }

    /**
     * @Type("string")
     */
    private $fC2004;

    /**
     * @return string
     */
    public function getFC2004()
    {
        return $this->fC2004;
    }

    /**
     * @param string $fC2004
     */
    public function setFC2004($fC2004)
    {
        $this->fC2004 = $fC2004;
    }

    /**
     * @Type("string")
     */
    private $fC5004;

    /**
     * @return string
     */
    public function getFC5004()
    {
        return $this->fC5004;
    }

    /**
     * @param string $fC5004
     */
    public function setFC5004($fC5004)
    {
        $this->fC5004 = $fC5004;
    }

    /**
     * @Type("string")
     */
    private $fC10004;

    /**
     * @return string
     */
    public function getFC10004()
    {
        return $this->fC10004;
    }

    /**
     * @param string $fC10004
     */
    public function setFC10004($fC10004)
    {
        $this->fC10004 = $fC10004;
    }

    /**
     * @Type("boolean")
     */
    private $fB5;

    /**
     * @return boolean
     */
    public function getFB5()
    {
        return $this->fB5;
    }

    /**
     * @param boolean $fB5
     */
    public function setFB5($fB5)
    {
        $this->fB5 = $fB5;
    }

    /**
     * @Type("integer")
     */
    private $fI5;

    /**
     * @return integer
     */
    public function getFI5()
    {
        return $this->fI5;
    }

    /**
     * @param integer $fI5
     */
    public function setFI5($fI5)
    {
        $this->fI5 = $fI5;
    }

    /**
     * @Type("long")
     */
    private $fL5;

    /**
     * @return long
     */
    public function getFL5()
    {
        return $this->fL5;
    }

    /**
     * @param long $fL5
     */
    public function setFL5($fL5)
    {
        $this->fL5 = $fL5;
    }

    /**
     * @Type("\DateTime")
     */
    private $fDt5;

    /**
     * @return \DateTime
     */
    public function getFDt5()
    {
        return $this->fDt5;
    }

    /**
     * @param \DateTime $fDt5
     */
    public function setFDt5($fDt5)
    {
        $this->fDt5 = $fDt5;
    }

    /**
     * @Type("decimal")
     */
    private $fN5;

    /**
     * @return decimal
     */
    public function getFN5()
    {
        return $this->fN5;
    }

    /**
     * @param decimal $fN5
     */
    public function setFN5($fN5)
    {
        $this->fN5 = $fN5;
    }

    /**
     * @Type("string")
     */
    private $fC55;

    /**
     * @return string
     */
    public function getFC55()
    {
        return $this->fC55;
    }

    /**
     * @param string $fC55
     */
    public function setFC55($fC55)
    {
        $this->fC55 = $fC55;
    }

    /**
     * @Type("string")
     */
    private $fC105;

    /**
     * @return string
     */
    public function getFC105()
    {
        return $this->fC105;
    }

    /**
     * @param string $fC105
     */
    public function setFC105($fC105)
    {
        $this->fC105 = $fC105;
    }

    /**
     * @Type("string")
     */
    private $fC205;

    /**
     * @return string
     */
    public function getFC205()
    {
        return $this->fC205;
    }

    /**
     * @param string $fC205
     */
    public function setFC205($fC205)
    {
        $this->fC205 = $fC205;
    }

    /**
     * @Type("string")
     */
    private $fC505;

    /**
     * @return string
     */
    public function getFC505()
    {
        return $this->fC505;
    }

    /**
     * @param string $fC505
     */
    public function setFC505($fC505)
    {
        $this->fC505 = $fC505;
    }

    /**
     * @Type("string")
     */
    private $fC1005;

    /**
     * @return string
     */
    public function getFC1005()
    {
        return $this->fC1005;
    }

    /**
     * @param string $fC1005
     */
    public function setFC1005($fC1005)
    {
        $this->fC1005 = $fC1005;
    }

    /**
     * @Type("string")
     */
    private $fC2005;

    /**
     * @return string
     */
    public function getFC2005()
    {
        return $this->fC2005;
    }

    /**
     * @param string $fC2005
     */
    public function setFC2005($fC2005)
    {
        $this->fC2005 = $fC2005;
    }

    /**
     * @Type("string")
     */
    private $fC5005;

    /**
     * @return string
     */
    public function getFC5005()
    {
        return $this->fC5005;
    }

    /**
     * @param string $fC5005
     */
    public function setFC5005($fC5005)
    {
        $this->fC5005 = $fC5005;
    }

    /**
     * @Type("boolean")
     */
    private $fB6;

    /**
     * @return boolean
     */
    public function getFB6()
    {
        return $this->fB6;
    }

    /**
     * @param boolean $fB6
     */
    public function setFB6($fB6)
    {
        $this->fB6 = $fB6;
    }

    /**
     * @Type("integer")
     */
    private $fI6;

    /**
     * @return integer
     */
    public function getFI6()
    {
        return $this->fI6;
    }

    /**
     * @param integer $fI6
     */
    public function setFI6($fI6)
    {
        $this->fI6 = $fI6;
    }

    /**
     * @Type("long")
     */
    private $fL6;

    /**
     * @return long
     */
    public function getFL6()
    {
        return $this->fL6;
    }

    /**
     * @param long $fL6
     */
    public function setFL6($fL6)
    {
        $this->fL6 = $fL6;
    }

    /**
     * @Type("\DateTime")
     */
    private $fDt6;

    /**
     * @return \DateTime
     */
    public function getFDt6()
    {
        return $this->fDt6;
    }

    /**
     * @param \DateTime $fDt6
     */
    public function setFDt6($fDt6)
    {
        $this->fDt6 = $fDt6;
    }

    /**
     * @Type("decimal")
     */
    private $fN6;

    /**
     * @return decimal
     */
    public function getFN6()
    {
        return $this->fN6;
    }

    /**
     * @param decimal $fN6
     */
    public function setFN6($fN6)
    {
        $this->fN6 = $fN6;
    }

    /**
     * @Type("string")
     */
    private $fC56;

    /**
     * @return string
     */
    public function getFC56()
    {
        return $this->fC56;
    }

    /**
     * @param string $fC56
     */
    public function setFC56($fC56)
    {
        $this->fC56 = $fC56;
    }

    /**
     * @Type("string")
     */
    private $fC106;

    /**
     * @return string
     */
    public function getFC106()
    {
        return $this->fC106;
    }

    /**
     * @param string $fC106
     */
    public function setFC106($fC106)
    {
        $this->fC106 = $fC106;
    }

    /**
     * @Type("string")
     */
    private $fC206;

    /**
     * @return string
     */
    public function getFC206()
    {
        return $this->fC206;
    }

    /**
     * @param string $fC206
     */
    public function setFC206($fC206)
    {
        $this->fC206 = $fC206;
    }

    /**
     * @Type("string")
     */
    private $fC506;

    /**
     * @return string
     */
    public function getFC506()
    {
        return $this->fC506;
    }

    /**
     * @param string $fC506
     */
    public function setFC506($fC506)
    {
        $this->fC506 = $fC506;
    }

    /**
     * @Type("string")
     */
    private $fC1006;

    /**
     * @return string
     */
    public function getFC1006()
    {
        return $this->fC1006;
    }

    /**
     * @param string $fC1006
     */
    public function setFC1006($fC1006)
    {
        $this->fC1006 = $fC1006;
    }

    /**
     * @Type("string")
     */
    private $fC2006;

    /**
     * @return string
     */
    public function getFC2006()
    {
        return $this->fC2006;
    }

    /**
     * @param string $fC2006
     */
    public function setFC2006($fC2006)
    {
        $this->fC2006 = $fC2006;
    }

    /**
     * @Type("string")
     */
    private $fC5006;

    /**
     * @return string
     */
    public function getFC5006()
    {
        return $this->fC5006;
    }

    /**
     * @param string $fC5006
     */
    public function setFC5006($fC5006)
    {
        $this->fC5006 = $fC5006;
    }

    /**
     * @Type("boolean")
     */
    private $fB7;

    /**
     * @return boolean
     */
    public function getFB7()
    {
        return $this->fB7;
    }

    /**
     * @param boolean $fB7
     */
    public function setFB7($fB7)
    {
        $this->fB7 = $fB7;
    }

    /**
     * @Type("integer")
     */
    private $fI7;

    /**
     * @return integer
     */
    public function getFI7()
    {
        return $this->fI7;
    }

    /**
     * @param integer $fI7
     */
    public function setFI7($fI7)
    {
        $this->fI7 = $fI7;
    }

    /**
     * @Type("long")
     */
    private $fL7;

    /**
     * @return long
     */
    public function getFL7()
    {
        return $this->fL7;
    }

    /**
     * @param long $fL7
     */
    public function setFL7($fL7)
    {
        $this->fL7 = $fL7;
    }

    /**
     * @Type("\DateTime")
     */
    private $fDt7;

    /**
     * @return \DateTime
     */
    public function getFDt7()
    {
        return $this->fDt7;
    }

    /**
     * @param \DateTime $fDt7
     */
    public function setFDt7($fDt7)
    {
        $this->fDt7 = $fDt7;
    }

    /**
     * @Type("decimal")
     */
    private $fN7;

    /**
     * @return decimal
     */
    public function getFN7()
    {
        return $this->fN7;
    }

    /**
     * @param decimal $fN7
     */
    public function setFN7($fN7)
    {
        $this->fN7 = $fN7;
    }

    /**
     * @Type("string")
     */
    private $fC57;

    /**
     * @return string
     */
    public function getFC57()
    {
        return $this->fC57;
    }

    /**
     * @param string $fC57
     */
    public function setFC57($fC57)
    {
        $this->fC57 = $fC57;
    }

    /**
     * @Type("string")
     */
    private $fC107;

    /**
     * @return string
     */
    public function getFC107()
    {
        return $this->fC107;
    }

    /**
     * @param string $fC107
     */
    public function setFC107($fC107)
    {
        $this->fC107 = $fC107;
    }

    /**
     * @Type("string")
     */
    private $fC207;

    /**
     * @return string
     */
    public function getFC207()
    {
        return $this->fC207;
    }

    /**
     * @param string $fC207
     */
    public function setFC207($fC207)
    {
        $this->fC207 = $fC207;
    }

    /**
     * @Type("string")
     */
    private $fC507;

    /**
     * @return string
     */
    public function getFC507()
    {
        return $this->fC507;
    }

    /**
     * @param string $fC507
     */
    public function setFC507($fC507)
    {
        $this->fC507 = $fC507;
    }

    /**
     * @Type("string")
     */
    private $fC1007;

    /**
     * @return string
     */
    public function getFC1007()
    {
        return $this->fC1007;
    }

    /**
     * @param string $fC1007
     */
    public function setFC1007($fC1007)
    {
        $this->fC1007 = $fC1007;
    }

    /**
     * @Type("string")
     */
    private $fC2007;

    /**
     * @return string
     */
    public function getFC2007()
    {
        return $this->fC2007;
    }

    /**
     * @param string $fC2007
     */
    public function setFC2007($fC2007)
    {
        $this->fC2007 = $fC2007;
    }

    /**
     * @Type("string")
     */
    private $fC5007;

    /**
     * @return string
     */
    public function getFC5007()
    {
        return $this->fC5007;
    }

    /**
     * @param string $fC5007
     */
    public function setFC5007($fC5007)
    {
        $this->fC5007 = $fC5007;
    }

    /**
     * @Type("boolean")
     */
    private $fB8;

    /**
     * @return boolean
     */
    public function getFB8()
    {
        return $this->fB8;
    }

    /**
     * @param boolean $fB8
     */
    public function setFB8($fB8)
    {
        $this->fB8 = $fB8;
    }

    /**
     * @Type("integer")
     */
    private $fI8;

    /**
     * @return integer
     */
    public function getFI8()
    {
        return $this->fI8;
    }

    /**
     * @param integer $fI8
     */
    public function setFI8($fI8)
    {
        $this->fI8 = $fI8;
    }

    /**
     * @Type("long")
     */
    private $fL8;

    /**
     * @return long
     */
    public function getFL8()
    {
        return $this->fL8;
    }

    /**
     * @param long $fL8
     */
    public function setFL8($fL8)
    {
        $this->fL8 = $fL8;
    }

    /**
     * @Type("\DateTime")
     */
    private $fDt8;

    /**
     * @return \DateTime
     */
    public function getFDt8()
    {
        return $this->fDt8;
    }

    /**
     * @param \DateTime $fDt8
     */
    public function setFDt8($fDt8)
    {
        $this->fDt8 = $fDt8;
    }

    /**
     * @Type("decimal")
     */
    private $fN8;

    /**
     * @return decimal
     */
    public function getFN8()
    {
        return $this->fN8;
    }

    /**
     * @param decimal $fN8
     */
    public function setFN8($fN8)
    {
        $this->fN8 = $fN8;
    }

    /**
     * @Type("string")
     */
    private $fC58;

    /**
     * @return string
     */
    public function getFC58()
    {
        return $this->fC58;
    }

    /**
     * @param string $fC58
     */
    public function setFC58($fC58)
    {
        $this->fC58 = $fC58;
    }

    /**
     * @Type("string")
     */
    private $fC108;

    /**
     * @return string
     */
    public function getFC108()
    {
        return $this->fC108;
    }

    /**
     * @param string $fC108
     */
    public function setFC108($fC108)
    {
        $this->fC108 = $fC108;
    }

    /**
     * @Type("string")
     */
    private $fC208;

    /**
     * @return string
     */
    public function getFC208()
    {
        return $this->fC208;
    }

    /**
     * @param string $fC208
     */
    public function setFC208($fC208)
    {
        $this->fC208 = $fC208;
    }

    /**
     * @Type("string")
     */
    private $fC508;

    /**
     * @return string
     */
    public function getFC508()
    {
        return $this->fC508;
    }

    /**
     * @param string $fC508
     */
    public function setFC508($fC508)
    {
        $this->fC508 = $fC508;
    }

    /**
     * @Type("string")
     */
    private $fC1008;

    /**
     * @return string
     */
    public function getFC1008()
    {
        return $this->fC1008;
    }

    /**
     * @param string $fC1008
     */
    public function setFC1008($fC1008)
    {
        $this->fC1008 = $fC1008;
    }

    /**
     * @Type("string")
     */
    private $fC2008;

    /**
     * @return string
     */
    public function getFC2008()
    {
        return $this->fC2008;
    }

    /**
     * @param string $fC2008
     */
    public function setFC2008($fC2008)
    {
        $this->fC2008 = $fC2008;
    }

    /**
     * @Type("string")
     */
    private $fC5008;

    /**
     * @return string
     */
    public function getFC5008()
    {
        return $this->fC5008;
    }

    /**
     * @param string $fC5008
     */
    public function setFC5008($fC5008)
    {
        $this->fC5008 = $fC5008;
    }

    /**
     * @Type("boolean")
     */
    private $fB9;

    /**
     * @return boolean
     */
    public function getFB9()
    {
        return $this->fB9;
    }

    /**
     * @param boolean $fB9
     */
    public function setFB9($fB9)
    {
        $this->fB9 = $fB9;
    }

    /**
     * @Type("integer")
     */
    private $fI9;

    /**
     * @return integer
     */
    public function getFI9()
    {
        return $this->fI9;
    }

    /**
     * @param integer $fI9
     */
    public function setFI9($fI9)
    {
        $this->fI9 = $fI9;
    }

    /**
     * @Type("long")
     */
    private $fL9;

    /**
     * @return long
     */
    public function getFL9()
    {
        return $this->fL9;
    }

    /**
     * @param long $fL9
     */
    public function setFL9($fL9)
    {
        $this->fL9 = $fL9;
    }

    /**
     * @Type("\DateTime")
     */
    private $fDt9;

    /**
     * @return \DateTime
     */
    public function getFDt9()
    {
        return $this->fDt9;
    }

    /**
     * @param \DateTime $fDt9
     */
    public function setFDt9($fDt9)
    {
        $this->fDt9 = $fDt9;
    }

    /**
     * @Type("decimal")
     */
    private $fN9;

    /**
     * @return decimal
     */
    public function getFN9()
    {
        return $this->fN9;
    }

    /**
     * @param decimal $fN9
     */
    public function setFN9($fN9)
    {
        $this->fN9 = $fN9;
    }

    /**
     * @Type("string")
     */
    private $fC59;

    /**
     * @return string
     */
    public function getFC59()
    {
        return $this->fC59;
    }

    /**
     * @param string $fC59
     */
    public function setFC59($fC59)
    {
        $this->fC59 = $fC59;
    }

    /**
     * @Type("string")
     */
    private $fC109;

    /**
     * @return string
     */
    public function getFC109()
    {
        return $this->fC109;
    }

    /**
     * @param string $fC109
     */
    public function setFC109($fC109)
    {
        $this->fC109 = $fC109;
    }

    /**
     * @Type("string")
     */
    private $fC209;

    /**
     * @return string
     */
    public function getFC209()
    {
        return $this->fC209;
    }

    /**
     * @param string $fC209
     */
    public function setFC209($fC209)
    {
        $this->fC209 = $fC209;
    }

    /**
     * @Type("string")
     */
    private $fC509;

    /**
     * @return string
     */
    public function getFC509()
    {
        return $this->fC509;
    }

    /**
     * @param string $fC509
     */
    public function setFC509($fC509)
    {
        $this->fC509 = $fC509;
    }

    /**
     * @Type("string")
     */
    private $fC1009;

    /**
     * @return string
     */
    public function getFC1009()
    {
        return $this->fC1009;
    }

    /**
     * @param string $fC1009
     */
    public function setFC1009($fC1009)
    {
        $this->fC1009 = $fC1009;
    }

    /**
     * @Type("string")
     */
    private $fC2009;

    /**
     * @return string
     */
    public function getFC2009()
    {
        return $this->fC2009;
    }

    /**
     * @param string $fC2009
     */
    public function setFC2009($fC2009)
    {
        $this->fC2009 = $fC2009;
    }

    /**
     * @Type("string")
     */
    private $fC5009;

    /**
     * @return string
     */
    public function getFC5009()
    {
        return $this->fC5009;
    }

    /**
     * @param string $fC5009
     */
    public function setFC5009($fC5009)
    {
        $this->fC5009 = $fC5009;
    }

    /**
     * @Type("boolean")
     */
    private $fB10;

    /**
     * @return boolean
     */
    public function getFB10()
    {
        return $this->fB10;
    }

    /**
     * @param boolean $fB10
     */
    public function setFB10($fB10)
    {
        $this->fB10 = $fB10;
    }

    /**
     * @Type("integer")
     */
    private $fI10;

    /**
     * @return integer
     */
    public function getFI10()
    {
        return $this->fI10;
    }

    /**
     * @param integer $fI10
     */
    public function setFI10($fI10)
    {
        $this->fI10 = $fI10;
    }

    /**
     * @Type("long")
     */
    private $fL10;

    /**
     * @return long
     */
    public function getFL10()
    {
        return $this->fL10;
    }

    /**
     * @param long $fL10
     */
    public function setFL10($fL10)
    {
        $this->fL10 = $fL10;
    }

    /**
     * @Type("\DateTime")
     */
    private $fDt10;

    /**
     * @return \DateTime
     */
    public function getFDt10()
    {
        return $this->fDt10;
    }

    /**
     * @param \DateTime $fDt10
     */
    public function setFDt10($fDt10)
    {
        $this->fDt10 = $fDt10;
    }

    /**
     * @Type("decimal")
     */
    private $fN10;

    /**
     * @return decimal
     */
    public function getFN10()
    {
        return $this->fN10;
    }

    /**
     * @param decimal $fN10
     */
    public function setFN10($fN10)
    {
        $this->fN10 = $fN10;
    }

    /**
     * @Type("string")
     */
    private $fC510;

    /**
     * @return string
     */
    public function getFC510()
    {
        return $this->fC510;
    }

    /**
     * @param string $fC510
     */
    public function setFC510($fC510)
    {
        $this->fC510 = $fC510;
    }

    /**
     * @Type("string")
     */
    private $fC1010;

    /**
     * @return string
     */
    public function getFC1010()
    {
        return $this->fC1010;
    }

    /**
     * @param string $fC1010
     */
    public function setFC1010($fC1010)
    {
        $this->fC1010 = $fC1010;
    }

    /**
     * @Type("string")
     */
    private $fC2010;

    /**
     * @return string
     */
    public function getFC2010()
    {
        return $this->fC2010;
    }

    /**
     * @param string $fC2010
     */
    public function setFC2010($fC2010)
    {
        $this->fC2010 = $fC2010;
    }

    /**
     * @Type("string")
     */
    private $fC5010;

    /**
     * @return string
     */
    public function getFC5010()
    {
        return $this->fC5010;
    }

    /**
     * @param string $fC5010
     */
    public function setFC5010($fC5010)
    {
        $this->fC5010 = $fC5010;
    }

    /**
     * @Type("string")
     */
    private $fC10010;

    /**
     * @return string
     */
    public function getFC10010()
    {
        return $this->fC10010;
    }

    /**
     * @param string $fC10010
     */
    public function setFC10010($fC10010)
    {
        $this->fC10010 = $fC10010;
    }

    /**
     * @Type("string")
     */
    private $fC20010;

    /**
     * @return string
     */
    public function getFC20010()
    {
        return $this->fC20010;
    }

    /**
     * @param string $fC20010
     */
    public function setFC20010($fC20010)
    {
        $this->fC20010 = $fC20010;
    }

    /**
     * @Type("boolean")
     */
    private $fB11;

    /**
     * @return boolean
     */
    public function getFB11()
    {
        return $this->fB11;
    }

    /**
     * @param boolean $fB11
     */
    public function setFB11($fB11)
    {
        $this->fB11 = $fB11;
    }

    /**
     * @Type("integer")
     */
    private $fI11;

    /**
     * @return integer
     */
    public function getFI11()
    {
        return $this->fI11;
    }

    /**
     * @param integer $fI11
     */
    public function setFI11($fI11)
    {
        $this->fI11 = $fI11;
    }

    /**
     * @Type("long")
     */
    private $fL11;

    /**
     * @return long
     */
    public function getFL11()
    {
        return $this->fL11;
    }

    /**
     * @param long $fL11
     */
    public function setFL11($fL11)
    {
        $this->fL11 = $fL11;
    }

    /**
     * @Type("\DateTime")
     */
    private $fDt11;

    /**
     * @return \DateTime
     */
    public function getFDt11()
    {
        return $this->fDt11;
    }

    /**
     * @param \DateTime $fDt11
     */
    public function setFDt11($fDt11)
    {
        $this->fDt11 = $fDt11;
    }

    /**
     * @Type("decimal")
     */
    private $fN11;

    /**
     * @return decimal
     */
    public function getFN11()
    {
        return $this->fN11;
    }

    /**
     * @param decimal $fN11
     */
    public function setFN11($fN11)
    {
        $this->fN11 = $fN11;
    }

    /**
     * @Type("string")
     */
    private $fC511;

    /**
     * @return string
     */
    public function getFC511()
    {
        return $this->fC511;
    }

    /**
     * @param string $fC511
     */
    public function setFC511($fC511)
    {
        $this->fC511 = $fC511;
    }

    /**
     * @Type("string")
     */
    private $fC1011;

    /**
     * @return string
     */
    public function getFC1011()
    {
        return $this->fC1011;
    }

    /**
     * @param string $fC1011
     */
    public function setFC1011($fC1011)
    {
        $this->fC1011 = $fC1011;
    }

    /**
     * @Type("string")
     */
    private $fC2011;

    /**
     * @return string
     */
    public function getFC2011()
    {
        return $this->fC2011;
    }

    /**
     * @param string $fC2011
     */
    public function setFC2011($fC2011)
    {
        $this->fC2011 = $fC2011;
    }

    /**
     * @Type("string")
     */
    private $fC5011;

    /**
     * @return string
     */
    public function getFC5011()
    {
        return $this->fC5011;
    }

    /**
     * @param string $fC5011
     */
    public function setFC5011($fC5011)
    {
        $this->fC5011 = $fC5011;
    }

    /**
     * @Type("string")
     */
    private $fC10011;

    /**
     * @return string
     */
    public function getFC10011()
    {
        return $this->fC10011;
    }

    /**
     * @param string $fC10011
     */
    public function setFC10011($fC10011)
    {
        $this->fC10011 = $fC10011;
    }

    /**
     * @Type("string")
     */
    private $fC20011;

    /**
     * @return string
     */
    public function getFC20011()
    {
        return $this->fC20011;
    }

    /**
     * @param string $fC20011
     */
    public function setFC20011($fC20011)
    {
        $this->fC20011 = $fC20011;
    }

    /**
     * @Type("boolean")
     */
    private $fB12;

    /**
     * @return boolean
     */
    public function getFB12()
    {
        return $this->fB12;
    }

    /**
     * @param boolean $fB12
     */
    public function setFB12($fB12)
    {
        $this->fB12 = $fB12;
    }

    /**
     * @Type("integer")
     */
    private $fI12;

    /**
     * @return integer
     */
    public function getFI12()
    {
        return $this->fI12;
    }

    /**
     * @param integer $fI12
     */
    public function setFI12($fI12)
    {
        $this->fI12 = $fI12;
    }

    /**
     * @Type("long")
     */
    private $fL12;

    /**
     * @return long
     */
    public function getFL12()
    {
        return $this->fL12;
    }

    /**
     * @param long $fL12
     */
    public function setFL12($fL12)
    {
        $this->fL12 = $fL12;
    }

    /**
     * @Type("\DateTime")
     */
    private $fDt12;

    /**
     * @return \DateTime
     */
    public function getFDt12()
    {
        return $this->fDt12;
    }

    /**
     * @param \DateTime $fDt12
     */
    public function setFDt12($fDt12)
    {
        $this->fDt12 = $fDt12;
    }

    /**
     * @Type("decimal")
     */
    private $fN12;

    /**
     * @return decimal
     */
    public function getFN12()
    {
        return $this->fN12;
    }

    /**
     * @param decimal $fN12
     */
    public function setFN12($fN12)
    {
        $this->fN12 = $fN12;
    }

    /**
     * @Type("string")
     */
    private $fC512;

    /**
     * @return string
     */
    public function getFC512()
    {
        return $this->fC512;
    }

    /**
     * @param string $fC512
     */
    public function setFC512($fC512)
    {
        $this->fC512 = $fC512;
    }

    /**
     * @Type("string")
     */
    private $fC1012;

    /**
     * @return string
     */
    public function getFC1012()
    {
        return $this->fC1012;
    }

    /**
     * @param string $fC1012
     */
    public function setFC1012($fC1012)
    {
        $this->fC1012 = $fC1012;
    }

    /**
     * @Type("string")
     */
    private $fC2012;

    /**
     * @return string
     */
    public function getFC2012()
    {
        return $this->fC2012;
    }

    /**
     * @param string $fC2012
     */
    public function setFC2012($fC2012)
    {
        $this->fC2012 = $fC2012;
    }

    /**
     * @Type("string")
     */
    private $fC5012;

    /**
     * @return string
     */
    public function getFC5012()
    {
        return $this->fC5012;
    }

    /**
     * @param string $fC5012
     */
    public function setFC5012($fC5012)
    {
        $this->fC5012 = $fC5012;
    }

    /**
     * @Type("string")
     */
    private $fC10012;

    /**
     * @return string
     */
    public function getFC10012()
    {
        return $this->fC10012;
    }

    /**
     * @param string $fC10012
     */
    public function setFC10012($fC10012)
    {
        $this->fC10012 = $fC10012;
    }

    /**
     * @Type("string")
     */
    private $fC20012;

    /**
     * @return string
     */
    public function getFC20012()
    {
        return $this->fC20012;
    }

    /**
     * @param string $fC20012
     */
    public function setFC20012($fC20012)
    {
        $this->fC20012 = $fC20012;
    }

    /**
     * @Type("boolean")
     */
    private $fB13;

    /**
     * @return boolean
     */
    public function getFB13()
    {
        return $this->fB13;
    }

    /**
     * @param boolean $fB13
     */
    public function setFB13($fB13)
    {
        $this->fB13 = $fB13;
    }

    /**
     * @Type("integer")
     */
    private $fI13;

    /**
     * @return integer
     */
    public function getFI13()
    {
        return $this->fI13;
    }

    /**
     * @param integer $fI13
     */
    public function setFI13($fI13)
    {
        $this->fI13 = $fI13;
    }

    /**
     * @Type("long")
     */
    private $fL13;

    /**
     * @return long
     */
    public function getFL13()
    {
        return $this->fL13;
    }

    /**
     * @param long $fL13
     */
    public function setFL13($fL13)
    {
        $this->fL13 = $fL13;
    }

    /**
     * @Type("\DateTime")
     */
    private $fDt13;

    /**
     * @return \DateTime
     */
    public function getFDt13()
    {
        return $this->fDt13;
    }

    /**
     * @param \DateTime $fDt13
     */
    public function setFDt13($fDt13)
    {
        $this->fDt13 = $fDt13;
    }

    /**
     * @Type("decimal")
     */
    private $fN13;

    /**
     * @return decimal
     */
    public function getFN13()
    {
        return $this->fN13;
    }

    /**
     * @param decimal $fN13
     */
    public function setFN13($fN13)
    {
        $this->fN13 = $fN13;
    }

    /**
     * @Type("string")
     */
    private $fC513;

    /**
     * @return string
     */
    public function getFC513()
    {
        return $this->fC513;
    }

    /**
     * @param string $fC513
     */
    public function setFC513($fC513)
    {
        $this->fC513 = $fC513;
    }

    /**
     * @Type("string")
     */
    private $fC1013;

    /**
     * @return string
     */
    public function getFC1013()
    {
        return $this->fC1013;
    }

    /**
     * @param string $fC1013
     */
    public function setFC1013($fC1013)
    {
        $this->fC1013 = $fC1013;
    }

    /**
     * @Type("string")
     */
    private $fC2013;

    /**
     * @return string
     */
    public function getFC2013()
    {
        return $this->fC2013;
    }

    /**
     * @param string $fC2013
     */
    public function setFC2013($fC2013)
    {
        $this->fC2013 = $fC2013;
    }

    /**
     * @Type("string")
     */
    private $fC5013;

    /**
     * @return string
     */
    public function getFC5013()
    {
        return $this->fC5013;
    }

    /**
     * @param string $fC5013
     */
    public function setFC5013($fC5013)
    {
        $this->fC5013 = $fC5013;
    }

    /**
     * @Type("string")
     */
    private $fC10013;

    /**
     * @return string
     */
    public function getFC10013()
    {
        return $this->fC10013;
    }

    /**
     * @param string $fC10013
     */
    public function setFC10013($fC10013)
    {
        $this->fC10013 = $fC10013;
    }

    /**
     * @Type("string")
     */
    private $fC20013;

    /**
     * @return string
     */
    public function getFC20013()
    {
        return $this->fC20013;
    }

    /**
     * @param string $fC20013
     */
    public function setFC20013($fC20013)
    {
        $this->fC20013 = $fC20013;
    }

    /**
     * @Type("boolean")
     */
    private $fB14;

    /**
     * @return boolean
     */
    public function getFB14()
    {
        return $this->fB14;
    }

    /**
     * @param boolean $fB14
     */
    public function setFB14($fB14)
    {
        $this->fB14 = $fB14;
    }

    /**
     * @Type("integer")
     */
    private $fI14;

    /**
     * @return integer
     */
    public function getFI14()
    {
        return $this->fI14;
    }

    /**
     * @param integer $fI14
     */
    public function setFI14($fI14)
    {
        $this->fI14 = $fI14;
    }

    /**
     * @Type("long")
     */
    private $fL14;

    /**
     * @return long
     */
    public function getFL14()
    {
        return $this->fL14;
    }

    /**
     * @param long $fL14
     */
    public function setFL14($fL14)
    {
        $this->fL14 = $fL14;
    }

    /**
     * @Type("\DateTime")
     */
    private $fDt14;

    /**
     * @return \DateTime
     */
    public function getFDt14()
    {
        return $this->fDt14;
    }

    /**
     * @param \DateTime $fDt14
     */
    public function setFDt14($fDt14)
    {
        $this->fDt14 = $fDt14;
    }

    /**
     * @Type("decimal")
     */
    private $fN14;

    /**
     * @return decimal
     */
    public function getFN14()
    {
        return $this->fN14;
    }

    /**
     * @param decimal $fN14
     */
    public function setFN14($fN14)
    {
        $this->fN14 = $fN14;
    }

    /**
     * @Type("string")
     */
    private $fC514;

    /**
     * @return string
     */
    public function getFC514()
    {
        return $this->fC514;
    }

    /**
     * @param string $fC514
     */
    public function setFC514($fC514)
    {
        $this->fC514 = $fC514;
    }

    /**
     * @Type("string")
     */
    private $fC1014;

    /**
     * @return string
     */
    public function getFC1014()
    {
        return $this->fC1014;
    }

    /**
     * @param string $fC1014
     */
    public function setFC1014($fC1014)
    {
        $this->fC1014 = $fC1014;
    }

    /**
     * @Type("string")
     */
    private $fC2014;

    /**
     * @return string
     */
    public function getFC2014()
    {
        return $this->fC2014;
    }

    /**
     * @param string $fC2014
     */
    public function setFC2014($fC2014)
    {
        $this->fC2014 = $fC2014;
    }

    /**
     * @Type("string")
     */
    private $fC5014;

    /**
     * @return string
     */
    public function getFC5014()
    {
        return $this->fC5014;
    }

    /**
     * @param string $fC5014
     */
    public function setFC5014($fC5014)
    {
        $this->fC5014 = $fC5014;
    }

    /**
     * @Type("string")
     */
    private $fC10014;

    /**
     * @return string
     */
    public function getFC10014()
    {
        return $this->fC10014;
    }

    /**
     * @param string $fC10014
     */
    public function setFC10014($fC10014)
    {
        $this->fC10014 = $fC10014;
    }

    /**
     * @Type("string")
     */
    private $fC20014;

    /**
     * @return string
     */
    public function getFC20014()
    {
        return $this->fC20014;
    }

    /**
     * @param string $fC20014
     */
    public function setFC20014($fC20014)
    {
        $this->fC20014 = $fC20014;
    }

    /**
     * @Type("boolean")
     */
    private $fB15;

    /**
     * @return boolean
     */
    public function getFB15()
    {
        return $this->fB15;
    }

    /**
     * @param boolean $fB15
     */
    public function setFB15($fB15)
    {
        $this->fB15 = $fB15;
    }

    /**
     * @Type("integer")
     */
    private $fI15;

    /**
     * @return integer
     */
    public function getFI15()
    {
        return $this->fI15;
    }

    /**
     * @param integer $fI15
     */
    public function setFI15($fI15)
    {
        $this->fI15 = $fI15;
    }

    /**
     * @Type("long")
     */
    private $fL15;

    /**
     * @return long
     */
    public function getFL15()
    {
        return $this->fL15;
    }

    /**
     * @param long $fL15
     */
    public function setFL15($fL15)
    {
        $this->fL15 = $fL15;
    }

    /**
     * @Type("\DateTime")
     */
    private $fDt15;

    /**
     * @return \DateTime
     */
    public function getFDt15()
    {
        return $this->fDt15;
    }

    /**
     * @param \DateTime $fDt15
     */
    public function setFDt15($fDt15)
    {
        $this->fDt15 = $fDt15;
    }

    /**
     * @Type("decimal")
     */
    private $fN15;

    /**
     * @return decimal
     */
    public function getFN15()
    {
        return $this->fN15;
    }

    /**
     * @param decimal $fN15
     */
    public function setFN15($fN15)
    {
        $this->fN15 = $fN15;
    }

    /**
     * @Type("string")
     */
    private $fC515;

    /**
     * @return string
     */
    public function getFC515()
    {
        return $this->fC515;
    }

    /**
     * @param string $fC515
     */
    public function setFC515($fC515)
    {
        $this->fC515 = $fC515;
    }

    /**
     * @Type("string")
     */
    private $fC1015;

    /**
     * @return string
     */
    public function getFC1015()
    {
        return $this->fC1015;
    }

    /**
     * @param string $fC1015
     */
    public function setFC1015($fC1015)
    {
        $this->fC1015 = $fC1015;
    }

    /**
     * @Type("string")
     */
    private $fC2015;

    /**
     * @return string
     */
    public function getFC2015()
    {
        return $this->fC2015;
    }

    /**
     * @param string $fC2015
     */
    public function setFC2015($fC2015)
    {
        $this->fC2015 = $fC2015;
    }

    /**
     * @Type("string")
     */
    private $fC5015;

    /**
     * @return string
     */
    public function getFC5015()
    {
        return $this->fC5015;
    }

    /**
     * @param string $fC5015
     */
    public function setFC5015($fC5015)
    {
        $this->fC5015 = $fC5015;
    }

    /**
     * @Type("string")
     */
    private $fC10015;

    /**
     * @return string
     */
    public function getFC10015()
    {
        return $this->fC10015;
    }

    /**
     * @param string $fC10015
     */
    public function setFC10015($fC10015)
    {
        $this->fC10015 = $fC10015;
    }

    /**
     * @Type("string")
     */
    private $fC20015;

    /**
     * @return string
     */
    public function getFC20015()
    {
        return $this->fC20015;
    }

    /**
     * @param string $fC20015
     */
    public function setFC20015($fC20015)
    {
        $this->fC20015 = $fC20015;
    }

    /**
     * @Type("boolean")
     */
    private $fB16;

    /**
     * @return boolean
     */
    public function getFB16()
    {
        return $this->fB16;
    }

    /**
     * @param boolean $fB16
     */
    public function setFB16($fB16)
    {
        $this->fB16 = $fB16;
    }

    /**
     * @Type("integer")
     */
    private $fI16;

    /**
     * @return integer
     */
    public function getFI16()
    {
        return $this->fI16;
    }

    /**
     * @param integer $fI16
     */
    public function setFI16($fI16)
    {
        $this->fI16 = $fI16;
    }

    /**
     * @Type("long")
     */
    private $fL16;

    /**
     * @return long
     */
    public function getFL16()
    {
        return $this->fL16;
    }

    /**
     * @param long $fL16
     */
    public function setFL16($fL16)
    {
        $this->fL16 = $fL16;
    }

    /**
     * @Type("\DateTime")
     */
    private $fDt16;

    /**
     * @return \DateTime
     */
    public function getFDt16()
    {
        return $this->fDt16;
    }

    /**
     * @param \DateTime $fDt16
     */
    public function setFDt16($fDt16)
    {
        $this->fDt16 = $fDt16;
    }

    /**
     * @Type("decimal")
     */
    private $fN16;

    /**
     * @return decimal
     */
    public function getFN16()
    {
        return $this->fN16;
    }

    /**
     * @param decimal $fN16
     */
    public function setFN16($fN16)
    {
        $this->fN16 = $fN16;
    }

    /**
     * @Type("string")
     */
    private $fC516;

    /**
     * @return string
     */
    public function getFC516()
    {
        return $this->fC516;
    }

    /**
     * @param string $fC516
     */
    public function setFC516($fC516)
    {
        $this->fC516 = $fC516;
    }

    /**
     * @Type("string")
     */
    private $fC1016;

    /**
     * @return string
     */
    public function getFC1016()
    {
        return $this->fC1016;
    }

    /**
     * @param string $fC1016
     */
    public function setFC1016($fC1016)
    {
        $this->fC1016 = $fC1016;
    }

    /**
     * @Type("string")
     */
    private $fC2016;

    /**
     * @return string
     */
    public function getFC2016()
    {
        return $this->fC2016;
    }

    /**
     * @param string $fC2016
     */
    public function setFC2016($fC2016)
    {
        $this->fC2016 = $fC2016;
    }

    /**
     * @Type("string")
     */
    private $fC5016;

    /**
     * @return string
     */
    public function getFC5016()
    {
        return $this->fC5016;
    }

    /**
     * @param string $fC5016
     */
    public function setFC5016($fC5016)
    {
        $this->fC5016 = $fC5016;
    }

    /**
     * @Type("string")
     */
    private $fC10016;

    /**
     * @return string
     */
    public function getFC10016()
    {
        return $this->fC10016;
    }

    /**
     * @param string $fC10016
     */
    public function setFC10016($fC10016)
    {
        $this->fC10016 = $fC10016;
    }

    /**
     * @Type("string")
     */
    private $fC20016;

    /**
     * @return string
     */
    public function getFC20016()
    {
        return $this->fC20016;
    }

    /**
     * @param string $fC20016
     */
    public function setFC20016($fC20016)
    {
        $this->fC20016 = $fC20016;
    }

    /**
     * @Type("boolean")
     */
    private $fB17;

    /**
     * @return boolean
     */
    public function getFB17()
    {
        return $this->fB17;
    }

    /**
     * @param boolean $fB17
     */
    public function setFB17($fB17)
    {
        $this->fB17 = $fB17;
    }

    /**
     * @Type("integer")
     */
    private $fI17;

    /**
     * @return integer
     */
    public function getFI17()
    {
        return $this->fI17;
    }

    /**
     * @param integer $fI17
     */
    public function setFI17($fI17)
    {
        $this->fI17 = $fI17;
    }

    /**
     * @Type("long")
     */
    private $fL17;

    /**
     * @return long
     */
    public function getFL17()
    {
        return $this->fL17;
    }

    /**
     * @param long $fL17
     */
    public function setFL17($fL17)
    {
        $this->fL17 = $fL17;
    }

    /**
     * @Type("\DateTime")
     */
    private $fDt17;

    /**
     * @return \DateTime
     */
    public function getFDt17()
    {
        return $this->fDt17;
    }

    /**
     * @param \DateTime $fDt17
     */
    public function setFDt17($fDt17)
    {
        $this->fDt17 = $fDt17;
    }

    /**
     * @Type("decimal")
     */
    private $fN17;

    /**
     * @return decimal
     */
    public function getFN17()
    {
        return $this->fN17;
    }

    /**
     * @param decimal $fN17
     */
    public function setFN17($fN17)
    {
        $this->fN17 = $fN17;
    }

    /**
     * @Type("string")
     */
    private $fC517;

    /**
     * @return string
     */
    public function getFC517()
    {
        return $this->fC517;
    }

    /**
     * @param string $fC517
     */
    public function setFC517($fC517)
    {
        $this->fC517 = $fC517;
    }

    /**
     * @Type("string")
     */
    private $fC1017;

    /**
     * @return string
     */
    public function getFC1017()
    {
        return $this->fC1017;
    }

    /**
     * @param string $fC1017
     */
    public function setFC1017($fC1017)
    {
        $this->fC1017 = $fC1017;
    }

    /**
     * @Type("string")
     */
    private $fC2017;

    /**
     * @return string
     */
    public function getFC2017()
    {
        return $this->fC2017;
    }

    /**
     * @param string $fC2017
     */
    public function setFC2017($fC2017)
    {
        $this->fC2017 = $fC2017;
    }

    /**
     * @Type("string")
     */
    private $fC5017;

    /**
     * @return string
     */
    public function getFC5017()
    {
        return $this->fC5017;
    }

    /**
     * @param string $fC5017
     */
    public function setFC5017($fC5017)
    {
        $this->fC5017 = $fC5017;
    }

    /**
     * @Type("string")
     */
    private $fC10017;

    /**
     * @return string
     */
    public function getFC10017()
    {
        return $this->fC10017;
    }

    /**
     * @param string $fC10017
     */
    public function setFC10017($fC10017)
    {
        $this->fC10017 = $fC10017;
    }

    /**
     * @Type("string")
     */
    private $fC20017;

    /**
     * @return string
     */
    public function getFC20017()
    {
        return $this->fC20017;
    }

    /**
     * @param string $fC20017
     */
    public function setFC20017($fC20017)
    {
        $this->fC20017 = $fC20017;
    }

    /**
     * @Type("boolean")
     */
    private $fB18;

    /**
     * @return boolean
     */
    public function getFB18()
    {
        return $this->fB18;
    }

    /**
     * @param boolean $fB18
     */
    public function setFB18($fB18)
    {
        $this->fB18 = $fB18;
    }

    /**
     * @Type("integer")
     */
    private $fI18;

    /**
     * @return integer
     */
    public function getFI18()
    {
        return $this->fI18;
    }

    /**
     * @param integer $fI18
     */
    public function setFI18($fI18)
    {
        $this->fI18 = $fI18;
    }

    /**
     * @Type("long")
     */
    private $fL18;

    /**
     * @return long
     */
    public function getFL18()
    {
        return $this->fL18;
    }

    /**
     * @param long $fL18
     */
    public function setFL18($fL18)
    {
        $this->fL18 = $fL18;
    }

    /**
     * @Type("\DateTime")
     */
    private $fDt18;

    /**
     * @return \DateTime
     */
    public function getFDt18()
    {
        return $this->fDt18;
    }

    /**
     * @param \DateTime $fDt18
     */
    public function setFDt18($fDt18)
    {
        $this->fDt18 = $fDt18;
    }

    /**
     * @Type("decimal")
     */
    private $fN18;

    /**
     * @return decimal
     */
    public function getFN18()
    {
        return $this->fN18;
    }

    /**
     * @param decimal $fN18
     */
    public function setFN18($fN18)
    {
        $this->fN18 = $fN18;
    }

    /**
     * @Type("string")
     */
    private $fC518;

    /**
     * @return string
     */
    public function getFC518()
    {
        return $this->fC518;
    }

    /**
     * @param string $fC518
     */
    public function setFC518($fC518)
    {
        $this->fC518 = $fC518;
    }

    /**
     * @Type("string")
     */
    private $fC1018;

    /**
     * @return string
     */
    public function getFC1018()
    {
        return $this->fC1018;
    }

    /**
     * @param string $fC1018
     */
    public function setFC1018($fC1018)
    {
        $this->fC1018 = $fC1018;
    }

    /**
     * @Type("string")
     */
    private $fC2018;

    /**
     * @return string
     */
    public function getFC2018()
    {
        return $this->fC2018;
    }

    /**
     * @param string $fC2018
     */
    public function setFC2018($fC2018)
    {
        $this->fC2018 = $fC2018;
    }

    /**
     * @Type("string")
     */
    private $fC5018;

    /**
     * @return string
     */
    public function getFC5018()
    {
        return $this->fC5018;
    }

    /**
     * @param string $fC5018
     */
    public function setFC5018($fC5018)
    {
        $this->fC5018 = $fC5018;
    }

    /**
     * @Type("string")
     */
    private $fC10018;

    /**
     * @return string
     */
    public function getFC10018()
    {
        return $this->fC10018;
    }

    /**
     * @param string $fC10018
     */
    public function setFC10018($fC10018)
    {
        $this->fC10018 = $fC10018;
    }

    /**
     * @Type("string")
     */
    private $fC20018;

    /**
     * @return string
     */
    public function getFC20018()
    {
        return $this->fC20018;
    }

    /**
     * @param string $fC20018
     */
    public function setFC20018($fC20018)
    {
        $this->fC20018 = $fC20018;
    }

    /**
     * @Type("boolean")
     */
    private $fB19;

    /**
     * @return boolean
     */
    public function getFB19()
    {
        return $this->fB19;
    }

    /**
     * @param boolean $fB19
     */
    public function setFB19($fB19)
    {
        $this->fB19 = $fB19;
    }

    /**
     * @Type("integer")
     */
    private $fI19;

    /**
     * @return integer
     */
    public function getFI19()
    {
        return $this->fI19;
    }

    /**
     * @param integer $fI19
     */
    public function setFI19($fI19)
    {
        $this->fI19 = $fI19;
    }

    /**
     * @Type("long")
     */
    private $fL19;

    /**
     * @return long
     */
    public function getFL19()
    {
        return $this->fL19;
    }

    /**
     * @param long $fL19
     */
    public function setFL19($fL19)
    {
        $this->fL19 = $fL19;
    }

    /**
     * @Type("\DateTime")
     */
    private $fDt19;

    /**
     * @return \DateTime
     */
    public function getFDt19()
    {
        return $this->fDt19;
    }

    /**
     * @param \DateTime $fDt19
     */
    public function setFDt19($fDt19)
    {
        $this->fDt19 = $fDt19;
    }

    /**
     * @Type("decimal")
     */
    private $fN19;

    /**
     * @return decimal
     */
    public function getFN19()
    {
        return $this->fN19;
    }

    /**
     * @param decimal $fN19
     */
    public function setFN19($fN19)
    {
        $this->fN19 = $fN19;
    }

    /**
     * @Type("string")
     */
    private $fC519;

    /**
     * @return string
     */
    public function getFC519()
    {
        return $this->fC519;
    }

    /**
     * @param string $fC519
     */
    public function setFC519($fC519)
    {
        $this->fC519 = $fC519;
    }

    /**
     * @Type("string")
     */
    private $fC1019;

    /**
     * @return string
     */
    public function getFC1019()
    {
        return $this->fC1019;
    }

    /**
     * @param string $fC1019
     */
    public function setFC1019($fC1019)
    {
        $this->fC1019 = $fC1019;
    }

    /**
     * @Type("string")
     */
    private $fC2019;

    /**
     * @return string
     */
    public function getFC2019()
    {
        return $this->fC2019;
    }

    /**
     * @param string $fC2019
     */
    public function setFC2019($fC2019)
    {
        $this->fC2019 = $fC2019;
    }

    /**
     * @Type("string")
     */
    private $fC5019;

    /**
     * @return string
     */
    public function getFC5019()
    {
        return $this->fC5019;
    }

    /**
     * @param string $fC5019
     */
    public function setFC5019($fC5019)
    {
        $this->fC5019 = $fC5019;
    }

    /**
     * @Type("string")
     */
    private $fC10019;

    /**
     * @return string
     */
    public function getFC10019()
    {
        return $this->fC10019;
    }

    /**
     * @param string $fC10019
     */
    public function setFC10019($fC10019)
    {
        $this->fC10019 = $fC10019;
    }

    /**
     * @Type("string")
     */
    private $fC20019;

    /**
     * @return string
     */
    public function getFC20019()
    {
        return $this->fC20019;
    }

    /**
     * @param string $fC20019
     */
    public function setFC20019($fC20019)
    {
        $this->fC20019 = $fC20019;
    }

    /**
     * @Type("boolean")
     */
    private $fB20;

    /**
     * @return boolean
     */
    public function getFB20()
    {
        return $this->fB20;
    }

    /**
     * @param boolean $fB20
     */
    public function setFB20($fB20)
    {
        $this->fB20 = $fB20;
    }

    /**
     * @Type("integer")
     */
    private $fI20;

    /**
     * @return integer
     */
    public function getFI20()
    {
        return $this->fI20;
    }

    /**
     * @param integer $fI20
     */
    public function setFI20($fI20)
    {
        $this->fI20 = $fI20;
    }

    /**
     * @Type("long")
     */
    private $fL20;

    /**
     * @return long
     */
    public function getFL20()
    {
        return $this->fL20;
    }

    /**
     * @param long $fL20
     */
    public function setFL20($fL20)
    {
        $this->fL20 = $fL20;
    }

    /**
     * @Type("decimal")
     */
    private $fN20;

    /**
     * @return decimal
     */
    public function getFN20()
    {
        return $this->fN20;
    }

    /**
     * @param decimal $fN20
     */
    public function setFN20($fN20)
    {
        $this->fN20 = $fN20;
    }

    /**
     * @Type("string")
     */
    private $fC520;

    /**
     * @return string
     */
    public function getFC520()
    {
        return $this->fC520;
    }

    /**
     * @param string $fC520
     */
    public function setFC520($fC520)
    {
        $this->fC520 = $fC520;
    }

    /**
     * @Type("string")
     */
    private $fC1020;

    /**
     * @return string
     */
    public function getFC1020()
    {
        return $this->fC1020;
    }

    /**
     * @param string $fC1020
     */
    public function setFC1020($fC1020)
    {
        $this->fC1020 = $fC1020;
    }

    /**
     * @Type("string")
     */
    private $fC2020;

    /**
     * @return string
     */
    public function getFC2020()
    {
        return $this->fC2020;
    }

    /**
     * @param string $fC2020
     */
    public function setFC2020($fC2020)
    {
        $this->fC2020 = $fC2020;
    }

    /**
     * @Type("string")
     */
    private $fC5020;

    /**
     * @return string
     */
    public function getFC5020()
    {
        return $this->fC5020;
    }

    /**
     * @param string $fC5020
     */
    public function setFC5020($fC5020)
    {
        $this->fC5020 = $fC5020;
    }

    /**
     * @Type("boolean")
     */
    private $fB21;

    /**
     * @return boolean
     */
    public function getFB21()
    {
        return $this->fB21;
    }

    /**
     * @param boolean $fB21
     */
    public function setFB21($fB21)
    {
        $this->fB21 = $fB21;
    }

    /**
     * @Type("integer")
     */
    private $fI21;

    /**
     * @return integer
     */
    public function getFI21()
    {
        return $this->fI21;
    }

    /**
     * @param integer $fI21
     */
    public function setFI21($fI21)
    {
        $this->fI21 = $fI21;
    }

    /**
     * @Type("long")
     */
    private $fL21;

    /**
     * @return long
     */
    public function getFL21()
    {
        return $this->fL21;
    }

    /**
     * @param long $fL21
     */
    public function setFL21($fL21)
    {
        $this->fL21 = $fL21;
    }

    /**
     * @Type("decimal")
     */
    private $fN21;

    /**
     * @return decimal
     */
    public function getFN21()
    {
        return $this->fN21;
    }

    /**
     * @param decimal $fN21
     */
    public function setFN21($fN21)
    {
        $this->fN21 = $fN21;
    }

    /**
     * @Type("string")
     */
    private $fC521;

    /**
     * @return string
     */
    public function getFC521()
    {
        return $this->fC521;
    }

    /**
     * @param string $fC521
     */
    public function setFC521($fC521)
    {
        $this->fC521 = $fC521;
    }

    /**
     * @Type("string")
     */
    private $fC1021;

    /**
     * @return string
     */
    public function getFC1021()
    {
        return $this->fC1021;
    }

    /**
     * @param string $fC1021
     */
    public function setFC1021($fC1021)
    {
        $this->fC1021 = $fC1021;
    }

    /**
     * @Type("string")
     */
    private $fC2021;

    /**
     * @return string
     */
    public function getFC2021()
    {
        return $this->fC2021;
    }

    /**
     * @param string $fC2021
     */
    public function setFC2021($fC2021)
    {
        $this->fC2021 = $fC2021;
    }

    /**
     * @Type("string")
     */
    private $fC5021;

    /**
     * @return string
     */
    public function getFC5021()
    {
        return $this->fC5021;
    }

    /**
     * @param string $fC5021
     */
    public function setFC5021($fC5021)
    {
        $this->fC5021 = $fC5021;
    }

    /**
     * @Type("boolean")
     */
    private $fB22;

    /**
     * @return boolean
     */
    public function getFB22()
    {
        return $this->fB22;
    }

    /**
     * @param boolean $fB22
     */
    public function setFB22($fB22)
    {
        $this->fB22 = $fB22;
    }

    /**
     * @Type("integer")
     */
    private $fI22;

    /**
     * @return integer
     */
    public function getFI22()
    {
        return $this->fI22;
    }

    /**
     * @param integer $fI22
     */
    public function setFI22($fI22)
    {
        $this->fI22 = $fI22;
    }

    /**
     * @Type("long")
     */
    private $fL22;

    /**
     * @return long
     */
    public function getFL22()
    {
        return $this->fL22;
    }

    /**
     * @param long $fL22
     */
    public function setFL22($fL22)
    {
        $this->fL22 = $fL22;
    }

    /**
     * @Type("decimal")
     */
    private $fN22;

    /**
     * @return decimal
     */
    public function getFN22()
    {
        return $this->fN22;
    }

    /**
     * @param decimal $fN22
     */
    public function setFN22($fN22)
    {
        $this->fN22 = $fN22;
    }

    /**
     * @Type("string")
     */
    private $fC522;

    /**
     * @return string
     */
    public function getFC522()
    {
        return $this->fC522;
    }

    /**
     * @param string $fC522
     */
    public function setFC522($fC522)
    {
        $this->fC522 = $fC522;
    }

    /**
     * @Type("string")
     */
    private $fC1022;

    /**
     * @return string
     */
    public function getFC1022()
    {
        return $this->fC1022;
    }

    /**
     * @param string $fC1022
     */
    public function setFC1022($fC1022)
    {
        $this->fC1022 = $fC1022;
    }

    /**
     * @Type("string")
     */
    private $fC2022;

    /**
     * @return string
     */
    public function getFC2022()
    {
        return $this->fC2022;
    }

    /**
     * @param string $fC2022
     */
    public function setFC2022($fC2022)
    {
        $this->fC2022 = $fC2022;
    }

    /**
     * @Type("string")
     */
    private $fC5022;

    /**
     * @return string
     */
    public function getFC5022()
    {
        return $this->fC5022;
    }

    /**
     * @param string $fC5022
     */
    public function setFC5022($fC5022)
    {
        $this->fC5022 = $fC5022;
    }

    /**
     * @Type("boolean")
     */
    private $fB23;

    /**
     * @return boolean
     */
    public function getFB23()
    {
        return $this->fB23;
    }

    /**
     * @param boolean $fB23
     */
    public function setFB23($fB23)
    {
        $this->fB23 = $fB23;
    }

    /**
     * @Type("integer")
     */
    private $fI23;

    /**
     * @return integer
     */
    public function getFI23()
    {
        return $this->fI23;
    }

    /**
     * @param integer $fI23
     */
    public function setFI23($fI23)
    {
        $this->fI23 = $fI23;
    }

    /**
     * @Type("long")
     */
    private $fL23;

    /**
     * @return long
     */
    public function getFL23()
    {
        return $this->fL23;
    }

    /**
     * @param long $fL23
     */
    public function setFL23($fL23)
    {
        $this->fL23 = $fL23;
    }

    /**
     * @Type("decimal")
     */
    private $fN23;

    /**
     * @return decimal
     */
    public function getFN23()
    {
        return $this->fN23;
    }

    /**
     * @param decimal $fN23
     */
    public function setFN23($fN23)
    {
        $this->fN23 = $fN23;
    }

    /**
     * @Type("string")
     */
    private $fC523;

    /**
     * @return string
     */
    public function getFC523()
    {
        return $this->fC523;
    }

    /**
     * @param string $fC523
     */
    public function setFC523($fC523)
    {
        $this->fC523 = $fC523;
    }

    /**
     * @Type("string")
     */
    private $fC1023;

    /**
     * @return string
     */
    public function getFC1023()
    {
        return $this->fC1023;
    }

    /**
     * @param string $fC1023
     */
    public function setFC1023($fC1023)
    {
        $this->fC1023 = $fC1023;
    }

    /**
     * @Type("string")
     */
    private $fC2023;

    /**
     * @return string
     */
    public function getFC2023()
    {
        return $this->fC2023;
    }

    /**
     * @param string $fC2023
     */
    public function setFC2023($fC2023)
    {
        $this->fC2023 = $fC2023;
    }

    /**
     * @Type("string")
     */
    private $fC5023;

    /**
     * @return string
     */
    public function getFC5023()
    {
        return $this->fC5023;
    }

    /**
     * @param string $fC5023
     */
    public function setFC5023($fC5023)
    {
        $this->fC5023 = $fC5023;
    }

    /**
     * @Type("boolean")
     */
    private $fB24;

    /**
     * @return boolean
     */
    public function getFB24()
    {
        return $this->fB24;
    }

    /**
     * @param boolean $fB24
     */
    public function setFB24($fB24)
    {
        $this->fB24 = $fB24;
    }

    /**
     * @Type("integer")
     */
    private $fI24;

    /**
     * @return integer
     */
    public function getFI24()
    {
        return $this->fI24;
    }

    /**
     * @param integer $fI24
     */
    public function setFI24($fI24)
    {
        $this->fI24 = $fI24;
    }

    /**
     * @Type("long")
     */
    private $fL24;

    /**
     * @return long
     */
    public function getFL24()
    {
        return $this->fL24;
    }

    /**
     * @param long $fL24
     */
    public function setFL24($fL24)
    {
        $this->fL24 = $fL24;
    }

    /**
     * @Type("decimal")
     */
    private $fN24;

    /**
     * @return decimal
     */
    public function getFN24()
    {
        return $this->fN24;
    }

    /**
     * @param decimal $fN24
     */
    public function setFN24($fN24)
    {
        $this->fN24 = $fN24;
    }

    /**
     * @Type("string")
     */
    private $fC524;

    /**
     * @return string
     */
    public function getFC524()
    {
        return $this->fC524;
    }

    /**
     * @param string $fC524
     */
    public function setFC524($fC524)
    {
        $this->fC524 = $fC524;
    }

    /**
     * @Type("string")
     */
    private $fC1024;

    /**
     * @return string
     */
    public function getFC1024()
    {
        return $this->fC1024;
    }

    /**
     * @param string $fC1024
     */
    public function setFC1024($fC1024)
    {
        $this->fC1024 = $fC1024;
    }

    /**
     * @Type("string")
     */
    private $fC2024;

    /**
     * @return string
     */
    public function getFC2024()
    {
        return $this->fC2024;
    }

    /**
     * @param string $fC2024
     */
    public function setFC2024($fC2024)
    {
        $this->fC2024 = $fC2024;
    }

    /**
     * @Type("string")
     */
    private $fC5024;

    /**
     * @return string
     */
    public function getFC5024()
    {
        return $this->fC5024;
    }

    /**
     * @param string $fC5024
     */
    public function setFC5024($fC5024)
    {
        $this->fC5024 = $fC5024;
    }

    /**
     * @Type("boolean")
     */
    private $fB25;

    /**
     * @return boolean
     */
    public function getFB25()
    {
        return $this->fB25;
    }

    /**
     * @param boolean $fB25
     */
    public function setFB25($fB25)
    {
        $this->fB25 = $fB25;
    }

    /**
     * @Type("integer")
     */
    private $fI25;

    /**
     * @return integer
     */
    public function getFI25()
    {
        return $this->fI25;
    }

    /**
     * @param integer $fI25
     */
    public function setFI25($fI25)
    {
        $this->fI25 = $fI25;
    }

    /**
     * @Type("long")
     */
    private $fL25;

    /**
     * @return long
     */
    public function getFL25()
    {
        return $this->fL25;
    }

    /**
     * @param long $fL25
     */
    public function setFL25($fL25)
    {
        $this->fL25 = $fL25;
    }

    /**
     * @Type("decimal")
     */
    private $fN25;

    /**
     * @return decimal
     */
    public function getFN25()
    {
        return $this->fN25;
    }

    /**
     * @param decimal $fN25
     */
    public function setFN25($fN25)
    {
        $this->fN25 = $fN25;
    }

    /**
     * @Type("string")
     */
    private $fC525;

    /**
     * @return string
     */
    public function getFC525()
    {
        return $this->fC525;
    }

    /**
     * @param string $fC525
     */
    public function setFC525($fC525)
    {
        $this->fC525 = $fC525;
    }

    /**
     * @Type("string")
     */
    private $fC1025;

    /**
     * @return string
     */
    public function getFC1025()
    {
        return $this->fC1025;
    }

    /**
     * @param string $fC1025
     */
    public function setFC1025($fC1025)
    {
        $this->fC1025 = $fC1025;
    }

    /**
     * @Type("string")
     */
    private $fC2025;

    /**
     * @return string
     */
    public function getFC2025()
    {
        return $this->fC2025;
    }

    /**
     * @param string $fC2025
     */
    public function setFC2025($fC2025)
    {
        $this->fC2025 = $fC2025;
    }

    /**
     * @Type("string")
     */
    private $fC5025;

    /**
     * @return string
     */
    public function getFC5025()
    {
        return $this->fC5025;
    }

    /**
     * @param string $fC5025
     */
    public function setFC5025($fC5025)
    {
        $this->fC5025 = $fC5025;
    }

    /**
     * @Type("boolean")
     */
    private $fB26;

    /**
     * @return boolean
     */
    public function getFB26()
    {
        return $this->fB26;
    }

    /**
     * @param boolean $fB26
     */
    public function setFB26($fB26)
    {
        $this->fB26 = $fB26;
    }

    /**
     * @Type("integer")
     */
    private $fI26;

    /**
     * @return integer
     */
    public function getFI26()
    {
        return $this->fI26;
    }

    /**
     * @param integer $fI26
     */
    public function setFI26($fI26)
    {
        $this->fI26 = $fI26;
    }

    /**
     * @Type("long")
     */
    private $fL26;

    /**
     * @return long
     */
    public function getFL26()
    {
        return $this->fL26;
    }

    /**
     * @param long $fL26
     */
    public function setFL26($fL26)
    {
        $this->fL26 = $fL26;
    }

    /**
     * @Type("decimal")
     */
    private $fN26;

    /**
     * @return decimal
     */
    public function getFN26()
    {
        return $this->fN26;
    }

    /**
     * @param decimal $fN26
     */
    public function setFN26($fN26)
    {
        $this->fN26 = $fN26;
    }

    /**
     * @Type("string")
     */
    private $fC526;

    /**
     * @return string
     */
    public function getFC526()
    {
        return $this->fC526;
    }

    /**
     * @param string $fC526
     */
    public function setFC526($fC526)
    {
        $this->fC526 = $fC526;
    }

    /**
     * @Type("string")
     */
    private $fC1026;

    /**
     * @return string
     */
    public function getFC1026()
    {
        return $this->fC1026;
    }

    /**
     * @param string $fC1026
     */
    public function setFC1026($fC1026)
    {
        $this->fC1026 = $fC1026;
    }

    /**
     * @Type("string")
     */
    private $fC2026;

    /**
     * @return string
     */
    public function getFC2026()
    {
        return $this->fC2026;
    }

    /**
     * @param string $fC2026
     */
    public function setFC2026($fC2026)
    {
        $this->fC2026 = $fC2026;
    }

    /**
     * @Type("string")
     */
    private $fC5026;

    /**
     * @return string
     */
    public function getFC5026()
    {
        return $this->fC5026;
    }

    /**
     * @param string $fC5026
     */
    public function setFC5026($fC5026)
    {
        $this->fC5026 = $fC5026;
    }

    /**
     * @Type("boolean")
     */
    private $fB27;

    /**
     * @return boolean
     */
    public function getFB27()
    {
        return $this->fB27;
    }

    /**
     * @param boolean $fB27
     */
    public function setFB27($fB27)
    {
        $this->fB27 = $fB27;
    }

    /**
     * @Type("integer")
     */
    private $fI27;

    /**
     * @return integer
     */
    public function getFI27()
    {
        return $this->fI27;
    }

    /**
     * @param integer $fI27
     */
    public function setFI27($fI27)
    {
        $this->fI27 = $fI27;
    }

    /**
     * @Type("long")
     */
    private $fL27;

    /**
     * @return long
     */
    public function getFL27()
    {
        return $this->fL27;
    }

    /**
     * @param long $fL27
     */
    public function setFL27($fL27)
    {
        $this->fL27 = $fL27;
    }

    /**
     * @Type("decimal")
     */
    private $fN27;

    /**
     * @return decimal
     */
    public function getFN27()
    {
        return $this->fN27;
    }

    /**
     * @param decimal $fN27
     */
    public function setFN27($fN27)
    {
        $this->fN27 = $fN27;
    }

    /**
     * @Type("string")
     */
    private $fC527;

    /**
     * @return string
     */
    public function getFC527()
    {
        return $this->fC527;
    }

    /**
     * @param string $fC527
     */
    public function setFC527($fC527)
    {
        $this->fC527 = $fC527;
    }

    /**
     * @Type("string")
     */
    private $fC1027;

    /**
     * @return string
     */
    public function getFC1027()
    {
        return $this->fC1027;
    }

    /**
     * @param string $fC1027
     */
    public function setFC1027($fC1027)
    {
        $this->fC1027 = $fC1027;
    }

    /**
     * @Type("string")
     */
    private $fC2027;

    /**
     * @return string
     */
    public function getFC2027()
    {
        return $this->fC2027;
    }

    /**
     * @param string $fC2027
     */
    public function setFC2027($fC2027)
    {
        $this->fC2027 = $fC2027;
    }

    /**
     * @Type("string")
     */
    private $fC5027;

    /**
     * @return string
     */
    public function getFC5027()
    {
        return $this->fC5027;
    }

    /**
     * @param string $fC5027
     */
    public function setFC5027($fC5027)
    {
        $this->fC5027 = $fC5027;
    }

    /**
     * @Type("boolean")
     */
    private $fB28;

    /**
     * @return boolean
     */
    public function getFB28()
    {
        return $this->fB28;
    }

    /**
     * @param boolean $fB28
     */
    public function setFB28($fB28)
    {
        $this->fB28 = $fB28;
    }

    /**
     * @Type("integer")
     */
    private $fI28;

    /**
     * @return integer
     */
    public function getFI28()
    {
        return $this->fI28;
    }

    /**
     * @param integer $fI28
     */
    public function setFI28($fI28)
    {
        $this->fI28 = $fI28;
    }

    /**
     * @Type("long")
     */
    private $fL28;

    /**
     * @return long
     */
    public function getFL28()
    {
        return $this->fL28;
    }

    /**
     * @param long $fL28
     */
    public function setFL28($fL28)
    {
        $this->fL28 = $fL28;
    }

    /**
     * @Type("decimal")
     */
    private $fN28;

    /**
     * @return decimal
     */
    public function getFN28()
    {
        return $this->fN28;
    }

    /**
     * @param decimal $fN28
     */
    public function setFN28($fN28)
    {
        $this->fN28 = $fN28;
    }

    /**
     * @Type("string")
     */
    private $fC528;

    /**
     * @return string
     */
    public function getFC528()
    {
        return $this->fC528;
    }

    /**
     * @param string $fC528
     */
    public function setFC528($fC528)
    {
        $this->fC528 = $fC528;
    }

    /**
     * @Type("string")
     */
    private $fC1028;

    /**
     * @return string
     */
    public function getFC1028()
    {
        return $this->fC1028;
    }

    /**
     * @param string $fC1028
     */
    public function setFC1028($fC1028)
    {
        $this->fC1028 = $fC1028;
    }

    /**
     * @Type("string")
     */
    private $fC2028;

    /**
     * @return string
     */
    public function getFC2028()
    {
        return $this->fC2028;
    }

    /**
     * @param string $fC2028
     */
    public function setFC2028($fC2028)
    {
        $this->fC2028 = $fC2028;
    }

    /**
     * @Type("string")
     */
    private $fC5028;

    /**
     * @return string
     */
    public function getFC5028()
    {
        return $this->fC5028;
    }

    /**
     * @param string $fC5028
     */
    public function setFC5028($fC5028)
    {
        $this->fC5028 = $fC5028;
    }

    /**
     * @Type("boolean")
     */
    private $fB29;

    /**
     * @return boolean
     */
    public function getFB29()
    {
        return $this->fB29;
    }

    /**
     * @param boolean $fB29
     */
    public function setFB29($fB29)
    {
        $this->fB29 = $fB29;
    }

    /**
     * @Type("integer")
     */
    private $fI29;

    /**
     * @return integer
     */
    public function getFI29()
    {
        return $this->fI29;
    }

    /**
     * @param integer $fI29
     */
    public function setFI29($fI29)
    {
        $this->fI29 = $fI29;
    }

    /**
     * @Type("long")
     */
    private $fL29;

    /**
     * @return long
     */
    public function getFL29()
    {
        return $this->fL29;
    }

    /**
     * @param long $fL29
     */
    public function setFL29($fL29)
    {
        $this->fL29 = $fL29;
    }

    /**
     * @Type("decimal")
     */
    private $fN29;

    /**
     * @return decimal
     */
    public function getFN29()
    {
        return $this->fN29;
    }

    /**
     * @param decimal $fN29
     */
    public function setFN29($fN29)
    {
        $this->fN29 = $fN29;
    }

    /**
     * @Type("string")
     */
    private $fC529;

    /**
     * @return string
     */
    public function getFC529()
    {
        return $this->fC529;
    }

    /**
     * @param string $fC529
     */
    public function setFC529($fC529)
    {
        $this->fC529 = $fC529;
    }

    /**
     * @Type("string")
     */
    private $fC1029;

    /**
     * @return string
     */
    public function getFC1029()
    {
        return $this->fC1029;
    }

    /**
     * @param string $fC1029
     */
    public function setFC1029($fC1029)
    {
        $this->fC1029 = $fC1029;
    }

    /**
     * @Type("string")
     */
    private $fC2029;

    /**
     * @return string
     */
    public function getFC2029()
    {
        return $this->fC2029;
    }

    /**
     * @param string $fC2029
     */
    public function setFC2029($fC2029)
    {
        $this->fC2029 = $fC2029;
    }

    /**
     * @Type("string")
     */
    private $fC5029;

    /**
     * @return string
     */
    public function getFC5029()
    {
        return $this->fC5029;
    }

    /**
     * @param string $fC5029
     */
    public function setFC5029($fC5029)
    {
        $this->fC5029 = $fC5029;
    }

    /**
     * @Type("boolean")
     */
    private $fB30;

    /**
     * @return boolean
     */
    public function getFB30()
    {
        return $this->fB30;
    }

    /**
     * @param boolean $fB30
     */
    public function setFB30($fB30)
    {
        $this->fB30 = $fB30;
    }

    /**
     * @Type("integer")
     */
    private $fI30;

    /**
     * @return integer
     */
    public function getFI30()
    {
        return $this->fI30;
    }

    /**
     * @param integer $fI30
     */
    public function setFI30($fI30)
    {
        $this->fI30 = $fI30;
    }

    /**
     * @Type("decimal")
     */
    private $fN30;

    /**
     * @return decimal
     */
    public function getFN30()
    {
        return $this->fN30;
    }

    /**
     * @param decimal $fN30
     */
    public function setFN30($fN30)
    {
        $this->fN30 = $fN30;
    }

    /**
     * @Type("string")
     */
    private $fC530;

    /**
     * @return string
     */
    public function getFC530()
    {
        return $this->fC530;
    }

    /**
     * @param string $fC530
     */
    public function setFC530($fC530)
    {
        $this->fC530 = $fC530;
    }

    /**
     * @Type("string")
     */
    private $fC1030;

    /**
     * @return string
     */
    public function getFC1030()
    {
        return $this->fC1030;
    }

    /**
     * @param string $fC1030
     */
    public function setFC1030($fC1030)
    {
        $this->fC1030 = $fC1030;
    }

    /**
     * @Type("string")
     */
    private $fC2030;

    /**
     * @return string
     */
    public function getFC2030()
    {
        return $this->fC2030;
    }

    /**
     * @param string $fC2030
     */
    public function setFC2030($fC2030)
    {
        $this->fC2030 = $fC2030;
    }

    /**
     * @Type("string")
     */
    private $fC5030;

    /**
     * @return string
     */
    public function getFC5030()
    {
        return $this->fC5030;
    }

    /**
     * @param string $fC5030
     */
    public function setFC5030($fC5030)
    {
        $this->fC5030 = $fC5030;
    }

    /**
     * @Type("boolean")
     */
    private $fB31;

    /**
     * @return boolean
     */
    public function getFB31()
    {
        return $this->fB31;
    }

    /**
     * @param boolean $fB31
     */
    public function setFB31($fB31)
    {
        $this->fB31 = $fB31;
    }

    /**
     * @Type("integer")
     */
    private $fI31;

    /**
     * @return integer
     */
    public function getFI31()
    {
        return $this->fI31;
    }

    /**
     * @param integer $fI31
     */
    public function setFI31($fI31)
    {
        $this->fI31 = $fI31;
    }

    /**
     * @Type("decimal")
     */
    private $fN31;

    /**
     * @return decimal
     */
    public function getFN31()
    {
        return $this->fN31;
    }

    /**
     * @param decimal $fN31
     */
    public function setFN31($fN31)
    {
        $this->fN31 = $fN31;
    }

    /**
     * @Type("string")
     */
    private $fC531;

    /**
     * @return string
     */
    public function getFC531()
    {
        return $this->fC531;
    }

    /**
     * @param string $fC531
     */
    public function setFC531($fC531)
    {
        $this->fC531 = $fC531;
    }

    /**
     * @Type("string")
     */
    private $fC1031;

    /**
     * @return string
     */
    public function getFC1031()
    {
        return $this->fC1031;
    }

    /**
     * @param string $fC1031
     */
    public function setFC1031($fC1031)
    {
        $this->fC1031 = $fC1031;
    }

    /**
     * @Type("string")
     */
    private $fC2031;

    /**
     * @return string
     */
    public function getFC2031()
    {
        return $this->fC2031;
    }

    /**
     * @param string $fC2031
     */
    public function setFC2031($fC2031)
    {
        $this->fC2031 = $fC2031;
    }

    /**
     * @Type("string")
     */
    private $fC5031;

    /**
     * @return string
     */
    public function getFC5031()
    {
        return $this->fC5031;
    }

    /**
     * @param string $fC5031
     */
    public function setFC5031($fC5031)
    {
        $this->fC5031 = $fC5031;
    }

    /**
     * @Type("boolean")
     */
    private $fB32;

    /**
     * @return boolean
     */
    public function getFB32()
    {
        return $this->fB32;
    }

    /**
     * @param boolean $fB32
     */
    public function setFB32($fB32)
    {
        $this->fB32 = $fB32;
    }

    /**
     * @Type("integer")
     */
    private $fI32;

    /**
     * @return integer
     */
    public function getFI32()
    {
        return $this->fI32;
    }

    /**
     * @param integer $fI32
     */
    public function setFI32($fI32)
    {
        $this->fI32 = $fI32;
    }

    /**
     * @Type("decimal")
     */
    private $fN32;

    /**
     * @return decimal
     */
    public function getFN32()
    {
        return $this->fN32;
    }

    /**
     * @param decimal $fN32
     */
    public function setFN32($fN32)
    {
        $this->fN32 = $fN32;
    }

    /**
     * @Type("string")
     */
    private $fC532;

    /**
     * @return string
     */
    public function getFC532()
    {
        return $this->fC532;
    }

    /**
     * @param string $fC532
     */
    public function setFC532($fC532)
    {
        $this->fC532 = $fC532;
    }

    /**
     * @Type("string")
     */
    private $fC1032;

    /**
     * @return string
     */
    public function getFC1032()
    {
        return $this->fC1032;
    }

    /**
     * @param string $fC1032
     */
    public function setFC1032($fC1032)
    {
        $this->fC1032 = $fC1032;
    }

    /**
     * @Type("string")
     */
    private $fC2032;

    /**
     * @return string
     */
    public function getFC2032()
    {
        return $this->fC2032;
    }

    /**
     * @param string $fC2032
     */
    public function setFC2032($fC2032)
    {
        $this->fC2032 = $fC2032;
    }

    /**
     * @Type("string")
     */
    private $fC5032;

    /**
     * @return string
     */
    public function getFC5032()
    {
        return $this->fC5032;
    }

    /**
     * @param string $fC5032
     */
    public function setFC5032($fC5032)
    {
        $this->fC5032 = $fC5032;
    }

    /**
     * @Type("boolean")
     */
    private $fB33;

    /**
     * @return boolean
     */
    public function getFB33()
    {
        return $this->fB33;
    }

    /**
     * @param boolean $fB33
     */
    public function setFB33($fB33)
    {
        $this->fB33 = $fB33;
    }

    /**
     * @Type("integer")
     */
    private $fI33;

    /**
     * @return integer
     */
    public function getFI33()
    {
        return $this->fI33;
    }

    /**
     * @param integer $fI33
     */
    public function setFI33($fI33)
    {
        $this->fI33 = $fI33;
    }

    /**
     * @Type("decimal")
     */
    private $fN33;

    /**
     * @return decimal
     */
    public function getFN33()
    {
        return $this->fN33;
    }

    /**
     * @param decimal $fN33
     */
    public function setFN33($fN33)
    {
        $this->fN33 = $fN33;
    }

    /**
     * @Type("string")
     */
    private $fC533;

    /**
     * @return string
     */
    public function getFC533()
    {
        return $this->fC533;
    }

    /**
     * @param string $fC533
     */
    public function setFC533($fC533)
    {
        $this->fC533 = $fC533;
    }

    /**
     * @Type("string")
     */
    private $fC1033;

    /**
     * @return string
     */
    public function getFC1033()
    {
        return $this->fC1033;
    }

    /**
     * @param string $fC1033
     */
    public function setFC1033($fC1033)
    {
        $this->fC1033 = $fC1033;
    }

    /**
     * @Type("string")
     */
    private $fC2033;

    /**
     * @return string
     */
    public function getFC2033()
    {
        return $this->fC2033;
    }

    /**
     * @param string $fC2033
     */
    public function setFC2033($fC2033)
    {
        $this->fC2033 = $fC2033;
    }

    /**
     * @Type("string")
     */
    private $fC5033;

    /**
     * @return string
     */
    public function getFC5033()
    {
        return $this->fC5033;
    }

    /**
     * @param string $fC5033
     */
    public function setFC5033($fC5033)
    {
        $this->fC5033 = $fC5033;
    }

    /**
     * @Type("boolean")
     */
    private $fB34;

    /**
     * @return boolean
     */
    public function getFB34()
    {
        return $this->fB34;
    }

    /**
     * @param boolean $fB34
     */
    public function setFB34($fB34)
    {
        $this->fB34 = $fB34;
    }

    /**
     * @Type("integer")
     */
    private $fI34;

    /**
     * @return integer
     */
    public function getFI34()
    {
        return $this->fI34;
    }

    /**
     * @param integer $fI34
     */
    public function setFI34($fI34)
    {
        $this->fI34 = $fI34;
    }

    /**
     * @Type("decimal")
     */
    private $fN34;

    /**
     * @return decimal
     */
    public function getFN34()
    {
        return $this->fN34;
    }

    /**
     * @param decimal $fN34
     */
    public function setFN34($fN34)
    {
        $this->fN34 = $fN34;
    }

    /**
     * @Type("string")
     */
    private $fC534;

    /**
     * @return string
     */
    public function getFC534()
    {
        return $this->fC534;
    }

    /**
     * @param string $fC534
     */
    public function setFC534($fC534)
    {
        $this->fC534 = $fC534;
    }

    /**
     * @Type("string")
     */
    private $fC1034;

    /**
     * @return string
     */
    public function getFC1034()
    {
        return $this->fC1034;
    }

    /**
     * @param string $fC1034
     */
    public function setFC1034($fC1034)
    {
        $this->fC1034 = $fC1034;
    }

    /**
     * @Type("string")
     */
    private $fC2034;

    /**
     * @return string
     */
    public function getFC2034()
    {
        return $this->fC2034;
    }

    /**
     * @param string $fC2034
     */
    public function setFC2034($fC2034)
    {
        $this->fC2034 = $fC2034;
    }

    /**
     * @Type("string")
     */
    private $fC5034;

    /**
     * @return string
     */
    public function getFC5034()
    {
        return $this->fC5034;
    }

    /**
     * @param string $fC5034
     */
    public function setFC5034($fC5034)
    {
        $this->fC5034 = $fC5034;
    }

    /**
     * @Type("boolean")
     */
    private $fB35;

    /**
     * @return boolean
     */
    public function getFB35()
    {
        return $this->fB35;
    }

    /**
     * @param boolean $fB35
     */
    public function setFB35($fB35)
    {
        $this->fB35 = $fB35;
    }

    /**
     * @Type("integer")
     */
    private $fI35;

    /**
     * @return integer
     */
    public function getFI35()
    {
        return $this->fI35;
    }

    /**
     * @param integer $fI35
     */
    public function setFI35($fI35)
    {
        $this->fI35 = $fI35;
    }

    /**
     * @Type("decimal")
     */
    private $fN35;

    /**
     * @return decimal
     */
    public function getFN35()
    {
        return $this->fN35;
    }

    /**
     * @param decimal $fN35
     */
    public function setFN35($fN35)
    {
        $this->fN35 = $fN35;
    }

    /**
     * @Type("string")
     */
    private $fC535;

    /**
     * @return string
     */
    public function getFC535()
    {
        return $this->fC535;
    }

    /**
     * @param string $fC535
     */
    public function setFC535($fC535)
    {
        $this->fC535 = $fC535;
    }

    /**
     * @Type("string")
     */
    private $fC1035;

    /**
     * @return string
     */
    public function getFC1035()
    {
        return $this->fC1035;
    }

    /**
     * @param string $fC1035
     */
    public function setFC1035($fC1035)
    {
        $this->fC1035 = $fC1035;
    }

    /**
     * @Type("string")
     */
    private $fC2035;

    /**
     * @return string
     */
    public function getFC2035()
    {
        return $this->fC2035;
    }

    /**
     * @param string $fC2035
     */
    public function setFC2035($fC2035)
    {
        $this->fC2035 = $fC2035;
    }

    /**
     * @Type("string")
     */
    private $fC5035;

    /**
     * @return string
     */
    public function getFC5035()
    {
        return $this->fC5035;
    }

    /**
     * @param string $fC5035
     */
    public function setFC5035($fC5035)
    {
        $this->fC5035 = $fC5035;
    }

    /**
     * @Type("boolean")
     */
    private $fB36;

    /**
     * @return boolean
     */
    public function getFB36()
    {
        return $this->fB36;
    }

    /**
     * @param boolean $fB36
     */
    public function setFB36($fB36)
    {
        $this->fB36 = $fB36;
    }

    /**
     * @Type("integer")
     */
    private $fI36;

    /**
     * @return integer
     */
    public function getFI36()
    {
        return $this->fI36;
    }

    /**
     * @param integer $fI36
     */
    public function setFI36($fI36)
    {
        $this->fI36 = $fI36;
    }

    /**
     * @Type("decimal")
     */
    private $fN36;

    /**
     * @return decimal
     */
    public function getFN36()
    {
        return $this->fN36;
    }

    /**
     * @param decimal $fN36
     */
    public function setFN36($fN36)
    {
        $this->fN36 = $fN36;
    }

    /**
     * @Type("string")
     */
    private $fC536;

    /**
     * @return string
     */
    public function getFC536()
    {
        return $this->fC536;
    }

    /**
     * @param string $fC536
     */
    public function setFC536($fC536)
    {
        $this->fC536 = $fC536;
    }

    /**
     * @Type("string")
     */
    private $fC1036;

    /**
     * @return string
     */
    public function getFC1036()
    {
        return $this->fC1036;
    }

    /**
     * @param string $fC1036
     */
    public function setFC1036($fC1036)
    {
        $this->fC1036 = $fC1036;
    }

    /**
     * @Type("string")
     */
    private $fC2036;

    /**
     * @return string
     */
    public function getFC2036()
    {
        return $this->fC2036;
    }

    /**
     * @param string $fC2036
     */
    public function setFC2036($fC2036)
    {
        $this->fC2036 = $fC2036;
    }

    /**
     * @Type("string")
     */
    private $fC5036;

    /**
     * @return string
     */
    public function getFC5036()
    {
        return $this->fC5036;
    }

    /**
     * @param string $fC5036
     */
    public function setFC5036($fC5036)
    {
        $this->fC5036 = $fC5036;
    }

    /**
     * @Type("boolean")
     */
    private $fB37;

    /**
     * @return boolean
     */
    public function getFB37()
    {
        return $this->fB37;
    }

    /**
     * @param boolean $fB37
     */
    public function setFB37($fB37)
    {
        $this->fB37 = $fB37;
    }

    /**
     * @Type("integer")
     */
    private $fI37;

    /**
     * @return integer
     */
    public function getFI37()
    {
        return $this->fI37;
    }

    /**
     * @param integer $fI37
     */
    public function setFI37($fI37)
    {
        $this->fI37 = $fI37;
    }

    /**
     * @Type("decimal")
     */
    private $fN37;

    /**
     * @return decimal
     */
    public function getFN37()
    {
        return $this->fN37;
    }

    /**
     * @param decimal $fN37
     */
    public function setFN37($fN37)
    {
        $this->fN37 = $fN37;
    }

    /**
     * @Type("string")
     */
    private $fC537;

    /**
     * @return string
     */
    public function getFC537()
    {
        return $this->fC537;
    }

    /**
     * @param string $fC537
     */
    public function setFC537($fC537)
    {
        $this->fC537 = $fC537;
    }

    /**
     * @Type("string")
     */
    private $fC1037;

    /**
     * @return string
     */
    public function getFC1037()
    {
        return $this->fC1037;
    }

    /**
     * @param string $fC1037
     */
    public function setFC1037($fC1037)
    {
        $this->fC1037 = $fC1037;
    }

    /**
     * @Type("string")
     */
    private $fC2037;

    /**
     * @return string
     */
    public function getFC2037()
    {
        return $this->fC2037;
    }

    /**
     * @param string $fC2037
     */
    public function setFC2037($fC2037)
    {
        $this->fC2037 = $fC2037;
    }

    /**
     * @Type("string")
     */
    private $fC5037;

    /**
     * @return string
     */
    public function getFC5037()
    {
        return $this->fC5037;
    }

    /**
     * @param string $fC5037
     */
    public function setFC5037($fC5037)
    {
        $this->fC5037 = $fC5037;
    }

    /**
     * @Type("boolean")
     */
    private $fB38;

    /**
     * @return boolean
     */
    public function getFB38()
    {
        return $this->fB38;
    }

    /**
     * @param boolean $fB38
     */
    public function setFB38($fB38)
    {
        $this->fB38 = $fB38;
    }

    /**
     * @Type("integer")
     */
    private $fI38;

    /**
     * @return integer
     */
    public function getFI38()
    {
        return $this->fI38;
    }

    /**
     * @param integer $fI38
     */
    public function setFI38($fI38)
    {
        $this->fI38 = $fI38;
    }

    /**
     * @Type("decimal")
     */
    private $fN38;

    /**
     * @return decimal
     */
    public function getFN38()
    {
        return $this->fN38;
    }

    /**
     * @param decimal $fN38
     */
    public function setFN38($fN38)
    {
        $this->fN38 = $fN38;
    }

    /**
     * @Type("string")
     */
    private $fC538;

    /**
     * @return string
     */
    public function getFC538()
    {
        return $this->fC538;
    }

    /**
     * @param string $fC538
     */
    public function setFC538($fC538)
    {
        $this->fC538 = $fC538;
    }

    /**
     * @Type("string")
     */
    private $fC1038;

    /**
     * @return string
     */
    public function getFC1038()
    {
        return $this->fC1038;
    }

    /**
     * @param string $fC1038
     */
    public function setFC1038($fC1038)
    {
        $this->fC1038 = $fC1038;
    }

    /**
     * @Type("string")
     */
    private $fC2038;

    /**
     * @return string
     */
    public function getFC2038()
    {
        return $this->fC2038;
    }

    /**
     * @param string $fC2038
     */
    public function setFC2038($fC2038)
    {
        $this->fC2038 = $fC2038;
    }

    /**
     * @Type("string")
     */
    private $fC5038;

    /**
     * @return string
     */
    public function getFC5038()
    {
        return $this->fC5038;
    }

    /**
     * @param string $fC5038
     */
    public function setFC5038($fC5038)
    {
        $this->fC5038 = $fC5038;
    }

    /**
     * @Type("boolean")
     */
    private $fB39;

    /**
     * @return boolean
     */
    public function getFB39()
    {
        return $this->fB39;
    }

    /**
     * @param boolean $fB39
     */
    public function setFB39($fB39)
    {
        $this->fB39 = $fB39;
    }

    /**
     * @Type("integer")
     */
    private $fI39;

    /**
     * @return integer
     */
    public function getFI39()
    {
        return $this->fI39;
    }

    /**
     * @param integer $fI39
     */
    public function setFI39($fI39)
    {
        $this->fI39 = $fI39;
    }

    /**
     * @Type("decimal")
     */
    private $fN39;

    /**
     * @return decimal
     */
    public function getFN39()
    {
        return $this->fN39;
    }

    /**
     * @param decimal $fN39
     */
    public function setFN39($fN39)
    {
        $this->fN39 = $fN39;
    }

    /**
     * @Type("string")
     */
    private $fC539;

    /**
     * @return string
     */
    public function getFC539()
    {
        return $this->fC539;
    }

    /**
     * @param string $fC539
     */
    public function setFC539($fC539)
    {
        $this->fC539 = $fC539;
    }

    /**
     * @Type("string")
     */
    private $fC1039;

    /**
     * @return string
     */
    public function getFC1039()
    {
        return $this->fC1039;
    }

    /**
     * @param string $fC1039
     */
    public function setFC1039($fC1039)
    {
        $this->fC1039 = $fC1039;
    }

    /**
     * @Type("string")
     */
    private $fC2039;

    /**
     * @return string
     */
    public function getFC2039()
    {
        return $this->fC2039;
    }

    /**
     * @param string $fC2039
     */
    public function setFC2039($fC2039)
    {
        $this->fC2039 = $fC2039;
    }

    /**
     * @Type("string")
     */
    private $fC5039;

    /**
     * @return string
     */
    public function getFC5039()
    {
        return $this->fC5039;
    }

    /**
     * @param string $fC5039
     */
    public function setFC5039($fC5039)
    {
        $this->fC5039 = $fC5039;
    }

    /**
     * @Type("boolean")
     */
    private $fB40;

    /**
     * @return boolean
     */
    public function getFB40()
    {
        return $this->fB40;
    }

    /**
     * @param boolean $fB40
     */
    public function setFB40($fB40)
    {
        $this->fB40 = $fB40;
    }

    /**
     * @Type("integer")
     */
    private $fI40;

    /**
     * @return integer
     */
    public function getFI40()
    {
        return $this->fI40;
    }

    /**
     * @param integer $fI40
     */
    public function setFI40($fI40)
    {
        $this->fI40 = $fI40;
    }

    /**
     * @Type("decimal")
     */
    private $fN40;

    /**
     * @return decimal
     */
    public function getFN40()
    {
        return $this->fN40;
    }

    /**
     * @param decimal $fN40
     */
    public function setFN40($fN40)
    {
        $this->fN40 = $fN40;
    }

    /**
     * @Type("string")
     */
    private $fC540;

    /**
     * @return string
     */
    public function getFC540()
    {
        return $this->fC540;
    }

    /**
     * @param string $fC540
     */
    public function setFC540($fC540)
    {
        $this->fC540 = $fC540;
    }

    /**
     * @Type("string")
     */
    private $fC1040;

    /**
     * @return string
     */
    public function getFC1040()
    {
        return $this->fC1040;
    }

    /**
     * @param string $fC1040
     */
    public function setFC1040($fC1040)
    {
        $this->fC1040 = $fC1040;
    }

    /**
     * @Type("string")
     */
    private $fC2040;

    /**
     * @return string
     */
    public function getFC2040()
    {
        return $this->fC2040;
    }

    /**
     * @param string $fC2040
     */
    public function setFC2040($fC2040)
    {
        $this->fC2040 = $fC2040;
    }

    /**
     * @Type("string")
     */
    private $fC5040;

    /**
     * @return string
     */
    public function getFC5040()
    {
        return $this->fC5040;
    }

    /**
     * @param string $fC5040
     */
    public function setFC5040($fC5040)
    {
        $this->fC5040 = $fC5040;
    }

    /**
     * @Type("boolean")
     */
    private $fB41;

    /**
     * @return boolean
     */
    public function getFB41()
    {
        return $this->fB41;
    }

    /**
     * @param boolean $fB41
     */
    public function setFB41($fB41)
    {
        $this->fB41 = $fB41;
    }

    /**
     * @Type("integer")
     */
    private $fI41;

    /**
     * @return integer
     */
    public function getFI41()
    {
        return $this->fI41;
    }

    /**
     * @param integer $fI41
     */
    public function setFI41($fI41)
    {
        $this->fI41 = $fI41;
    }

    /**
     * @Type("decimal")
     */
    private $fN41;

    /**
     * @return decimal
     */
    public function getFN41()
    {
        return $this->fN41;
    }

    /**
     * @param decimal $fN41
     */
    public function setFN41($fN41)
    {
        $this->fN41 = $fN41;
    }

    /**
     * @Type("string")
     */
    private $fC541;

    /**
     * @return string
     */
    public function getFC541()
    {
        return $this->fC541;
    }

    /**
     * @param string $fC541
     */
    public function setFC541($fC541)
    {
        $this->fC541 = $fC541;
    }

    /**
     * @Type("string")
     */
    private $fC1041;

    /**
     * @return string
     */
    public function getFC1041()
    {
        return $this->fC1041;
    }

    /**
     * @param string $fC1041
     */
    public function setFC1041($fC1041)
    {
        $this->fC1041 = $fC1041;
    }

    /**
     * @Type("string")
     */
    private $fC2041;

    /**
     * @return string
     */
    public function getFC2041()
    {
        return $this->fC2041;
    }

    /**
     * @param string $fC2041
     */
    public function setFC2041($fC2041)
    {
        $this->fC2041 = $fC2041;
    }

    /**
     * @Type("string")
     */
    private $fC5041;

    /**
     * @return string
     */
    public function getFC5041()
    {
        return $this->fC5041;
    }

    /**
     * @param string $fC5041
     */
    public function setFC5041($fC5041)
    {
        $this->fC5041 = $fC5041;
    }

    /**
     * @Type("boolean")
     */
    private $fB42;

    /**
     * @return boolean
     */
    public function getFB42()
    {
        return $this->fB42;
    }

    /**
     * @param boolean $fB42
     */
    public function setFB42($fB42)
    {
        $this->fB42 = $fB42;
    }

    /**
     * @Type("integer")
     */
    private $fI42;

    /**
     * @return integer
     */
    public function getFI42()
    {
        return $this->fI42;
    }

    /**
     * @param integer $fI42
     */
    public function setFI42($fI42)
    {
        $this->fI42 = $fI42;
    }

    /**
     * @Type("decimal")
     */
    private $fN42;

    /**
     * @return decimal
     */
    public function getFN42()
    {
        return $this->fN42;
    }

    /**
     * @param decimal $fN42
     */
    public function setFN42($fN42)
    {
        $this->fN42 = $fN42;
    }

    /**
     * @Type("string")
     */
    private $fC542;

    /**
     * @return string
     */
    public function getFC542()
    {
        return $this->fC542;
    }

    /**
     * @param string $fC542
     */
    public function setFC542($fC542)
    {
        $this->fC542 = $fC542;
    }

    /**
     * @Type("string")
     */
    private $fC1042;

    /**
     * @return string
     */
    public function getFC1042()
    {
        return $this->fC1042;
    }

    /**
     * @param string $fC1042
     */
    public function setFC1042($fC1042)
    {
        $this->fC1042 = $fC1042;
    }

    /**
     * @Type("string")
     */
    private $fC2042;

    /**
     * @return string
     */
    public function getFC2042()
    {
        return $this->fC2042;
    }

    /**
     * @param string $fC2042
     */
    public function setFC2042($fC2042)
    {
        $this->fC2042 = $fC2042;
    }

    /**
     * @Type("string")
     */
    private $fC5042;

    /**
     * @return string
     */
    public function getFC5042()
    {
        return $this->fC5042;
    }

    /**
     * @param string $fC5042
     */
    public function setFC5042($fC5042)
    {
        $this->fC5042 = $fC5042;
    }

    /**
     * @Type("boolean")
     */
    private $fB43;

    /**
     * @return boolean
     */
    public function getFB43()
    {
        return $this->fB43;
    }

    /**
     * @param boolean $fB43
     */
    public function setFB43($fB43)
    {
        $this->fB43 = $fB43;
    }

    /**
     * @Type("integer")
     */
    private $fI43;

    /**
     * @return integer
     */
    public function getFI43()
    {
        return $this->fI43;
    }

    /**
     * @param integer $fI43
     */
    public function setFI43($fI43)
    {
        $this->fI43 = $fI43;
    }

    /**
     * @Type("decimal")
     */
    private $fN43;

    /**
     * @return decimal
     */
    public function getFN43()
    {
        return $this->fN43;
    }

    /**
     * @param decimal $fN43
     */
    public function setFN43($fN43)
    {
        $this->fN43 = $fN43;
    }

    /**
     * @Type("string")
     */
    private $fC543;

    /**
     * @return string
     */
    public function getFC543()
    {
        return $this->fC543;
    }

    /**
     * @param string $fC543
     */
    public function setFC543($fC543)
    {
        $this->fC543 = $fC543;
    }

    /**
     * @Type("string")
     */
    private $fC1043;

    /**
     * @return string
     */
    public function getFC1043()
    {
        return $this->fC1043;
    }

    /**
     * @param string $fC1043
     */
    public function setFC1043($fC1043)
    {
        $this->fC1043 = $fC1043;
    }

    /**
     * @Type("string")
     */
    private $fC2043;

    /**
     * @return string
     */
    public function getFC2043()
    {
        return $this->fC2043;
    }

    /**
     * @param string $fC2043
     */
    public function setFC2043($fC2043)
    {
        $this->fC2043 = $fC2043;
    }

    /**
     * @Type("string")
     */
    private $fC5043;

    /**
     * @return string
     */
    public function getFC5043()
    {
        return $this->fC5043;
    }

    /**
     * @param string $fC5043
     */
    public function setFC5043($fC5043)
    {
        $this->fC5043 = $fC5043;
    }

    /**
     * @Type("boolean")
     */
    private $fB44;

    /**
     * @return boolean
     */
    public function getFB44()
    {
        return $this->fB44;
    }

    /**
     * @param boolean $fB44
     */
    public function setFB44($fB44)
    {
        $this->fB44 = $fB44;
    }

    /**
     * @Type("integer")
     */
    private $fI44;

    /**
     * @return integer
     */
    public function getFI44()
    {
        return $this->fI44;
    }

    /**
     * @param integer $fI44
     */
    public function setFI44($fI44)
    {
        $this->fI44 = $fI44;
    }

    /**
     * @Type("decimal")
     */
    private $fN44;

    /**
     * @return decimal
     */
    public function getFN44()
    {
        return $this->fN44;
    }

    /**
     * @param decimal $fN44
     */
    public function setFN44($fN44)
    {
        $this->fN44 = $fN44;
    }

    /**
     * @Type("string")
     */
    private $fC544;

    /**
     * @return string
     */
    public function getFC544()
    {
        return $this->fC544;
    }

    /**
     * @param string $fC544
     */
    public function setFC544($fC544)
    {
        $this->fC544 = $fC544;
    }

    /**
     * @Type("string")
     */
    private $fC1044;

    /**
     * @return string
     */
    public function getFC1044()
    {
        return $this->fC1044;
    }

    /**
     * @param string $fC1044
     */
    public function setFC1044($fC1044)
    {
        $this->fC1044 = $fC1044;
    }

    /**
     * @Type("string")
     */
    private $fC2044;

    /**
     * @return string
     */
    public function getFC2044()
    {
        return $this->fC2044;
    }

    /**
     * @param string $fC2044
     */
    public function setFC2044($fC2044)
    {
        $this->fC2044 = $fC2044;
    }

    /**
     * @Type("string")
     */
    private $fC5044;

    /**
     * @return string
     */
    public function getFC5044()
    {
        return $this->fC5044;
    }

    /**
     * @param string $fC5044
     */
    public function setFC5044($fC5044)
    {
        $this->fC5044 = $fC5044;
    }

    /**
     * @Type("boolean")
     */
    private $fB45;

    /**
     * @return boolean
     */
    public function getFB45()
    {
        return $this->fB45;
    }

    /**
     * @param boolean $fB45
     */
    public function setFB45($fB45)
    {
        $this->fB45 = $fB45;
    }

    /**
     * @Type("integer")
     */
    private $fI45;

    /**
     * @return integer
     */
    public function getFI45()
    {
        return $this->fI45;
    }

    /**
     * @param integer $fI45
     */
    public function setFI45($fI45)
    {
        $this->fI45 = $fI45;
    }

    /**
     * @Type("decimal")
     */
    private $fN45;

    /**
     * @return decimal
     */
    public function getFN45()
    {
        return $this->fN45;
    }

    /**
     * @param decimal $fN45
     */
    public function setFN45($fN45)
    {
        $this->fN45 = $fN45;
    }

    /**
     * @Type("string")
     */
    private $fC545;

    /**
     * @return string
     */
    public function getFC545()
    {
        return $this->fC545;
    }

    /**
     * @param string $fC545
     */
    public function setFC545($fC545)
    {
        $this->fC545 = $fC545;
    }

    /**
     * @Type("string")
     */
    private $fC1045;

    /**
     * @return string
     */
    public function getFC1045()
    {
        return $this->fC1045;
    }

    /**
     * @param string $fC1045
     */
    public function setFC1045($fC1045)
    {
        $this->fC1045 = $fC1045;
    }

    /**
     * @Type("string")
     */
    private $fC2045;

    /**
     * @return string
     */
    public function getFC2045()
    {
        return $this->fC2045;
    }

    /**
     * @param string $fC2045
     */
    public function setFC2045($fC2045)
    {
        $this->fC2045 = $fC2045;
    }

    /**
     * @Type("string")
     */
    private $fC5045;

    /**
     * @return string
     */
    public function getFC5045()
    {
        return $this->fC5045;
    }

    /**
     * @param string $fC5045
     */
    public function setFC5045($fC5045)
    {
        $this->fC5045 = $fC5045;
    }

    /**
     * @Type("boolean")
     */
    private $fB46;

    /**
     * @return boolean
     */
    public function getFB46()
    {
        return $this->fB46;
    }

    /**
     * @param boolean $fB46
     */
    public function setFB46($fB46)
    {
        $this->fB46 = $fB46;
    }

    /**
     * @Type("integer")
     */
    private $fI46;

    /**
     * @return integer
     */
    public function getFI46()
    {
        return $this->fI46;
    }

    /**
     * @param integer $fI46
     */
    public function setFI46($fI46)
    {
        $this->fI46 = $fI46;
    }

    /**
     * @Type("decimal")
     */
    private $fN46;

    /**
     * @return decimal
     */
    public function getFN46()
    {
        return $this->fN46;
    }

    /**
     * @param decimal $fN46
     */
    public function setFN46($fN46)
    {
        $this->fN46 = $fN46;
    }

    /**
     * @Type("string")
     */
    private $fC546;

    /**
     * @return string
     */
    public function getFC546()
    {
        return $this->fC546;
    }

    /**
     * @param string $fC546
     */
    public function setFC546($fC546)
    {
        $this->fC546 = $fC546;
    }

    /**
     * @Type("string")
     */
    private $fC1046;

    /**
     * @return string
     */
    public function getFC1046()
    {
        return $this->fC1046;
    }

    /**
     * @param string $fC1046
     */
    public function setFC1046($fC1046)
    {
        $this->fC1046 = $fC1046;
    }

    /**
     * @Type("string")
     */
    private $fC2046;

    /**
     * @return string
     */
    public function getFC2046()
    {
        return $this->fC2046;
    }

    /**
     * @param string $fC2046
     */
    public function setFC2046($fC2046)
    {
        $this->fC2046 = $fC2046;
    }

    /**
     * @Type("string")
     */
    private $fC5046;

    /**
     * @return string
     */
    public function getFC5046()
    {
        return $this->fC5046;
    }

    /**
     * @param string $fC5046
     */
    public function setFC5046($fC5046)
    {
        $this->fC5046 = $fC5046;
    }

    /**
     * @Type("boolean")
     */
    private $fB47;

    /**
     * @return boolean
     */
    public function getFB47()
    {
        return $this->fB47;
    }

    /**
     * @param boolean $fB47
     */
    public function setFB47($fB47)
    {
        $this->fB47 = $fB47;
    }

    /**
     * @Type("integer")
     */
    private $fI47;

    /**
     * @return integer
     */
    public function getFI47()
    {
        return $this->fI47;
    }

    /**
     * @param integer $fI47
     */
    public function setFI47($fI47)
    {
        $this->fI47 = $fI47;
    }

    /**
     * @Type("decimal")
     */
    private $fN47;

    /**
     * @return decimal
     */
    public function getFN47()
    {
        return $this->fN47;
    }

    /**
     * @param decimal $fN47
     */
    public function setFN47($fN47)
    {
        $this->fN47 = $fN47;
    }

    /**
     * @Type("string")
     */
    private $fC547;

    /**
     * @return string
     */
    public function getFC547()
    {
        return $this->fC547;
    }

    /**
     * @param string $fC547
     */
    public function setFC547($fC547)
    {
        $this->fC547 = $fC547;
    }

    /**
     * @Type("string")
     */
    private $fC1047;

    /**
     * @return string
     */
    public function getFC1047()
    {
        return $this->fC1047;
    }

    /**
     * @param string $fC1047
     */
    public function setFC1047($fC1047)
    {
        $this->fC1047 = $fC1047;
    }

    /**
     * @Type("string")
     */
    private $fC2047;

    /**
     * @return string
     */
    public function getFC2047()
    {
        return $this->fC2047;
    }

    /**
     * @param string $fC2047
     */
    public function setFC2047($fC2047)
    {
        $this->fC2047 = $fC2047;
    }

    /**
     * @Type("string")
     */
    private $fC5047;

    /**
     * @return string
     */
    public function getFC5047()
    {
        return $this->fC5047;
    }

    /**
     * @param string $fC5047
     */
    public function setFC5047($fC5047)
    {
        $this->fC5047 = $fC5047;
    }

    /**
     * @Type("boolean")
     */
    private $fB48;

    /**
     * @return boolean
     */
    public function getFB48()
    {
        return $this->fB48;
    }

    /**
     * @param boolean $fB48
     */
    public function setFB48($fB48)
    {
        $this->fB48 = $fB48;
    }

    /**
     * @Type("integer")
     */
    private $fI48;

    /**
     * @return integer
     */
    public function getFI48()
    {
        return $this->fI48;
    }

    /**
     * @param integer $fI48
     */
    public function setFI48($fI48)
    {
        $this->fI48 = $fI48;
    }

    /**
     * @Type("decimal")
     */
    private $fN48;

    /**
     * @return decimal
     */
    public function getFN48()
    {
        return $this->fN48;
    }

    /**
     * @param decimal $fN48
     */
    public function setFN48($fN48)
    {
        $this->fN48 = $fN48;
    }

    /**
     * @Type("string")
     */
    private $fC548;

    /**
     * @return string
     */
    public function getFC548()
    {
        return $this->fC548;
    }

    /**
     * @param string $fC548
     */
    public function setFC548($fC548)
    {
        $this->fC548 = $fC548;
    }

    /**
     * @Type("string")
     */
    private $fC1048;

    /**
     * @return string
     */
    public function getFC1048()
    {
        return $this->fC1048;
    }

    /**
     * @param string $fC1048
     */
    public function setFC1048($fC1048)
    {
        $this->fC1048 = $fC1048;
    }

    /**
     * @Type("string")
     */
    private $fC2048;

    /**
     * @return string
     */
    public function getFC2048()
    {
        return $this->fC2048;
    }

    /**
     * @param string $fC2048
     */
    public function setFC2048($fC2048)
    {
        $this->fC2048 = $fC2048;
    }

    /**
     * @Type("string")
     */
    private $fC5048;

    /**
     * @return string
     */
    public function getFC5048()
    {
        return $this->fC5048;
    }

    /**
     * @param string $fC5048
     */
    public function setFC5048($fC5048)
    {
        $this->fC5048 = $fC5048;
    }

    /**
     * @Type("boolean")
     */
    private $fB49;

    /**
     * @return boolean
     */
    public function getFB49()
    {
        return $this->fB49;
    }

    /**
     * @param boolean $fB49
     */
    public function setFB49($fB49)
    {
        $this->fB49 = $fB49;
    }

    /**
     * @Type("integer")
     */
    private $fI49;

    /**
     * @return integer
     */
    public function getFI49()
    {
        return $this->fI49;
    }

    /**
     * @param integer $fI49
     */
    public function setFI49($fI49)
    {
        $this->fI49 = $fI49;
    }

    /**
     * @Type("decimal")
     */
    private $fN49;

    /**
     * @return decimal
     */
    public function getFN49()
    {
        return $this->fN49;
    }

    /**
     * @param decimal $fN49
     */
    public function setFN49($fN49)
    {
        $this->fN49 = $fN49;
    }

    /**
     * @Type("string")
     */
    private $fC549;

    /**
     * @return string
     */
    public function getFC549()
    {
        return $this->fC549;
    }

    /**
     * @param string $fC549
     */
    public function setFC549($fC549)
    {
        $this->fC549 = $fC549;
    }

    /**
     * @Type("string")
     */
    private $fC1049;

    /**
     * @return string
     */
    public function getFC1049()
    {
        return $this->fC1049;
    }

    /**
     * @param string $fC1049
     */
    public function setFC1049($fC1049)
    {
        $this->fC1049 = $fC1049;
    }

    /**
     * @Type("string")
     */
    private $fC2049;

    /**
     * @return string
     */
    public function getFC2049()
    {
        return $this->fC2049;
    }

    /**
     * @param string $fC2049
     */
    public function setFC2049($fC2049)
    {
        $this->fC2049 = $fC2049;
    }

    /**
     * @Type("string")
     */
    private $fC5049;

    /**
     * @return string
     */
    public function getFC5049()
    {
        return $this->fC5049;
    }

    /**
     * @param string $fC5049
     */
    public function setFC5049($fC5049)
    {
        $this->fC5049 = $fC5049;
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

    /**
     * @Type("long")
     */
    private $version;

    /**
     * @return long
     */
    public function getVersion()
    {
        return $this->version;
    }

    /**
     * @param long $version
     */
    public function setVersion($version)
    {
        $this->version = $version;
    }

    /**
     * @Type("string")
     */
    private $createdBy;

    /**
     * @return string
     */
    public function getCreatedBy()
    {
        return $this->createdBy;
    }

    /**
     * @param string $createdBy
     */
    public function setCreatedBy($createdBy)
    {
        $this->createdBy = $createdBy;
    }

    /**
     * @Type("\DateTime")
     */
    private $createdAt;

    /**
     * @return \DateTime
     */
    public function getCreatedAt()
    {
        return $this->createdAt;
    }

    /**
     * @param \DateTime $createdAt
     */
    public function setCreatedAt($createdAt)
    {
        $this->createdAt = $createdAt;
    }

    /**
     * @Type("string")
     */
    private $updatedBy;

    /**
     * @return string
     */
    public function getUpdatedBy()
    {
        return $this->updatedBy;
    }

    /**
     * @param string $updatedBy
     */
    public function setUpdatedBy($updatedBy)
    {
        $this->updatedBy = $updatedBy;
    }

    /**
     * @Type("\DateTime")
     */
    private $updatedAt;

    /**
     * @return \DateTime
     */
    public function getUpdatedAt()
    {
        return $this->updatedAt;
    }

    /**
     * @param \DateTime $updatedAt
     */
    public function setUpdatedAt($updatedAt)
    {
        $this->updatedAt = $updatedAt;
    }


}

