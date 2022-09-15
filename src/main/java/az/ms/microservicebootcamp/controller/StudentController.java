package az.ms.microservicebootcamp.controller;

import az.ms.microservicebootcamp.model.Student;
import az.ms.microservicebootcamp.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ms")
@Slf4j
@RequiredArgsConstructor
public class StudentController {

    private final StudentRepository studentRepository;

    @PostMapping
    public Student sayHello2(@RequestBody Student student) {
        Student save = studentRepository.save(student);

        return save;
    }

}
