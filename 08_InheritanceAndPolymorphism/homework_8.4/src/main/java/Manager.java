public class Manager extends Worker {

    public static final double EARNINGS_BONUS = 0.05;
    public static final int MIN_EARNINGS = 140000;
    public static final int MAX_EARNINGS = 115000;
    private final int sales = (int) (Math.random() * (MIN_EARNINGS - MAX_EARNINGS) + MAX_EARNINGS);

    public Manager(int salary) {
        super(salary);

    }

    @Override
    public int getMonthSalary() {
        return (int) (salary + EARNINGS_BONUS * sales);
    }

    public int getSales() {
        return sales;
    }
}

