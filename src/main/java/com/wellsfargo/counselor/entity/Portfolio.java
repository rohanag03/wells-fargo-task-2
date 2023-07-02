package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.List;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue
    private Long portfolioId;

    private String title;

    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;

    @OneToOne
    private Client client;

    public Portfolio() {
    }

    public Portfolio(String title) {
        this.title = title;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}

