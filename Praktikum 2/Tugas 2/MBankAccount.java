public class MBankAccount {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1000);
        System.out.println("Saldo awal: " + myAccount.getBalance());
        myAccount.deposit(500);
        myAccount.withdraw(200);
        System.out.println("Saldo akhir: " + myAccount.getBalance());
    }
}