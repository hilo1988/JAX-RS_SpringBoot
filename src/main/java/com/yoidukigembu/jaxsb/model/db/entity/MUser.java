package com.yoidukigembu.jaxsb.model.db.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by hilo on 2017/06/21.
 */
@Entity(name = "MUser")
@Table(name = "m_user")
@Data
@EqualsAndHashCode(callSuper = true)
public class MUser extends BaseEntity {

    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;


    /** ユーザ名 */
    @Column(name = "name", nullable = false, length = 24)
    private String name;

    /** ログインID */
    @Column(name = "login_id", nullable = false, length = 24)
    private String loginId;

    /** パスワード */
    @Column(name = "password", nullable = false, length = 128)
    private String password;
}
