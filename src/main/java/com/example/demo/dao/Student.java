/**
 * @Package com.example.demo.dao
 * @author atom.hu
 * @date 2025/4/15 14:31
 * @version V1.0
 */
package com.example.demo.dao;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;


@Entity
@Table(name="Student")  //表示一个自增的组件
public class Student {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = IDENTITY)
    private long id;

    @Column(name="name")    //表示这个java字段是映射到数据库表的字段
    private String name;

    @Column(name="email")
    private  String email;

    @Column(name="age")
    private int age;
}
