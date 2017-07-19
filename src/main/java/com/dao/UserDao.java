package com.dao;

import com.entity.UserEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by Administrator on 2017/6/27 0027.
 */
@Repository
public interface UserDao extends JpaRepository<UserEntity, Long>
        ,JpaSpecificationExecutor<UserEntity> {

    UserEntity findById(Long id);

    UserEntity findByIdAndAge(Long id, Integer age);

    List<UserEntity> findAll();
}
