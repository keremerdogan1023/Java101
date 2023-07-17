import java.util.Scanner;
class PoliticalException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("Siyasi yasağınız bulunuyor");
    }
}
class VisaException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("Gerekli vizeniz bulunmamaktadır.");
    }
}
class TuitionException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("Lütfen yurtdışı harcını tam yatırın...");
    }
}
public class Passanger  {
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


    public void controlFeesAbroad() throws TuitionException {
        if (this.tuition < 15){
            throw new TuitionException();

        }
        else{
            System.out.println("Harç işlemi tamam");
        }
    }


    public void controlForPoliticalBan() throws PoliticalException {
        if (this.politicalBan == true){
            throw new PoliticalException();
        }
        else {
            System.out.println("Siyasi yasağınız bulunmuyor");
        }
    }


    public void checkVisaStatus() throws VisaException {
        if (visaStatus == true){
            System.out.println("Vize işlemleriniz tamam");
        }
        else {
            throw new VisaException();
        }
    }
}
