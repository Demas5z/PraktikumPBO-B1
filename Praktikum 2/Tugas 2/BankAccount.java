public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double jumlah) {
        if (jumlah > 0) {
            balance += jumlah;
            System.out.println("Deposit sebesar " + jumlah + " berhasil. Saldo sekarang: " + balance);
        } else {
            System.out.println("Jumlah deposit harus lebih dari 0.");
        }
    }

    public void withdraw(double jumlah) {
        if (jumlah > 0) {
            if (balance >= jumlah) {
                balance -= jumlah;
                System.out.println("Penarikan sebesar " + jumlah + " berhasil. Saldo sekarang: " + balance);
            } else {
                System.out.println("Saldo tidak mencukupi untuk melakukan penarikan sebesar " + jumlah);
            }
        } else {
            System.out.println("Jumlah penarikan harus lebih dari 0.");
        }
    }

    public double getBalance() {
        return balance;
    }
}