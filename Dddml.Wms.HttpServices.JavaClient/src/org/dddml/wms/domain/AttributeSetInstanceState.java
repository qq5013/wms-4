package org.dddml.wms.domain;

import java.util.Set;
import java.math.BigDecimal;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.AttributeSetInstanceStateEvent.*;

public interface AttributeSetInstanceState
{
    String getAttributeSetInstanceId();

    void setAttributeSetInstanceId(String attributeSetInstanceId);

    String getAttributeSetId();

    void setAttributeSetId(String attributeSetId);

    String getOrganizationId();

    void setOrganizationId(String organizationId);

    String getReferenceId();

    void setReferenceId(String referenceId);

    String getSerialNumber();

    void setSerialNumber(String serialNumber);

    String getLot();

    void setLot(String lot);

    String getDescription();

    void setDescription(String description);

    String getHash();

    void setHash(String hash);

    Boolean get_F_B_0_();

    void set_F_B_0_(Boolean _f_B_0_);

    Integer get_F_I_0_();

    void set_F_I_0_(Integer _f_I_0_);

    Long get_F_L_0_();

    void set_F_L_0_(Long _f_L_0_);

    Date get_F_DT_0_();

    void set_F_DT_0_(Date _f_DT_0_);

    BigDecimal get_F_N_0_();

    void set_F_N_0_(BigDecimal _f_N_0_);

    String get_F_C5_0_();

    void set_F_C5_0_(String _f_C5_0_);

    String get_F_C10_0_();

    void set_F_C10_0_(String _f_C10_0_);

    String get_F_C20_0_();

    void set_F_C20_0_(String _f_C20_0_);

    String get_F_C50_0_();

    void set_F_C50_0_(String _f_C50_0_);

    String get_F_C100_0_();

    void set_F_C100_0_(String _f_C100_0_);

    String get_F_C200_0_();

    void set_F_C200_0_(String _f_C200_0_);

    String get_F_C500_0_();

    void set_F_C500_0_(String _f_C500_0_);

    String get_F_C1000_0_();

    void set_F_C1000_0_(String _f_C1000_0_);

    Boolean get_F_B_1_();

    void set_F_B_1_(Boolean _f_B_1_);

    Integer get_F_I_1_();

    void set_F_I_1_(Integer _f_I_1_);

    Long get_F_L_1_();

    void set_F_L_1_(Long _f_L_1_);

    Date get_F_DT_1_();

    void set_F_DT_1_(Date _f_DT_1_);

    BigDecimal get_F_N_1_();

    void set_F_N_1_(BigDecimal _f_N_1_);

    String get_F_C5_1_();

    void set_F_C5_1_(String _f_C5_1_);

    String get_F_C10_1_();

    void set_F_C10_1_(String _f_C10_1_);

    String get_F_C20_1_();

    void set_F_C20_1_(String _f_C20_1_);

    String get_F_C50_1_();

    void set_F_C50_1_(String _f_C50_1_);

    String get_F_C100_1_();

    void set_F_C100_1_(String _f_C100_1_);

    String get_F_C200_1_();

    void set_F_C200_1_(String _f_C200_1_);

    String get_F_C500_1_();

    void set_F_C500_1_(String _f_C500_1_);

    String get_F_C1000_1_();

    void set_F_C1000_1_(String _f_C1000_1_);

    Boolean get_F_B_2_();

    void set_F_B_2_(Boolean _f_B_2_);

    Integer get_F_I_2_();

    void set_F_I_2_(Integer _f_I_2_);

    Long get_F_L_2_();

    void set_F_L_2_(Long _f_L_2_);

    Date get_F_DT_2_();

    void set_F_DT_2_(Date _f_DT_2_);

    BigDecimal get_F_N_2_();

    void set_F_N_2_(BigDecimal _f_N_2_);

    String get_F_C5_2_();

    void set_F_C5_2_(String _f_C5_2_);

    String get_F_C10_2_();

    void set_F_C10_2_(String _f_C10_2_);

    String get_F_C20_2_();

    void set_F_C20_2_(String _f_C20_2_);

    String get_F_C50_2_();

    void set_F_C50_2_(String _f_C50_2_);

    String get_F_C100_2_();

    void set_F_C100_2_(String _f_C100_2_);

    String get_F_C200_2_();

    void set_F_C200_2_(String _f_C200_2_);

    String get_F_C500_2_();

    void set_F_C500_2_(String _f_C500_2_);

    String get_F_C1000_2_();

    void set_F_C1000_2_(String _f_C1000_2_);

    Boolean get_F_B_3_();

    void set_F_B_3_(Boolean _f_B_3_);

    Integer get_F_I_3_();

    void set_F_I_3_(Integer _f_I_3_);

    Long get_F_L_3_();

    void set_F_L_3_(Long _f_L_3_);

    Date get_F_DT_3_();

    void set_F_DT_3_(Date _f_DT_3_);

    BigDecimal get_F_N_3_();

    void set_F_N_3_(BigDecimal _f_N_3_);

    String get_F_C5_3_();

    void set_F_C5_3_(String _f_C5_3_);

    String get_F_C10_3_();

    void set_F_C10_3_(String _f_C10_3_);

    String get_F_C20_3_();

    void set_F_C20_3_(String _f_C20_3_);

    String get_F_C50_3_();

    void set_F_C50_3_(String _f_C50_3_);

    String get_F_C100_3_();

    void set_F_C100_3_(String _f_C100_3_);

    String get_F_C200_3_();

