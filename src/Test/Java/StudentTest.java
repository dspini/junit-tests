import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

//  Create a new branch called `students-tests`
public class StudentTest {

    Student don;
    Student spini;

    @Before
    public void init() {
        don = new Student(1L, "Don");
        spini = new Student(2L, "Spini");

    }

    @Test
    public void testIfIdWorks() {
        assertEquals(1L, don.getId());
        assertEquals(2L, spini.getId());
    }

    @Test
    public void testIfNameWorks() {
        assertEquals("Don", don.getName());
        assertEquals("Spini", spini.getName());
        assertNotEquals("Don", spini.getName());
    }

    @Test
    public void testIfGradesWorks() {
        assertEquals(0, don.getGrades().size());
    }

    @Test
    public void testIfAddGradeWorks() {
        don.addGrade(80);
        assertTrue(80 == don.getGrades().get(0));
        don.addGrade(100);
        assertEquals(100, don.getGrades().get(1), 0);
    }

    @Test
    public void testIfAvgWorks() {
        assertEquals(0, don.getAverage(), 0);
        don.addGrade(100);
        don.addGrade(50);
        don.addGrade(100);
        assertEquals(83.33, don.getAverage(), 0.1);
        don.addGrade(50);
        assertEquals(75, don.getAverage(), 0);
    }

}