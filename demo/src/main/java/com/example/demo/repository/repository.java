package com.example.demo.repository;

import com.example.demo.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Repository
public interface repository extends JpaRepository<Student,Integer> {

    @Query(value = "SELECT * FROM Student s WHERE s.name LIKE 'C%' AND s.age > 20", nativeQuery = true)
    List<Student> findStudentsWithCandAge20();
    @Query(value = "SELECT * FROM Student s WHERE s.age > 18", nativeQuery = true)
    List<Student> getStudentsWithAgeMoreThan18();

    @Query(value = "DELETE FROM Student s WHERE s.name LIKE 'A%'", nativeQuery = true)
    void deleteStudentsWithStartA();
    @Modifying
    @Transactional
    @Query(value = "UPDATE Student s set s.age = 20 WHERE s.age > 18 ")
    void updateStudentsAgeMoreThan18To20();
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM Student ", nativeQuery = true)
    void emptyTable();
}