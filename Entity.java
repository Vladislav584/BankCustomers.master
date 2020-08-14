public class Entity extends Client {

    private final double PERCENT_WITHDRAW = 0.01;

    @Override
    public void withdrawMoney(long moneyAmount) {
        long amountWithPercent = (long) (moneyAmount + moneyAmount * PERCENT_WITHDRAW);
        super.withdrawMoney(amountWithPercent);
    }
}