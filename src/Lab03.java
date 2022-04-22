
public class Lab03 {
    public static void main(String[] args) {
        System.out.println("-------------------------------\n");
        System.out.println("     Salary of Employees\n");
        System.out.println("-------------------------------\n");
        Employee Employee1 = new Employee(001, "Ishan", 7000);
        Employee1.DisplaySalary();
        FullTimeEmployee Employee2 = new FullTimeEmployee(002, "Yash", 9000);
        Employee2.calculateSalary();
        InternEmployee Inter1 = new InternEmployee(101, "Alex", 2300);
        Inter1.calculateSalary();
    }
}

class Employee{
    int empId;
    String Name;
    double beforeHikeSalary;
    double afterHikeSalary;

    public Employee(int empId, String name, double beforeHikeSalary) {
        this.empId = empId;
        Name = name;
        this.beforeHikeSalary = beforeHikeSalary;
    }

    void DisplaySalary(){
        System.out.println("Salary of Employee before hike: \n"+beforeHikeSalary);
        //System.out.println("Salary of Full time Employee: \n"+afterHikeSalary);
    }

}

class FullTimeEmployee extends Employee{
    public FullTimeEmployee(int empId, String name, double beforeHikeSalary) {
        super(empId, name, beforeHikeSalary);
    }

    void calculateSalary(){
        afterHikeSalary = beforeHikeSalary * 0.5;
        System.out.println("Salary of Full time Employee: \n"+afterHikeSalary);
    }
}

class InternEmployee extends Employee{
    public InternEmployee(int empId, String name, double beforeHikeSalary) {
        super(empId, name, beforeHikeSalary);
    }

    void calculateSalary(){
        afterHikeSalary = beforeHikeSalary * 0.25;
        System.out.println("Salary of Intern Employee is: \n"+afterHikeSalary);
    }
}