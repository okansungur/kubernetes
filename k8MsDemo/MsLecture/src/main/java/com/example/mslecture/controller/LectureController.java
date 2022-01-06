package com.example.mslecture.controller;


import com.example.mslecture.entity.Student;
import com.example.mslecture.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class LectureController {

    @Autowired
    private LectureService lectureService;


    @RequestMapping(value = "/getLecture", method = RequestMethod.GET, produces = "application/json")
    public List<Map<String, String>> getLecture()  {

        return lectureService.getLectures();
    }


    @GetMapping("/getLecture/{id}")
    public Map<String, String>  getLecture(@PathVariable("id") String id) {



        return lectureService.getLectureById(id);
    }


    @GetMapping("/getStudentClientRest/{id}")
    public Student getStudentClientRest(@PathVariable("id") String id) {
        Student myStudent = lectureService.getRestData(id);

        return myStudent;
    }




}