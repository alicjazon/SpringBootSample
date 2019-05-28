package fis.agh.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
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