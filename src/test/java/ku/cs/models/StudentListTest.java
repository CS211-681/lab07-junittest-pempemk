package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    private StudentList s;

    @BeforeEach
    void setUp() {
        s = new StudentList();
        s.addNewStudent("67000", "pem", 50);
    }

    @Test
    void testAddNewStudent() {
        s.addNewStudent("67100", "pemk", 70);
        assertEquals(2, s.getStudents().size());
        assertEquals("67100", s.getStudents().get(1).getId());
        assertEquals("pemk", s.getStudents().get(1).getName());
        assertEquals(70, s.getStudents().get(1).getScore());

    }

    @Test
    void testfindStudentById() {
        assertEquals("67000", s.getStudents().get(0).getId());
    }

    @Test
    void testfilterByName() {
        assertEquals("pem", s.getStudents().get(0).getName());
    }

    @Test
    void testgiveScoreToId() {
        s.giveScoreToId("67000", 50);
        assertEquals(100, s.getStudents().get(0).getScore());
    }

    @Test
    void testviewGradeOfId() {
        s.viewGradeOfId("67000");
        assertEquals("D", s.getStudents().get(0).getGrade());
    }

}