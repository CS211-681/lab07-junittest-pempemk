package ku.cs.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {
    @Test
    void testreadData() {
        StudentHardCodeDatasource ds = new StudentHardCodeDatasource();
        assertEquals("6710400001", ds.readData().getStudents().get(0).getId());
        assertEquals("First", ds.readData().getStudents().get(0).getName());
        assertEquals(4, ds.readData().getStudents().size());
    }
}