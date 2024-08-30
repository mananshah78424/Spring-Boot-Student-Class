package com.learning2.demo.student;

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
        return args->{
            Student manan= new Student(
                    "Manan",
                    "manan@gmail.com",
                    LocalDate.of(2000, Month.FEBRUARY, 4)

            );
            Student ryan= new Student(
                    "Ryan",
                    "ryan@gmail.com",
                    LocalDate.of(2002,Month.JANUARY,5)

            );
            repository.saveAll(
                  List.of(manan,ryan)
            );



        };
    }
}
