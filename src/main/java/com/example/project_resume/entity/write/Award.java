package com.example.project_resume.entity.write;

import com.example.project_resume.entity.Member;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="pj_award")
@ToString(exclude = "member")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Award {  //수상
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @Column(length = 200)
    private String award_type;

    @Column(length = 200)
    private String award_date;

    @Column(length = 200)
    private String awardOffice_name;

    @Column(length = 200)
    private String award_inform;

    @Column(length = 200)
    private String other_aw;

    @ManyToOne
    private Member member;

}
