package com.molice.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * 用户查询条件
 *
 * @author  molice
 * @date 2019.1
 */
public class UserQueryCondition {
    @ApiModelProperty(value = "姓名")
    private String username;

    private String age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
