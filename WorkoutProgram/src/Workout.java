
public class Workout {
    private int burpeeNumber;
    private int pushupNumber;
    private int situpNumber;
    private int squatNumber;

    public Workout(int burpeeNumber, int pushupNumber, int situpNumber, int squatNumber) {
        this.burpeeNumber = burpeeNumber;
        this.pushupNumber = pushupNumber;
        this.situpNumber = situpNumber;
        this.squatNumber = squatNumber;
    }

    public int getBurpeeNumber() {
        return burpeeNumber;
    }

    public void setBurpeeNumber(int burpeeNumber) {
        this.burpeeNumber = burpeeNumber;
    }

    public int getPushupNumber() {
        return pushupNumber;
    }

    public void setPushupNumber(int pushupNumber) {
        this.pushupNumber = pushupNumber;
    }

    public int getSitupNumber() {
        return situpNumber;
    }

    public void setSitupNumber(int situpNumber) {
        this.situpNumber = situpNumber;
    }

    public int getSquatNumber() {
        return squatNumber;
    }

    public void setSquatNumber(int squatNumber) {
        this.squatNumber = squatNumber;
    }
    public void workout(String workoutType, int number){
        if (workoutType.equals("Burpee")){
            
            doBurpee(number);
            
        }
        else if (workoutType.equals("Pushup")){
            doPushup(number);
            
            
        }
        else if (workoutType.equals("Situp")){
            doSitup(number);
            
            
        }
        else if (workoutType.equals("Squat")){
            doSquat(number);
            
            
        }
        else {
            System.out.println("Geçersiz Hareket...");
        }
        
    }
    public void doBurpee(int sayi) {
        
        if (burpeeNumber == 0) {
            System.out.println("Yapacak burpee kalmadı...");
        }
        if (burpeeNumber - sayi < 0) {
            System.out.println("Hedeflediğin burpee sayısını geçtin.Tebrikler!");
            burpeeNumber = 0;
            System.out.println("Kalan Burpee : " + burpeeNumber);
            
        }
        else {
            
            burpeeNumber -= sayi;
            
            System.out.println("Kalan Burpee Sayısı : " + burpeeNumber);
            
        }
        
        
    }
    public void doPushup(int sayi) {
        
        if (pushupNumber == 0) {
            System.out.println("Yapacak pushup kalmadı...");
        }
        if (pushupNumber - sayi < 0) {
            System.out.println("Hedeflediğin pushup sayısını geçtin.Tebrikler!");
            pushupNumber = 0;
            System.out.println("Kalan Pushup : " + pushupNumber);
            
        }
        else {
            
            pushupNumber -= sayi;
            
            System.out.println("Kalan Pushup Sayısı : " + pushupNumber);
            
        }
        
        
    }
    public void doSitup(int sayi) {
        
        if (situpNumber == 0) {
            System.out.println("Yapacak Situp  kalmadı...");
        }
        if (situpNumber - sayi < 0) {
            System.out.println("Hedeflediğin situp sayısını geçtin.Tebrikler!");
            situpNumber = 0;
            System.out.println("Kalan Situp : " + situpNumber);
            
        }
        else {
            
            situpNumber -= sayi;
            
            System.out.println("Kalan Situp Sayısı : " + situpNumber);
            
        }
        
        
    }
    public void doSquat(int sayi) {
        
        if (squatNumber == 0) {
            System.out.println("Yapacak squat kalmadı...");
        }
        if (squatNumber - sayi < 0) {
            System.out.println("Hedeflediğin squat sayısını geçtin.Tebrikler!");
            squatNumber = 0;
            System.out.println("Kalan Squat : " + squatNumber);
            
        }
        else {
            
            squatNumber -= sayi;
            
            System.out.println("Kalan Squat Sayısı : " + squatNumber);
            
        }
        
        
    }
    public boolean isWorkoutOver() {
        
        return (burpeeNumber == 0 ) && (pushupNumber == 0 ) && (situpNumber == 0 ) && (squatNumber == 0 );
        
    }
    
}
