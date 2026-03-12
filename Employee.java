package Task04;

public class Employee {
    public void calculateSalary(){
        System.out.println("Calculating the Salaries.");
    }

    static void main(String[] args) {
        Employee m = new Manager();
        Employee d = new Developer();
        Employee i = new Intern();

        m.calculateSalary();
        d.calculateSalary();
        i.calculateSalary();
    }
}


class Manager extends Employee{
    @Override
    public void calculateSalary() {
        double salary =500000;
        double allowances=25000;
        double tax=10000;
        double bonus=6000;
        double total = (salary+allowances+bonus)-tax;
        System.out.println("Salary Of Manager: " + total);
    }
}

class Developer extends Employee{
    @Override
    public void calculateSalary() {
        double salary =250000;
        double allowances=12000;
        double tax=5000;

        double total = (salary+allowances)-tax;
        System.out.println("Salary Of Developer: " + total);
    }
}

class Intern extends Employee{
    @Override
    public void calculateSalary() {
        double stipend =50000;

        double total = stipend;
        System.out.println("Salary Of Intern: " + total);
    }
}