public class IndividualBusinessman extends Client {
    protected static final double COMMISSION_PERCENT = 0.005;
    protected static final int MONETARY_THRESHOLD = 1000;

//    @Override
//    public double put(double amountToPut) {
//        if (amountToPut > 0) {
//            if (amountToPut < MONETARY_THRESHOLD) {
//                amount += (amountToPut - amountToPut * LegalPerson.COMMISSION_PERCENT);
//            } else if (amountToPut >= MONETARY_THRESHOLD) {
//                amount += (amountToPut - amountToPut * COMMISSION_PERCENT);
//            }
//        }
//        return amount;
//    }

    @Override
    protected double getWithdrawalCommission(double amountToTake) { //подсчет суммы комиссии снятия
        return withdrawalCommission;
    }

    @Override
    protected double getDepositCommission(double amountToPut) { //подсчет суммы комиссии пополнения
        if (amountToPut > 0) {
            if (amountToPut < MONETARY_THRESHOLD) {
                depositCommission += amountToPut * LegalPerson.COMMISSION_PERCENT;
            } else if (amountToPut >= MONETARY_THRESHOLD) {
                depositCommission += amountToPut * COMMISSION_PERCENT;
            }
        }
        return depositCommission;
    }
}
