package com.kerem.databasetoexcel.business;

import com.kerem.databasetoexcel.entity.Student;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.util.List;

public class DatabaseToExcelService {
    private List<Student> students;
    private XSSFSheet sheet;
    private XSSFWorkbook workbook;

    public DatabaseToExcelService(List<Student> students) {
        this.students = students;
        workbook = new XSSFWorkbook();
    }

    private void createExcelCells(Row row, int numberOfColumn, Object value, CellStyle style){
        sheet.autoSizeColumn(numberOfColumn);
        Cell cell = row.createCell(numberOfColumn);
        if (value instanceof Integer){
            cell.setCellValue((Integer) value);
        }else if (value instanceof Double){
            cell.setCellValue((Double) value);
        }else if (value instanceof Boolean){
            cell.setCellValue((Boolean) value);
        }else if (value instanceof Long){
            cell.setCellValue((Long) value);
        }else {
            cell.setCellValue((String) value);
        }
        cell.setCellStyle(style);



    }

    private void createHeaders(){
        sheet = workbook.createSheet("Students");
        Row row = sheet.createRow(0);
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(20);
        CellStyle style = workbook.createCellStyle();
        style.setFont(font);
        createExcelCells(row,0,"Student Number",style);
        createExcelCells(row,1,"First Name",style);
        createExcelCells(row,2,"Last Name",style);
        createExcelCells(row,3,"Country",style);
        createExcelCells(row,4,"Major",style);





    }

    private void writeDataToExcel(){
        int rowNumber = 1;
        XSSFFont font = workbook.createFont();
        font.setBold(false);
        font.setFontHeight(15);
        CellStyle style = workbook.createCellStyle();
        style.setFont(font);


        for (Student student : students){
            Row row = sheet.createRow(rowNumber++);
            int numberOfColumn = 0;
            createExcelCells(row,numberOfColumn++,student.getStudentNumber(),style);
            createExcelCells(row,numberOfColumn++,student.getFirstName(),style);
            createExcelCells(row,numberOfColumn++,student.getLastName(),style);
            createExcelCells(row,numberOfColumn++,student.getCountry(),style);
            createExcelCells(row,numberOfColumn++,student.getMajor(),style);
        }

    }
    public void exportData(HttpServletResponse response) throws IOException {
        createHeaders();
        writeDataToExcel();
        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }
}
