-- 학과
INSERT INTO department (department_name) VALUES
                                             ('수학통계학'),
                                             ('국어문과'),
                                             ('전자정보통신과'),
                                             ('모바일AI공학');
-- 학생
INSERT INTO student (student_name,
                     department_code) VALUES
                                          ('가학생', 1),
                                          ('나학생', 1),
                                          ('다학생', 1),
                                          ('라학생', 2),
                                          ('마학생', 2),
                                          ('바학생', 3),
                                          ('사학생', 4),
                                          ('아학생', 4);
-- 교수
INSERT INTO professor (professor_name, department_code) VALUES
                                                            ('리누스 토발즈', 1),
                                                            ('제임스 고슬링', 2),
                                                            ('빌게이츠', 3),
                                                            ('래리 엘리슨', 4),
                                                            ('몬티 와이드니어스', 3);


-- 개설과목
INSERT INTO course (course_name, professor_code, start_date,
                    end_date, pass_score, limit_enrollment, create_user_id, modify_user_id ) VALUES
                                                                                                 ('서버 프로그래밍', 1, '2024-02-05', '2024-08-15' ,60 ,10 ,'lms','lms'),
                                                                                                 ('객체지향 프로그래밍', 2, '2024-02-05', '2024-08-31',60,30,'lms','lms'),
                                                                                                 ('OS 프로그래밍', 3, '2024-02-05', '2024-09-15',60 ,2,'lms','lms'),
                                                                                                 ('데이터베이스 프로그래밍', 4, '2024-02-05', '2024-09-30',60,5,'lms','lms'),
                                                                                                 ('오픈소스', 5, '2024-07-01', '2024-08-31',60 ,3,'lms','lms');



-- 수강
INSERT INTO student_course (id, student_id, course_code) VALUES
                                                             (1, 1, 1   ),
                                                             (2, 2, 2   ),
                                                             (3, 3, 3   ),
                                                             (4, 4, 4   ),
                                                             (5, 5, 5   );