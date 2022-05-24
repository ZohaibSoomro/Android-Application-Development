package week6;

public class TestStudent {
    public static void main(String[] args) {
//        Student zohaib = new Student("Zohaib", new Department(24, "Software", "Naeem Ahmed"), 20);
//        Student hassan = new Student("Hassan", "Mining", 19);
//        Student ahmed = new Student("Ahmed", "Mechanical", 22);
//        Student shoaib = new Student("Shoaib", "Civil", 25);

//        printStudent(zohaib);
//        printStudent(hassan);
//        printStudent(ahmed);
//        printStudent(shoaib);
    }

    public static void printStudent(Student student) {
        System.out.println("Student Name: " + student.getName());
        System.out.println("Department Name: " + student.getDepartmentName().getDepartmentName());
        System.out.println("Manager Name: " + student.getDepartmentName().getManagerName());
        System.out.println("Age: " + student.getAge());
        System.out.println("----------------------");
    }
}
