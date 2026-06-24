package com.example.clinic.project.services.impl;

import com.example.clinic.project.model.dtos.request.RoleRequestDto;
import com.example.clinic.project.model.dtos.response.RoleResponseDto;
import com.example.clinic.project.repositories.RoleRepository;
import com.example.clinic.project.services.interfaces.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public RoleResponseDto save(RoleRequestDto roleRequestDto) {
        return null;
    }

    @Override
    public RoleResponseDto update(RoleRequestDto roleRequestDto) {
        return null;
    }

    @Override
    public RoleResponseDto findById(Long id) {
        return null;
    }

    @Override
    public List<RoleResponseDto> findAll() {
        return List.of();
    }
}