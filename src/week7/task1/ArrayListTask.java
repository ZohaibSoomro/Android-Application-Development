package week7.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTask {
    public static void main(String[] args) {
        ArrayList<Employee> employeesInfoList = getEmployeesInfo();
        int choice = 0;
        do {
            System.out.println("1. Print Names");
            System.out.println("2. Print Job ids");
            System.out.println("3. Print Salaries");
            System.out.println("4. Print Email Addresses");
            System.out.println("5. Print Phone Numbers");
            System.out.println("6. Print All Info");
            System.out.println("0. Exit");
            System.out.print("Your input: ");
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nNames: ");
                    System.out.println(listEmployeeNames(employeesInfoList));
                    break;
                case 2:
                    System.out.println("\nJob Ids: ");
                    System.out.println(listEmployeeJobIds(employeesInfoList));
                    break;
                case 3:
                    System.out.println("\nSalaries: ");
                    System.out.println(listEmployeeSalaries(employeesInfoList));
                    break;
                case 4:
                    System.out.println("\nEmail Addresses: ");
                    System.out.println(listEmployeeEmailAddresses(employeesInfoList));
                    break;
                case 5:
                    System.out.println("\nPhone Numbers: ");
                    System.out.println(listEmployeePhoneNums(employeesInfoList));
                    break;
                case 6:
                    System.out.println("\nEmployees' Information: ");
                    printArrayList(employeesInfoList);
                    break;
                case 0:
                    System.out.println("\nExited!");
                    System.exit(0);
                default:
                    System.out.println("\nInvalid input! try again...\n");
            }

        } while (choice != 0);
    }

    private static ArrayList<String> listEmployeeEmailAddresses(ArrayList<Employee> list) {
        ArrayList<String> emailAddresses = new ArrayList<String>();
        for (Employee e : list) {
            emailAddresses.add(e.getEmailAddress());
        }
        return emailAddresses;
    }

    private static ArrayList<String> listEmployeePhoneNums(ArrayList<Employee> list) {
        ArrayList<String> phoneNumbers = new ArrayList<String>();
        for (Employee e : list) {
            phoneNumbers.add(e.getEmailAddress());
        }
        return phoneNumbers;
    }

    private static ArrayList<String> listEmployeeJobIds(ArrayList<Employee> list) {
        ArrayList<String> jobIds = new ArrayList<String>();
        for (Employee e : list) {
            jobIds.add(e.getJobId());
        }
        return jobIds;
    }

    public static void printArrayList(ArrayList<Employee> arrayList) {
        for (Employee e : arrayList) {
            System.out.print("\nName: " + e.getName());
            System.out.print("  job id: " + e.getJobId());
            System.out.print("  Salary: " + e.getSalary());
            System.out.println("\n---------------------------");
        }
    }

    public static ArrayList<String> listEmployeeNames(ArrayList<Employee> list) {
        ArrayList<String> names = new ArrayList<String>();
        for (Employee e : list) {
            names.add(e.getName());
        }
        return names;
    }

    public static ArrayList<Double> listEmployeeSalaries(ArrayList<Employee> list) {
        ArrayList<Double> salaries = new ArrayList<Double>();
        for (Employee e : list) {
            salaries.add(e.getSalary());
        }
        return salaries;
    }


    public static ArrayList<Employee> getEmployeesInfo() {
        ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter employee#" + (i + 1) + "'s name: ");
            String name = in.nextLine();
            System.out.print("Enter job id: ");
            String jobId = in.nextLine();
            System.out.print("Enter email address: ");
            String emailAddress = in.nextLine();
            System.out.print("Enter phone number: ");
            String phoneNumber = in.nextLine();
            System.out.print("Enter salary: ");
            double salary = in.nextDouble();
            in.nextLine();
            Employee employee = new Employee();
            employee.setName(name);
            employee.setSalary(salary);
            employee.setJobId(jobId);
            employee.setEmailAddress(emailAddress);
            employee.setPhoneNumber(phoneNumber);

            employeeArrayList.add(employee);
        }
        return employeeArrayList;
    }

}
