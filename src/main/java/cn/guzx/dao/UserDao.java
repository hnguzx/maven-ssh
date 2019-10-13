package cn.guzx.dao;

import cn.guzx.entity.UserEntity;

import java.util.List;

public interface UserDao {
    /**
     * 添加并保存用户
     * @param user
     */
    public void add(UserEntity user);

    /**
     * 进行登录
     */
    public boolean login(UserEntity user);


    /**
     * 获取用户列表
     */
    public List getUser();

    /**
     * 根据用户Id获取用户信息
     * @param id
     * @return
     */
    public UserEntity getUser(int id);

    /**
     * 更新用户信息
     * @param user
     */
    public void update(UserEntity user);


    /**
     * 根据用户id删除用户信息
     * @param id
     */
    public void delete(int id);

}