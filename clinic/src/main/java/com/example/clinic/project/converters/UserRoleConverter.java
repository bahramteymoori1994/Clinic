package com.example.clinic.project.converters;

import com.example.clinic.project.model.dtos.request.UserRoleRequestDto;
import com.example.clinic.project.model.dtos.response.UserRoleResponseDto;
import com.example.clinic.project.model.entities.UserRole;

public class UserRoleConverter {

    public static UserRole convertToEntity(UserRoleRequestDto userRoleRequestDto){

        UserRole userRole = new UserRole();

        userRole
                .setId(userRoleRequestDto.getId())
                .setRole(userRoleRequestDto.getRole())
                .setUser(userRoleRequestDto.getUser())
                .setVersionNum(userRoleRequestDto.getVersionNum())
                .setCreatedDate(userRoleRequestDto.getCreatedDate())
                .setCreatedTime(userRoleRequestDto.getCreatedTime())
                .setCreatedBy(userRoleRequestDto.getCreatedBy());

        return userRole;
    }

    public static UserRoleResponseDto convertToDto(UserRole userRole){

        UserRoleResponseDto userRoleResponseDto = new UserRoleResponseDto();

        userRoleResponseDto
                .setId(userRole.getId())
                .setRole(userRole.getRole())
                .setUser(userRole.getUser())
                .setVersionNum(userRole.getVersionNum())
                .setCreatedDate(userRole.getCreatedDate())
                .setCreatedTime(userRole.getCreatedTime())
                .setCreatedBy(userRole.getCreatedBy());

        return userRoleResponseDto;
    }
}