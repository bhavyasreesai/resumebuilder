package com.resumebuilder.backend.controller;

import com.resumebuilder.backend.model.Resume;
import com.resumebuilder.backend.model.ResumeExperience;
import com.resumebuilder.backend.model.ResumeEducation;
import com.resumebuilder.backend.model.ResumeProject;

import java.util.List;

public class ResumeRequest {

    private Resume resume;
    private List<String> skills;
    private List<ResumeExperience> experience;
    private List<ResumeEducation> education;
    private List<ResumeProject> projects;

    public Resume getResume() {
        return resume;
    }

    public List<String> getSkills() {
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

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public void setExperience(List<ResumeExperience> experience) {
        this.experience = experience;
    }

    public void setEducation(List<ResumeEducation> education) {
        this.education = education;
    }

    public void setProjects(List<ResumeProject> projects) {
        this.projects = projects;
    }
}