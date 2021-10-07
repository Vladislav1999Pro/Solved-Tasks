public abstract class Client {
    protected double amount = 0;
    protected double withdrawalCommission = 0; //сумма комиссии снятия
    protected double depositCommission = 0; //сумма комиссии пополнения

    public double getAmount() {
        return amount;
    }

    public double put(double amountToPut) {
        if (amountToPut > 0) {
            amount += (amountToPut - getDepositCommission(amountToPut));
        }
        return amount;
    }

    public double take(double amountToTake) {
        if (amountToTake > 0 && amountToTake < amount) {
            amount -= (amountToTake + getWithdrawalCommission(amountToTake)) ;
        }
        return amount;
    }

    protected abstract double getWithdrawalCommission(double amountToTake); //подсчет суммы комиссии снятия

    protected abstract double getDepositCommission(double amountToPut); //подсчет суммы комиссии пополнения

}
