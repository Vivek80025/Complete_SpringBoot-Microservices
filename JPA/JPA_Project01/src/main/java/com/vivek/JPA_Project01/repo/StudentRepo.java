package com.vivek.JPA_Project01.repo;

import com.vivek.JPA_Project01.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

}

//jpa internally run time pe ek implemented class bnayega jo studentRepo ke saare method ko implement krega