package hsm;

import org.junit.Before;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentRegistryTest {
    StudentRegistry studentRegistry;

    @Before
    public void setUp() throws Exception {
        studentRegistry = new StudentRegistry();
    }

    @org.junit.Test
    public void whenAdded100StudentsThenSize100(){
        for(int i =0 ; i < 100; i++){
            studentRegistry.addAStudent(new Student("Paul"));
        }
        assertEquals(100, studentRegistry.getStudentsAmount());
    }
}