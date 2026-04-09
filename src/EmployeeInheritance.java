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

// TODO: Create class Officer extends Employee
class Officer extends Employee {
    // Add 'specialization' attribute
    String specialization;
}

// TODO: Create class Manager extends Employee
class Manager extends Employee {
    // Add 'department' attribute
    String department;
}

public class EmployeeInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- OFFICER INPUT ---
        Officer off = new Officer();
        off.name = sc.nextLine();
        off.age = sc.nextInt();
        sc.nextLine(); // Consume newline buffer
        off.phoneNumber = sc.nextLine();
        off.address = sc.nextLine();
        off.salary = sc.nextDouble();
        sc.nextLine(); // Consume newline buffer
        off.specialization = sc.nextLine();

        // --- MANAGER INPUT ---
        Manager man = new Manager();
        man.name = sc.nextLine();
        man.age = sc.nextInt();
        sc.nextLine(); // Consume newline buffer
        man.phoneNumber = sc.nextLine();
        man.address = sc.nextLine();
        man.salary = sc.nextDouble();
        sc.nextLine(); // Consume newline buffer
        man.department = sc.nextLine();

        // --- OUTPUT ---
        System.out.println("Officer:");
        System.out.println(off.name);
        System.out.println(off.age);
        System.out.println(off.phoneNumber);
        System.out.println(off.address);
        // Cast to int to match the example output format
        System.out.println((int)off.salary);
        System.out.println(off.specialization);

        System.out.println("Manager:");
        System.out.println(man.name);
        System.out.println(man.age);
        System.out.println(man.phoneNumber);
        System.out.println(man.address);
        System.out.println((int)man.salary);
        System.out.println(man.department);
        
        sc.close();
    }
}
