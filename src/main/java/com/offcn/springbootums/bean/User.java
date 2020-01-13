package com.offcn.springbootums.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * <p>title:com.offcn.springboot3.bean</p >
 *
 * <p>ClassName:User</p >
 *
 * <p>Description:TODO(请用一句话描述这个类的作用)</p >
 * <p>
 * date:2020/1/13 0013
 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})

public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name", nullable = true, length = 200)
    private String name;

    @Column(name = "age", nullable = true, length = 4)
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
}
