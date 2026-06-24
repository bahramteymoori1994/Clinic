package com.example.clinic.project.services.impl;

import com.example.clinic.project.model.dtos.request.PersonRequestDto;
import com.example.clinic.project.model.dtos.response.PersonResponseDto;
import com.example.clinic.project.repositories.PersonRepository;
import com.example.clinic.project.services.interfaces.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public PersonResponseDto save(PersonRequestDto personRequestDto) {
        return null;
    }

    @Override
    public PersonResponseDto update(PersonRequestDto personRequestDto) {
        return null;
    }

    @Override
    public PersonResponseDto findById(Long id) {
        return null;
    }

    @Override
    public List<PersonResponseDto> findAll() {
        return List.of();
    }
}