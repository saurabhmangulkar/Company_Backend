
package com.example.demo.repository;

import com.example.demo.entity.SubscriptionPlan;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionPlanRepository
        extends JpaRepository<
            SubscriptionPlan,
            Long
        > {

}

