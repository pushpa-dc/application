package com.pushpa.application.controller;

import com.pushpa.application.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.*;

@RestController
public class StudentController {
    List<Student> list;
    Student student;

    @Autowired
    @RequestMapping("/api/v1/students")
    public List<Student> hello() {
        list = new ArrayList<>();
        list.add(new Student(UUID.randomUUID(), "Pushpa", "Katmandu"));
        list.add(new Student(UUID.randomUUID(), "Dip Sagar", "Katmandu"));
        return list;

    }

//    @RequestMapping("/{name}")
//    public String students(@RequestParam("name") String name, List<Student> students) {
//        if (students.contains(student))
//            return student.toString();
//        else {
//            return "hello";
//        }
//    }


}
