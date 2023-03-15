package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
public class StudentController {
    @Autowired
    service studentService;
    //WORKING
    @GetMapping("/getAllstudents")
    List<Student> getStudents(){
        return studentService.getStudents();
    }
    @GetMapping("/studentsAgeGreater18")
    List<Student> getStudentsWithAgeMoreThan18(){
        return studentService.getStudentsWithAgeMoreThan18();
    }

    @GetMapping("/getStudentsByID/{id}")
    Optional<Student> getStudentsByID(@PathVariable Integer id){
        return studentService.getStudentsById(id);
    }

    @PostMapping("/addStudents")
    Student addStudents(@RequestBody Student studentEntity){
        return studentService.addStudents(studentEntity);
    }
    @DeleteMapping("/deleteStudentByID/{id}")
    List<Student> deleteStudentByID(@PathVariable Integer id){
        studentService.deleteStudentByID(id);
        return studentService.getStudents();
    }
    @GetMapping("/student/Cand20")
    List<Student> getStudentsWithCandAge20(){
        return studentService.getStudentswCand20();
    }

    @DeleteMapping("/deleteStudents/StartsA")
     public List<Student> deleteStudentsWithStartA(){
        studentService.deleteStudentsWithStartA();
        return studentService.getStudents();
    }
    @GetMapping("updateStudentsAgeMoreThan18To20")
    List<Student> updateStudentsAgeMoreThan18To20(){
        studentService.updateStudentsAgeMoreThan18To20();
        return studentService.getStudents();
    }
    @GetMapping("/emptyTable")
    String emptyTable(){
        studentService.emptyTable();
        return "Done";
    }

}
