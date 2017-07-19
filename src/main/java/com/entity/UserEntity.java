package com.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/6/26 0026.
 */
@Data
@Entity
@Table(name = "sf_user")
public class UserEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 用户名
     */
    @Column(name = "name", nullable = false,length = 250,unique = true)
    private String name;

    /**
     * 性别
     */
    @Column(name = "sex", nullable = false,length = 250)
    private String sex;

    /**
     * 年龄
     */
    @Column(name = "age", nullable = false,length = 250)
    private Integer age;

    /**
     * 密码
     */
    @Column(name = "pwd", nullable = false,length = 250)
    private String pwd;

    /**
     * 电话
     */
    @Column(name = "phone", nullable = false,length = 250)
    private String phone;
}
