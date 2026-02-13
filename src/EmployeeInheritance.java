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
        Scanner sc = new Scanner(System.in);

        // Officer Data Entry
        Officer off = new Officer();
        off.name = sc.nextLine();
        off.age = Integer.parseInt(sc.nextLine());
        off.phoneNumber = sc.nextLine();
        off.address = sc.nextLine();
        off.salary = Double.parseDouble(sc.nextLine());
        off.specialization = sc.nextLine();

        // Manager Data Entry
        Manager man = new Manager();
        man.name = sc.nextLine();
        man.age = Integer.parseInt(sc.nextLine());
        man.phoneNumber = sc.nextLine();
        man.address = sc.nextLine();
        man.salary = Double.parseDouble(sc.nextLine());
        man.department = sc.nextLine();

        // Output Officer Details
        System.out.println("Officer:");
        System.out.println(off.name);
        System.out.println(off.age);
        System.out.println(off.phoneNumber);
        System.out.println(off.address);
        System.out.printf("%.0f\n", off.salary);
        System.out.println(off.specialization);

        // Output Manager Details
        System.out.println("Manager:");
        System.out.println(man.name);
        System.out.println(man.age);
        System.out.println(man.phoneNumber);
        System.out.println(man.address);
        System.out.printf("%.0f\n", man.salary);
        System.out.println(man.department);
        
        sc.close();
    }
}
