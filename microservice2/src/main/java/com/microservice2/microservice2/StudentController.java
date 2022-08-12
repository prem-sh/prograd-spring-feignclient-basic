package com.microservice2.microservice2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {
    @PostMapping("/student/save")
    public Student save(Student student){
        student.setName("Premkumar A");
        student.setRollNumber(31L);
        return student;
    }
}
