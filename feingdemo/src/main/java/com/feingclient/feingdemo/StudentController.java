package com.feingclient.feingdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")

public class StudentController {
    @Autowired
    RestClientService restClientService;

    @GetMapping("/save")
    public Student save(){
        Student newStudent = new Student();
        return restClientService.save(newStudent);
    }
}
