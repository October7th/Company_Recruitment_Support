package com.example.project_resume.controller;

import com.example.project_resume.repository.write.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class HelloController{
    @Autowired
    ResumeRepository resumeRepository;

//    @PostConstruct
//    public void insertDate() {
//        IntStream.rangeClosed(1,10).forEach(i -> {
//            Resume resume = Resume.builder().name("홍길동").age("1999.05.20").gender("남자").address("서울 강남구").phone("01012345678").
//                    other_phone("01011111111").email("hong"+i+"@korea.com").check_disorder("비대상").check_veteran("비대상").build();
//            resumeRepository.save(resume);
//        });
//    }

        @GetMapping("/hello")
        String root() {
            return "안녕!";
        }

    }
