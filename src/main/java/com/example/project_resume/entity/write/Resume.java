package com.example.project_resume.entity.write;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="pj_resume")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Resume {  //이력서
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 20, nullable = false)
    private String age;

    @Column(length = 20, nullable = false)
    private String gender;

    @Column(length = 300, nullable = false)
    private String addr1;

    @Column(length = 300, nullable = false)
    private String addr2;

    @Column(length = 300, nullable = false)
    private String addr3;

    @Column(length = 50, nullable = false)
    private String phone;

    @Column(length = 50, nullable = false)
    private String other_phone;

    @Column(length = 30, nullable = false)
    private String email;

    @Column(length = 20, nullable = false)
    private String check_disorder;

    @Column(length = 20, nullable = false)
    private String check_veteran;

}