    void set_F_C200_3_(String _f_C200_3_);

    String get_F_C500_3_();

    void set_F_C500_3_(String _f_C500_3_);

    String get_F_C1000_3_();

    void set_F_C1000_3_(String _f_C1000_3_);

    Boolean get_F_B_4_();

    void set_F_B_4_(Boolean _f_B_4_);

    Integer get_F_I_4_();

    void set_F_I_4_(Integer _f_I_4_);

    Long get_F_L_4_();

    void set_F_L_4_(Long _f_L_4_);

    Date get_F_DT_4_();

    void set_F_DT_4_(Date _f_DT_4_);

    BigDecimal get_F_N_4_();

    void set_F_N_4_(BigDecimal _f_N_4_);

    String get_F_C5_4_();

    void set_F_C5_4_(String _f_C5_4_);

    String get_F_C10_4_();

    void set_F_C10_4_(String _f_C10_4_);

    String get_F_C20_4_();

    void set_F_C20_4_(String _f_C20_4_);

    String get_F_C50_4_();

    void set_F_C50_4_(String _f_C50_4_);

    String get_F_C100_4_();

    void set_F_C100_4_(String _f_C100_4_);

    String get_F_C200_4_();

    void set_F_C200_4_(String _f_C200_4_);

    String get_F_C500_4_();

    void set_F_C500_4_(String _f_C500_4_);

    String get_F_C1000_4_();

    void set_F_C1000_4_(String _f_C1000_4_);

    Boolean get_F_B_5_();

    void set_F_B_5_(Boolean _f_B_5_);

    Integer get_F_I_5_();

    void set_F_I_5_(Integer _f_I_5_);

    Long get_F_L_5_();

    void set_F_L_5_(Long _f_L_5_);

    Date get_F_DT_5_();

    void set_F_DT_5_(Date _f_DT_5_);

    BigDecimal get_F_N_5_();

    void set_F_N_5_(BigDecimal _f_N_5_);

    String get_F_C5_5_();

    void set_F_C5_5_(String _f_C5_5_);

    String get_F_C10_5_();

    void set_F_C10_5_(String _f_C10_5_);

    String get_F_C20_5_();

    void set_F_C20_5_(String _f_C20_5_);

    String get_F_C50_5_();

    void set_F_C50_5_(String _f_C50_5_);

    String get_F_C100_5_();

    void set_F_C100_5_(String _f_C100_5_);

    String get_F_C200_5_();

    void set_F_C200_5_(String _f_C200_5_);

    String get_F_C500_5_();

    void set_F_C500_5_(String _f_C500_5_);

    Boolean get_F_B_6_();

    void set_F_B_6_(Boolean _f_B_6_);

    Integer get_F_I_6_();

    void set_F_I_6_(Integer _f_I_6_);

    Long get_F_L_6_();

    void set_F_L_6_(Long _f_L_6_);

    Date get_F_DT_6_();

    void set_F_DT_6_(Date _f_DT_6_);

    BigDecimal get_F_N_6_();

    void set_F_N_6_(BigDecimal _f_N_6_);

    String get_F_C5_6_();

    void set_F_C5_6_(String _f_C5_6_);

    String get_F_C10_6_();

    void set_F_C10_6_(String _f_C10_6_);

    String get_F_C20_6_();

    void set_F_C20_6_(String _f_C20_6_);

    String get_F_C50_6_();

    void set_F_C50_6_(String _f_C50_6_);

    String get_F_C100_6_();

    void set_F_C100_6_(String _f_C100_6_);

    String get_F_C200_6_();

    void set_F_C200_6_(String _f_C200_6_);

    String get_F_C500_6_();

    void set_F_C500_6_(String _f_C500_6_);

    Boolean get_F_B_7_();

    void set_F_B_7_(Boolean _f_B_7_);

    Integer get_F_I_7_();

    void set_F_I_7_(Integer _f_I_7_);

    Long get_F_L_7_();

    void set_F_L_7_(Long _f_L_7_);

    Date get_F_DT_7_();

    void set_F_DT_7_(Date _f_DT_7_);

    BigDecimal get_F_N_7_();

    void set_F_N_7_(BigDecimal _f_N_7_);

    String get_F_C5_7_();

    void set_F_C5_7_(String _f_C5_7_);

    String get_F_C10_7_();

    void set_F_C10_7_(String _f_C10_7_);

    String get_F_C20_7_();

    void set_F_C20_7_(String _f_C20_7_);

    String get_F_C50_7_();

    void set_F_C50_7_(String _f_C50_7_);

    String get_F_C100_7_();

    void set_F_C100_7_(String _f_C100_7_);

    String get_F_C200_7_();

    void set_F_C200_7_(String _f_C200_7_);

    String get_F_C500_7_();

    void set_F_C500_7_(String _f_C500_7_);

    Boolean get_F_B_8_();

    void set_F_B_8_(Boolean _f_B_8_);

    Integer get_F_I_8_();

    void set_F_I_8_(Integer _f_I_8_);

    Long get_F_L_8_();

    void set_F_L_8_(Long _f_L_8_);

    Date get_F_DT_8_();

    void set_F_DT_8_(Date _f_DT_8_);

    BigDecimal get_F_N_8_();

    void set_F_N_8_(BigDecimal _f_N_8_);

    String get_F_C5_8_();

    void set_F_C5_8_(String _f_C5_8_);

    String get_F_C10_8_();

    void set_F_C10_8_(String _f_C10_8_);

