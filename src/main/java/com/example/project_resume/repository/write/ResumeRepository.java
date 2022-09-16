package com.example.project_resume.repository.write;

import com.example.project_resume.entity.write.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<Resume, Long> {
}
