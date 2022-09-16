package com.example.project_resume.entity.write;

import com.example.project_resume.entity.Member;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="pj_study")
@ToString(exclude = "member")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Study {  //학력
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @Column(length = 200)
    private String entrance_date;

    @Column(length = 200)
    private String graduation_date;

    @Column(length = 200)
    private String academic_car;

    @Column(length = 200)
    private String univer_name;

    @Column(length = 200)
    private String major;

    @Column(length = 200)
    private String grade;

    @Column(length = 200)
    private String full_grade;

    @ManyToOne
    private Member member;

}
