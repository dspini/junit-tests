import java.util.ArrayList;
import java.util.List;

public class Cohort {

    private final List<Student> students;

    public Cohort() {
        this.students = new ArrayList<>();
    }

    public double getCohortAverage() {
        double avg = 0;
        for (Student student : this.getStudents()) {
            avg += student.getAverage();
        }
        return avg / this.getStudents().size();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}