    String get_F_C20_8_();

    void set_F_C20_8_(String _f_C20_8_);

    String get_F_C50_8_();

    void set_F_C50_8_(String _f_C50_8_);

    String get_F_C100_8_();

    void set_F_C100_8_(String _f_C100_8_);

    String get_F_C200_8_();

    void set_F_C200_8_(String _f_C200_8_);

    String get_F_C500_8_();

    void set_F_C500_8_(String _f_C500_8_);

    Boolean get_F_B_9_();

    void set_F_B_9_(Boolean _f_B_9_);

    Integer get_F_I_9_();

    void set_F_I_9_(Integer _f_I_9_);

    Long get_F_L_9_();

    void set_F_L_9_(Long _f_L_9_);

    Date get_F_DT_9_();

    void set_F_DT_9_(Date _f_DT_9_);

    BigDecimal get_F_N_9_();

    void set_F_N_9_(BigDecimal _f_N_9_);

    String get_F_C5_9_();

    void set_F_C5_9_(String _f_C5_9_);

    String get_F_C10_9_();

    void set_F_C10_9_(String _f_C10_9_);

    String get_F_C20_9_();

    void set_F_C20_9_(String _f_C20_9_);

    String get_F_C50_9_();

    void set_F_C50_9_(String _f_C50_9_);

    String get_F_C100_9_();

    void set_F_C100_9_(String _f_C100_9_);

    String get_F_C200_9_();

    void set_F_C200_9_(String _f_C200_9_);

    String get_F_C500_9_();

    void set_F_C500_9_(String _f_C500_9_);

    Boolean get_F_B_10_();

    void set_F_B_10_(Boolean _f_B_10_);

    Integer get_F_I_10_();

    void set_F_I_10_(Integer _f_I_10_);

    Long get_F_L_10_();

    void set_F_L_10_(Long _f_L_10_);

    Date get_F_DT_10_();

    void set_F_DT_10_(Date _f_DT_10_);

    BigDecimal get_F_N_10_();

    void set_F_N_10_(BigDecimal _f_N_10_);

    String get_F_C5_10_();

    void set_F_C5_10_(String _f_C5_10_);

    String get_F_C10_10_();

    void set_F_C10_10_(String _f_C10_10_);

    String get_F_C20_10_();

    void set_F_C20_10_(String _f_C20_10_);

    String get_F_C50_10_();

    void set_F_C50_10_(String _f_C50_10_);

    String get_F_C100_10_();

    void set_F_C100_10_(String _f_C100_10_);

    String get_F_C200_10_();

    void set_F_C200_10_(String _f_C200_10_);

    Boolean get_F_B_11_();

    void set_F_B_11_(Boolean _f_B_11_);

    Integer get_F_I_11_();

    void set_F_I_11_(Integer _f_I_11_);

    Long get_F_L_11_();

    void set_F_L_11_(Long _f_L_11_);

    Date get_F_DT_11_();

    void set_F_DT_11_(Date _f_DT_11_);

    BigDecimal get_F_N_11_();

    void set_F_N_11_(BigDecimal _f_N_11_);

    String get_F_C5_11_();

    void set_F_C5_11_(String _f_C5_11_);

    String get_F_C10_11_();

    void set_F_C10_11_(String _f_C10_11_);

    String get_F_C20_11_();

    void set_F_C20_11_(String _f_C20_11_);

    String get_F_C50_11_();

    void set_F_C50_11_(String _f_C50_11_);

    String get_F_C100_11_();

    void set_F_C100_11_(String _f_C100_11_);

    String get_F_C200_11_();

    void set_F_C200_11_(String _f_C200_11_);

    Boolean get_F_B_12_();

    void set_F_B_12_(Boolean _f_B_12_);

    Integer get_F_I_12_();

    void set_F_I_12_(Integer _f_I_12_);

    Long get_F_L_12_();

    void set_F_L_12_(Long _f_L_12_);

    Date get_F_DT_12_();

    void set_F_DT_12_(Date _f_DT_12_);

    BigDecimal get_F_N_12_();

    void set_F_N_12_(BigDecimal _f_N_12_);

    String get_F_C5_12_();

    void set_F_C5_12_(String _f_C5_12_);

    String get_F_C10_12_();

    void set_F_C10_12_(String _f_C10_12_);

    String get_F_C20_12_();

    void set_F_C20_12_(String _f_C20_12_);

    String get_F_C50_12_();

    void set_F_C50_12_(String _f_C50_12_);

    String get_F_C100_12_();

    void set_F_C100_12_(String _f_C100_12_);

    String get_F_C200_12_();

    void set_F_C200_12_(String _f_C200_12_);

    Boolean get_F_B_13_();

    void set_F_B_13_(Boolean _f_B_13_);

    Integer get_F_I_13_();

    void set_F_I_13_(Integer _f_I_13_);

    Long get_F_L_13_();

    void set_F_L_13_(Long _f_L_13_);

    Date get_F_DT_13_();

    void set_F_DT_13_(Date _f_DT_13_);

    BigDecimal get_F_N_13_();

    void set_F_N_13_(BigDecimal _f_N_13_);

    String get_F_C5_13_();

    void set_F_C5_13_(String _f_C5_13_);

    String get_F_C10_13_();

    void set_F_C10_13_(String _f_C10_13_);

    String get_F_C20_13_();

    void set_F_C20_13_(String _f_C20_13_);

    String get_F_C50_13_();

    void set_F_C50_13_(String _f_C50_13_);

