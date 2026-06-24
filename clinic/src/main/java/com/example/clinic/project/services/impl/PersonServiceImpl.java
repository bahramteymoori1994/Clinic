package com.example.clinic.project.services.impl;

import com.example.clinic.project.converters.PersonConverter;
import com.example.clinic.project.model.dtos.request.PersonRequestDto;
import com.example.clinic.project.model.dtos.response.PersonResponseDto;
import com.example.clinic.project.model.entities.Person;
import com.example.clinic.project.repositories.PersonRepository;
import com.example.clinic.project.services.interfaces.PersonService;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public PersonResponseDto save(PersonRequestDto personRequestDto) throws Exception {

        if( personRequestDto == null ){
            throw new Exception("Person request object is null");
        }

        personRequestDto
                .setCreatedBy("admin")
                .setCreatedDate(LocalDate.now())
                .setCreatedTime(LocalTime.now());

        Person person = PersonConverter.convertToEntity(personRequestDto);
        Person personSaved = personRepository.save(person);

        if( personSaved == null ){
            throw new Exception("Person saved object is null");
        }

        return PersonConverter.convertToDto(personSaved);
    }

    @Override
    public PersonResponseDto update(PersonRequestDto personRequestDto) throws Exception {

        if( personRequestDto == null ){
            throw new Exception("Person request object is null");
        }

        personRequestDto
                .setCreatedBy("admin")
                .setCreatedDate(LocalDate.now())
                .setCreatedTime(LocalTime.now());

        Person person = PersonConverter.convertToEntity(personRequestDto);
        Person personUpdated = personRepository.save(person);

        if( personUpdated == null ){
            throw new Exception("Person updated object is null");
        }

        return PersonConverter.convertToDto(personUpdated);
    }

    @Override
    public PersonResponseDto findById(Long id) throws Exception {

        return personRepository.findById(id).stream()
                .map(PersonConverter::convertToDto)
                .findFirst()
                .orElseThrow(() -> new Exception("Person id not found"));
    }

    @Override
    public List<PersonResponseDto> findAll() throws Exception {

        List<Person> findPeople = personRepository.findAll();

        if( findPeople.isEmpty() ){
            throw new Exception("The list of people is empty");
        }

        return findPeople.stream()
                .map(PersonConverter::convertToDto)
                .collect(Collectors.toList());
    }
}