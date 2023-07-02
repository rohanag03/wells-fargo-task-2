package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class System {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long systemId;

    private double uptime;
    private String dashboard;
    private String backendType;
    private String databaseType;
    private String scalability;

    public System() {
    }

    public System(double uptime, String dashboard, String backendType, String databaseType, String scalability) {
        this.uptime = uptime;
        this.dashboard = dashboard;
        this.backendType = backendType;
        this.databaseType = databaseType;
        this.scalability = scalability;
    }

    public Long getSystemId() {
        return systemId;
    }

    public double getUptime() {
        return uptime;
    }

    public void setUptime(double uptime) {
        this.uptime = uptime;
    }

    public String getDashboard() {
        return dashboard;
    }

    public void setDashboard(String dashboard) {
        this.dashboard = dashboard;
    }

    public String getBackendType() {
        return backendType;
    }

    public void setBackendType(String backendType) {
        this.backendType = backendType;
    }

    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }

    public String getScalability() {
        return scalability;
    }

    public void setScalability(String scalability) {
        this.scalability = scalability;
    }
}

