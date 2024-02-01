package me.lms.tddstart.service;

public interface LectureApplyService {

    void applyLecture(Long lectureId, Long studentId);

    void cancelLecture(Long lectureId, Long studentId);


}
