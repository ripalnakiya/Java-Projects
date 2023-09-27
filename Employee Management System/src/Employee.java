public class Employee {
    private String name;
    private int empID;
    private int salary;

    public Employee(String name, int empID, int salary) {
        this.name = name;
        this.empID = empID;
        this.salary = salary;
    }

    public String toString() {
        return "\nName: " + name + "\nempID: " + empID + "\nSalary: " + salary;
    }
}
