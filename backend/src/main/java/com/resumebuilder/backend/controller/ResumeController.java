package com.resumebuilder.backend.controller;

import com.resumebuilder.backend.model.Resume;
import com.resumebuilder.backend.model.ResumeSkill;
import com.resumebuilder.backend.model.ResumeExperience;
import com.resumebuilder.backend.model.ResumeEducation;
import com.resumebuilder.backend.model.ResumeProject;

import com.resumebuilder.backend.repository.ResumeRepository;
import com.resumebuilder.backend.repository.ResumeSkillRepository;
import com.resumebuilder.backend.repository.ResumeExperienceRepository;
import com.resumebuilder.backend.repository.ResumeEducationRepository;
import com.resumebuilder.backend.repository.ResumeProjectRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resumes")
@CrossOrigin(origins = "*")
public class ResumeController {

    private final ResumeRepository resumeRepo;
    private final ResumeSkillRepository skillRepo;
    private final ResumeExperienceRepository expRepo;
    private final ResumeEducationRepository eduRepo;
    private final ResumeProjectRepository projRepo;

    public ResumeController(ResumeRepository resumeRepo,
                            ResumeSkillRepository skillRepo,
                            ResumeExperienceRepository expRepo,
                            ResumeEducationRepository eduRepo,
                            ResumeProjectRepository projRepo) {
        this.resumeRepo = resumeRepo;
        this.skillRepo = skillRepo;
        this.expRepo = expRepo;
        this.eduRepo = eduRepo;
        this.projRepo = projRepo;
    }

    @PostMapping
    public Resume saveResume(@RequestBody ResumeRequest request) {

        Resume resume = request.getResume();
        Resume savedResume = resumeRepo.save(resume);

        if (request.getSkills() != null) {
            for (String skill : request.getSkills()) {
                ResumeSkill rs = new ResumeSkill();
                rs.setResumeId(savedResume.getId());
                rs.setSkillName(skill);
                rs.setSkillType("TECH");
                skillRepo.save(rs);
            }
        }

        if (request.getExperience() != null) {
            for (ResumeExperience exp : request.getExperience()) {
                exp.setResumeId(savedResume.getId());
                expRepo.save(exp);
            }
        }

        if (request.getEducation() != null) {
            for (ResumeEducation edu : request.getEducation()) {
                edu.setResumeId(savedResume.getId());
                eduRepo.save(edu);
            }
        }

        if (request.getProjects() != null) {
            for (ResumeProject p : request.getProjects()) {
                p.setResumeId(savedResume.getId());
                projRepo.save(p);
            }
        }

        return savedResume;
    }

@GetMapping("/{id}")
public FullResumeResponse getResumeById(@PathVariable Long id) {

    Resume resume = resumeRepo.findById(id).orElse(null);

    List<ResumeSkill> skills = skillRepo.findByResumeId(id);
    List<ResumeExperience> experience = expRepo.findByResumeId(id);
    List<ResumeEducation> education = eduRepo.findByResumeId(id);
    List<ResumeProject> projects = projRepo.findByResumeId(id);

    return new FullResumeResponse(resume, skills, experience, education, projects);
}
@DeleteMapping("/{id}")
public String deleteResume(@PathVariable Long id) {

    if (!resumeRepo.existsById(id)) {
        return "Resume not found";
    }

    skillRepo.findByResumeId(id).forEach(skillRepo::delete);
    expRepo.findByResumeId(id).forEach(expRepo::delete);
    eduRepo.findByResumeId(id).forEach(eduRepo::delete);
    projRepo.findByResumeId(id).forEach(projRepo::delete);

    resumeRepo.deleteById(id);

    return "Deleted successfully";
}
@GetMapping
public List<Resume> getAllResumes() {
    return resumeRepo.findAll();
}
}