    String get_F_C100_13_();

    void set_F_C100_13_(String _f_C100_13_);

    String get_F_C200_13_();

    void set_F_C200_13_(String _f_C200_13_);

    Boolean get_F_B_14_();

    void set_F_B_14_(Boolean _f_B_14_);

    Integer get_F_I_14_();

    void set_F_I_14_(Integer _f_I_14_);

    Long get_F_L_14_();

    void set_F_L_14_(Long _f_L_14_);

    Date get_F_DT_14_();

    void set_F_DT_14_(Date _f_DT_14_);

    BigDecimal get_F_N_14_();

    void set_F_N_14_(BigDecimal _f_N_14_);

    String get_F_C5_14_();

    void set_F_C5_14_(String _f_C5_14_);

    String get_F_C10_14_();

    void set_F_C10_14_(String _f_C10_14_);

    String get_F_C20_14_();

    void set_F_C20_14_(String _f_C20_14_);

    String get_F_C50_14_();

    void set_F_C50_14_(String _f_C50_14_);

    String get_F_C100_14_();

    void set_F_C100_14_(String _f_C100_14_);

    String get_F_C200_14_();

    void set_F_C200_14_(String _f_C200_14_);

    Boolean get_F_B_15_();

    void set_F_B_15_(Boolean _f_B_15_);

    Integer get_F_I_15_();

    void set_F_I_15_(Integer _f_I_15_);

    Long get_F_L_15_();

    void set_F_L_15_(Long _f_L_15_);

    Date get_F_DT_15_();

    void set_F_DT_15_(Date _f_DT_15_);

    BigDecimal get_F_N_15_();

    void set_F_N_15_(BigDecimal _f_N_15_);

    String get_F_C5_15_();

    void set_F_C5_15_(String _f_C5_15_);

    String get_F_C10_15_();

    void set_F_C10_15_(String _f_C10_15_);

    String get_F_C20_15_();

    void set_F_C20_15_(String _f_C20_15_);

    String get_F_C50_15_();

    void set_F_C50_15_(String _f_C50_15_);

    String get_F_C100_15_();

    void set_F_C100_15_(String _f_C100_15_);

    String get_F_C200_15_();

    void set_F_C200_15_(String _f_C200_15_);

    Boolean get_F_B_16_();

    void set_F_B_16_(Boolean _f_B_16_);

    Integer get_F_I_16_();

    void set_F_I_16_(Integer _f_I_16_);

    Long get_F_L_16_();

    void set_F_L_16_(Long _f_L_16_);

    Date get_F_DT_16_();

    void set_F_DT_16_(Date _f_DT_16_);

    BigDecimal get_F_N_16_();

    void set_F_N_16_(BigDecimal _f_N_16_);

    String get_F_C5_16_();

    void set_F_C5_16_(String _f_C5_16_);

    String get_F_C10_16_();

    void set_F_C10_16_(String _f_C10_16_);

    String get_F_C20_16_();

    void set_F_C20_16_(String _f_C20_16_);

    String get_F_C50_16_();

    void set_F_C50_16_(String _f_C50_16_);

    String get_F_C100_16_();

    void set_F_C100_16_(String _f_C100_16_);

    String get_F_C200_16_();

    void set_F_C200_16_(String _f_C200_16_);

    Boolean get_F_B_17_();

    void set_F_B_17_(Boolean _f_B_17_);

    Integer get_F_I_17_();

    void set_F_I_17_(Integer _f_I_17_);

    Long get_F_L_17_();

    void set_F_L_17_(Long _f_L_17_);

    Date get_F_DT_17_();

    void set_F_DT_17_(Date _f_DT_17_);

    BigDecimal get_F_N_17_();

    void set_F_N_17_(BigDecimal _f_N_17_);

    String get_F_C5_17_();

    void set_F_C5_17_(String _f_C5_17_);

    String get_F_C10_17_();

    void set_F_C10_17_(String _f_C10_17_);

    String get_F_C20_17_();

    void set_F_C20_17_(String _f_C20_17_);

    String get_F_C50_17_();

    void set_F_C50_17_(String _f_C50_17_);

    String get_F_C100_17_();

    void set_F_C100_17_(String _f_C100_17_);

    String get_F_C200_17_();

    void set_F_C200_17_(String _f_C200_17_);

    Boolean get_F_B_18_();

    void set_F_B_18_(Boolean _f_B_18_);

    Integer get_F_I_18_();

    void set_F_I_18_(Integer _f_I_18_);

    Long get_F_L_18_();

    void set_F_L_18_(Long _f_L_18_);

    Date get_F_DT_18_();

    void set_F_DT_18_(Date _f_DT_18_);

    BigDecimal get_F_N_18_();

    void set_F_N_18_(BigDecimal _f_N_18_);

    String get_F_C5_18_();

    void set_F_C5_18_(String _f_C5_18_);

    String get_F_C10_18_();

    void set_F_C10_18_(String _f_C10_18_);

    String get_F_C20_18_();

    void set_F_C20_18_(String _f_C20_18_);

    String get_F_C50_18_();

    void set_F_C50_18_(String _f_C50_18_);

    String get_F_C100_18_();

    void set_F_C100_18_(String _f_C100_18_);

    String get_F_C200_18_();

    void set_F_C200_18_(String _f_C200_18_);

    Boolean get_F_B_19_();

    void set_F_B_19_(Boolean _f_B_19_);

    Integer get_F_I_19_();

    void set_F_I_19_(Integer _f_I_19_);

