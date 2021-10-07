public class CardAccount extends BankAccount {
    private static final double COMMISSION_PERCENT = 0.01;

    public double take(double amountToTake) {
        if (amountToTake >= 0 && amountToTake < amount) {
            amount -= (amountToTake + amountToTake * COMMISSION_PERCENT);
       }
        return amount;
    }
}
