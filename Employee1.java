
abstract class Employee1 {
    String name;

    Employee1(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("Employee: " + name);
    }

    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee1 {
    double monthlySalary;

    FullTimeEmployee(String name, double salary) {
        super(name);
        monthlySalary = salary;
    }

    void calculateSalary() {
        System.out.println("Monthly Salary: ₹" + monthlySalary);
    }
}

class Employee1Main {
    public static void main(String[] args) {
        FullTimeEmployee e = new FullTimeEmployee("Divya", 30000);

        e.showName();
        e.calculateSalary();
    }
}