    Long get_F_L_19_();

    void set_F_L_19_(Long _f_L_19_);

    Date get_F_DT_19_();

    void set_F_DT_19_(Date _f_DT_19_);

    BigDecimal get_F_N_19_();

    void set_F_N_19_(BigDecimal _f_N_19_);

    String get_F_C5_19_();

    void set_F_C5_19_(String _f_C5_19_);

    String get_F_C10_19_();

    void set_F_C10_19_(String _f_C10_19_);

    String get_F_C20_19_();

    void set_F_C20_19_(String _f_C20_19_);

    String get_F_C50_19_();

    void set_F_C50_19_(String _f_C50_19_);

    String get_F_C100_19_();

    void set_F_C100_19_(String _f_C100_19_);

    String get_F_C200_19_();

    void set_F_C200_19_(String _f_C200_19_);

    Boolean get_F_B_20_();

    void set_F_B_20_(Boolean _f_B_20_);

    Integer get_F_I_20_();

    void set_F_I_20_(Integer _f_I_20_);

    Long get_F_L_20_();

    void set_F_L_20_(Long _f_L_20_);

    BigDecimal get_F_N_20_();

    void set_F_N_20_(BigDecimal _f_N_20_);

    String get_F_C5_20_();

    void set_F_C5_20_(String _f_C5_20_);

    String get_F_C10_20_();

    void set_F_C10_20_(String _f_C10_20_);

    String get_F_C20_20_();

    void set_F_C20_20_(String _f_C20_20_);

    String get_F_C50_20_();

    void set_F_C50_20_(String _f_C50_20_);

    Boolean get_F_B_21_();

    void set_F_B_21_(Boolean _f_B_21_);

    Integer get_F_I_21_();

    void set_F_I_21_(Integer _f_I_21_);

    Long get_F_L_21_();

    void set_F_L_21_(Long _f_L_21_);

    BigDecimal get_F_N_21_();

    void set_F_N_21_(BigDecimal _f_N_21_);

    String get_F_C5_21_();

    void set_F_C5_21_(String _f_C5_21_);

    String get_F_C10_21_();

    void set_F_C10_21_(String _f_C10_21_);

    String get_F_C20_21_();

    void set_F_C20_21_(String _f_C20_21_);

    String get_F_C50_21_();

    void set_F_C50_21_(String _f_C50_21_);

    Boolean get_F_B_22_();

    void set_F_B_22_(Boolean _f_B_22_);

    Integer get_F_I_22_();

    void set_F_I_22_(Integer _f_I_22_);

    Long get_F_L_22_();

    void set_F_L_22_(Long _f_L_22_);

    BigDecimal get_F_N_22_();

    void set_F_N_22_(BigDecimal _f_N_22_);

    String get_F_C5_22_();

    void set_F_C5_22_(String _f_C5_22_);

    String get_F_C10_22_();

    void set_F_C10_22_(String _f_C10_22_);

    String get_F_C20_22_();

    void set_F_C20_22_(String _f_C20_22_);

    String get_F_C50_22_();

    void set_F_C50_22_(String _f_C50_22_);

    Boolean get_F_B_23_();

    void set_F_B_23_(Boolean _f_B_23_);

    Integer get_F_I_23_();

    void set_F_I_23_(Integer _f_I_23_);

    Long get_F_L_23_();

    void set_F_L_23_(Long _f_L_23_);

    BigDecimal get_F_N_23_();

    void set_F_N_23_(BigDecimal _f_N_23_);

    String get_F_C5_23_();

    void set_F_C5_23_(String _f_C5_23_);

    String get_F_C10_23_();

    void set_F_C10_23_(String _f_C10_23_);

    String get_F_C20_23_();

    void set_F_C20_23_(String _f_C20_23_);

    String get_F_C50_23_();

    void set_F_C50_23_(String _f_C50_23_);

    Boolean get_F_B_24_();

    void set_F_B_24_(Boolean _f_B_24_);

    Integer get_F_I_24_();

    void set_F_I_24_(Integer _f_I_24_);

    Long get_F_L_24_();

    void set_F_L_24_(Long _f_L_24_);

    BigDecimal get_F_N_24_();

    void set_F_N_24_(BigDecimal _f_N_24_);

    String get_F_C5_24_();

    void set_F_C5_24_(String _f_C5_24_);

    String get_F_C10_24_();

    void set_F_C10_24_(String _f_C10_24_);

    String get_F_C20_24_();

    void set_F_C20_24_(String _f_C20_24_);

    String get_F_C50_24_();

    void set_F_C50_24_(String _f_C50_24_);

    Boolean get_F_B_25_();

    void set_F_B_25_(Boolean _f_B_25_);

    Integer get_F_I_25_();

    void set_F_I_25_(Integer _f_I_25_);

    Long get_F_L_25_();

    void set_F_L_25_(Long _f_L_25_);

    BigDecimal get_F_N_25_();

    void set_F_N_25_(BigDecimal _f_N_25_);

    String get_F_C5_25_();

    void set_F_C5_25_(String _f_C5_25_);

    String get_F_C10_25_();

    void set_F_C10_25_(String _f_C10_25_);

    String get_F_C20_25_();

    void set_F_C20_25_(String _f_C20_25_);

    String get_F_C50_25_();

    void set_F_C50_25_(String _f_C50_25_);

    Boolean get_F_B_26_();

    void set_F_B_26_(Boolean _f_B_26_);

    Integer get_F_I_26_();

