package Company;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Ammar", 50000, Department.TECH);
        System.out.println(e.name + "'s bonus: " + e.calculateBonus());
    }
}

enum Department {
    // your code
    HR, SALES, TECH;
}

class Employee {
    String name;
    double salary;
    Department dept;

    Employee(String name, double salary, Department dept) {
        // your code
        this.name=name;
        this.salary=salary;
        this.dept=dept;
    }

    double calculateBonus() {
        // your code

        double bonus = 0;

        if(dept == Department.HR){
            bonus = salary * 0.1;
        }else if(dept == Department.SALES){
            bonus = salary * 0.15;
        }else {
            bonus = salary * 0.2;
        }

        return bonus;
    }
}
