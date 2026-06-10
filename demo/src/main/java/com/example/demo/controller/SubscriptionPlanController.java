
package com.example.demo.controller;

import com.example.demo.entity.SubscriptionPlan;

import com.example.demo.service.SubscriptionPlanService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(
    "/api/subscription-plans"
)
@CrossOrigin("*")
public class SubscriptionPlanController {

    @Autowired
    private SubscriptionPlanService
            subscriptionPlanService;



    @PostMapping
    public SubscriptionPlan
    createPlan(
            @RequestBody
            SubscriptionPlan plan
    ) {

        return subscriptionPlanService
                .createPlan(plan);
    }



    @GetMapping
    public List<SubscriptionPlan>
    getAllPlans() {

        return subscriptionPlanService
                .getAllPlans();
    }



    @GetMapping("/{id}")
    public SubscriptionPlan
    getPlanById(
            @PathVariable Long id
    ) {

        return subscriptionPlanService
                .getPlanById(id);
    }



    @PutMapping("/{id}")
    public SubscriptionPlan
    updatePlan(
            @PathVariable Long id,

            @RequestBody
            SubscriptionPlan plan
    ) {

        return subscriptionPlanService
                .updatePlan(
                        id,
                        plan
                );
    }



    @DeleteMapping("/{id}")
    public String deletePlan(
            @PathVariable Long id
    ) {

        subscriptionPlanService
                .deletePlan(id);

        return
            "Subscription Plan Deleted Successfully";
    }
}

