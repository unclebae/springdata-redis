package com.example.spring.data.redis.demospringdataredis.repository;

import com.example.spring.data.redis.demospringdataredis.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {
}
