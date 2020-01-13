package com.offcn.springbootums.dao;

import com.offcn.springbootums.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <p>title:com.offcn.springboot3.dao</p >
 *
 * <p>ClassName:UserRepository</p >
 *
 * <p>Description:TODO(请用一句话描述这个类的作用)</p >
 * <p>
 * date:2020/1/13 0013
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByName(String name);
    User findByNameAndAge(String name, Integer age);
}
