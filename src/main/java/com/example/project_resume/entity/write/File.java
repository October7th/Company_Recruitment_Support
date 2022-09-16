package com.example.project_resume.entity.write;

import com.example.project_resume.entity.Member;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="pj_uploadFile")
@ToString(exclude = "member")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class File { //파일 제출 페이지
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    private LocalDateTime regTime;

    //-------------------학력---------------------
    @Column(length = 200)
    private String St_name;

    @Column(length = 200)
    private String St_note;

    //-------------------외국어---------------------
    @Column(length = 200)
    private String La_type;

    @Column(length = 200)
    private String La_name;

    @Column(length = 200)
    private String La_note;

    //-------------------자격증---------------------
    @Column(length = 200)
    private String Li_type;

    @Column(length = 200)
    private String Li_name;

    @Column(length = 200)
    private String Li_note;

    //-------------------대외활동---------------------
    @Column(length = 200)
    private String Ac_type;

    @Column(length = 200)
    private String Ac_name;

    @Column(length = 200)
    private String Ac_note;

    //-------------------수상---------------------
    @Column(length = 200)
    private String Aw_type;

    @Column(length = 200)
    private String Aw_name;

    @Column(length = 200)
    private String Aw_note;

    //-------------------경력----------------------
    @Column(length = 200)
    private String Wo_type;

    @Column(length = 200)
    private String Wo_name;

    @Column(length = 200)
    private String Wo_note;

    @ManyToOne
    private Member member;

}
