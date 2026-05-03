package com.resumebuilder.backend.repository;

import com.resumebuilder.backend.model.ResumeExperience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResumeExperienceRepository extends JpaRepository<ResumeExperience, Long> {

    List<ResumeExperience> findByResumeId(Long resumeId);
}