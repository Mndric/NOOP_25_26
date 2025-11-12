package pckg_snd_vj4;

public abstract class Account {

    private int id;
    protected static int cntID = 100;
    private String name;
    protected double balance;

    protected Account(String name) {

        this.name = name;
        this.id = cntID++;
        this.balance = 1000;
    }
    public double getBalance() {
        return balance;
    }
    public abstract void depositMoney(double amount);
    public abstract double withdrawMoney(double amount);

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
