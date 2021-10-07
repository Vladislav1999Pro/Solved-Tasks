import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends BankAccount {
    private LocalDate lastIncome;

    private boolean getTermDeposit(LocalDate lastIncome, LocalDate dayOutcome) {
        return daysBetween(lastIncome, dayOutcome) > 30;
    }

    private int daysBetween(LocalDate lastIncome, LocalDate toDateTime) {
        return (int) ChronoUnit.DAYS.between(lastIncome, toDateTime);
    }

    private LocalDate currentDate() {
        return LocalDate.now();
    }

    public double take(double amountToTake) {
        double amount = super.take(amountToTake);
        if (lastIncome != null && getTermDeposit(lastIncome, currentDate()) | (amount >= 0)) {
            amount = Math.ceil(amount);
        }
        return amount;
    }
    public void put(double amountToPut) {
        super.put(amountToPut);
        lastIncome = currentDate();
    }

}