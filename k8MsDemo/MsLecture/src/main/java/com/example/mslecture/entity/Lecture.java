package com.example.mslecture.entity;

public class Lecture {
    private int lectureId;
    private int studentId;
    private String lectureName;

    public Lecture() {
    }

    public Lecture(int lectureId, int studentId, String lectureName) {
        this.lectureId = lectureId;
        this.studentId = studentId;
        this.lectureName = lectureName;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "lectureId=" + lectureId +
                ", studentId=" + studentId +
                ", lectureName='" + lectureName + '\'' +
                '}';
    }
}
