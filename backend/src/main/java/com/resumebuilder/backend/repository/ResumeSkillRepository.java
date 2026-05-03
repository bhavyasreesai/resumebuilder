package com.resumebuilder.backend.repository;

import com.resumebuilder.backend.model.ResumeSkill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResumeSkillRepository extends JpaRepository<ResumeSkill, Long> {

    List<ResumeSkill> findByResumeId(Long resumeId);
}