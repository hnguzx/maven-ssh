package cn.guzx.dao.impl;

import cn.guzx.dao.UserDao;
import cn.guzx.entity.UserEntity;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.List;

@Transactional(rollbackFor = Exception.class)
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    private SessionFactory sessionFactory;

    @Override
    public void add(UserEntity user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public boolean login(UserEntity user) {
        Iterator it;
        String hsql="FROM UserEntity u where u.username=? and u.phone=?";
        System.out.println(hsql);
        Query query = sessionFactory.getCurrentSession().createQuery(hsql);
        query.setString(0, user.getUsername());
        query.setString(1, user.getPhone());
//        System.out.println(user.getUsername());
        it=query.iterate();
        if(it.hasNext()) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }

    }

    @Override
    public List getUser() {
        return null;
    }

    @Override
    public UserEntity getUser(int id) {
        return null;
    }

    @Override
    public void update(UserEntity user) {

    }

    @Override
    public void delete(int id) {

    }
}
