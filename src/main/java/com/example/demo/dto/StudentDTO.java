/**
 * @Package com.example.demo.dto
 * @author atom.hu
 * @date 2025/4/15 16:58
 * @version V1.0
 */
package com.example.demo.dto;

public class StudentDTO {
    private long id;
    private String name;
    private String email;
    //不返回age属性，目的是展示避免把数据库所有的字段毫无保留的返回给前端

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
