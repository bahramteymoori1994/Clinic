package com.example.clinic.project.services.impl;

import com.example.clinic.project.model.dtos.request.UserRequestDto;
import com.example.clinic.project.model.dtos.response.UserResponseDto;
import com.example.clinic.project.repositories.UserRoleRepository;
import com.example.clinic.project.services.interfaces.UserRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    private final UserRoleRepository userRoleRepository;

    public UserRoleServiceImpl(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Override
    public UserResponseDto save(UserRequestDto userRequestDto) {
        return null;
    }

    @Override
    public UserResponseDto update(UserRequestDto userRequestDto) {
        return null;
    }

    @Override
    public UserResponseDto findById(Long id) {
        return null;
    }

    @Override
    public List<UserResponseDto> findAll() {
        return List.of();
    }
}