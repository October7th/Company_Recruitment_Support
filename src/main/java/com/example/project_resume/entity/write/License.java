package com.example.project_resume.entity.write;

import com.example.project_resume.entity.Member;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="pj_license")
@ToString(exclude = "member")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class License { //자격증
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @Column(length = 200)
    private String license;

    @Column(length = 200)
    private String license_name;

    @Column(length = 200)
    private String issuing_entity;

    @Column(length = 200)
    private String license_date;

    @Column(length = 200)
    private String expiry_date_li;

    @Column(length = 200)
    private String license_number;

    @ManyToOne
    private Member member;
}
