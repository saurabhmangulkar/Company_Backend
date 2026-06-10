
package com.example.demo.controller;

import com.example.demo.entity.CompanySubscription;

import com.example.demo.service.CompanySubscriptionService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(
    "/api/company-subscriptions"
)
@CrossOrigin("*")
public class CompanySubscriptionController {

    @Autowired
    private CompanySubscriptionService
            companySubscriptionService;



    @PostMapping
    public CompanySubscription
    createSubscription(
            @RequestBody
            CompanySubscription subscription
    ) {

        return companySubscriptionService
                .createSubscription(
                        subscription
                );
    }



    @GetMapping
    public List<CompanySubscription>
    getAllSubscriptions() {

        return companySubscriptionService
                .getAllSubscriptions();
    }



    @GetMapping("/{id}")
    public CompanySubscription
    getSubscriptionById(
            @PathVariable Long id
    ) {

        return companySubscriptionService
                .getSubscriptionById(id);
    }



    @PutMapping("/{id}")
    public CompanySubscription
    updateSubscription(
            @PathVariable Long id,

            @RequestBody
            CompanySubscription subscription
    ) {

        return companySubscriptionService
                .updateSubscription(
                        id,
                        subscription
                );
    }



    @DeleteMapping("/{id}")
    public String deleteSubscription(
            @PathVariable Long id
    ) {

        companySubscriptionService
                .deleteSubscription(id);

        return
            "Company Subscription Deleted Successfully";
    }
}

