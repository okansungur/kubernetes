package com.example.mslecture.service;

import com.example.mslecture.clients.StudentRestTemplateClient;
import com.example.mslecture.entity.Lecture;
import com.example.mslecture.entity.Student;
import com.google.common.collect.ImmutableMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class LectureService {
    @Autowired
    StudentRestTemplateClient studentRestTemplateClient;

    public Student getRestData(String studentid) {
        Student student = studentRestTemplateClient.getStudent(studentid);
        return student;
    }

    public List<Map<String, String>> getLectures() {

        return lectures;
    }


    public Map<String, String> getLectureById(String id) {

        return lectures
                .stream()
                .filter(stu -> stu.get("lectureId").equals(id))
                .findFirst()
                .orElse(null);
    }




    private static List<Map<String, String>> lectures = Arrays.asList(
            ImmutableMap.of("lectureId", "1",
                    "studentId", "1",
                    "lectureName", "Math"

            ),
            ImmutableMap.of("lectureId", "2",
                    "studentId", "1",
                    "lectureName", "Science"

            ),
            ImmutableMap.of("lectureId", "3",
                    "studentId", "2",
                    "lectureName", "Literature"

            ),
            ImmutableMap.of("lectureId", "4",
                    "studentId", "2",
                    "lectureName", "Geometry"

            )
    );





}
