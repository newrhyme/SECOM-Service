package com.aivnautics.secom_test.models;

import lombok.Data;
import org.grad.secom.core.models.ImplementedInterfaces;

/**
 * 개별 Capability 정보를 담는 DTO
 */
@Data
public class CapabilityObject {
    private int dataProductType;
    private int containerType;
    private String productSchemaUrl;
    private String serviceVersion;
    private ImplementedInterfaces implementedInterfaces;
}