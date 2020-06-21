package com.samirovic.springswagger2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable int id) {
        return Person.builder()
                .id(12L)
                .firstName("Samir")
                .lastName("EL IDRISSI")
                .build();
    }

    @GetMapping
    public List<Person> getAllPerson() {
        return Arrays.asList(Person.builder()
                .id(12L)
                .firstName("Samir")
                .lastName("EL IDRISSI")
                .build());
    }
}
