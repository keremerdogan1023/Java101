package com.kerem.databasetoexcel.business;

import com.kerem.databasetoexcel.entity.Student;
import com.kerem.databasetoexcel.repository.StudentRepository;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    private StudentRepository repository;


    public List<Student> studentInfoToExcel(HttpServletResponse response) throws IOException {
        List<Student> studentList = this.repository.findAll();
        DatabaseToExcelService databaseToExcelService = new DatabaseToExcelService(studentList);
        databaseToExcelService.exportData(response);
        return studentList;
    }
    public List<Student> getAllCustomers(){
        return this.repository.findAll();
    }

}
