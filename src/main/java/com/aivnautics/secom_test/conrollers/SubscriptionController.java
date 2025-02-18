package com.aivnautics.secom_test.conrollers;

import com.aivnautics.secom_test.services.SubscriptionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("/v1/subscription")
@Slf4j
public class SubscriptionController {

    private static final Object MediaType = 1;
    @Autowired
    private SubscriptionService subscriptionService;

    // 구독 생성
    @PostMapping(
            value = "/{mrn}",
            produces = MediaType.APPLICATION_JSON
    )

    // 구독 삭제
    @DeleteMapping(
            value = "/{mrn}",
            produces = MediaType.APPLICATION_JSON
    )
}
