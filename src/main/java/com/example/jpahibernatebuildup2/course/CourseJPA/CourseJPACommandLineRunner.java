package com.example.jpahibernatebuildup2.course.CourseJPA;


import com.example.jpahibernatebuildup2.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJPACommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJPARepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Spring", "jun"));
        repository.insert(new Course(2, "ASP", "jun"));
        repository.insert(new Course(3, "Node", "jun"));

        repository.deleteById(1);

        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
}
