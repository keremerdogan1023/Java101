import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kullanıcıdan alınan 3 sayıdan en büyüğünü bulucak.

        Scanner scanner = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        int number1 = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int number2 = scanner.nextInt();
        System.out.println("Üçüncü sayıyı giriniz: ");
        int number3 = scanner.nextInt();

        int biggestNumber;

        if (number1>=number2 && number1>=number3){
            biggestNumber=number1;
        } else if (number2>=number1 && number2>=number3) {
            biggestNumber=number2;
        }
        else {
            biggestNumber=number3;
        }
        System.out.println("En büyük sayı:" + biggestNumber);

    }
}