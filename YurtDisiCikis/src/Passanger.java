import java.util.Scanner;

public class Passanger implements RulesForGoingAbroad {
    private int tuition;
    private boolean politicalBan;
    private boolean visaStatus;


    public Passanger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yatırdığınız harç bedeli:");
        this.tuition = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Siyasi yasağınız bulunmaktamıdır ?");
        String cevap = scanner.nextLine();
        if (cevap.equals("evet")){
            this.politicalBan = true;

        } else if (cevap.equals("hayır")) {
            this.politicalBan = false;
        }else {
            System.out.println("Cevap olarak evet veya hayır giriniz!");
        }
        System.out.println("Vizeniz bulunuyor mu ?");
        String answer2 = scanner.nextLine();
        if (answer2.equals("evet")){
            this.visaStatus = true;

        } else if (answer2.equals("hayır")) {
            this.visaStatus = false;
        }else {
            System.out.println("Cevap olarak evet veya hayır giriniz!");
        }
    }

    @Override
    public boolean controlFeesAbroad() {
        if (this.tuition < 15){
            System.out.println("Lütfen harcı eksiksiz yatırın");
            return false;
        }
        else{
            System.out.println("Harç işlemi tamam");
            return true;
        }
    }

    @Override
    public boolean controlForPoliticalBan() {
        if (this.politicalBan == true){
            System.out.println("Siyasi yasağınız bulunuyor. Yurt dışına çıkamazsınız!");
            return false;
        }
        else {
            System.out.println("Siyasi yasağınız bulunmuyor");
            return true;
        }
    }

    @Override
    public boolean checkVisaStatus() {
        if (visaStatus == true){
            System.out.println("Vize işlemleri tamam!");
            return true;
        }else {
            System.out.println("Geçerli bir vizeniz bulunmamaktadır");
            return false;
        }
    }
}
