package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
          Student anish =  new Student(
                    1L,
                    "anish chaudhary",
                    "barcafan830@gmail.com",
                    LocalDate.of(2000, Month.DECEMBER, 12)
            );
            Student prem = new Student(
                    2L,
                    "Prem chaudhary",
                    "prem830@gmail.com",
                    LocalDate.of(2001, Month.DECEMBER, 12)
            );

            repository.saveAll(
                    List.of(anish, prem)
            );
        };
    }
}
