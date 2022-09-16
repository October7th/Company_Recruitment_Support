package com.example.project_resume.repository.write;

import com.example.project_resume.entity.write.Work;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkRepository extends JpaRepository<Work, Long> {
}
