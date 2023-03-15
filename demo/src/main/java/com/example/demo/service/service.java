package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class service {
    @Autowired
    repository studentRepository;
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Student addStudents(Student studentEnity) {
        return studentRepository.save(studentEnity);
    }

    public Optional<Student> getStudentsById(Integer id) {
        return studentRepository.findById(id);
    }

    public List<Student> getStudentswCand20() {
        return studentRepository.findStudentsWithCandAge20();
    }

    public List<Student> getStudentsWithAgeMoreThan18() {
        return studentRepository.getStudentsWithAgeMoreThan18();
    }
    public void deleteStudentsWithStartA() {
        studentRepository.deleteStudentsWithStartA();
    }

    public void updateStudentsAgeMoreThan18To20() {
        studentRepository.updateStudentsAgeMoreThan18To20();
    }

    public void deleteStudentByID(Integer studID) {
        studentRepository.deleteById(studID);
    }

    public void emptyTable() {
        studentRepository.emptyTable();
    }


}