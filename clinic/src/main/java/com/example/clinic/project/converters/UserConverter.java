package com.example.clinic.project.converters;

import com.example.clinic.project.model.dtos.request.UserRequestDto;
import com.example.clinic.project.model.dtos.response.UserResponseDto;
import com.example.clinic.project.model.entities.User;

public class UserConverter {

    public static User convertToEntity(UserRequestDto userRequestDto){

        User user = new User();

        user
                .setId(userRequestDto.getId())
                .setUsername(userRequestDto.getUsername())
                .setPassword(userRequestDto.getPassword())
                .setPerson(userRequestDto.getPerson())
                .setEmail(userRequestDto.getEmail())
                .setVersionNum(userRequestDto.getVersionNum())
                .setCreatedDate(userRequestDto.getCreatedDate())
                .setCreatedTime(userRequestDto.getCreatedTime())
                .setCreatedBy(userRequestDto.getCreatedBy());

        return user;
    }

    public static UserResponseDto convertToDto(User user){

        UserResponseDto userResponseDto = new UserResponseDto();

        userResponseDto
                .setId(user.getId())
                .setUsername(user.getUsername())
                .setPassword(user.getPassword())
                .setPerson(user.getPerson())
                .setEmail(user.getEmail())
                .setVersionNum(user.getVersionNum())
                .setCreatedDate(user.getCreatedDate())
                .setCreatedTime(user.getCreatedTime())
                .setCreatedBy(user.getCreatedBy());

        return userResponseDto;
    }
}