package maps;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentMapTest {

    @Test
    public void testPositiveResponse() {
        StudentMap studentMap = new StudentMap();
        Student student = studentMap.getStudent("John");
        assertNotNull(student);
        assertEquals("John", student.getFirstName());
    }

    @Test
    public void testNegativeResponse() {
        StudentMap studentMap = new StudentMap();
        Student student = studentMap.getStudent("Unknown");
        assertNull(student);
    }

    @Test
    public void testZeroResponse() {
        StudentMap studentMap = new StudentMap();
        Student student = studentMap.getStudent("Michael");
        assertNotNull(student);
        assertEquals("Michael", student.getFirstName());
    }

    @Test
    public void testNullResponse() {
        StudentMap studentMap = new StudentMap();
        Student student = studentMap.getStudent(null);
        assertNull(student);
    }
}
