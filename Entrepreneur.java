public class Entrepreneur extends Client {

    private final double PERCENT_PUT_UP_1000 = 0.01;
    private final double PERCENT_PUT_OVER_1000 = 0.005;

    @Override
    public void putMoney(long moneyAmount) {
        if (moneyAmount < 100000) {
            moneyAmount = (long) (moneyAmount - moneyAmount * PERCENT_PUT_UP_1000);
        }
        if (moneyAmount >= 100000) {
            moneyAmount = (long) (moneyAmount - moneyAmount * PERCENT_PUT_OVER_1000);
        }
        super.putMoney(moneyAmount);
    }
}
