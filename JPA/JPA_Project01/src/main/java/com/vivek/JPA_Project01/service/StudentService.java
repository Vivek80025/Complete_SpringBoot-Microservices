package com.vivek.JPA_Project01.service;

import com.vivek.JPA_Project01.entity.Student;
import com.vivek.JPA_Project01.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student saveStudent(Student student){
        return studentRepo.save(student);
    }

    public List<Student> getAllStudentsData(){
        List<Student> list = studentRepo.findAll();
        return list;
    }

    public Student getStudentById(Integer id){
        Optional<Student> byId = studentRepo.findById(id);      //this method hold only Integer(rapper class) type data not int
        Student student = byId.get();
        return student;
    }

    public Student updateStudentById(Integer id , Student student){
        Optional<Student> studentbyId = studentRepo.findById(id);
        Student std = null;
        if(studentbyId.isPresent()){
            Student dbStudentObj = studentbyId.get();
            dbStudentObj.setName(student.getName());
            dbStudentObj.setAge(student.getAge());
            dbStudentObj.setEmail(student.getEmail());
            std = studentRepo.save(dbStudentObj);
        }
        else {
            System.out.println("data not present in DB");
        }
        return std;
    }

    //same as partial update using @Patch

    public String deleteById(Integer id){
        studentRepo.deleteById(id);
        return "data delete successfully from DB........";
    }
}
