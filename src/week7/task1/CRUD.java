package week7.task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CRUD {
    public static void main(String[] args) {
        String id;
        String name;
        int age;
        String department;
        String grade;
        Scanner in = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. Add a student record");
            System.out.println("2. Search a student record");
            System.out.println("3. Update a student record");
            System.out.println("4. Delete a student record");
            System.out.println("5. View all records");
            System.out.println("0. Exit");
            System.out.print("Your input: ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter student id: ");
                    id = in.next();
                    System.out.print("Enter student age: ");
                    age = in.nextInt();
                    System.out.print("Enter student department: ");
                    department = in.next();
                    System.out.print("Enter student grade: ");
                    grade = in.next();
                    System.out.print("Enter student name: ");
                    in.nextLine();
                    name = in.nextLine();

                    Student1 student1 = new Student1(id, name, age, department, grade);
                    insertStudentRecord(student1);
                    break;
                case 2:
                    System.out.print("Enter student id: ");
                    id = in.next();
                    Student1 student = search(id);
                    System.out.println(student + "\n");
                    break;
                case 3:
                    System.out.print("Enter student id: ");
                    id = in.next();
                    updateStudentRecord(id);
                    break;
                case 4:
                    System.out.print("Enter student id: ");
                    id = in.next();
                    deleteStudentRecord(id);
                    break;
                case 5:
                    viewStudentRecords();
                    break;
                case 0:
                    System.out.println("Exited.");
                    System.exit(0);
                default:
                    System.out.println("Invalid input try again...");
            }
        } while (choice != 0);


    }

    public static void viewStudentRecords() {
        try {
            Scanner fileInput = new Scanner(new File("student_info.txt"));
            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insertStudentRecord(Student1 student1) {
        try {
            FileWriter fileWriter = new FileWriter("student_info.txt", true);
            fileWriter.write(student1.toString() + "\n");
            fileWriter.close();
            System.out.println("Record inserted.\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void updateStudentRecord(String id) {
        try {
            Scanner fileInput = new Scanner(new File("student_info.txt"));
            Scanner in = new Scanner(System.in);
            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                if (line.contains(id)) {
                    String content = getFileContent(id);
                    System.out.print("Enter student age: ");
                    int age = in.nextInt();
                    System.out.print("Enter student department: ");
                    String department = in.next();
                    System.out.print("Enter student grade: ");
                    String grade = in.next();
                    System.out.print("Enter student name: ");
                    in.nextLine();
                    String name = in.nextLine();
                    Student1 std = new Student1(id, name, age, department, grade);
                    FileWriter fileWriter = new FileWriter("student_info.txt");
                    fileWriter.write(content + "\n");
                    fileWriter.write(std.toString() + "\n");
                    fileWriter.close();
                    System.out.println("Record updated.\n");
                    break;
                }
            }
            System.out.println("No any match found!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteStudentRecord(String id) {
        try {
            Scanner fileInput = new Scanner(new File("student_info.txt"));
            Scanner in = new Scanner(System.in);
            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                if (line.contains(id)) {
                    String content = getFileContent(id);
                    FileWriter fileWriter = new FileWriter("student_info.txt");
                    fileWriter.write(content);
                    fileWriter.close();
                    System.out.println("Record deleted.\n");
                    break;
                }
            }
            System.out.println("No any match found!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Student1 search(String id) {
        try {
            Scanner fileInput = new Scanner(new File("student_info.txt"));
            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                if (line.contains(id)) {
                    String[] args = line.split("[, ]+");
                    String name = args[1];
                    int age = Integer.parseInt(args[2]);
                    String department = args[3];
                    String grade = args[4];
                    return new Student1(id, name, age, department, grade);
                }
            }
            System.out.println("No any match found!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getFileContent(String id) {
        String content = "";
        try {
            Scanner fileInput = new Scanner(new File("student_info.txt"));
            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                if (line.contains(id)) {
                    continue;
                }
                content += line + "\n";
            }
        } catch (Exception ignored) {

        }
        return content;
    }
}
