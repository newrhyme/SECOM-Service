package com.aivnautics.secom_test.repositories;

import com.aivnautics.secom_test.models.domain.Subscription;
import org.grad.secom.springboot3.components.SecomClient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.Optional;
import java.util.UUID;

public interface SubscriptionRepository extends JpaRepository<Subscription, BigInteger> {
    Optional<Subscription> findBySubscriptionId(UUID subscriptionId);
}
