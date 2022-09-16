package com.example.project_resume.repository.write;

import com.example.project_resume.entity.write.File;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FileRepository extends JpaRepository<File, Long> {
}
