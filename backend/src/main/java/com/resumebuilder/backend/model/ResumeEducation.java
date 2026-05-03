package com.resumebuilder.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "resume_education")
public class ResumeEducation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long resumeId;
    private String school;
    private String degree;
    private String field;
    private String fromDate;
    private String toDate;
    private String gpa;

    public Long getId() { return id; }
    public Long getResumeId() { return resumeId; }
    public String getSchool() { return school; }
    public String getDegree() { return degree; }
    public String getField() { return field; }
    public String getFromDate() { return fromDate; }
    public String getToDate() { return toDate; }
    public String getGpa() { return gpa; }

    public void setId(Long id) { this.id = id; }
    public void setResumeId(Long resumeId) { this.resumeId = resumeId; }
    public void setSchool(String school) { this.school = school; }
    public void setDegree(String degree) { this.degree = degree; }
    public void setField(String field) { this.field = field; }
    public void setFromDate(String fromDate) { this.fromDate = fromDate; }
    public void setToDate(String toDate) { this.toDate = toDate; }
    public void setGpa(String gpa) { this.gpa = gpa; }
}