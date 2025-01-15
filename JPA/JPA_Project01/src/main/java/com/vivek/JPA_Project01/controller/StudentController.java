package com.vivek.JPA_Project01.controller;

import com.vivek.JPA_Project01.entity.Student;
import com.vivek.JPA_Project01.service.StudentService;
import jakarta.persistence.PostUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/std")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public Student createStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/all")
    public List<Student> getAllStudents(){
        return studentService.getAllStudentsData();
    }

    //@GetMapping
    @GetMapping("/getById")
    public Student getStudentById(@RequestParam Integer id){
        return studentService.getStudentById(id);
    }

    //@PutMapping
    @PutMapping("/update")
    public Student updateStudentById(@RequestParam Integer id , @RequestBody Student student){
        return studentService.updateStudentById(id,student);
    }

    //same as partial update using @Patch

    @DeleteMapping("/deleteById")
    public String deleteById(@RequestParam Integer id){
        return studentService.deleteById(id);
    }

}
