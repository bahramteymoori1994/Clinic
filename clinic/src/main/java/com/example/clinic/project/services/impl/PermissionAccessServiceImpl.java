package com.example.clinic.project.services.impl;

import com.example.clinic.project.model.dtos.request.PermissionAccessRequestDto;
import com.example.clinic.project.model.dtos.response.PermissionAccessResponseDto;
import com.example.clinic.project.repositories.PermissionAccessRepository;
import com.example.clinic.project.services.interfaces.PermissionAccessService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionAccessServiceImpl implements PermissionAccessService {

    private final PermissionAccessRepository permissionAccessRepository;

    public PermissionAccessServiceImpl(PermissionAccessRepository permissionAccessRepository) {
        this.permissionAccessRepository = permissionAccessRepository;
    }

    @Override
    public PermissionAccessResponseDto save(PermissionAccessRequestDto permissionAccessRequestDto) {
        return null;
    }

    @Override
    public PermissionAccessResponseDto update(PermissionAccessRequestDto permissionAccessRequestDto) {
        return null;
    }

    @Override
    public PermissionAccessResponseDto findById(Long id) {
        return null;
    }

    @Override
    public List<PermissionAccessResponseDto> findAll() {
        return List.of();
    }
}