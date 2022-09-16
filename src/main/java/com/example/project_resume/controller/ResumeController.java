package com.example.project_resume.controller;

import com.example.project_resume.entity.Member;
import com.example.project_resume.entity.write.*;
import com.example.project_resume.repository.member.MemberRepository;
import com.example.project_resume.repository.write.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ResumeController {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    ResumeRepository resumeRepository;
    @Autowired
    SelfIntroRepository selfIntroRepository;
    @Autowired
    StudyRepository studyRepository;
    @Autowired
    LanguageRepository languageRepository;
    @Autowired
    LicenseRepository licenseRepository;
    @Autowired
    WorkRepository workRepository;
    @Autowired
    ActiveRepository activeRepository;
    @Autowired
    AwardRepository awardRepository;
    @Autowired
    FileRepository fileRepository;

    @GetMapping("/") //메인 홈
    String index() {
        return "resumeHome";
    }

    @GetMapping("/login") //로그인 페이지
    String index2() {
        return "login";
    }

    @GetMapping("/signUp") //회원가입 페이지
    String index3() { return "signUp"; }


//    @GetMapping("/list") //리스트 페이지
//    String list(Model model) {
//        model.addAttribute("list", resumeRepository.findAll());
//        return "saveFinish";
//    }



    //step1 페이지 : 이력서 작성
    @RequestMapping(value="/insert", method= RequestMethod.POST)
    String resume(@RequestParam String name, @RequestParam String age, @RequestParam String gender, @RequestParam String addr1, @RequestParam String addr2, @RequestParam String addr3, @RequestParam String phone,
                  @RequestParam String other_phone, @RequestParam String email, @RequestParam String check_disorder, @RequestParam String check_veteran) {
        Resume resume = Resume.builder().name(name).age(age).gender(gender).addr1(addr1).addr2(addr2).addr3(addr3).phone(phone).other_phone(other_phone).email(email).check_disorder(check_disorder).check_veteran(check_veteran).build();
        resumeRepository.save(resume);
        return "step2";
    }
    @GetMapping("/resumeform")
    String insert() { return "step1"; }


    //step2 페이지 : 학력, 외국어, 자격증 작성
    @RequestMapping(value="/insert2", method= RequestMethod.POST)
    String background(@RequestParam String entrance_date, @RequestParam String graduation_date, @RequestParam String academic_car, @RequestParam String univer_name, @RequestParam String major, @RequestParam String grade, @RequestParam String full_grade,
                       @RequestParam String language, @RequestParam String test_name, @RequestParam String test_number, @RequestParam String test_date, @RequestParam String expiry_date_la, @RequestParam String level, @RequestParam String full_level,
                       @RequestParam String license, @RequestParam String license_name, @RequestParam String issuing_entity, @RequestParam String license_date, @RequestParam String expiry_date_li, @RequestParam String license_number) {
        System.out.println(entrance_date);
        Study study = Study.builder().entrance_date(entrance_date).graduation_date(graduation_date).academic_car(academic_car).univer_name(univer_name).major(major).grade(grade).full_grade(full_grade).build();
        Language language1 = Language.builder().language(language).test_name(test_name).test_date(test_date).test_number(test_number).test_date(test_date).expiry_date_la(expiry_date_la).level(level).full_level(full_level).build();
        License license1 = License.builder().license(license).license_name(license_name).issuing_entity(issuing_entity).license_date(license_date).expiry_date_li(expiry_date_li).license_number(license_number).build();
        studyRepository.save(study);
        languageRepository.save(language1);
        licenseRepository.save(license1);
        return "step3";
    }
    @GetMapping("/backgroundform")
    String insert2() { return "step2"; }


    //step3 페이지 : 대외활동, 수상, 경력 작성
    @RequestMapping(value="/insert3", method= RequestMethod.POST)
    String career(@RequestParam String active_date, @RequestParam String activeOffice_name, @RequestParam String active_name, @RequestParam String active_type, @RequestParam String other_ac,
                  @RequestParam String award_type, @RequestParam String award_date, @RequestParam String awardOffice_name, @RequestParam String award_inform, @RequestParam String other_aw,
                  @RequestParam String work_start, @RequestParam String work_finish, @RequestParam String work_year, @RequestParam String work_name, @RequestParam String dept_name,
                  @RequestParam String position, @RequestParam String salary) {
        Active active = Active.builder().active_date(active_date).activeOffice_name(activeOffice_name).active_name(active_name).active_type(active_type).other_ac(other_ac).build();
        Award award = Award.builder().award_type(award_type).award_date(award_date).awardOffice_name(awardOffice_name).award_inform(award_inform).other_aw(other_aw).build();
        Work work = Work.builder().work_start(work_start).work_finish(work_finish).work_year(work_year).work_name(work_name).dept_name(dept_name).position(position).salary(salary).build();
        activeRepository.save(active);
        awardRepository.save(award);
        workRepository.save(work);
        return "step4";
    }
    @GetMapping("/careerform")
    String insert3() { return "step3"; }


    //step4 페이지 : 자기소개서 작성
    @RequestMapping(value="/insert4", method= RequestMethod.POST)
    String selfintro(@RequestParam String intro1, @RequestParam String intro2, @RequestParam String intro3, @RequestParam String intro4) {
        SelfIntro selfIntro = SelfIntro.builder().intro1(intro1).intro2(intro2).intro3(intro3).intro4(intro4).build();
        selfIntroRepository.save(selfIntro);
        return"step5";
    }
    @GetMapping("/selfintroform")
    String insert4() { return "step4"; }


    //step5 페이지 : 증명서 파일 제출
    @RequestMapping(value="/insert5", method= RequestMethod.POST)
    String FileSubmit(@RequestParam String St_name, @RequestParam String St_note, @RequestParam String La_type, @RequestParam String La_name, @RequestParam String La_note, @RequestParam String Li_type, @RequestParam String Li_name, @RequestParam String Li_note,
                      @RequestParam String Ac_type, @RequestParam String Ac_name, @RequestParam String Ac_note, @RequestParam String Aw_type, @RequestParam String Aw_name, @RequestParam String Aw_note, @RequestParam String Wo_type, @RequestParam String Wo_name, @RequestParam String Wo_note) {
        File file = File.builder().St_name(St_name).St_note(St_note).La_type(La_type).La_name(La_name).La_note(La_note).Li_type(Li_type).Li_name(Li_name).Li_note(Li_note)
                    .Ac_type(Ac_type).Ac_name(Ac_name).Ac_note(Ac_note).Aw_type(Aw_type).Aw_name(Aw_name).Aw_note(Aw_note).Wo_type(Wo_type).Wo_name(Wo_name).Wo_note(Wo_note).build();
        fileRepository.save(file);
        return "saveFinish";
    }
    @GetMapping("/fileform")
    String insert5() { return "step5"; }





//    @PostMapping("/insert")
//    void test(@RequestParam String name) {
//        System.out.println(name);
//    }

}
