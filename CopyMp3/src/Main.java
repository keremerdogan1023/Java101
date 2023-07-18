import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Integer> content = new ArrayList<Integer>();
    public static void readFile(){
        try {
            FileInputStream in = new FileInputStream("Example.mp3"); //need to enter the file name we want to copy
            int read;
            while ((read = in.read()) != -1){
                content.add(read);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void copyFile(String fileName){
        try {
            FileOutputStream out = new FileOutputStream(fileName);
            for(int value : content){
                out.write(value);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void main(String[] args) {

        readFile();
        copyFile("Example2.mp3");
        copyFile("Example3.mp3");
        copyFile("Example4.mp3");

    }
}