    void set_F_I_26_(Integer _f_I_26_);

    Long get_F_L_26_();

    void set_F_L_26_(Long _f_L_26_);

    BigDecimal get_F_N_26_();

    void set_F_N_26_(BigDecimal _f_N_26_);

    String get_F_C5_26_();

    void set_F_C5_26_(String _f_C5_26_);

    String get_F_C10_26_();

    void set_F_C10_26_(String _f_C10_26_);

    String get_F_C20_26_();

    void set_F_C20_26_(String _f_C20_26_);

    String get_F_C50_26_();

    void set_F_C50_26_(String _f_C50_26_);

    Boolean get_F_B_27_();

    void set_F_B_27_(Boolean _f_B_27_);

    Integer get_F_I_27_();

    void set_F_I_27_(Integer _f_I_27_);

    Long get_F_L_27_();

    void set_F_L_27_(Long _f_L_27_);

    BigDecimal get_F_N_27_();

    void set_F_N_27_(BigDecimal _f_N_27_);

    String get_F_C5_27_();

    void set_F_C5_27_(String _f_C5_27_);

    String get_F_C10_27_();

    void set_F_C10_27_(String _f_C10_27_);

    String get_F_C20_27_();

    void set_F_C20_27_(String _f_C20_27_);

    String get_F_C50_27_();

    void set_F_C50_27_(String _f_C50_27_);

    Boolean get_F_B_28_();

    void set_F_B_28_(Boolean _f_B_28_);

    Integer get_F_I_28_();

    void set_F_I_28_(Integer _f_I_28_);

    Long get_F_L_28_();

    void set_F_L_28_(Long _f_L_28_);

    BigDecimal get_F_N_28_();

    void set_F_N_28_(BigDecimal _f_N_28_);

    String get_F_C5_28_();

    void set_F_C5_28_(String _f_C5_28_);

    String get_F_C10_28_();

    void set_F_C10_28_(String _f_C10_28_);

    String get_F_C20_28_();

    void set_F_C20_28_(String _f_C20_28_);

    String get_F_C50_28_();

    void set_F_C50_28_(String _f_C50_28_);

    Boolean get_F_B_29_();

    void set_F_B_29_(Boolean _f_B_29_);

    Integer get_F_I_29_();

    void set_F_I_29_(Integer _f_I_29_);

    Long get_F_L_29_();

    void set_F_L_29_(Long _f_L_29_);

    BigDecimal get_F_N_29_();

    void set_F_N_29_(BigDecimal _f_N_29_);

    String get_F_C5_29_();

    void set_F_C5_29_(String _f_C5_29_);

    String get_F_C10_29_();

    void set_F_C10_29_(String _f_C10_29_);

    String get_F_C20_29_();

    void set_F_C20_29_(String _f_C20_29_);

    String get_F_C50_29_();

    void set_F_C50_29_(String _f_C50_29_);

    Boolean get_F_B_30_();

    void set_F_B_30_(Boolean _f_B_30_);

    Integer get_F_I_30_();

    void set_F_I_30_(Integer _f_I_30_);

    BigDecimal get_F_N_30_();

    void set_F_N_30_(BigDecimal _f_N_30_);

    String get_F_C5_30_();

    void set_F_C5_30_(String _f_C5_30_);

    String get_F_C10_30_();

    void set_F_C10_30_(String _f_C10_30_);

    String get_F_C20_30_();

    void set_F_C20_30_(String _f_C20_30_);

    String get_F_C50_30_();

    void set_F_C50_30_(String _f_C50_30_);

    Boolean get_F_B_31_();

    void set_F_B_31_(Boolean _f_B_31_);

    Integer get_F_I_31_();

    void set_F_I_31_(Integer _f_I_31_);

    BigDecimal get_F_N_31_();

    void set_F_N_31_(BigDecimal _f_N_31_);

    String get_F_C5_31_();

    void set_F_C5_31_(String _f_C5_31_);

    String get_F_C10_31_();

    void set_F_C10_31_(String _f_C10_31_);

    String get_F_C20_31_();

    void set_F_C20_31_(String _f_C20_31_);

    String get_F_C50_31_();

    void set_F_C50_31_(String _f_C50_31_);

    Boolean get_F_B_32_();

    void set_F_B_32_(Boolean _f_B_32_);

    Integer get_F_I_32_();

    void set_F_I_32_(Integer _f_I_32_);

    BigDecimal get_F_N_32_();

    void set_F_N_32_(BigDecimal _f_N_32_);

    String get_F_C5_32_();

    void set_F_C5_32_(String _f_C5_32_);

    String get_F_C10_32_();

    void set_F_C10_32_(String _f_C10_32_);

    String get_F_C20_32_();

    void set_F_C20_32_(String _f_C20_32_);

    String get_F_C50_32_();

    void set_F_C50_32_(String _f_C50_32_);

    Boolean get_F_B_33_();

    void set_F_B_33_(Boolean _f_B_33_);

    Integer get_F_I_33_();

    void set_F_I_33_(Integer _f_I_33_);

    BigDecimal get_F_N_33_();

    void set_F_N_33_(BigDecimal _f_N_33_);

    String get_F_C5_33_();

    void set_F_C5_33_(String _f_C5_33_);

    String get_F_C10_33_();

    void set_F_C10_33_(String _f_C10_33_);

    String get_F_C20_33_();

    void set_F_C20_33_(String _f_C20_33_);

    String get_F_C50_33_();

