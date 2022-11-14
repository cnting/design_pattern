package day_53_combination.department;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cnting on 2022/11/12
 */
public class Department extends HumanResource {
    private List<HumanResource> subNodes = new ArrayList<>();

    public Department(long id) {
        super(id);
    }

    @Override
    public double calculateSalary() {
        double total = 0;
        for (HumanResource hr : subNodes) {
            total += hr.calculateSalary();
        }
        this.salary = total;
        return total;
    }

    public void addSubNode(HumanResource hr) {
        subNodes.add(hr);
    }
}
