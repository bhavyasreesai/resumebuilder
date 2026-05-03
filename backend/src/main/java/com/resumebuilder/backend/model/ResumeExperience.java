package com.resumebuilder.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "resume_experience")
public class ResumeExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long resumeId;
    private String organization;
    private String role;
    private String fromDate;
    private String toDate;

    @Column(length = 1000)
    private String description;

    public Long getId() { return id; }
    public Long getResumeId() { return resumeId; }
    public String getOrganization() { return organization; }
    public String getRole() { return role; }
    public String getFromDate() { return fromDate; }
    public String getToDate() { return toDate; }
    public String getDescription() { return description; }

    public void setId(Long id) { this.id = id; }
    public void setResumeId(Long resumeId) { this.resumeId = resumeId; }
    public void setOrganization(String organization) { this.organization = organization; }
    public void setRole(String role) { this.role = role; }
    public void setFromDate(String fromDate) { this.fromDate = fromDate; }
    public void setToDate(String toDate) { this.toDate = toDate; }
    public void setDescription(String description) { this.description = description; }
}