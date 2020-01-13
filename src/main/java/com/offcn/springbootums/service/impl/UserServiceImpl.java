package com.offcn.springbootums.service.impl;


import com.offcn.springbootums.bean.User;
import com.offcn.springbootums.dao.UserRepository;
import com.offcn.springbootums.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>title:com.offcn.springboot3.service.impl</p >
 *
 * <p>ClassName:UserServiceImpl</p >
 *
 * <p>Description:TODO(请用一句话描述这个类的作用)</p >
 * <p>
 * date:2020/1/13 0013
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public void updateUser(Long id, User user) {
        user.setId(id);
        userRepository.saveAndFlush(user);

    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
