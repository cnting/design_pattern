package day_53_combination.department;

/**
 * Created by cnting on 2022/11/12
 */
public class Employee extends HumanResource {
    public Employee(long id,double salary) {
        super(id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
