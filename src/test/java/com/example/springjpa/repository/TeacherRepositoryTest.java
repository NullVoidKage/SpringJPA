package com.example.springjpa.repository;

import com.example.springjpa.entity.Course;
import com.example.springjpa.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {
    @Autowired
    private TeacherRepository teacherRepository;

    Course course = Course.builder()
            .title("DBA")
            .credit(5)
            .build();
    @Test
    public void saveTeacher(){
        Teacher teacher = Teacher.builder()
                .firstName("Kakashi")
                .lastName("Ha take")
                //.courses(List.of(course))
                .build();
        teacherRepository.save(teacher);
    }


}