package com.example.mslecture.clients;


import com.example.mslecture.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class StudentRestTemplateClient {

    @Autowired
    RestTemplate restTemplate;

    public Student getStudent(String studentID) {

        ResponseEntity<Student> restExchange =
                restTemplate.exchange(

                        //"http://localhost:9541/getStudents/{studentID}",
                        "http://msstudent:9541/getStudents/{studentID}",
                        HttpMethod.GET,
                        null, Student.class, studentID);

        return restExchange.getBody();
    }



}
