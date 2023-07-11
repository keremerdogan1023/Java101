public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Hesap hesap = new Hesap("Kerem Erdoğan", "123456", 1500);
        atm.calis(hesap);
    }
}