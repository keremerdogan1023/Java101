import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void islemleriBastir(){
        System.out.println("0- İşlemleri görüntüle");
        System.out.println("1- Bir sonraki şehre git ");
        System.out.println("2- Bir önceki şehre git");
        System.out.println("3- Uygulamadan çık");
    }
    public static void  sehirleriTurla(LinkedList<String > sehirler){
        Scanner scanner = new Scanner(System.in);
        ListIterator<String >iterator = sehirler.listIterator();

        int islem;
        islemleriBastir();
        if (!iterator.hasNext()){
            System.out.println("Herhangi bir şehir bulunmuyor.");
        }
        boolean exit = false;
        boolean ileri = true;
        while (!exit){
            System.out.println("Bir işlem seçiniz.");
            islem=scanner.nextInt();
            if (islem == 0){
                islemleriBastir();
            } else if (islem == 1) {
                if (!ileri){
                    if (iterator.hasNext()){
                        iterator.next();
                    }
                    ileri = true;
                }
                if (iterator.hasNext()){
                    System.out.println("Bir sonraki şehre gidiliyor:"+ iterator.next());
                }
                else{
                    System.out.println("Turumuz tamamlandı.");
                    ileri = true;
                }

            } else if (islem == 2) {
                if (ileri){
                    if (iterator.hasPrevious()){
                        iterator.previous();
                    }
                    ileri = false;
                }
                if (iterator.hasPrevious()){
                    System.out.println("Bir önceki şehre gidiliyor:"+ iterator.previous());
                }
                else {
                    System.out.println("Turun başındayız.");
                }

            } else if (islem == 3) {
                exit = true;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList<String> sehirler = new LinkedList<String >();

        sehirler.add("Ankara");
        sehirler.add("Eskişehir");
        sehirler.add("Adıyaman");
        sehirleriTurla(sehirler);
    }
}