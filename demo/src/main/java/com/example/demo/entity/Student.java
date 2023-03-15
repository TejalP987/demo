package com.example.demo.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@DynamicUpdate
@Table(name = "Student")
public class Student
{
    @Column(name = "Age", nullable = false)
    private int age;
    @Column(name = "Name", nullable = false)
    private String name;
    @Id
    @Column(name = "StudId")
    private int studId;
    public Student() {
    }
    public Student(String name, int age, int id) {
        super();
        this.age = age;
        this.name = name;
        this.studId = id;
    }
    @Override
    public String toString() {
        return "StudentEnity{" +
                "stud_id=" + studId +
                ", stud_name='" + name + '\'' +
                ", stud_age=" + age +
                '}';
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return studId;
    }
    public void setId(int studID) {
        this.studId = studID;
    }
}
