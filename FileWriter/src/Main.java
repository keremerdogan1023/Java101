import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("languages.txt")){
            Scanner scanner = new Scanner(System.in);
            String language;
            while (true){
                System.out.println("Bir dil giriniz: ");
                language = scanner.nextLine();

                if (language.equals("-1")){
                    System.out.println("Programdan çıkılıyor...");
                    break;
                }
                writer.write(language + "\n");
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }
    }
