package com.kerem.importdatafromexceltodatabase.business;

import com.kerem.importdatafromexceltodatabase.entity.Student;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ExcelUploadService {
    public static boolean isValidExcelFile(MultipartFile file){

        return Objects.equals(file.getContentType(), "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet" );
    }

    public static List<Student> getStudentData(InputStream inputStream){
        List<Student> students = new ArrayList<>();


        try {
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheet("Students");

            int rowNumber = 0;

            for (Row row : sheet){
                if (rowNumber == 0 ){
                    rowNumber++;   // to skip titles.
                    continue;
                }

                Iterator<Cell> cellIter = row.iterator();
                int cellNumber = 0;
                Student student = new Student();
                while (cellIter.hasNext()){

                    Cell cell = cellIter.next();
                    if (cellNumber == 0){
                        student.setStudentNumber((int)cell.getNumericCellValue());
                    }
                    else if (cellNumber == 1){
                        student.setFirstName(cell.getStringCellValue());
                    }
                    else if (cellNumber == 2){
                        student.setLastName(cell.getStringCellValue());
                    }else if (cellNumber == 3) {
                        student.setCountry(cell.getStringCellValue());
                    }else if (cellNumber == 4) {
                        student.setMajor(cell.getStringCellValue());
                    }
                    cellNumber++;

                }


                students.add(student);

            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        return students;
    }

}
