package fis.agh.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Value("${sc.helloWorld:Not Found}")
    public String helloWorld;

    @Autowired
    private StudentService studentService;

    @RequestMapping("/")
    public String home() {
        return helloWorld;
    }

    @GetMapping("/students")
    public Iterable<Student> findAll() {
        return studentService.findAll();
    }

    @PostMapping("/students")
    public Student create(@RequestBody Student student) {
        return studentService.save(student);
    }

}