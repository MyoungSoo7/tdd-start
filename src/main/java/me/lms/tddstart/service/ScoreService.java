package me.lms.tddstart.service;


public interface ScoreService {

    void addScore(Long studentId, Long lectureId, int score);
    void changeScore(Long studentId, Long lectureId, int score);

}
