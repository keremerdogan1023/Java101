public class Account {
    private String id;
    private String password;
    private int balance;

    public Account() {
    }

    public Account(String id, String password, int balance) {
        this.id = id;
        this.password = password;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("İşlem sonrası yeni bakiyeniz: "+ balance);
    }
    public void withdraw(int amount){
        if (amount<= balance){
            balance -= amount;
            System.out.println("İşlem sonrası yeni bakiyeniz:"+ balance);
        }
        else {
            System.out.println("Yetersiz bakiye!");
        }
    }
}
