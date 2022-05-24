package week7.task1;

public class TestDemo {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Ahmed");
        person.setEmailAddress("zohaibsoomro006@gmail.com");
        person.setPhoneNumber("03047498080");
        person.setAddress("Hyderabad");
        printPerson(person);

        Faculty f1 = new Faculty();
        f1.setName("Faculty member 1");
        f1.setHours(8);
        f1.setRank("5.5");
        f1.setEmailAddress("f1.sw@gmail.com");
        f1.setSalary(40000);
        printPerson(f1);


        Student student = new Student("Juniour");
        student.setName("Javed");
        student.setEmailAddress("f1.sw@gmail.com");
        student.setAddress("Hyderabad");
        student.setPhoneNumber("689987989");
        printPerson(student);

        Staff staff = new Staff();
        staff.setName("Khalid");
        staff.setAddress("Multan");
        staff.setPhoneNumber("689987989");
        staff.setEmailAddress("f1.sw@gmail.com");
        staff.setTitle("Tea Staff");
        staff.setSalary(60000);
        staff.setDateHired("03-06-2017");
        printPerson(staff);

        Employee employee = new Employee();
        employee.setOffice("on Office");
        employee.setAddress("Jamshoro");
        employee.setName("Hamid");
        employee.setDateHired("04-08-2009");
        employee.setSalary(80000);
        printPerson(employee);

    }

    public static void printPerson(Person person) {
        System.out.println(person.getName());
        System.out.println(person.getPhoneNumber());
        System.out.println(person.getEmailAddress());
        System.out.println(person.getAddress());
        System.out.println("--------------------------");
    }
}
