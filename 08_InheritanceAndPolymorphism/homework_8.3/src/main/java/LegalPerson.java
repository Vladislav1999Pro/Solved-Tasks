public class LegalPerson extends Client {
    protected static final double COMMISSION_PERCENT = 0.01;

//    @Override
//    public double take(double amountToTake) {
//        if (amountToTake > 0 && amountToTake < amount) {
//            amount -= (amountToTake + amountToTake * COMMISSION_PERCENT);
//        }
//        return amount;
//    }

    @Override
    protected double getWithdrawalCommission(double amountToTake) { //подсчет суммы комиссии снятия
        if (amountToTake > 0 && amountToTake < amount) {
            withdrawalCommission += amountToTake * COMMISSION_PERCENT;
        }
        return withdrawalCommission;
    }

    @Override
    protected double getDepositCommission(double amountToPut) { //подсчет суммы комиссии пополнения
        return depositCommission;
    }
}