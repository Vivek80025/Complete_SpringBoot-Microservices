package com.vivek.SSP03_DB.repo;

import com.vivek.SSP03_DB.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserEntity,Integer> {

    UserEntity findByEmail(String email);
}
