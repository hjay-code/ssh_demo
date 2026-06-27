package com.example.ssh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sys_menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "menu_name", nullable = false, length = 80)
    private String menuName;

    @Column(name = "parent_id")
    private Long parentId;

    @Column(name = "url", length = 200)
    private String url;

    @Column(name = "icon", length = 80)
    private String icon;

    @Column(name = "sort")
    private Integer sort = 0;

    @Column(name = "status", nullable = false)
    private Integer status = 1;
}
