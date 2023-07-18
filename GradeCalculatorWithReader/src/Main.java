import java.io.*;
import java.util.Scanner;

public class Main {
    public static String calculateGrade(String name, int midterm1, int midterm2, int finalGrade){
        String out = "";
        double total = (midterm1*0.3)+(midterm2*0.3)+(finalGrade*0.4);
        if (total>=90){
            out = name + "bu dersten AA aldı...";
        } else if (total>=85) {
            out = name + "bu dersten BA aldı...";
        }else if (total>=80) {
            out = name + "bu dersten BB aldı...";
        }else if (total>=75) {
            out = name + "bu dersten CB aldı...";
        }else if (total>=70) {
            out = name + "bu dersten CC aldı...";
        }else if (total>=65) {
            out = name + "bu dersten DC aldı...";
        }else if (total>=60) {
            out = name + "bu dersten DD aldı...";
        }else if (total>=55) {
            out = name + "bu dersten FD aldı...";
        }else {
            out = name + "bu dersten FF aldı...";
        }
        return out;
    }
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(new FileReader("studentsGrades.txt"));
            FileWriter writer = new FileWriter("letterGrades.txt")){

            while (scanner.hasNextLine()){
                String studentInfo = scanner.nextLine();
                String[] studentArray = studentInfo.split(",");
                int midterm1 = Integer.valueOf(studentArray[1]);
                int midterm2 = Integer.valueOf(studentArray[2]);
                int finalGrade = Integer.valueOf(studentArray[3]);
                String out =calculateGrade(studentArray[0],midterm1,midterm2,finalGrade);

                writer.write(out + "\n");

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}