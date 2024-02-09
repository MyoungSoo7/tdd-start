CREATE DATABASE `class` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
GRANT ALL PRIVILEGES ON `lecture`.* TO 'lecture'@'localhost' IDENTIFIED BY 'lecture';
FLUSH PRIVILEGES;


DROP TABLE IF EXISTS `class`.`department`;
-- Create Department table
CREATE TABLE department (
                            department_code INT PRIMARY KEY AUTO_INCREMENT COMMENT '학과코드',
                            department_name VARCHAR(50) COMMENT '학과명'
);
-- Create Student table
DROP TABLE IF EXISTS `class`.`student`;
CREATE TABLE student (
                         student_id INT PRIMARY KEY AUTO_INCREMENT COMMENT '학생번호',
                         student_name VARCHAR(50) COMMENT '학생명',
                         height INT COMMENT '키',
                         department_code INT COMMENT '학과코드'
);


DROP TABLE IF EXISTS `class`.`professor`;
CREATE TABLE professor (
                           professor_code INT PRIMARY KEY AUTO_INCREMENT COMMENT '교수번호',
                           professor_name VARCHAR(50) COMMENT '교수명',
                           department_code INT COMMENT '학과코드'
);


DROP TABLE IF EXISTS `class`.`course`;
CREATE TABLE course (
                        course_code INT AUTO_INCREMENT PRIMARY KEY COMMENT '강의번호',
                        course_name VARCHAR(20) NOT NULL COMMENT '강의명',
                        professor_code INT NOT NULL COMMENT '교수번호',
                        pass_score INT COMMENT '합격점수',
                        limit_enrollment INT COMMENT '수강제한인원',
                        start_date DATE COMMENT '개강일',
                        end_date DATE COMMENT '종강일',
                        create_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '수강일시',
                        create_user_id VARCHAR(20) NOT NULL COMMENT '수강자',
                        modify_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '수정일시',
                        modify_user_id VARCHAR(20) NOT NULL COMMENT '수정자'
);


DROP TABLE IF EXISTS `class`.`student_course`;
-- Create Student_Course table
CREATE TABLE student_course (
                                id INT not null unique,
                                student_id INT COMMENT '학생번호',
                                course_code INT COMMENT '강의번호',
                                score INT      COMMENT '점수',
                                result VARCHAR(10)      COMMENT '결과',
                                primary key(student_id , course_code)
);
-- Add foreign key constraints using ALTER TABLE
ALTER TABLE student
    ADD CONSTRAINT FK_Student_Department
        FOREIGN KEY (department_code) REFERENCES department(department_code);
ALTER TABLE professor
    ADD CONSTRAINT FK_Professor_Department
        FOREIGN KEY (department_code) REFERENCES department(department_code);
ALTER TABLE course
    ADD CONSTRAINT FK_Course_Professor
        FOREIGN KEY (professor_code) REFERENCES professor(professor_code);
ALTER TABLE student_course
    ADD CONSTRAINT FK_Student_Course_Student
        FOREIGN KEY (student_id) REFERENCES student(student_id);
ALTER TABLE student_course
    ADD CONSTRAINT FK_Student_Course_Course
        FOREIGN KEY (course_code) REFERENCES course(course_code);
