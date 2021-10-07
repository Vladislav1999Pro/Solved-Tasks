public class PhysicalPerson extends Client {
    @Override
    protected double getWithdrawalCommission(double amountToTake) { //подсчет суммы комиссии снятия
        return withdrawalCommission;
    }

    @Override
    protected double getDepositCommission(double amountToPut) { //подсчет суммы комиссии пополнения
        return depositCommission;
    }
}
