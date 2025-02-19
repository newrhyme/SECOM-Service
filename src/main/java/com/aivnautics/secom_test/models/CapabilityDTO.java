package com.aivnautics.secom_test.models;

import lombok.Data;
import org.grad.secom.core.models.CapabilityObject;

import java.util.List;

@Data
public class CapabilityDTO {
    private List<CapabilityObject> capability;
}
