package com.aivnautics.secom_test.conrollers;

import com.aivnautics.secom_test.services.CapabilityService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.grad.secom.core.interfaces.CapabilitySecomInterface;
import org.grad.secom.core.models.CapabilityResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The SECOM Capability Interface Controller.
 */
@RestController
@RequestMapping("/api/capability")
@Slf4j
public class CapabilityController implements CapabilitySecomInterface {

    private final CapabilityService capabilityService;

    @Autowired
    public CapabilityController(CapabilityService capabilityService) {
        this.capabilityService = capabilityService;
    }

    @Tag(name = "SECOM")
    @GetMapping
    public CapabilityResponseObject capability() {
        log.info("Capability API 호출됨");
        return capabilityService.getCapability();
    }
}