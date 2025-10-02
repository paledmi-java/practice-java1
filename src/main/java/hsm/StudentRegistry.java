package hsm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentRegistry implements FunctionsStudentManager, Iterable<Student>{
    protected Set<Student> studentsSet;
    protected static int totalStudents;

    public StudentRegistry(){
        studentsSet = new HashSet<>();
        totalStudents = 0;
    }

    @Override
    public void addAStudent(Student student) {
        studentsSet.add(student);
        totalStudents ++;
    }

    public int getTotalStudents(){
        return totalStudents;
    }

    public Set<Student> getStudentsSet(){
        return studentsSet;
    }

//    @Override
//    public void removeAStudentById(int id) {
//        for(Student student : studentsSet){
//            if(student.id == id){
//                studentsSet.remove(student);
//                totalStudents--;
//            }
//        }
//    }

    @Override
    public void removeAStudentById(int id) {
        Iterator<Student> iterator = studentsSet.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if(student.id == id){
                iterator.remove();
                totalStudents--;
            }
        }
    }


    @Override
    public void addAStudentVarargs(Student... students){
        for(Student s : students){
            studentsSet.add(s);
            totalStudents++;
        }
    }

    @Override
    public void removeAStudentByName(String name) {
        for(Student student : studentsSet){
            if(student.name.equals(name)){
                studentsSet.remove(student);
                totalStudents--;
            }
        }
    }

    @Override
    public Student getAStudentByName(String name) {
        for(Student student : studentsSet){
            if(student.name.equals(name)){
                return student;
            }
        }
        return null;
    }

    @Override
    public Student getAStudentById(int id) {
        for(Student student : studentsSet){
            if(student.id == id){
                return student;
            }
        }
        return null;
    }

    @Override
    public Student[] getAStudentByName2(String name) {
        ArrayList<Student> matched = new ArrayList<>();
        for(Student student : studentsSet){
            if(student.name.equals(name)){
                matched.add(student);
            }
        }
        return matched.toArray(new Student[0]);
    }

    @Override
    public int getStudentsAmount() {
        return studentsSet.size();
    }

    @Override
    public void getStudentInfo(int id) {
        for(Student student : studentsSet){
            if(student.id == id){
                System.out.println(student);
            }
        }
    }

    @Override
    public Iterator<Student> iterator() {
        return studentsSet.iterator();
    }
}
