package com.example.clinic.project.converters;

import com.example.clinic.project.model.dtos.request.RoleRequestDto;
import com.example.clinic.project.model.dtos.response.RoleResponseDto;
import com.example.clinic.project.model.entities.Role;
import com.example.clinic.project.model.entities.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RoleConverter {

    public static Role convertToEntity(RoleRequestDto roleRequestDto, List<User> users){

        Role role = new Role();

        role
                .setId(roleRequestDto.getId())
                .setEnglishRoleTitle(roleRequestDto.getEnglishRoleTitle())
                .setPersianRoleTitle(roleRequestDto.getPersianRoleTitle())
                .setVersionNum(roleRequestDto.getVersionNum())
                .setCreatedDate(roleRequestDto.getCreatedDate())
                .setCreatedTime(roleRequestDto.getCreatedTime())
                .setCreatedBy(roleRequestDto.getCreatedBy())
                .setUsers(users);

        return role;
    }

    public static RoleResponseDto convertToDto(Role role){

        RoleResponseDto roleResponseDto = new RoleResponseDto();

        roleResponseDto
                .setId(role.getId())
                .setEnglishRoleTitle(role.getEnglishRoleTitle())
                .setPersianRoleTitle(role.getPersianRoleTitle())
                .setVersionNum(role.getVersionNum())
                .setCreatedDate(role.getCreatedDate())
                .setCreatedTime(role.getCreatedTime())
                .setCreatedBy(role.getCreatedBy());

        if( role.getUsers() != null ){

            List<Long> usersId = role.getUsers().stream()
                    .map(User::getId)
                    .collect(Collectors.toList());

            roleResponseDto.setUsers(usersId);
        }
        else{
            roleResponseDto.setUsers(new ArrayList<>());
        }

        return roleResponseDto;
    }
}