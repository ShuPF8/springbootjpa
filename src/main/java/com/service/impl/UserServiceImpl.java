package com.service.impl;

import com.dao.UserDao;
import com.entity.UserEntity;
import com.service.UserService;
import com.utils.ResultJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/6/27 0027.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired private UserDao userDao;

    @Override
    public ResultJson findById(Long id) {
        ResultJson result = new ResultJson();
        UserEntity u = userDao.findById(id);
        if (u == null) {
            result.setCode(400);
            result.setMaseege("没有记录");
        }
        result.setData(u);
        result.success();
        return result;
    }

    @Override
    public ResultJson fingByIdAndAge(Long id, Integer age) {
        ResultJson result = new ResultJson();
        UserEntity u = userDao.findByIdAndAge(id,age);
        if (u == null) {
            result.setCode(400);
            result.setMaseege("没有记录");
        }
        result.setData(u);
        result.success();
        return result;
    }

    @Override
    public ResultJson findAll() {
        ResultJson result = new ResultJson();
        List<UserEntity> datas = userDao.findAll();
        if (datas ==null || datas.isEmpty()) {
            result.setCode(400);
            result.setMaseege("没有记录");
        }
        result.setDatas(datas);
        result.success();
        return result;
    }

    @Override
    public void save(UserEntity userEntity) {
       userDao.save(userEntity);
    }

    @Override
    public void deleteById(Long id) {
        userDao.delete(id);
    }

    @Override
    public void deleteByObject(UserEntity userEntity) {
        userDao.delete(userEntity);
    }
}
