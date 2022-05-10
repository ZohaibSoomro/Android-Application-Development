package week6.task1;

public class Course {
    String courseCode;
    String courseTitle;
    String instructor;
    int noOfStudentsEnrolled;
    String courseDescription;

    Course() {
    }

    public Course(String courseCode, String courseTitle, String instructor, String courseDescription, int noOfStudentsEnrolled) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.courseDescription = courseDescription;
        this.instructor = instructor;
        this.noOfStudentsEnrolled = noOfStudentsEnrolled;
    }
}
