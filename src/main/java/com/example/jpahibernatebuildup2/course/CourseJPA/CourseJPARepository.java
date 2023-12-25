package com.example.jpahibernatebuildup2.course.CourseJPA;

import com.example.jpahibernatebuildup2.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJPARepository {

    // AutoWird으로도 사용가능함
    @PersistenceContext
    private EntityManager entityManager;

    //merge를 통해 값 매칭함
    public void insert(Course course) {
        entityManager.merge(course);
    }

    public Course findById(long id) {
        return entityManager.find(Course.class, id);
    }

    public void deleteById(long id) {
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }

}
