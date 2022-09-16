package com.example.project_resume.controller;

import com.example.project_resume.entity.Member;
import com.example.project_resume.repository.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @Autowired
    MemberRepository memberRepository;

    @RequestMapping("/signUp")
    String signUp() { return "signUp"; }

    //회원가입 페이지 : insert
    @RequestMapping(value="/joinSuccess", method = RequestMethod.POST)
    String signUp(@RequestParam String id, @RequestParam String password, @RequestParam String password2, @RequestParam String name,
                @RequestParam String email, @RequestParam String phone, @RequestParam String birth, @RequestParam String gender) {
        Member member = Member.builder().id(id).password(password).password2(password2).name(name).email(email).phone(phone).birth(birth).gender(gender).build();
        memberRepository.save(member);
        return "login";
    }

    @RequestMapping(value="/loginSuccess", method = RequestMethod.POST)
    String login() {
        return "resumeHome";
    }

}
