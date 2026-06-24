package com.example.clinic.project.services.impl;

import com.example.clinic.project.converters.UserRoleConverter;
import com.example.clinic.project.model.dtos.response.UserRoleResponseDto;
import com.example.clinic.project.model.entities.UserRole;
import com.example.clinic.project.repositories.UserRoleRepository;
import com.example.clinic.project.services.interfaces.UserRoleService;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    private final UserRoleRepository userRoleRepository;

    public UserRoleServiceImpl(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Override
    public UserRoleResponseDto save(Long userId, Long roleId) {

        UserRole userRole = new UserRole();

        userRole
                .setCreatedBy("admin")
                .setCreatedTime(LocalTime.now())
                .setCreatedDate(LocalDate.now());

        UserRole userRoleSaved = userRoleRepository.saveAndFlush(userRole);

        return UserRoleConverter.convertToDto(userRoleSaved);
    }

    @Override
    public UserRoleResponseDto update(Long userId, Long roleId) {

        UserRole userRole = new UserRole();

        userRole
                .setCreatedBy("admin")
                .setCreatedTime(LocalTime.now())
                .setCreatedDate(LocalDate.now());

        UserRole userRoleUpdated = userRoleRepository.save(userRole);

        return UserRoleConverter.convertToDto(userRoleUpdated);
    }

    @Override
    public UserRoleResponseDto findById(Long userRoleId) throws Exception {

        return userRoleRepository.findById(userRoleId)
                .stream()
                .map(UserRoleConverter::convertToDto)
                .findFirst()
                .orElseThrow(() -> new Exception("User role id not found"));
    }

    @Override
    public List<UserRoleResponseDto> findAll() {

        return userRoleRepository.findAll()
                .stream()
                .map(UserRoleConverter::convertToDto)
                .collect(Collectors.toList());
    }
}