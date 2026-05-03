package com.resumebuilder.backend.repository;

import com.resumebuilder.backend.model.ResumeProject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResumeProjectRepository extends JpaRepository<ResumeProject, Long> {

    List<ResumeProject> findByResumeId(Long resumeId);
}