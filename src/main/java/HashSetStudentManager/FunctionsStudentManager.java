package HashSetStudentManager;

public interface FunctionsStudentManager {
    void addAStudent(Student student);
    void addAStudentVarargs(Student... student);
    void removeAStudentById(int id);
    void removeAStudentByName(String name);
    Student getAStudentByName(String name);
    Student getAStudentById(int id);
    Student[] getAStudentByName2(String name);
    int getStudentsAmount();
    void getStudentInfo(int id);
}
