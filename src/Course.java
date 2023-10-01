/* Assignment: 1
       Author: Tehila M
 */
import java.util.Arrays;

public class Course {
    private final String courseName;
    private final int courseNum;
    private Student[] students;

    public Course(String courseName, int courseNum) {//constructor
        this.courseName = courseName;
        this.courseNum = courseNum;
        this.students = new Student[0];
    }

    public int getCourseNum() {
        return this.courseNum;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public String toString() {
        return "courseName: " + getCourseName() + ", courseNum: " + getCourseNum();
    }

    //
    public Course(Course other) {//copy constructor
        this(other.getCourseName(), other.getCourseNum());
        this.students = Arrays.copyOf(other.students, other.students.length);
    }

    public Student getStudent(int id) {
        for (int i = 0; i < this.students.length; i++) {
            Student student = this.students[i];
            if (student != null && student.getId() == id)
                return student;
        }
        //No student with this id.
        return null;
    }

    //
    public void addStudent(Student s) {
        if (getStudent(s.getId()) != null || s.getCourse(this.getCourseNum()) != null) {
            return;
        }
        this.students = Arrays.copyOf(this.students, this.students.length + 1);
        this.students[this.students.length - 1] = s;
        s.addCourse(this);
    }

    public void print() {
        boolean flag = false;
        System.out.println("Students in the course " + getCourseName() + " are:");

        for (int i = 0; i < this.students.length; i++) {
            Student student = this.students[i];
            if (student != null) {
                System.out.println(student);
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("No students in this course.");
        }
    }

    public void sortStudents() {
        //        Arrays.sort(this.students, new Comparator<Student>() {
//            @Override
//            public int compare(Student student1, Student student2) {
//                return student1.getId() - student2.getId();
//            }
//        });
        for (int i = 0; i < this.students.length; i++) {
            for (int j = 0; j < this.students.length - 1; j++) {
                if (this.students[j].getId() > this.students[j + 1].getId()) {
                    Student temp = this.students[j];
                    this.students[j] = this.students[j + 1];
                    this.students[j + 1] = temp;
                }
            }
        }
    }

//    public void setCourseNum(int courseNum) {
//        if (courseNum < 0)
//            System.out.println("Wrong course num.");
//        else
//            this.courseNum = courseNum;
//    }
//
//    public void setCourseName(String courseName) {
//        if (courseName.isEmpty())
//            System.out.println("Wrong course name.");
//        else
//            this.courseName = courseName;
//    }
}
