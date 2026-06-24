package com.example.clinic.project.services.impl;

import com.example.clinic.project.converters.RoleConverter;
import com.example.clinic.project.model.dtos.request.RoleRequestDto;
import com.example.clinic.project.model.dtos.response.RoleResponseDto;
import com.example.clinic.project.model.entities.Role;
import com.example.clinic.project.model.entities.User;
import com.example.clinic.project.repositories.RoleRepository;
import com.example.clinic.project.repositories.UserRepository;
import com.example.clinic.project.services.interfaces.RoleService;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    private final UserRepository userRepository;

    public RoleServiceImpl(RoleRepository roleRepository, UserRepository userRepository) {
        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
    }

    @Override
    public RoleResponseDto save(RoleRequestDto roleRequestDto) throws Exception {

        if( roleRequestDto == null ){
            throw new Exception("Role request object is null");
        }

        roleRequestDto
                .setCreatedBy("admin")
                .setCreatedDate(LocalDate.now())
                .setCreatedTime(LocalTime.now());

        List<User> users = new ArrayList<>();
        List<Long> usersId = roleRequestDto.getUsers();

        if( roleRequestDto.getUsers() != null || !roleRequestDto.getUsers().isEmpty() ){

            usersId.stream()
                    .forEach(userId -> {
                        try {
                            User findUserById = userRepository.findById(userId).orElseThrow(() -> new Exception("User id not found to be saved"));
                            users.add(findUserById);
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    });
        }

        Role role = RoleConverter.convertToEntity(roleRequestDto, users);
        Role roleSaved = roleRepository.saveAndFlush(role);

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

        List<User> users = new ArrayList<>();
        List<Long> usersId = roleRequestDto.getUsers();

        if( roleRequestDto.getUsers() != null || !roleRequestDto.getUsers().isEmpty() ){

            usersId.stream()
                    .forEach(userId -> {
                        try {
                            User findUserById = userRepository.findById(userId).orElseThrow(() -> new Exception("User id not found to be saved"));
                            users.add(findUserById);
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    });
        }

        Role role = RoleConverter.convertToEntity(roleRequestDto, users);
        Role roleUpdated = roleRepository.save(role);

        if( roleUpdated == null ){
            throw new Exception("Role saved object is null");
        }

        return RoleConverter.convertToDto(roleUpdated);
    }

    @Override
    public RoleResponseDto findById(Long id) throws Exception {

        return roleRepository.findById(id).stream()
                .map(RoleConverter::convertToDto)
                .findFirst()
                .orElseThrow(() -> new Exception("Role id not found...!"));
    }

    @Override
    public List<RoleResponseDto> findAll() throws Exception {

        return roleRepository.findAll()
                .stream()
                .map(RoleConverter::convertToDto)
                .collect(Collectors.toList());
    }
}