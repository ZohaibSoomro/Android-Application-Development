package week6;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {

        Employee employee1 = getUserInputs();
        printEmployee(employee1);

    }

    public static void printEmployee(Employee employee) {
        System.out.println("Employee Id: " + employee.getId());
        System.out.println("Department Name: " + employee.getDepartment().getDepartmentName());
        System.out.println("Gender: " + employee.getGender());
        System.out.println("Job: " + employee.getJobId());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Address: " + employee.getAddress().getCityName() + ", " + employee.getAddress().getStateName());
        System.out.println("Contact number: " + employee.getContactNumber());
        System.out.println("-------------------------------");
    }

    public static Employee getUserInputs() {
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.print("Enter employee id: ");
        employee.setId(input.nextInt());
        System.out.print("Enter employee Name: ");
        employee.setName(input.next());

        Department dept1 = new Department();
        System.out.print("Enter department id: ");
        dept1.setDepartmentId(input.nextInt());
        System.out.print("Enter department Name: ");
        dept1.setDepartmentName(input.next());
        System.out.print("Enter department's Manager Name: ");
        dept1.setManagerName(input.next());
        employee.setDepartment(dept1);

        System.out.print("Enter employee Gender(M/F): ");
        employee.setGender(input.next().charAt(0));

        System.out.print("Enter Employee Job: ");
        employee.setJobId(input.next());
        System.out.print("Enter Employee salary: ");
        employee.setSalary(input.nextDouble());

        Address address1 = new Address();
        System.out.print("Enter city name: ");
        address1.setCityName(input.next());
        System.out.print("Enter state name: ");
        address1.setStateName(input.next());

        employee.setAddress(address1);
        System.out.print("Enter employee contact number: ");
        employee.setContactNumber(input.nextInt());
        System.out.println();
        return employee;
    }
}
