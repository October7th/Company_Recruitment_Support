package com.example.project_resume.repository.member;

import com.example.project_resume.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {
}
