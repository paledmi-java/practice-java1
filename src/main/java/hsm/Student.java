package hsm;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    protected int id;
    protected String name;
    protected String[] listOfCourses;
    private static int counter;

    public Student(String name){
        this.name = name;
        id = counter++;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public String toString(){
        return "Student's name: " + name + " ID: " + id + " Courses: " + Arrays.toString(listOfCourses);
    }
}
