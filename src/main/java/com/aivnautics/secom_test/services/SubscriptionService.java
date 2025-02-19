//package com.aivnautics.secom_test.services;
//
//import com.aivnautics.secom_test.models.domain.Subscription;
//import com.aivnautics.secom_test.repositories.SubscriptionRepository;
//import jakarta.ws.rs.NotFoundException;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//import java.util.UUID;
//
//@Service
//@Slf4j
//public class SubscriptionService {
//
//    @Autowired
//    SubscriptionRepository subscriptionRepository;
//
//    public Optional<Subscription> getActiveSubscription() {
//        return this.subscriptionRepository
//                .findAll()
//                .stream()
//                .findFirst();
//    }
//
//
//    public Subscription getSubscription(UUID uuid) {
//        return this.subscriptionRepository.findBySubscriptionId(uuid)
//                .orElseThrow(NotFoundException::new);
//    }
//
//    public Subscription deleteSubscription(UUID uuid) {
//        try {
//            final Subscription subscription = getSubscription(uuid);
//
//            this.subscriptionRepository.delete(subscription);
//
//            return subscription;
//        }
//        catch (NotFoundException e) {
//            return null;
//        }
//    }
//}
