package com.aivnautics.secom_test.models;

import lombok.Data;
import org.grad.secom.core.models.CapabilityObject;

import java.util.List;

@Data
public class Capability {
    private List<CapabilityObject> capability;

}
