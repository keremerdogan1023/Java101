import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void showOperations(){
        System.out.println("0- İşlemleri görüntüle");
        System.out.println("1- Bir sonraki şehre git ");
        System.out.println("2- Bir önceki şehre git");
        System.out.println("3- Uygulamadan çık");
    }
    public static void tourCities(LinkedList<String > cities){
        Scanner scanner = new Scanner(System.in);
        ListIterator<String >iterator = cities.listIterator();

        int operation;
        showOperations();
        if (!iterator.hasNext()){
            System.out.println("Herhangi bir şehir bulunmuyor.");
        }
        boolean exit = false;
        boolean forward = true;
        while (!exit){
            System.out.println("Bir işlem seçiniz.");
            operation=scanner.nextInt();
            if (operation == 0){
                showOperations();
            } else if (operation == 1) {
                if (!forward){
                    if (iterator.hasNext()){
                        iterator.next();
                    }
                    forward = true;
                }
                if (iterator.hasNext()){
                    System.out.println("Bir sonraki şehre gidiliyor:"+ iterator.next());
                }
                else{
                    System.out.println("Turumuz tamamlandı.");
                    forward = true;
                }

            } else if (operation == 2) {
                if (forward){
                    if (iterator.hasPrevious()){
                        iterator.previous();
                    }
                    forward = false;
                }
                if (iterator.hasPrevious()){
                    System.out.println("Bir önceki şehre gidiliyor:"+ iterator.previous());
                }
                else {
                    System.out.println("Turun başındayız.");
                }

            } else if (operation == 3) {
                exit = true;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<String >();

        cities.add("Ankara");
        cities.add("Eskişehir");
        cities.add("Adıyaman");
        tourCities(cities);
    }
}