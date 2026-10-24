package employee;

public class Employee {
    int id;
    String name;
    double salary;

    public Employee(int i, String n, double s) {
        id = i;
        name = n;
        salary = s;
    }

    public void displayEmployee() {
        System.out.println(id + " " + name + " " + salary);
    }
}
import employee.Employee;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee e = new Employee(id, name, salary);
        e.displayEmployee();

        sc.close();
    }
}
