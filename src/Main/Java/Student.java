import java.util.ArrayList;



public class Student {

//  `id` should be a `long` number used to represent a "unique user" in our application.
//  `name` is a `String` that holds the name of the student.
//  `grades` is an `ArrayList` that contains a list of `Integer` numbers.

    private long id;
    private String name;
    private ArrayList<Integer> grades;

//  The `Student` class should have a constructor that sets both the name and id property,
//  it initializes the grades property as an empty ArrayList.

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

//  The `Student` class should have the following methods:

    public long getId() {
        return this.id; // returns the student's id
    }

    public String getName() {
        return this.name; // returns the student's name
    }

    public ArrayList<Integer> getGrades() {
        return this.grades; // adds the given grade to the grades list
    }

    public void addGrade(int grade) {
        this.grades.add(grade); // returns the average of the students grades
    }

    public double getAverage() {

        if (this.grades.size() == 0) {
            return 0;
        }

        double sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }
}
