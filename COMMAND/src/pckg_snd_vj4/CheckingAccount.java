package pckg_snd_vj4;

public class CheckingAccount extends Account {

    protected CheckingAccount(String name) {
        super(name);
    }

    @Override
    public void depositMoney(double amount) {
        this.balance += amount;
        System.out.println("Deposit money amount: " + amount);
    }

    @Override
    public double withdrawMoney(double amount) {
        if(this.balance - amount <0){
            System.out.println("Nothing to withdraw!");
            return 0;
        }else{
            balance -= amount;
            System.out.println("After withdrawal of amount: " + amount + " the balance is: " + balance);
            return 0;
        }

    }
}
