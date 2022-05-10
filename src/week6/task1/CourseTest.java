package week6.task1;


class CourseTest {
    public static void main(String[] args) {
        Course course = new Course("SW234", "Data Structures and Algorithms", "Zahid Hussain Khaskheli", "DSA in Java", 30);
        printCourse(course);
    }

    public static void printCourse(Course course) {
        System.out.println("Course Code: " + course.courseCode);
        System.out.println("Title: " + course.courseTitle);
        System.out.println("Description: " + course.courseDescription);
        System.out.println("Instructor: " + course.instructor);
        System.out.println("No of Students enrolled: " + course.noOfStudentsEnrolled);
    }
}