package com.example.jpahibernatebuildup2.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// 엔티티 어노테이션을 통해 엔티티생성
@Entity
public class Course {

    // PK
    @Id
    private long id;

    // @Coulmn(name="name")를 통해 컬럼과 값을 설정가능하지만, 지금은 필드이름과 같기에 생략
    private String name;

    private String author;

    public Course() {

    }

    public Course(long id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
