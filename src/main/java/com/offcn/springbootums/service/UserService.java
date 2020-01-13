package com.offcn.springbootums.service;


import com.offcn.springbootums.bean.User;

import java.util.List;

/**
 * <p>title:com.offcn.springboot3.service</p >
 *
 * <p>ClassName:UserService</p >
 *
 * <p>Description:TODO(请用一句话描述这个类的作用)</p >
 * <p>
 * date:2020/1/13 0013
 */
public interface UserService {
    //获取全部用户数据
    public List<User> getUserList();
    //新增用户数据
    public void createUser(User user);
    //获取指定id用户信息
    public User getUser(Long id);
    //更新指定id用户信息
    public void updateUser(Long id, User user);
    //删除指定id用户
    public void deleteUser(Long id);
}
