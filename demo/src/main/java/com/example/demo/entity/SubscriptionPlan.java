
package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "subscription_plans")
public class SubscriptionPlan {

    @Id
    @GeneratedValue(
        strategy =
        GenerationType.IDENTITY
    )
    private Long id;
    
    		private Integer durationInMonths;
    

    private String name;

    private Double price;

    private Integer userLimit;

    private Integer storageLimit;

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(
            String name
    ) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(
            Double price
    ) {
        this.price = price;
    }

    public Integer getUserLimit() {
        return userLimit;
    }

    public void setUserLimit(
            Integer userLimit
    ) {
        this.userLimit = userLimit;
    }

    public Integer getStorageLimit() {
        return storageLimit;
    }

    public void setStorageLimit(
            Integer storageLimit
    ) {
        this.storageLimit =
                storageLimit;
    }
    
    
    		public Integer getDurationInMonths() {

    		    return durationInMonths;
    		}

    		public void setDurationInMonths(
    		        Integer durationInMonths
    		) {

    		    this.durationInMonths =
    		            durationInMonths;
    		}
    	

}

