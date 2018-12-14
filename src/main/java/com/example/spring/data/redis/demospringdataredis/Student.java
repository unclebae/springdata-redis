package com.example.spring.data.redis.demospringdataredis;

import lombok.*;
import org.springframework.data.redis.core.RedisHash;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@RedisHash(value = "Student", timeToLive = 60)
public class Student {

    public enum Gender {
        MALE, FEMALE
    }

    private String id;
    private String name;
    private Gender gender;
    private int grade;

}
