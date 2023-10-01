/* Assignment: 1
       Author: Tehila M
 */
public class Runner {
    public static void main(String[] args) {
        Student A = new Student("Amy", 123456);
        Student B = new Student("Sheldon", 234567);
        Student C = new Student("Sam", 345678);

        Course stay = new Course("Stay", 1);
        Course fetch = new Course("Fetch", 2);
        Course dogBark = new Course("Dog Bark", 3);
        Course rollOver = new Course("Roll Over", 4);

        stay.addStudent(A);
        stay.addStudent(B);
        stay.addStudent(C);
        fetch.addStudent(A);
        fetch.addStudent(C);
        fetch.addStudent(B);
        dogBark.addStudent(A);
        dogBark.addStudent(B);
        dogBark.addStudent(C);
        rollOver.addStudent(A);
        rollOver.addStudent(B);
        rollOver.addStudent(C);

        Course stayCopy = new Course(stay);

        fetch.sortStudents();
        fetch.print();
        System.out.println();

        System.out.println("Students information: ");
        System.out.print("1: ");
        A.print();
        System.out.print("2: ");
        B.print();
        System.out.print("3: ");
        C.print();
        System.out.println();

        System.out.println("Courses information: ");
        System.out.print("1: ");
        stay.print();
        System.out.print("2: ");
        fetch.print();
        System.out.print("3: ");
        dogBark.print();
        System.out.print("4: ");
        rollOver.print();
        System.out.print("5: ");
        stayCopy.print();

    }
}
