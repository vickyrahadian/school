package com.kode19.schoolapps.student;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import static com.kode19.schoolapps.student.Gender.*;

@RestController
@RequestMapping("api/v1/student")
@Slf4j
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        log.info("calling getAllStudents");
        List<Student> students = Arrays.asList(
                new Student(1L, "Vicky", "vicky.rahadian@gmail.com", MALE),
                new Student(2L, "Alexa", "alexa@gmail.com", FEMALE)
        );

        return students;
    }

}
