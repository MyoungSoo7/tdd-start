package me.lms.tddstart.service;

import me.lms.tddstart.model.Lecture;
import me.lms.tddstart.model.Student;

public class LectureApplyServiceImpl implements LectureApplyService{

    @Override
    public void applyLecture(Long lectureId, Long studentId) {
        Lecture lecture = lectureRepository.findById(lectureId).orElseThrow(() -> new IllegalArgumentException("해당 강의가 없습니다."));
        Student student = studentRepository.findById(studentId).orElseThrow(() -> new IllegalArgumentException("해당 학생이 없습니다."));
    }

    @Override
    public void cancelLecture(Long lectureId, Long studentId) {
        Lecture lecture = lectureRepository.findById(lectureId).orElseThrow(() -> new IllegalArgumentException("해당 강의가 없습니다."));
        Student student = studentRepository.findById(studentId).orElseThrow(() -> new IllegalArgumentException("해당 학생이 없습니다."));
    }
}
