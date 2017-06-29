package com.yoidukigembu.jaxsb.model.db.repository;

import com.yoidukigembu.jaxsb.model.db.entity.MUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hilo on 2017/06/30.
 */
@Repository
public interface UserRepository extends JpaRepository<MUser, Long>{

}
