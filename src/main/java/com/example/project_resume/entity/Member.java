package com.example.project_resume.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name="member")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Member extends BaseEntity {
    @Id
    private String id;

    private String password;
    private String password2;
    private String name;
    private String email;
    private String phone;
    private String birth;
    private String gender;

}

