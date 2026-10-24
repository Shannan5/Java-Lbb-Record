abstract class Employee {
    static String company = "ABC";
    public String department = "CSE";
    private int salary;
    protected String designation;
    String location;

    Employee(int s, String d, String l) {
        salary = s;
        designation = d;
        location = l;
    }

    void setSalary(int s) {
        salary = s;
    }

    int getSalary() {
        return salary;
    }

    abstract void displayRole();
}

class Developer extends Employee {
    Developer() {
        super(25000, "Developer", "Coimbatore");
    }

    void displayRole() {
        System.out.println("Software Developer");
    }

    public static void main(String[] args) {
        Developer d = new Developer();
        System.out.println(company);
        System.out.println(d.department);
        System.out.println(d.getSalary());
        System.out.println(d.designation);
        System.out.println(d.location);
        d.displayRole();
    }
}
