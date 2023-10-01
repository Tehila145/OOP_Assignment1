/* Assignment: 1
       Author: Tehila M
 */
import java.util.Arrays;

public class Student {
    private String name;
    private int id;
    private Course[] courses;

    public Student(String name, int id) {//constructor
        this.name = name;
        this.id = id;
        this.courses = new Course[0];
    }

    //    public void setId(int id) {
//        if (id < 0)
//            System.out.println("Wrong id.");
//        else
//            this.id = id;
//    }
//
    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public String toString() {
        return "name: " + getName() + ", id: " + getId();
    }

    public Course getCourse(int num) {
        for (int i = 0; i < this.courses.length; i++) {
            Course course = this.courses[i];
            if (course != null && course.getCourseNum() == num)
                return course;
        }
        //No course with this number.
        return null;
    }

    public void addCourse(Course c) {
        if (getCourse(c.getCourseNum()) != null || c.getStudent(this.getId()) != null) {
            return;
        }

        this.courses = Arrays.copyOf(this.courses, this.courses.length + 1);
        this.courses[this.courses.length - 1] = c;
        c.addStudent(this);
    }

    public void print() {
        System.out.println(this);
        for (int i = 0; i < courses.length; i++)
            System.out.println(" " + courses[i]);
    }
//
//    public void setName(String name) {
//        if (name.isEmpty())
//            System.out.println("Wrong name.");
//        else
//            this.name = name;
//    }
//

//

//
}
