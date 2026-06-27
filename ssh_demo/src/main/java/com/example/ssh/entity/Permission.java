package com.example.ssh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sys_permission")
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "permission_name", nullable = false, length = 80)
    private String permissionName;

    @Column(name = "permission_code", nullable = false, unique = true, length = 80)
    private String permissionCode;

    @Column(name = "permission_type", nullable = false, length = 20)
    private String permissionType;

    @Column(name = "url", length = 200)
    private String url;

    @Column(name = "parent_id")
    private Long parentId;

    @Column(name = "sort")
    private Integer sort = 0;

    @Column(name = "status", nullable = false)
    private Integer status = 1;
}
