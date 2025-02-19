//package com.aivnautics.secom_test.conrollers;
//
//import com.aivnautics.secom_test.services.SubscriptionService;
//import lombok.extern.slf4j.Slf4j;
//import org.grad.secom.core.models.SubscriptionRequestObject;
//import org.grad.secom.core.models.SubscriptionResponseObject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/v1/subscription")
//@Slf4j
//public class SubscriptionController {
//
//    @Autowired
//    private SubscriptionService subscriptionService;
//
//    // 구독 생성
//    @PostMapping(
//            value = "/{mrn}",
//            produces = MediaType.APPLICATION_JSON_VALUE
//    )
//    public SubscriptionResponseObject subscribe(
//            @PathVariable String mrn,
//            @RequestBody SubscriptionRequestObject subscriptionRequestObject) {
//            log.debug("Received request to subscribe to {}", mrn);
//            return this.subscriptionService.creatClientSubscription()
//    }
//
//    // 구독 삭제
//    @DeleteMapping(value = "/{mrn}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public SubscriptionResponseObject unsubscribe(@PathVariable String mrn) {
//        log.debug("Received request to unsubscribe to {}", mrn);
//        return this.subscriptionService.removeClientSubscription(mrn);
//    }
//}
