import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student{
    private String name;
    private double gpa;

    public Student (String name , double gpa){
        this.name = name;
        this.gpa = gpa;

    }
    public String getName() {
        return name;
    }
    public double getGpa() {
    return gpa;
}
}
public class framework_arrayList_01 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ram", 3.5));
        students.add(new Student("Santosh", 3.8));
        students.add(new Student("Golu", 3.5));
        students.add(new Student("Chandan", 5.5));


        // first method
       // Sorting by GPA (descending)
        /*students.sort((o1, o2) -> {
            if (o2.getGpa() - o1.getGpa() > 0) {
                return 1;
            } else if (o2.getGpa() - o1.getGpa() < 0) {
                return -1;
            } else {
                return 0;
            }
        }); */


        // Second method  
        /* Comparator<Student> comparator = Comparator.comparing(Student::getGpa);
        students.sort(comparator); */

        // Sorting by GPA (descending)
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        students.sort(comparator);

        for (Student s : students) {
           System.out.println(s.getName() + ": " + s.getGpa());
        }
    }
}
