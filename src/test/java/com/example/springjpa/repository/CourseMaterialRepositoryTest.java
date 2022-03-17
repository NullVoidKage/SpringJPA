package com.example.springjpa.repository;

import com.example.springjpa.entity.Course;
import com.example.springjpa.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {
    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    public void saveCourseMaterial() throws Exception {
        Course course = Course.builder()
                .title(".net")
                .credit(6)
                .build()
                ;
        CourseMaterial courseMaterial =
                CourseMaterial.builder()
                        .url("www.dailycodebuffer.com")
                        .course(course)
                        .build();
        courseMaterialRepository.save(courseMaterial);

    }

    @Test
    public void printAllCoursesMaterials(){
        List<CourseMaterial> courseMaterial =courseMaterialRepository.findAll();
        System.out.println("Course Material = " + courseMaterial);
    }
}