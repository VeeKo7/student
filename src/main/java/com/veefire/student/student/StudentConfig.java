package com.veefire.student.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.util.List;
import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student tom = new Student(
                    1L,
                    "Tom",
                    "tom@smith.com",
                    LocalDate.of(2000, JANUARY, 5)
            );

            Student sam = new Student(
                    2L,
                    "Sam",
                    "sam@daniels.com",
                    LocalDate.of(2004, MARCH, 12)
            );

            Student james = new Student(
                    3L,
                    "James",
                    "james@dowson.com",
                    LocalDate.of(2002, MAY, 30)
            );

            Student alice = new Student(
                    4L,
                    "Alice",
                    "alice@thomson.com",
                    LocalDate.of(2007, DECEMBER, 17)
            );

            //saving to database by invoking repository
            repository.saveAll(
                    List.of(tom, sam, james, alice)
            );
        };
    }
}
