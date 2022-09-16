package com.example.project_resume.entity.write;

import com.example.project_resume.entity.Member;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="pj_work")
@ToString(exclude = "member")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Work { //경력
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @Column(length = 200)
    private String work_start;

    @Column(length = 200)
    private String work_finish;

    @Column(length = 200)
    private String work_year;

    @Column(length = 200)
    private String work_name;

    @Column(length = 200)
    private String dept_name;

    @Column(length = 200)
    private String position;

    @Column(length = 200)
    private String salary;

    @ManyToOne
    private Member member;

}

