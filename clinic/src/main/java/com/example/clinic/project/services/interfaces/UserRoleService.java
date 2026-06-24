package com.example.clinic.project.services.interfaces;

import com.example.clinic.project.model.dtos.response.UserRoleResponseDto;

import java.util.List;

public interface UserRoleService{

    UserRoleResponseDto save(Long userId, Long roleId);
    UserRoleResponseDto update(Long userId, Long roleId);
    UserRoleResponseDto findById(Long userRoleId) throws Exception;
    List<UserRoleResponseDto> findAll();
}