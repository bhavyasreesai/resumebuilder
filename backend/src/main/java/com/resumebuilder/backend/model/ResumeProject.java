package com.resumebuilder.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "resume_project")
public class ResumeProject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long resumeId;
    private String projectName;
    private String technologies;
    private String url;

    @Column(length = 1000)
    private String description;

    public Long getId() { return id; }
    public Long getResumeId() { return resumeId; }
    public String getProjectName() { return projectName; }
    public String getTechnologies() { return technologies; }
    public String getUrl() { return url; }
    public String getDescription() { return description; }

    public void setId(Long id) { this.id = id; }
    public void setResumeId(Long resumeId) { this.resumeId = resumeId; }
    public void setProjectName(String projectName) { this.projectName = projectName; }
    public void setTechnologies(String technologies) { this.technologies = technologies; }
    public void setUrl(String url) { this.url = url; }
    public void setDescription(String description) { this.description = description; }
}