package com.resumebuilder.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "resume_skill")
public class ResumeSkill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long resumeId;
    private String skillName;
    private String skillType;

    public Long getId() { return id; }
    public Long getResumeId() { return resumeId; }
    public String getSkillName() { return skillName; }
    public String getSkillType() { return skillType; }

    public void setId(Long id) { this.id = id; }
    public void setResumeId(Long resumeId) { this.resumeId = resumeId; }
    public void setSkillName(String skillName) { this.skillName = skillName; }
    public void setSkillType(String skillType) { this.skillType = skillType; }
}