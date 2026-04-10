import java.util.Scanner;

class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println(salary);
    }
}

class Officer extends Employee {
    String specialization;
}

class Manager extends Employee {
    String department;
}

public class EmployeeInheritance {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Read Officer
            Officer o = new Officer();
            if (sc.hasNextLine()) o.name = sc.nextLine().trim();
            if (sc.hasNextLine()) o.age = Integer.parseInt(sc.nextLine().trim());
            if (sc.hasNextLine()) o.phoneNumber = sc.nextLine().trim();
            if (sc.hasNextLine()) o.address = sc.nextLine().trim();
            if (sc.hasNextLine()) o.salary = Double.parseDouble(sc.nextLine().trim());
            if (sc.hasNextLine()) o.specialization = sc.nextLine().trim();

            // Read Manager
            Manager m = new Manager();
            if (sc.hasNextLine()) m.name = sc.nextLine().trim();
            if (sc.hasNextLine()) m.age = Integer.parseInt(sc.nextLine().trim());
            if (sc.hasNextLine()) m.phoneNumber = sc.nextLine().trim();
            if (sc.hasNextLine()) m.address = sc.nextLine().trim();
            if (sc.hasNextLine()) m.salary = Double.parseDouble(sc.nextLine().trim());
            if (sc.hasNextLine()) m.department = sc.nextLine().trim();

            // Output Officer
            System.out.println("Officer:");
            System.out.println(o.name);
            System.out.println(o.age);
            System.out.println(o.phoneNumber);
            System.out.println(o.address);
            o.printSalary();
            System.out.println(o.specialization);

            // Output Manager
            System.out.println("Manager:");
            System.out.println(m.name);
            System.out.println(m.age);
            System.out.println(m.phoneNumber);
            System.out.println(m.address);
            m.printSalary();
            System.out.println(m.department);
        }
    }
}
