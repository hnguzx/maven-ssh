package cn.guzx.service.impl;


import cn.guzx.dao.UserDao;
import cn.guzx.entity.UserEntity;
import cn.guzx.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kinthon on 17-6-23.
 */
//注入服务
@Service("userService")
public class UserServiceImpl implements UserService {
    //自动注入userDao，也可以使用@Autowired
    private UserDao userDao;


    @Override
    public boolean addUser(UserEntity user) {
        this.userDao.add(user);
        return true;
    }

    @Override
    public boolean login(UserEntity user) {
        return this.userDao.login(user);
    }

    @Override
    public List getAllUser() {
        return this.userDao.getUser();
    }

    @Override
    public UserEntity getUserById(int id) {
        return this.userDao.getUser(id);
    }

    @Override
    public boolean updateUser(UserEntity user) {
        this.userDao.update(user);
        return true;

    }

    @Override
    public boolean deleteUser(int id) {
        this.userDao.delete(id);
        return true;
    }
}