package hsm;

import org.junit.Before;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentRegistryTest {

    StudentRegistry studentRegistry;
    Student student;
    Student[] students;

    @Before
    public void setUp() {
        student = new Student("Mike");
        studentRegistry = new StudentRegistry();
        for(int i =0 ; i < 100; i++){
            studentRegistry.addAStudent(new Student("Paul"));
        }
    }

    @org.junit.Test
    public void whenAddedSameStudentSizeDoesNotChange(){
        studentRegistry.addAStudent(student);
        assertEquals(101, studentRegistry.getStudentsAmount());
        studentRegistry.addAStudent(student);
        assertEquals(101, studentRegistry.getStudentsAmount());
    }

    @org.junit.Test
    public void whenAdd100studentsThenCounter100(){
        assertEquals(100, studentRegistry.getTotalStudents());
    }

    @org.junit.Test
    public void whenAdded100StudentsThenSize100(){
        assertEquals(100, studentRegistry.getStudentsAmount());
    }

    @org.junit.Test
    public void whenSearchForACertainStudentThenStudent(){
        studentRegistry.addAStudent(student);
        assertEquals("Mike", studentRegistry.getAStudentByName(student.getName()).getName());
    }

    @org.junit.Test
    public void testForEach(){
        int index = 0;
        for(Student student : studentRegistry.getStudentsSet()){
            index++;
        }
        assertEquals(100, index);
    }

    @org.junit.Test
    public void whenAdd100StudentsByVarargsThenTotal103(){
        Student[] students = new Student[] {new Student("Chuck"),
                new Student("Lola"),
                new Student("Bob")};
        studentRegistry.addAStudentVarargs(students);
        assertEquals(103, studentRegistry.getStudentsAmount());
    }

    @After
    public void tearDown() throws Exception {
    }
}
