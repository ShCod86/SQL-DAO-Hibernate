package ru.netology.sqldaohibernate.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.sqldaohibernate.entity.Person;
import ru.netology.sqldaohibernate.repository.PersonRepository;

import java.util.List;

@RestController
@AllArgsConstructor
public class PersonController {
    private PersonRepository personRepository;

    @GetMapping("/persons/by-city")
    public List<Person> getByCity(@RequestParam String city) {
        return personRepository.getPersonByCity(city);
    }
}
