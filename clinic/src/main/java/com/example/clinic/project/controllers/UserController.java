package com.example.clinic.project.controllers;

import com.example.clinic.project.model.dtos.request.PermissionAccessRequestDto;
import com.example.clinic.project.model.dtos.request.RoleRequestDto;
import com.example.clinic.project.model.dtos.request.UserRequestDto;
import com.example.clinic.project.model.dtos.response.PermissionAccessResponseDto;
import com.example.clinic.project.model.dtos.response.RoleResponseDto;
import com.example.clinic.project.model.dtos.response.UserResponseDto;
import com.example.clinic.project.services.interfaces.PermissionAccessService;
import com.example.clinic.project.services.interfaces.RoleService;
import com.example.clinic.project.services.interfaces.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    private final UserService userService;
    private final RoleService roleService;
    private final PermissionAccessService permissionAccessService;

    public UserController(UserService userService, RoleService roleService, PermissionAccessService permissionAccessService) {
        this.userService = userService;
        this.roleService = roleService;
        this.permissionAccessService = permissionAccessService;
    }

    @PostMapping("/saveUser")
    @ResponseStatus(value = HttpStatus.CREATED)
    public UserResponseDto saveUser(@RequestBody UserRequestDto userRequestDto) throws Exception {

        return userService.save(userRequestDto);
    }

    @PutMapping("/updateUser")
    @ResponseStatus(value = HttpStatus.OK)
    public UserResponseDto updateUser(@RequestBody UserRequestDto userRequestDto) throws Exception {

        return userService.update(userRequestDto);
    }

    @GetMapping("/findUserById/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public UserResponseDto findUserById(@PathVariable Long id) throws Exception {

        return userService.findById(id);
    }

    @GetMapping("/findAllUsers")
    @ResponseStatus(value = HttpStatus.OK)
    public List<UserResponseDto> findAllUsers() throws Exception {

        return userService.findAll();
    }

    @PostMapping("/role/saveRole")
    @ResponseStatus(value = HttpStatus.CREATED)
    public RoleResponseDto saveRole(@RequestBody RoleRequestDto roleRequestDto) throws Exception {

        return roleService.save(roleRequestDto);
    }

    @PutMapping("/role/updateRole")
    @ResponseStatus(value = HttpStatus.OK)
    public RoleResponseDto updateRole(@RequestBody RoleRequestDto roleRequestDto) throws Exception {

        return roleService.update(roleRequestDto);
    }

    @GetMapping("/role/findRoleById/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public RoleResponseDto findRoleById(@PathVariable Long id) throws Exception {

        return roleService.findById(id);
    }

    @GetMapping("/role/findAllRoles")
    @ResponseStatus(value = HttpStatus.OK)
    public List<RoleResponseDto> findAllRoles() throws Exception {

        return roleService.findAll();
    }

    @PostMapping("/permissionAccess/savePermissionAccess")
    @ResponseStatus(value = HttpStatus.CREATED)
    public PermissionAccessResponseDto savePermissionAccess(@RequestBody PermissionAccessRequestDto permissionAccessRequestDto) throws Exception {

        return permissionAccessService.save(permissionAccessRequestDto);
    }

    @PutMapping("/permissionAccess/updatePermissionAccess")
    @ResponseStatus(value = HttpStatus.OK)
    public PermissionAccessResponseDto updatePermissionAccess(@RequestBody PermissionAccessRequestDto permissionAccessRequestDto) throws Exception {

        return permissionAccessService.update(permissionAccessRequestDto);
    }

    @GetMapping("/permissionAccess/findPermissionAccessById/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public PermissionAccessResponseDto findPermissionAccessById(@PathVariable Long id) throws Exception {

        return permissionAccessService.findById(id);
    }

    @GetMapping("/permissionAccess/findAllPermissionAccesses")
    @ResponseStatus(value = HttpStatus.OK)
    public List<PermissionAccessResponseDto> findAllPermissionAccesses() throws Exception {

        return permissionAccessService.findAll();
    }
}