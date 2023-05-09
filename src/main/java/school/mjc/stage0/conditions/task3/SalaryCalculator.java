package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if(salary < 0) {
            System.out.println("wrong input!");
        }

        if(salary > 0 && salary <=10_000) {
            System.out.printf("%.1f\n", salary * 0.85);
        } else if(salary > 10_000 && salary <= 20_000) {
            System.out.printf("%.1f\n", salary * 0.82);
        } else {
            System.out.printf("%.1f\n", salary * 0.8);
        }
    }
}
