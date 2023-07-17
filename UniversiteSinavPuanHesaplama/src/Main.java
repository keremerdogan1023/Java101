import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Üniversite sınavı puan hesaplama programı.");
        String operations = "İşlemler...\n" +
                "1.Eşit ağırlık puanları yazdırma .."+
                "2.Sayısal puanları yazdırma"+
                "3.Eşit ağırlık 1.bulma"+
                "4. Sayısal 1. bulma" +
                "Çıkış için i'ye basın";
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Öğrencinin ismini giriniz:");
        String name1 = scanner.nextLine();
        System.out.println("1. Öğrencinin Türkçe netini giriniz:");
        int netTurkishSubject = scanner.nextInt();
        System.out.println("1. Öğrencinin Matematik netini giriniz:");
        int netMathSubject = scanner.nextInt();
        System.out.println("1. Öğrencinin Edebiyat netini giriniz:");
        int netLiteratureSubject = scanner.nextInt();
        System.out.println("1. Öğrencinin Fizik netini giriniz:");
        int netPhysicsSubject = scanner.nextInt();
        scanner.nextLine();
        System.out.println("2. Öğrencinin ismini giriniz:");
        String name2 = scanner.nextLine();
        System.out.println("2. Öğrencinin Türkçe netini giriniz:");
        int netTurkishSubject2 = scanner.nextInt();
        System.out.println("2. Öğrencinin Matematik netini giriniz:");
        int netMathSubject2 = scanner.nextInt();
        System.out.println("2. Öğrencinin Edebiyat netini giriniz:");
        int netLiteratureSubject2 = scanner.nextInt();
        System.out.println("2. Öğrencinin Fizik netini giriniz:");
        int netPhysicsSubject2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("3. Öğrencinin ismini giriniz:");
        String name3 = scanner.nextLine();
        System.out.println("3. Öğrencinin Türkçe netini giriniz:");
        int netTurkishSubject3 = scanner.nextInt();
        System.out.println("3. Öğrencinin Matematik netini giriniz:");
        int netMathSubject3 = scanner.nextInt();
        System.out.println("3. Öğrencinin Edebiyat netini giriniz:");
        int netLiteratureSubject3 = scanner.nextInt();
        System.out.println("3. Öğrencinin Fizik netini giriniz:");
        int netPhysicsSubject3 = scanner.nextInt();
        scanner.nextLine();
        System.out.println(operations);
        while (true){

            System.out.print("İşlemi Giriniz : ");
            String operation = scanner.nextLine();
            if (operation.equals("i")){
                System.out.println("Çıkış yapılıyor...");
                break;
            }else if (operation.equals("1")) {

                EsitAgirlik student1 = new EsitAgirlik(netTurkishSubject, netMathSubject, netLiteratureSubject2, netPhysicsSubject,name1);
                EsitAgirlik student2 = new EsitAgirlik(netTurkishSubject2, netMathSubject2, netLiteratureSubject2, netPhysicsSubject2,name2);
                EsitAgirlik student3 = new EsitAgirlik(netTurkishSubject3, netMathSubject3, netLiteratureSubject3, netPhysicsSubject3,name3);
                System.out.println(name1+":" + student1.calculatePoints()+"\n"+
                        name2+":" + student2.calculatePoints()+"\n"+
                        name3+":" + student3.calculatePoints()+"\n");

            }
            else if (operation.equals("2")) {

                Sayisal student1 = new Sayisal(netTurkishSubject, netMathSubject, netLiteratureSubject2, netPhysicsSubject,name1);
                Sayisal student2 = new Sayisal(netTurkishSubject2, netMathSubject2, netLiteratureSubject2, netPhysicsSubject2,name2);
                Sayisal student3 = new Sayisal(netTurkishSubject3, netMathSubject3, netLiteratureSubject3, netPhysicsSubject3,name3);
                System.out.println(name1+":" + student1.calculatePoints()+"\n"+
                        name2+":" + student2.calculatePoints()+"\n"+
                        name3+":" + student3.calculatePoints()+"\n");
            } else if (operation.equals("3")) {
                EsitAgirlik student1 = new EsitAgirlik(netTurkishSubject, netMathSubject, netLiteratureSubject2, netPhysicsSubject,name1);
                EsitAgirlik student2 = new EsitAgirlik(netTurkishSubject2, netMathSubject2, netLiteratureSubject2, netPhysicsSubject2,name2);
                EsitAgirlik student3 = new EsitAgirlik(netTurkishSubject3, netMathSubject3, netLiteratureSubject3, netPhysicsSubject3,name3);

                EsitAgirlik firstPlaceHolder = firstPlaceHolder(student1,student2, student3);

                System.out.println("Birinci Eşit Ağırlık Öğrencisi : " + firstPlaceHolder.getName());
                System.out.println("Öğrenci Puanı : " + firstPlaceHolder.calculatePoints());
            } else if (operation.equals("4")) {
                Sayisal student1 = new Sayisal(netTurkishSubject, netMathSubject, netLiteratureSubject2, netPhysicsSubject,name1);
                Sayisal student2 = new Sayisal(netTurkishSubject2, netMathSubject2, netLiteratureSubject2, netPhysicsSubject2,name2);
                Sayisal student3 = new Sayisal(netTurkishSubject3, netMathSubject3, netLiteratureSubject3, netPhysicsSubject3,name3);
                Sayisal firstPlaceHolder = firstPlaceHolder(student1,student2, student3);

                System.out.println("Birinci Eşit Ağırlık Öğrencisi : " + firstPlaceHolder.getName());
                System.out.println("Öğrenci Puanı : " + firstPlaceHolder.calculatePoints());
            }else {
                System.out.println("Geçersiz işlem!");
            }
        }
        }

    public static <E extends Candidate> E firstPlaceHolder(E e1, E e2, E e3) {

        if (e1.calculatePoints() > e2.calculatePoints() && e1.calculatePoints() > e3.calculatePoints()) {

            return e1;
        }
        else if (e2.calculatePoints() > e1.calculatePoints() && e2.calculatePoints() > e3.calculatePoints()) {

            return e2;
        }
        else if (e3.calculatePoints() > e2.calculatePoints() && e3.calculatePoints() > e1.calculatePoints()) {

            return e3;
        }
        else {
            return e1;
        }
}}