package com.wellsfargo.counselor.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class FinancialAdvisor {
    @Id
    @GeneratedValue
    private Long advisorId;

    private String name;

    public FinancialAdvisor() {
    }

    public FinancialAdvisor(String name) {
        this.name = name;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
