package com.example.springjpa.repository;

import com.example.springjpa.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseMaterialRepository
        extends JpaRepository<CourseMaterial, Long> {


}
