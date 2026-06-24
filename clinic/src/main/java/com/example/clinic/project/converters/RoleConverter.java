package com.example.clinic.project.converters;

import com.example.clinic.project.model.dtos.request.RoleRequestDto;
import com.example.clinic.project.model.dtos.response.RoleResponseDto;
import com.example.clinic.project.model.entities.Role;

public class RoleConverter {

    public static Role convertToEntity(RoleRequestDto roleRequestDto){

        Role role = new Role();

        role
                .setId(roleRequestDto.getId())
                .setEnglishRoleTitle(roleRequestDto.getEnglishRoleTitle())
                .setPersianRoleTitle(roleRequestDto.getPersianRoleTitle())
                .setVersionNum(roleRequestDto.getVersionNum())
                .setCreatedDate(roleRequestDto.getCreatedDate())
                .setCreatedTime(roleRequestDto.getCreatedTime())
                .setCreatedBy(roleRequestDto.getCreatedBy());

        return role;
    }

    public static RoleResponseDto convertToDto(Role role){

        RoleResponseDto roleResponseDto = new RoleResponseDto();

        roleResponseDto
                .setId(role.getId())
                .setEnglishRoleTitle(role.getEnglishRoleTitle())
                .setPersianRoleTitle(role.getPersianRoleTitle())
                .setVersionNum(role.getVersionNum())
                .setUserId(role.getId())
                .setCreatedDate(role.getCreatedDate())
                .setCreatedTime(role.getCreatedTime())
                .setCreatedBy(role.getCreatedBy());

        return roleResponseDto;
    }
}