package spring.Jpura.Spring2.Rest.API.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.Jpura.Spring2.Rest.API.bean.Student;

import java.util.ArrayList;
import java.util.List;

@RestController

public class StudentController {
    @GetMapping("student")
    public Student getStudent(){
        Student student= new Student("mohamed","ihjas",1);
        return student;

    }

    @GetMapping("students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("amal","kk",2));
        students.add(new Student("nirasha","aa",3));
        students.add(new Student("ff","ss",4));
        return students;
    }

}
