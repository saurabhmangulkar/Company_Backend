
package com.example.demo.service;

import com.example.demo.entity.SubscriptionPlan;

import com.example.demo.repository.SubscriptionPlanRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionPlanService {

    @Autowired
    private SubscriptionPlanRepository
            subscriptionPlanRepository;

    
    
    public SubscriptionPlan
    createPlan(
            SubscriptionPlan plan
    ) {

        return subscriptionPlanRepository
                .save(plan);
    }

    
    
    public List<SubscriptionPlan>
    getAllPlans() {

        return subscriptionPlanRepository
                .findAll();
    }

    
    
    public SubscriptionPlan
    getPlanById(Long id) {

        return subscriptionPlanRepository
                .findById(id)
                .orElse(null);
    }

    
    
    public SubscriptionPlan
    updatePlan(
            Long id,
            SubscriptionPlan plan
    ) {

        plan.setId(id);

        return subscriptionPlanRepository
                .save(plan);
    }

    
    
    public void deletePlan(
            Long id
    ) {

        subscriptionPlanRepository
                .deleteById(id);
    }
}

