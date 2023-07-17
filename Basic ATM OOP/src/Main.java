public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Account account = new Account("Kerem Erdoğan", "123456", 1500);
        atm.calis(account);
    }
}