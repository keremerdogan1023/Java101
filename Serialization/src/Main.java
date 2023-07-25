import java.io.*;

public class Main {

    public static void serialize(Student student){
        //Serialization
        try {
            FileOutputStream fileStream = new FileOutputStream("student.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileStream);
            System.out.println("Öğrenciler kaydediliyor...");
            outputStream.writeObject(student);
            outputStream.close();
            fileStream.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void deserialize(Student student){
        //Deserialization
        try {
            FileInputStream fileStream = new FileInputStream("student.txt");
            ObjectInputStream inputStream = new ObjectInputStream(fileStream);
            student = (Student) inputStream.readObject();
            inputStream.close();
            fileStream.close();
            printStudent(student);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        Student student = new Student("Kerem","Erdogan",22,1453);
        serialize(student);
        System.out.println("Serialize işlemi tamamlandı...");

        deserialize(student);
        System.out.println("Deserialize işlemi tamamlandı...");






    }
    public static void printStudent(Student student){
        System.out.println("First Name = " +student.firstName);
        System.out.println("Last Name = " +student.lastName);
        System.out.println("Age = " + student.age);
        System.out.println("Student Number = " +student.studentNumber);
    }
}