    void set_F_C50_33_(String _f_C50_33_);

    Boolean get_F_B_34_();

    void set_F_B_34_(Boolean _f_B_34_);

    Integer get_F_I_34_();

    void set_F_I_34_(Integer _f_I_34_);

    BigDecimal get_F_N_34_();

    void set_F_N_34_(BigDecimal _f_N_34_);

    String get_F_C5_34_();

    void set_F_C5_34_(String _f_C5_34_);

    String get_F_C10_34_();

    void set_F_C10_34_(String _f_C10_34_);

    String get_F_C20_34_();

    void set_F_C20_34_(String _f_C20_34_);

    String get_F_C50_34_();

    void set_F_C50_34_(String _f_C50_34_);

    Boolean get_F_B_35_();

    void set_F_B_35_(Boolean _f_B_35_);

    Integer get_F_I_35_();

    void set_F_I_35_(Integer _f_I_35_);

    BigDecimal get_F_N_35_();

    void set_F_N_35_(BigDecimal _f_N_35_);

    String get_F_C5_35_();

    void set_F_C5_35_(String _f_C5_35_);

    String get_F_C10_35_();

    void set_F_C10_35_(String _f_C10_35_);

    String get_F_C20_35_();

    void set_F_C20_35_(String _f_C20_35_);

    String get_F_C50_35_();

    void set_F_C50_35_(String _f_C50_35_);

    Boolean get_F_B_36_();

    void set_F_B_36_(Boolean _f_B_36_);

    Integer get_F_I_36_();

    void set_F_I_36_(Integer _f_I_36_);

    BigDecimal get_F_N_36_();

    void set_F_N_36_(BigDecimal _f_N_36_);

    String get_F_C5_36_();

    void set_F_C5_36_(String _f_C5_36_);

    String get_F_C10_36_();

    void set_F_C10_36_(String _f_C10_36_);

    String get_F_C20_36_();

    void set_F_C20_36_(String _f_C20_36_);

    String get_F_C50_36_();

    void set_F_C50_36_(String _f_C50_36_);

    Boolean get_F_B_37_();

    void set_F_B_37_(Boolean _f_B_37_);

    Integer get_F_I_37_();

    void set_F_I_37_(Integer _f_I_37_);

    BigDecimal get_F_N_37_();

    void set_F_N_37_(BigDecimal _f_N_37_);

    String get_F_C5_37_();

    void set_F_C5_37_(String _f_C5_37_);

    String get_F_C10_37_();

    void set_F_C10_37_(String _f_C10_37_);

    String get_F_C20_37_();

    void set_F_C20_37_(String _f_C20_37_);

    String get_F_C50_37_();

    void set_F_C50_37_(String _f_C50_37_);

    Boolean get_F_B_38_();

    void set_F_B_38_(Boolean _f_B_38_);

    Integer get_F_I_38_();

    void set_F_I_38_(Integer _f_I_38_);

    BigDecimal get_F_N_38_();

    void set_F_N_38_(BigDecimal _f_N_38_);

    String get_F_C5_38_();

    void set_F_C5_38_(String _f_C5_38_);

    String get_F_C10_38_();

    void set_F_C10_38_(String _f_C10_38_);

    String get_F_C20_38_();

    void set_F_C20_38_(String _f_C20_38_);

    String get_F_C50_38_();

    void set_F_C50_38_(String _f_C50_38_);

    Boolean get_F_B_39_();

    void set_F_B_39_(Boolean _f_B_39_);

    Integer get_F_I_39_();

    void set_F_I_39_(Integer _f_I_39_);

    BigDecimal get_F_N_39_();

    void set_F_N_39_(BigDecimal _f_N_39_);

    String get_F_C5_39_();

    void set_F_C5_39_(String _f_C5_39_);

    String get_F_C10_39_();

    void set_F_C10_39_(String _f_C10_39_);

    String get_F_C20_39_();

    void set_F_C20_39_(String _f_C20_39_);

    String get_F_C50_39_();

    void set_F_C50_39_(String _f_C50_39_);

    Boolean get_F_B_40_();

    void set_F_B_40_(Boolean _f_B_40_);

    Integer get_F_I_40_();

    void set_F_I_40_(Integer _f_I_40_);

    BigDecimal get_F_N_40_();

    void set_F_N_40_(BigDecimal _f_N_40_);

    String get_F_C5_40_();

    void set_F_C5_40_(String _f_C5_40_);

    String get_F_C10_40_();

    void set_F_C10_40_(String _f_C10_40_);

    String get_F_C20_40_();

    void set_F_C20_40_(String _f_C20_40_);

    String get_F_C50_40_();

    void set_F_C50_40_(String _f_C50_40_);

    Boolean get_F_B_41_();

    void set_F_B_41_(Boolean _f_B_41_);

    Integer get_F_I_41_();

    void set_F_I_41_(Integer _f_I_41_);

    BigDecimal get_F_N_41_();

    void set_F_N_41_(BigDecimal _f_N_41_);

    String get_F_C5_41_();

    void set_F_C5_41_(String _f_C5_41_);

    String get_F_C10_41_();

    void set_F_C10_41_(String _f_C10_41_);

    String get_F_C20_41_();

    void set_F_C20_41_(String _f_C20_41_);

    String get_F_C50_41_();

    void set_F_C50_41_(String _f_C50_41_);

    Boolean get_F_B_42_();

    void set_F_B_42_(Boolean _f_B_42_);

    Integer get_F_I_42_();

    void set_F_I_42_(Integer _f_I_42_);

