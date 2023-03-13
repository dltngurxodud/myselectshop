package com.sparta.myselectshop.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne  // 유저 한명이 폴더 여러개를 갖는다.
    @JoinColumn(name = "USER_ID", nullable = false) // 외래키 설정 USER의 ID와 연결
    private User user;

    public Folder(String name, User user) {
        this.name = name;
        this.user = user;
    }
}