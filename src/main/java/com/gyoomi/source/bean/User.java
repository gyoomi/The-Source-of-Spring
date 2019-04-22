/**
 * Copyright © 2019, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.source.bean;

import java.util.List;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2019/4/18 9:29
 */
public class User {

    private Integer id;
    private String name;
    private Integer age;
    private String hobby;
    private List<Role> roleList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
}
