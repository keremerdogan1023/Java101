package com.kerem.importdatafromexceltodatabase.repository;

import com.kerem.importdatafromexceltodatabase.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
