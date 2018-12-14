package com.example.spring.data.redis.demospringdataredis;

import com.example.spring.data.redis.demospringdataredis.repository.StudentRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Optional;

@Log4j2
@SpringBootApplication
public class DemoSpringDataRedisApplication implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringDataRedisApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        final Student student = Student.builder()
                .id("USER01")
                .name("John Doe")
                .gender(Student.Gender.MALE)
                .grade(1)
                .build();

        studentRepository.save(student);

        final Optional<Student> byId = studentRepository.findById(student.getId());
        log.info("Student Info: " + byId.orElse(null));
    }
}

