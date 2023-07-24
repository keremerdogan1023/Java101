package com.kerem.databasetoexcel.controller;

import com.kerem.databasetoexcel.business.StudentService;
import com.kerem.databasetoexcel.entity.Student;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/export")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        String headerKey = " Content-Disposition";
        String headerValue = "attachment; filename = Students_Information.xlsx";

        response.setHeader(headerKey,headerValue);
        this.studentService.studentInfoToExcel(response);
    }
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents(){
        return new ResponseEntity<>(this.studentService.getAllCustomers(), HttpStatus.ACCEPTED);
    }
}
