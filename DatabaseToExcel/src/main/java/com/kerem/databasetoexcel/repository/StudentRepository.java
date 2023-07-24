package com.kerem.databasetoexcel.repository;

import com.kerem.databasetoexcel.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
