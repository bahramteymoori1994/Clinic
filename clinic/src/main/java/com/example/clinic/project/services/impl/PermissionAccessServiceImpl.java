package com.example.clinic.project.services.impl;

import com.example.clinic.project.converters.PermissionAccessConverter;
import com.example.clinic.project.model.dtos.request.PermissionAccessRequestDto;
import com.example.clinic.project.model.dtos.response.PermissionAccessResponseDto;
import com.example.clinic.project.model.entities.PermissionAccess;
import com.example.clinic.project.repositories.PermissionAccessRepository;
import com.example.clinic.project.services.interfaces.PermissionAccessService;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PermissionAccessServiceImpl implements PermissionAccessService {

    private final PermissionAccessRepository permissionAccessRepository;

    public PermissionAccessServiceImpl(PermissionAccessRepository permissionAccessRepository) {
        this.permissionAccessRepository = permissionAccessRepository;
    }

    @Override
    public PermissionAccessResponseDto save(PermissionAccessRequestDto permissionAccessRequestDto) throws Exception {

        if( permissionAccessRequestDto == null ){
            throw new Exception("Permission access request object is null");
        }

        permissionAccessRequestDto
                .setCreatedBy("admin")
                .setCreatedDate(LocalDate.now())
                .setCreatedTime(LocalTime.now());

        PermissionAccess permissionAccess = PermissionAccessConverter.convertToEntity(permissionAccessRequestDto);
        PermissionAccess permissionAccessSaved = permissionAccessRepository.saveAndFlush(permissionAccess);

        if( permissionAccessSaved == null ){
            throw new Exception("Permission access saved object is null");
        }

        return PermissionAccessConverter.convertToDto(permissionAccessSaved);
    }

    @Override
    public PermissionAccessResponseDto update(PermissionAccessRequestDto permissionAccessRequestDto) throws Exception {

        if( permissionAccessRequestDto == null ){
            throw new Exception("Permission access request object is null");
        }

        permissionAccessRequestDto
                .setCreatedBy("admin")
                .setCreatedDate(LocalDate.now())
                .setCreatedTime(LocalTime.now());

        PermissionAccess permissionAccess = PermissionAccessConverter.convertToEntity(permissionAccessRequestDto);
        PermissionAccess permissionAccessUpdated = permissionAccessRepository.save(permissionAccess);

        if( permissionAccessUpdated == null ){
            throw new Exception("Permission access updated object is null");
        }

        return PermissionAccessConverter.convertToDto(permissionAccessUpdated);
    }

    @Override
    public PermissionAccessResponseDto findById(Long id) throws Exception {

        return permissionAccessRepository.findById(id).stream()
                .map(PermissionAccessConverter::convertToDto)
                .findFirst()
                .orElseThrow(() -> new Exception("Permission access id not found"));
    }

    @Override
    public List<PermissionAccessResponseDto> findAll() {

        List<PermissionAccess> findPermissionAccesses = permissionAccessRepository.findAll();

        return findPermissionAccesses.stream()
                .map(PermissionAccessConverter::convertToDto)
                .collect(Collectors.toList());
    }
}