package com.example.project_resume.entity.write;

import com.example.project_resume.entity.Member;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="pj_selfintro")
@ToString(exclude = "member")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SelfIntro {  //자기소개서
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @Column(length = 1000, nullable = false)
    private String intro1;

    @Column(length = 1000, nullable = false)
    private String intro2;

    @Column(length = 1000, nullable = false)
    private String intro3;

    @Column(length = 1000, nullable = false)
    private String intro4;

    @ManyToOne
    private Member member;
}
