package com.example.project_resume.entity.write;

import com.example.project_resume.entity.Member;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="pj_active")
@ToString(exclude = "member")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Active {  //대외활동
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @Column(length = 200)
    private String active_date;

    @Column(length = 200)
    private String activeOffice_name;

    @Column(length = 200)
    private String active_name;

    @Column(length = 200)
    private String active_type;

    @Column(length = 200)
    private String other_ac;

    @ManyToOne
    private Member member;

}
