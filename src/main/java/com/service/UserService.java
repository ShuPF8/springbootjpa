package com.service;

import com.entity.UserEntity;
import com.utils.ResultJson;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/27 0027.
 */
public interface UserService {

    ResultJson findById(Long id);

    ResultJson fingByIdAndAge(Long id, Integer age);

    ResultJson findAll();

    void save(UserEntity userEntity);

    void deleteById(Long id);

    void deleteByObject(UserEntity userEntity);
}
