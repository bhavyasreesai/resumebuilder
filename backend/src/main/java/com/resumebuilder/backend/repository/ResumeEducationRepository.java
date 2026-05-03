package com.resumebuilder.backend.repository;

import com.resumebuilder.backend.model.ResumeEducation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResumeEducationRepository extends JpaRepository<ResumeEducation, Long> {

    List<ResumeEducation> findByResumeId(Long resumeId);
}