package com.example.springbatch.configuration;

import com.example.springbatch.student.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student, Student> {


    @Override
    public Student process(Student student) {
        // all the business logic goes here
        return student;
    }
}
