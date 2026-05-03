package com.resumebuilder.backend.controller;

import com.resumebuilder.backend.model.*;
import java.util.List;

public class FullResumeResponse {

    private Resume resume;
    private List<ResumeSkill> skills;
    private List<ResumeExperience> experience;
    private List<ResumeEducation> education;
    private List<ResumeProject> projects;

    public FullResumeResponse(Resume resume,
                              List<ResumeSkill> skills,
                              List<ResumeExperience> experience,
                              List<ResumeEducation> education,
                              List<ResumeProject> projects) {
        this.resume = resume;
        this.skills = skills;
        this.experience = experience;
        this.education = education;
        this.projects = projects;
    }

    public Resume getResume() {
        return resume;
    }

    public List<ResumeSkill> getSkills() {
        return skills;
    }

    public List<ResumeExperience> getExperience() {
        return experience;
    }

    public List<ResumeEducation> getEducation() {
        return education;
    }

    public List<ResumeProject> getProjects() {
        return projects;
    }
}
