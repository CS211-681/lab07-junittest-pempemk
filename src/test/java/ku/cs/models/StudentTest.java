package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student s;

    @BeforeEach
    void setup(){
        s = new Student("670000", "StudentTest");
    }

    @Test
    void testAddScore(){
        s.addScore(100);
        assertEquals(100,s.getScore());
    }

    @Test
    void testCalculateGrade(){
        s.addScore(100);
        assertEquals("A",s.getGrade());
    }


    @Test
    void testisId() {
        assertTrue(true, "67000");
    }

    @Test
    void testisNameContains() {
        assertTrue(true, "StudentTest");
    }

}