public class Main {
    public static void main(String[] args) {
        try{
            int b = 30/0; //AritmeticException
            int [] a = {1,2,3,4,5};
            System.out.println(a[6]);

        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Arrayin boyunu aştınız...");
           // e.printStackTrace();
        }
        catch (ArithmeticException e){
            System.out.println("Bir sayı 0'a bölünemez...");
        }
        catch (Exception e){
            System.out.println("Bir hata oluştu...");
        }
        finally {
            System.out.println("Hata yakalansa da yakalanmasa da çalışır...");
        }
    }
}