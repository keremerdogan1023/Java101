
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Main {
    public static void main(String[] args) {
        // Idman Oluşturma Programı
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Idman Programına Hoşgeldiniz...");
        
        String workouts = "Geçerli Hareketler...\n"
                          + "Burpee\n"
                          +"Pushup(Şınav)\n"
                          +"Situp(Mekik)\n"
                          +"Squat";
        System.out.println(workouts);
        
        System.out.println("Bir idman oluşturun...");
        
        System.out.print("Burpee Sayısı : ") ;
        int burpee = scanner.nextInt();
        System.out.print("Pushup Sayısı : ") ;
        int pushup = scanner.nextInt();
        System.out.print("Situp Sayısı : ") ;
        int situp = scanner.nextInt();
        System.out.print("Squat Sayısı : ") ;
        int squat = scanner.nextInt();
        
        scanner.nextLine();
        
    
        Workout workout = new Workout(burpee, pushup, situp, squat);
        
        System.out.println("İdmanınız Başlıyor.....");
        
        int i =  1;
        
        try(FileWriter writer = new FileWriter("workoutLog.txt")) {
            writer.write("Idman Programı...\n");
            writer.write("Burpee Sayısı : " + workout.getBurpeeNumber() + " \n");
            writer.write("Pushup Sayısı : " + workout.getPushupNumber()+ " \n");
            writer.write("Situp Sayısı : " + workout.getSitupNumber()+ " \n");
            writer.write("Squat Sayısı : " + workout.getSquatNumber()+ " \n");
           
          
        while (workout.isWorkoutOver() == false){
            
            System.out.print("Hareket Türü(Burpee,Pushup,Situp,Squat) : ");
            String tur = scanner.nextLine();
            System.out.print("Bu hareketten kaç tane yapacaksınız ? : ");
            int number = scanner.nextInt();
            scanner.nextLine();
            workout.workout(tur, number);
            
            writer.write(i + ".İşlem ---------->  Hareket : " + tur + " Sayı : " + number + "\n");
            i++;
            
            
        }
        
        System.out.println("Idmanını başarıyla bitirdin....");
    
    
    }   catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
