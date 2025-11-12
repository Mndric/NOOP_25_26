package pckg_snd_vj4;

public class MobAppTest {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("Lucijan");
        MobAccApp mobAccApp = new MobAccApp();
        DepositMoneyTransaction depositMoneyTransaction = new DepositMoneyTransaction(checkingAccount, 1300);
        mobAccApp.setPaymentTransactionCmd(depositMoneyTransaction);
        mobAccApp.performTransaction();
        System.out.println(checkingAccount);
        mobAccApp.undoTransaction();
        System.out.println(checkingAccount);
    }
}