    BigDecimal get_F_N_42_();

    void set_F_N_42_(BigDecimal _f_N_42_);

    String get_F_C5_42_();

    void set_F_C5_42_(String _f_C5_42_);

    String get_F_C10_42_();

    void set_F_C10_42_(String _f_C10_42_);

    String get_F_C20_42_();

    void set_F_C20_42_(String _f_C20_42_);

    String get_F_C50_42_();

    void set_F_C50_42_(String _f_C50_42_);

    Boolean get_F_B_43_();

    void set_F_B_43_(Boolean _f_B_43_);

    Integer get_F_I_43_();

    void set_F_I_43_(Integer _f_I_43_);

    BigDecimal get_F_N_43_();

    void set_F_N_43_(BigDecimal _f_N_43_);

    String get_F_C5_43_();

    void set_F_C5_43_(String _f_C5_43_);

    String get_F_C10_43_();

    void set_F_C10_43_(String _f_C10_43_);

    String get_F_C20_43_();

    void set_F_C20_43_(String _f_C20_43_);

    String get_F_C50_43_();

    void set_F_C50_43_(String _f_C50_43_);

    Boolean get_F_B_44_();

    void set_F_B_44_(Boolean _f_B_44_);

    Integer get_F_I_44_();

    void set_F_I_44_(Integer _f_I_44_);

    BigDecimal get_F_N_44_();

    void set_F_N_44_(BigDecimal _f_N_44_);

    String get_F_C5_44_();

    void set_F_C5_44_(String _f_C5_44_);

    String get_F_C10_44_();

    void set_F_C10_44_(String _f_C10_44_);

    String get_F_C20_44_();

    void set_F_C20_44_(String _f_C20_44_);

    String get_F_C50_44_();

    void set_F_C50_44_(String _f_C50_44_);

    Boolean get_F_B_45_();

    void set_F_B_45_(Boolean _f_B_45_);

    Integer get_F_I_45_();

    void set_F_I_45_(Integer _f_I_45_);

    BigDecimal get_F_N_45_();

    void set_F_N_45_(BigDecimal _f_N_45_);

    String get_F_C5_45_();

    void set_F_C5_45_(String _f_C5_45_);

    String get_F_C10_45_();

    void set_F_C10_45_(String _f_C10_45_);

    String get_F_C20_45_();

    void set_F_C20_45_(String _f_C20_45_);

    String get_F_C50_45_();

    void set_F_C50_45_(String _f_C50_45_);

    Boolean get_F_B_46_();

    void set_F_B_46_(Boolean _f_B_46_);

    Integer get_F_I_46_();

    void set_F_I_46_(Integer _f_I_46_);

    BigDecimal get_F_N_46_();

    void set_F_N_46_(BigDecimal _f_N_46_);

    String get_F_C5_46_();

    void set_F_C5_46_(String _f_C5_46_);

    String get_F_C10_46_();

    void set_F_C10_46_(String _f_C10_46_);

    String get_F_C20_46_();

    void set_F_C20_46_(String _f_C20_46_);

    String get_F_C50_46_();

    void set_F_C50_46_(String _f_C50_46_);

    Boolean get_F_B_47_();

    void set_F_B_47_(Boolean _f_B_47_);

    Integer get_F_I_47_();

    void set_F_I_47_(Integer _f_I_47_);

    BigDecimal get_F_N_47_();

    void set_F_N_47_(BigDecimal _f_N_47_);

    String get_F_C5_47_();

    void set_F_C5_47_(String _f_C5_47_);

    String get_F_C10_47_();

    void set_F_C10_47_(String _f_C10_47_);

    String get_F_C20_47_();

    void set_F_C20_47_(String _f_C20_47_);

    String get_F_C50_47_();

    void set_F_C50_47_(String _f_C50_47_);

    Boolean get_F_B_48_();

    void set_F_B_48_(Boolean _f_B_48_);

    Integer get_F_I_48_();

    void set_F_I_48_(Integer _f_I_48_);

    BigDecimal get_F_N_48_();

    void set_F_N_48_(BigDecimal _f_N_48_);

    String get_F_C5_48_();

    void set_F_C5_48_(String _f_C5_48_);

    String get_F_C10_48_();

    void set_F_C10_48_(String _f_C10_48_);

    String get_F_C20_48_();

    void set_F_C20_48_(String _f_C20_48_);

    String get_F_C50_48_();

    void set_F_C50_48_(String _f_C50_48_);

    Boolean get_F_B_49_();

    void set_F_B_49_(Boolean _f_B_49_);

    Integer get_F_I_49_();

    void set_F_I_49_(Integer _f_I_49_);

    BigDecimal get_F_N_49_();

    void set_F_N_49_(BigDecimal _f_N_49_);

    String get_F_C5_49_();

    void set_F_C5_49_(String _f_C5_49_);

    String get_F_C10_49_();

    void set_F_C10_49_(String _f_C10_49_);

    String get_F_C20_49_();

    void set_F_C20_49_(String _f_C20_49_);

    String get_F_C50_49_();

    void set_F_C50_49_(String _f_C50_49_);

    Long getVersion();

    void setVersion(Long version);

    Boolean getActive();

    void setActive(Boolean active);


    boolean isStateUnsaved();


    void when(AttributeSetInstanceStateCreated e);

    void when(AttributeSetInstanceStateMergePatched e);

    void when(AttributeSetInstanceStateDeleted e);

    void mutate(Event e);

    
}

