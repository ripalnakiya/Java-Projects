import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Scanner sc = new Scanner(System.in);

        Employee emp;
        int ans = 1, option;
        int empID, salary;
        String name;
        do {
            System.out.println("\n\n*********************Employee Management System*********************\n");
            System.out.println("1. Add Employee");
            System.out.println("2. Delete Employee");
            System.out.println("3. Display Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Exit");
            System.out.println("\nChoose the option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\nEnter Name and Salary");
                    name = sc.next();
                    salary = sc.nextInt();
                    empID = employees.size() + 1;
                    emp = new Employee(name, empID, salary);
                    employees.add(emp);
                    System.out.println("\nEmployee Created");
                    System.out.println(emp);
                    break;
                case 2:
                    System.out.print("Enter Employee ID: ");
                    empID = sc.nextInt();
                    employees.remove(empID - 1);
                    System.out.println("\nEmployee Deleted");
                    break;
                case 3:
                    System.out.println("Enter Employee ID: ");
                    empID = sc.nextInt();
                    emp = employees.get(empID - 1);
                    System.out.println(emp);
                    break;
                case 4:
                    for (Employee e : employees) {
                        System.out.println(e);
                    }
                    break;
                case 5:
                    ans = 0;
                    break;
            }
        } while (ans == 1);

        sc.close();
    }
}