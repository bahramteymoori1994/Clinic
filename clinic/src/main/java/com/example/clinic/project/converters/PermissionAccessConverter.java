package com.example.clinic.project.converters;

import com.example.clinic.project.model.dtos.request.PermissionAccessRequestDto;
import com.example.clinic.project.model.dtos.response.PermissionAccessResponseDto;
import com.example.clinic.project.model.entities.PermissionAccess;

public class PermissionAccessConverter {

    public static PermissionAccess convertToEntity(PermissionAccessRequestDto permissionAccessRequestDto){

        PermissionAccess permissionAccess = new PermissionAccess();

        permissionAccess
                .setId(permissionAccessRequestDto.getId())
                .setAccessTitle(permissionAccessRequestDto.getAccessTitle())
                .setRole(permissionAccessRequestDto.getRole())
                .setVersionNum(permissionAccessRequestDto.getVersionNum())
                .setCreatedDate(permissionAccessRequestDto.getCreatedDate())
                .setCreatedTime(permissionAccessRequestDto.getCreatedTime())
                .setCreatedBy(permissionAccessRequestDto.getCreatedBy());

        return permissionAccess;
    }

    public static PermissionAccessResponseDto convertToDto(PermissionAccess permissionAccess){

        PermissionAccessResponseDto permissionAccessResponseDto = new PermissionAccessResponseDto();

        permissionAccessResponseDto
                .setId(permissionAccess.getId())
                .setAccessTitle(permissionAccess.getAccessTitle())
                .setRole(permissionAccess.getRole())
                .setVersionNum(permissionAccess.getVersionNum())
                .setCreatedDate(permissionAccess.getCreatedDate())
                .setCreatedTime(permissionAccess.getCreatedTime())
                .setCreatedBy(permissionAccess.getCreatedBy());

        return permissionAccessResponseDto;
    }
}