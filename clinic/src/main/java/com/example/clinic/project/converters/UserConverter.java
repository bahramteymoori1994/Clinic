package com.example.clinic.project.converters;

import com.example.clinic.project.model.dtos.request.UserRequestDto;
import com.example.clinic.project.model.dtos.response.UserResponseDto;
import com.example.clinic.project.model.entities.Person;
import com.example.clinic.project.model.entities.User;

public class UserConverter {

    public static User convertToEntity(UserRequestDto userRequestDto, Person person){

        User user = new User();

        user
                .setId(userRequestDto.getId())
                .setUsername(userRequestDto.getUsername())
                .setPassword(userRequestDto.getPassword())
                .setEmail(userRequestDto.getEmail())
                .setVersionNum(userRequestDto.getVersionNum())
                .setCreatedTime(userRequestDto.getCreatedTime())
                .setCreatedDate(userRequestDto.getCreatedDate())
                .setCreatedBy(userRequestDto.getCreatedBy())
                .setPerson(person);

        return user;
    }

    public static UserResponseDto convertToDto(User user){

        UserResponseDto userResponseDto = new UserResponseDto();

        userResponseDto
                .setId(user.getId())
                .setUsername(user.getUsername())
                .setPassword(user.getPassword())
                .setEmail(user.getEmail())
                .setVersionNum(user.getVersionNum())
                .setCreatedTime(user.getCreatedTime())
                .setCreatedDate(user.getCreatedDate())
                .setCreatedBy(user.getCreatedBy())
                .setPersonId(userResponseDto.getPersonId());

        if( user.getPerson() != null ){

            Long personId = user.getPerson().getId();
            userResponseDto.setPersonId(personId);
        }

        return userResponseDto;
    }
}