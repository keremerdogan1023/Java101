package com.kerem.importdatafromexceltodatabase.controller;

import com.kerem.importdatafromexceltodatabase.business.StudentService;
import com.kerem.importdatafromexceltodatabase.entity.Student;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private StudentService service;
    @PostMapping("/upload-students-data")
    public void uploadStudentsDate(@RequestParam("file")MultipartFile file){
        this.service.addStudentsToDB(file);
    }
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents(){
        return new ResponseEntity<>(this.service.getAllCustomers(), HttpStatus.ACCEPTED);
    }


}
