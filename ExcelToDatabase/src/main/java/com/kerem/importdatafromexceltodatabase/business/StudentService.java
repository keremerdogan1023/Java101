package com.kerem.importdatafromexceltodatabase.business;

import com.kerem.importdatafromexceltodatabase.entity.Student;
import com.kerem.importdatafromexceltodatabase.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
@Service
@AllArgsConstructor
public class StudentService {
    private StudentRepository repository;

    public void addStudentsToDB(MultipartFile file){
        if (ExcelUploadService.isValidExcelFile(file)){
            try {
                List<Student> students = ExcelUploadService.getStudentData(file.getInputStream());
                this.repository.saveAll(students);
            } catch (IOException e) {
                throw new RuntimeException("The file is not valid.");
            }
        }
    }

    public List<Student> getAllCustomers(){
        return this.repository.findAll();
    }
}
