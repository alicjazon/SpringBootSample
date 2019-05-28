package fis.agh.student;

public interface StudentService {

    public Iterable<Student> findAll();
    public Student save(Student student);
}
