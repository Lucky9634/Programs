package Oops_Questions;

public class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollment;
    String[] enrolledStudents;

    Course(String courseName){
        this.courseName = courseName;
        this.enrollment = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName){
        enrolledStudents[enrollment] = studentName;
        enrollment++;
    }
    int getEnrollStudent(){
        return enrollment;
    }

    void unEnrollStudent(String studentName){
        System.out.println("Student Removed");
        enrollment --;
    }

    public static void main(String[] args) {
        Course myCourse = new Course("Data Science");
        myCourse.enrollStudent("Kamal Hasan");
        myCourse.getEnrollStudent();
    }

}
