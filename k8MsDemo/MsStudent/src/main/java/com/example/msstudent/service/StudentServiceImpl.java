package com.example.msstudent.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


import com.example.msstudent.clients.LectureRestTemplateClient;
import com.example.msstudent.entity.Student;
import com.example.msstudent.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    LectureRestTemplateClient lectureRestTemplateClient;

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    StudentRepo studentRepository;

    @Override
    public List<Student> getStudentList() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> getOrderedStudentList(int limit) {

        return entityManager.createQuery("SELECT p FROM  Student p ORDER BY p.studentId",
                Student.class).setMaxResults(limit).getResultList();

    }


    @Override
    public String addUpdateStudent(Student student) {
        Student stu = studentRepository.save(student);

        return "Saved: " +stu.getStudentId();
    }


    @Override
    public String deleteStudent(Student student) {
        studentRepository.delete(student);
        return "Deleted ";
    }


    public Optional<Student> getStudentByID(Long studentid) {

        return studentRepository.findById(studentid);

    }



    public String getFeignData(String lectureid) {
        String lecture = lectureRestTemplateClient.getLecture(lectureid);

        return lecture;
    }

}