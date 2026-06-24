package com.example.clinic.project.services.impl;

import com.example.clinic.project.converters.RoleConverter;
import com.example.clinic.project.model.dtos.request.RoleRequestDto;
import com.example.clinic.project.model.dtos.response.RoleResponseDto;
import com.example.clinic.project.model.entities.Role;
import com.example.clinic.project.repositories.RoleRepository;
import com.example.clinic.project.services.interfaces.RoleService;
import com.example.clinic.project.services.interfaces.UserRoleService;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    private final UserRoleService userRoleService;

    public RoleServiceImpl(RoleRepository roleRepository, UserRoleService userRoleService) {
        this.roleRepository = roleRepository;
        this.userRoleService = userRoleService;
    }

    //TODO : inject UserRole service to implement junction table

    @Override
    public RoleResponseDto save(RoleRequestDto roleRequestDto) throws Exception {

        if( roleRequestDto == null ){
            throw new Exception("Role request object is null");
        }

        roleRequestDto
                .setCreatedBy("admin")
                .setCreatedDate(LocalDate.now())
                .setCreatedTime(LocalTime.now());

        Role role = RoleConverter.convertToEntity(roleRequestDto);
        Role roleSaved = roleRepository.saveAndFlush(role);

        userRoleService.save(roleRequestDto.getUserId() ,roleSaved.getId());

        if( roleSaved == null ){
            throw new Exception("Role saved object is null");
        }

        return RoleConverter.convertToDto(roleSaved);
    }

    @Override
    public RoleResponseDto update(RoleRequestDto roleRequestDto) throws Exception {

        if( roleRequestDto == null ){
            throw new Exception("Role request object is null");
        }

        roleRequestDto
                .setCreatedBy("admin")
                .setCreatedDate(LocalDate.now())
                .setCreatedTime(LocalTime.now());

        Role role = RoleConverter.convertToEntity(roleRequestDto);
        Role roleUpdated = roleRepository.save(role);

        userRoleService.save(roleRequestDto.getUserId() ,roleUpdated.getId());

        if( roleUpdated == null ){
            throw new Exception("Role updated object is null");
        }

        return RoleConverter.convertToDto(roleUpdated);
    }

    @Override
    public RoleResponseDto findById(Long id) throws Exception {

        return roleRepository.findById(id).stream()
                .map(RoleConverter::convertToDto)
                .findFirst()
                .orElseThrow(() -> new Exception("Role id not found"));
    }

    @Override
    public List<RoleResponseDto> findAll() {

        return roleRepository.findAll()
                .stream()
                .map(RoleConverter::convertToDto)
                .collect(Collectors.toList());
    }
}