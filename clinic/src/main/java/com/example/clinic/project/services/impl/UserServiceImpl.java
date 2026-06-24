package com.example.clinic.project.services.impl;

import com.example.clinic.project.converters.UserConverter;
import com.example.clinic.project.model.dtos.request.UserRequestDto;
import com.example.clinic.project.model.dtos.response.UserResponseDto;
import com.example.clinic.project.model.entities.Person;
import com.example.clinic.project.model.entities.User;
import com.example.clinic.project.repositories.PersonRepository;
import com.example.clinic.project.repositories.UserRepository;
import com.example.clinic.project.services.interfaces.UserService;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PersonRepository personRepository;

    public UserServiceImpl(UserRepository userRepository, PersonRepository personRepository) {
        this.userRepository = userRepository;
        this.personRepository = personRepository;
    }

    @Override
    public UserResponseDto save(UserRequestDto userRequestDto) throws Exception {

        if( userRequestDto == null ){
            throw new Exception("User request object is null");
        }

        userRequestDto
                .setCreatedBy("admin")
                .setCreatedDate(LocalDate.now())
                .setCreatedTime(LocalTime.now());

        Person personById = personRepository.findById(userRequestDto.getPersonId()).orElseThrow(() -> new Exception("Person id not found to be saved"));
        User user = UserConverter.convertToEntity(userRequestDto, personById);
        User userSaved = userRepository.saveAndFlush(user);

        if( userSaved == null ){
            throw new Exception("User saved object is null");
        }

        return UserConverter.convertToDto(userSaved);
    }

    @Override
    public UserResponseDto update(UserRequestDto userRequestDto) throws Exception {

        if( userRequestDto == null ){
            throw new Exception("User request object is null");
        }

        userRequestDto
                .setCreatedBy("admin")
                .setCreatedDate(LocalDate.now())
                .setCreatedTime(LocalTime.now());

        Person personById = personRepository.findById(userRequestDto.getPersonId()).orElseThrow(() -> new Exception("Person id not found to be updated"));
        User user = UserConverter.convertToEntity(userRequestDto, personById);
        User userUpdated = userRepository.save(user);

        if( userUpdated == null ){
            throw new Exception("User updated object is null");
        }

        return UserConverter.convertToDto(userUpdated);
    }

    @Override
    public UserResponseDto findById(Long id) throws Exception {

        return userRepository.findById(id).stream()
                .map(UserConverter::convertToDto)
                .findFirst()
                .orElseThrow(() -> new Exception("User id not found"));
    }

    @Override
    public List<UserResponseDto> findAll() throws Exception {

        return userRepository.findAll()
                .stream()
                .map(UserConverter::convertToDto)
                .collect(Collectors.toList());
    }
}