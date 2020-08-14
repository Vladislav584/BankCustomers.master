abstract public class Client {

    private String outputBalance = "Ваш баланс: ";
    private long balance;

    long getBalance() {
        return balance;
    }

    public void putMoney(long moneyAmount) {
        balance += moneyAmount;
        System.out.println(outputBalance + balance);
        System.out.println();
    }

    public void withdrawMoney(long moneyAmount) {
        if (moneyAmount <= balance) {
            balance -= moneyAmount;
            System.out.println(outputBalance + balance);
            System.out.println();
        } else {
            System.out.println("Вы вводите сумму, которая больше Вашего баланса!");
            System.out.println();
        }
    }
}
