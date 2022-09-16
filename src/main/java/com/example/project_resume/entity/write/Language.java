package com.example.project_resume.entity.write;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="pj_language")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Language {  //외국어
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @Column(length = 200)
    private String language;

    @Column(length = 200)
    private String test_name;

    @Column(length = 200)
    private String test_number;

    @Column(length = 200)
    private String test_date;

    @Column(length = 200)
    private String expiry_date_la;

    @Column(length = 200)
    private String level;

    @Column(length = 200)
    private String full_level;

}
