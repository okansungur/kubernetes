package com.example.msstudent.controller;
import com.example.msstudent.entity.Student;
import com.example.msstudent.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping("/getStudents")
    public List<Student> getStudents() {
        List<Student> students = null;
        students = studentService.getStudentList();
        return students;
    }

    @GetMapping(path = "/deleteStudent/{studentId}")
    public String deleteStudent(
            @PathVariable String studentId) {
        Long id = Long.parseLong(studentId);
        Optional<Student> studentResponse = studentService.getStudentByID(id);
        if (studentResponse.isPresent()) {
            studentService.deleteStudent(studentResponse.get());
        }
        return "Deleted";
    }

    @GetMapping(value = "/addnewStudent")
    public String addStudent() {

        Student student = new Student();
        int randomValue = (int) Math.floor(Math.random() * 9999999);
        student.setStudentId(randomValue);
        student.setName("Name" + randomValue);
        studentService.addUpdateStudent(student);

        return "Added";
    }


    @GetMapping("/getStudents/{id}")
    public Student showStudentById(@PathVariable("id") Long id) {

        return studentService.getStudentByID(id).orElse(null);

    }

    @GetMapping("/getLectureRestClient/{id}")
    public String getFeignClientLecture(@PathVariable("id") String id) {


        String mylecture = studentService.getFeignData(id);

        return mylecture;
    }


}