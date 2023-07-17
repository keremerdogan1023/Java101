import java.util.InputMismatchException;
import java.util.Scanner;
class MultiplicationException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("Lütfen daha küçük sayılar giriniz");
    }
}

public class Main {
    public static int addition(int a, int b){
        return a+b;
    }
    public static int addition(int a, int b, int c){
        return a+b+c;
    }
    public static int subtraction(int a, int b){
        return a-b;
    }
    public static int subtraction(int a, int b, int c){
        return a-b-c;
    }
    public static int multiplication(int a, int b){
        return a*b;
    }
    public static int multiplication(int a, int b, int c){
        return a*b*c;
    }
    public static int division(int a, int b){
        return a/b;
    }
    public static int division(int a, int b, int c){
        return a/b/c;
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        double result;
        System.out.println(" 1.Toplama İşlemi: \n 2.Çıkarma İşlemi: " +
                "\n 3.Çarpma İşlemi: \n 4.Bölme İşlemi:\n" +
                "Çıkış yapmak için q'ya basın.");
        try {
            while (true){
                int numberQuantity;
                System.out.println("\nİşlemi seçiniz:");
                String operation = scanner.nextLine();
                if (operation.equals("q")){
                    System.out.println("Çıkış yapılıyor...");
                    break;
                } else if (operation.equals("1")) {

                    System.out.println("İşlem yapmak istediğiniz sayı adetini giriniz(2 veya 3)");
                    numberQuantity = scanner.nextInt();

                    if (numberQuantity == 2){
                        System.out.println("İlk sayıyı giriniz:");
                        number1 = scanner.nextInt();
                        System.out.println("İkinci sayıyı giriniz:");
                        number2 = scanner.nextInt();
                        scanner.nextLine();
                        result = addition(number1,number2);
                        System.out.println("Sonuç:" + result);
                    } else if (numberQuantity == 3) {
                        System.out.println("İlk sayıyı giriniz:");
                        number1 = scanner.nextInt();
                        System.out.println("İkinci sayıyı giriniz:");
                        number2 = scanner.nextInt();
                        System.out.println("Üçüncü sayıyı giriniz:");
                        number3 = scanner.nextInt();
                        scanner.nextLine();
                        result = addition(number1,number2,number3);
                        System.out.println("Sonuç:" + result);

                    }
                    else {
                        scanner.nextLine();
                        System.out.println("Uygun bir method bulunmamaktadır.");
                    }
                } else if (operation.equals("2")) {
                    System.out.println("İşlem yapmak istediğiniz sayı adetini giriniz(2 veya 3)");
                    numberQuantity = scanner.nextInt();

                    if (numberQuantity == 2){
                        System.out.println("İlk sayıyı giriniz:");
                        number1 = scanner.nextInt();
                        System.out.println("İkinci sayıyı giriniz:");
                        number2 = scanner.nextInt();
                        scanner.nextLine();
                        result = subtraction(number1,number2);
                        System.out.println("Sonuç:" + result);
                    } else if (numberQuantity == 3) {
                        System.out.println("İlk sayıyı giriniz:");
                        number1 = scanner.nextInt();
                        System.out.println("İkinci sayıyı giriniz:");
                        number2 = scanner.nextInt();
                        System.out.println("Üçüncü sayıyı giriniz:");
                        number3 = scanner.nextInt();
                        scanner.nextLine();
                        result = subtraction(number1,number2,number3);
                        System.out.println("Sonuç:" + result);

                    }
                    else {
                        scanner.nextLine();
                        System.out.println("Uygun bir method bulunmamaktadır.");
                    }
                } else if (operation.equals("3")) {
                    System.out.println("İşlem yapmak istediğiniz sayı adetini giriniz(2 veya 3)");
                    numberQuantity = scanner.nextInt();

                    if (numberQuantity == 2){
                        System.out.println("İlk sayıyı giriniz:");
                        number1 = scanner.nextInt();
                        System.out.println("İkinci sayıyı giriniz:");
                        number2 = scanner.nextInt();
                        scanner.nextLine();
                        if (number1>10000 && number2>10000) throw new MultiplicationException();
                        result = multiplication(number1,number2);
                        System.out.println("Sonuç:" + result);
                    } else if (numberQuantity == 3) {
                        System.out.println("İlk sayıyı giriniz:");
                        number1 = scanner.nextInt();
                        System.out.println("İkinci sayıyı giriniz:");
                        number2 = scanner.nextInt();
                        System.out.println("Üçüncü sayıyı giriniz:");
                        number3 = scanner.nextInt();
                        scanner.nextLine();
                        result = multiplication(number1,number2,number3);
                        System.out.println("Sonuç:" + result);

                    }
                    else {
                        scanner.nextLine();
                        System.out.println("Uygun bir method bulunmamaktadır.");
                    }
                } else if (operation.equals("4")) {
                    System.out.println("İşlem yapmak istediğiniz sayı adetini giriniz(2 veya 3)");
                    numberQuantity = scanner.nextInt();

                    if (numberQuantity == 2){
                        System.out.println("İlk sayıyı giriniz:");
                        number1 = scanner.nextInt();
                        System.out.println("İkinci sayıyı giriniz:");
                        number2 = scanner.nextInt();
                        scanner.nextLine();
                        result = division(number1,number2);
                        System.out.println("Sonuç:" + result);
                    } else if (numberQuantity == 3) {
                        System.out.println("İlk sayıyı giriniz:");
                        number1 = scanner.nextInt();
                        System.out.println("İkinci sayıyı giriniz:");
                        number2 = scanner.nextInt();
                        System.out.println("Üçüncü sayıyı giriniz:");
                        number3 = scanner.nextInt();
                        scanner.nextLine();
                        result = division(number1,number2,number3);
                        System.out.println("Sonuç:" + result);

                    }
                    else {
                        scanner.nextLine();
                        System.out.println("Uygun bir method bulunmamaktadır.");
                    }
                }
                else {
                    System.out.println("Geçersiz işlem");
                }
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Bir sayı sıfır bölünemez...");
        }
        catch (InputMismatchException e){
            System.out.println("Lütfen inputları doğru formatta giriniz...");
        } catch (MultiplicationException e) {
            e.printStackTrace();
        }

    }
}