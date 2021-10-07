import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Company company = new Company();
//        Operator operator = new Operator();
//        Employee operator1 = new Operator();
//        company.hire(operator);
//        company.hire(operator1);

        for (int i = 0; i < 180; i++) {
            company.hire(new Operator(30000));
        }
        List<Employee> workers = new ArrayList<>();
        for (int i = 0; i < 88; i++) {
//            workers.add(new Manager(40000));
//            if(i % 8 == 0) {
            workers.add(new TopManager(50000, company));
//            }
        }
        company.hireAll(workers);
        System.out.println(company.getIncome());
        printEmployees(company);
        System.out.println(company.getIncome());
        System.out.println("-----------------");
        List<Employee> employees = company.getEmployees();
        int size = employees.size();
        System.out.println(employees.size());
        for (int i = 0; i < size / 2; i++) {
            company.fire(employees.get(i));
        }
        System.out.println(company.getEmployees().size());
        printEmployees(company);
    }

    private static void printEmployees(Company company) {
        System.out.println("-----------------");
        List<Employee> topSalaryStaff = company.getTopSalaryStaff(10);
        for (Employee e : topSalaryStaff) {
            System.out.println(e.getMonthSalary());
        }
        System.out.println("-----------------");
        List<Employee> lowSalaryStaff = company.getLowestSalaryStaff(30);
        for (Employee e : lowSalaryStaff) {
            System.out.println(e.getMonthSalary());
        }
    }
}
