
package com.example.demo.service;

import com.example.demo.entity.CompanySubscription;

import com.example.demo.repository.CompanySubscriptionRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanySubscriptionService {

    @Autowired
    private CompanySubscriptionRepository
            companySubscriptionRepository;



    public CompanySubscription
    createSubscription(
            CompanySubscription subscription
    ) {

        return companySubscriptionRepository
                .save(subscription);
    }



    public List<CompanySubscription>
    getAllSubscriptions() {

        return companySubscriptionRepository
                .findAll();
    }



    public CompanySubscription
    getSubscriptionById(
            Long id
    ) {

        return companySubscriptionRepository
                .findById(id)
                .orElse(null);
    }



    public CompanySubscription
    updateSubscription(
            Long id,
            CompanySubscription subscription
    ) {

        subscription.setId(id);

        return companySubscriptionRepository
                .save(subscription);
    }



    public void deleteSubscription(
            Long id
    ) {

        companySubscriptionRepository
                .deleteById(id);
    }
}

