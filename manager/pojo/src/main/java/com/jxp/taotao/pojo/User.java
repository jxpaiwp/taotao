package com.jxp.taotao.pojo;

import java.util.Date;

public class User {
    private Long id;

    /**
     * 表名:tb_user
     * 数据库字段名:username
     * 数据库注释:用户名
     */
    private String username;

    /**
     * 表名:tb_user
     * 数据库字段名:password
     * 数据库注释:密码，加密存储
     */
    private String password;

    /**
     * 表名:tb_user
     * 数据库字段名:phone
     * 数据库注释:注册手机号
     */
    private String phone;

    /**
     * 表名:tb_user
     * 数据库字段名:email
     * 数据库注释:注册邮箱
     */
    private String email;

    private Date created;

    private Date updated;

    /**
     * 构造方法
     */
    public User(Long id, String username, String password, String phone, String email, Date created, Date updated) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.created = created;
        this.updated = updated;
    }

    /**
     * 构造方法
     */
    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取username属性的方法
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置username的方法
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取password属性的方法
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置password的方法
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取phone属性的方法
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置phone的方法
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取email属性的方法
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置email的方法
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}