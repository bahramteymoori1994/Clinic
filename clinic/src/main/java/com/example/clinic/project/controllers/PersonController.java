package com.example.clinic.project.controllers;

import com.example.clinic.project.model.dtos.request.PersonRequestDto;
import com.example.clinic.project.model.dtos.response.PersonResponseDto;
import com.example.clinic.project.services.interfaces.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/savePerson")
    @ResponseStatus(value = HttpStatus.CREATED)
    public PersonResponseDto save(@RequestBody PersonRequestDto personRequestDto) throws Exception {

        return personService.save(personRequestDto);
    }

    @PutMapping("/updatePerson")
    @ResponseStatus(value = HttpStatus.OK)
    public PersonResponseDto update(@RequestBody PersonRequestDto personRequestDto) throws Exception {

        return personService.update(personRequestDto);
    }

    @GetMapping("/findPersonById/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public PersonResponseDto findById(@PathVariable Long id) throws Exception {

        return personService.findById(id);
    }

    @PutMapping("/findAll")
    @ResponseStatus(value = HttpStatus.OK)
    public List<PersonResponseDto> findAll() throws Exception {

        return personService.findAll();
    }
}