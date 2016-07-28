package org.dddml.wms.domain;

import java.util.Set;
import java.math.BigDecimal;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.InOutLineStateEvent.*;

public interface InOutLineState
{
    Long VERSION_ZERO = 0L;

    Long VERSION_NULL = VERSION_ZERO - 1;

    InOutLineId getInOutLineId();

    void setInOutLineId(InOutLineId inOutLineId);

    SkuId getSkuId();

    void setSkuId(SkuId skuId);

    Long getLineNumber();

    void setLineNumber(Long lineNumber);

    String getDescription();

    void setDescription(String description);

    String getLocatorId();

    void setLocatorId(String locatorId);

    String getProduct();

    void setProduct(String product);

    String getUomId();

    void setUomId(String uomId);

    BigDecimal getMovementQuantity();

    void setMovementQuantity(BigDecimal movementQuantity);

    BigDecimal getConfirmedQuantity();

    void setConfirmedQuantity(BigDecimal confirmedQuantity);

    BigDecimal getScrappedQuantity();

    void setScrappedQuantity(BigDecimal scrappedQuantity);

    BigDecimal getTargetQuantity();

    void setTargetQuantity(BigDecimal targetQuantity);

    BigDecimal getPickedQuantity();

    void setPickedQuantity(BigDecimal pickedQuantity);

    Boolean getIsInvoiced();

    void setIsInvoiced(Boolean isInvoiced);

    String getAttributeSetInstanceId();

    void setAttributeSetInstanceId(String attributeSetInstanceId);

    Boolean getIsDescription();

    void setIsDescription(Boolean isDescription);

    Boolean getProcessed();

    void setProcessed(Boolean processed);

    BigDecimal getQuantityEntered();

    void setQuantityEntered(BigDecimal quantityEntered);

    Long getRmaLineNumber();

    void setRmaLineNumber(Long rmaLineNumber);

    Long getReversalLineNumber();

    void setReversalLineNumber(Long reversalLineNumber);

    Long getVersion();

    void setVersion(Long version);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

    String getUpdatedBy();

    void setUpdatedBy(String updatedBy);

    Date getUpdatedAt();

    void setUpdatedAt(Date updatedAt);

    Boolean getActive();

    void setActive(Boolean active);

    Boolean getDeleted();

    void setDeleted(Boolean deleted);

    String getInOutDocumentNumber();

    void setInOutDocumentNumber(String inOutDocumentNumber);


    boolean isStateUnsaved();


    void mutate(Event e);

    void when(InOutLineStateCreated e);

    void when(InOutLineStateMergePatched e);

    void when(InOutLineStateRemoved e);
    
}

