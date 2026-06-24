package com.example.clinic.project.model.dtos.response;

import java.time.LocalDate;
import java.time.LocalTime;

public class UserResponseDto {

    private Long id;
    private Long personId;
    private String username;
    private String password;
    private String email;
    private LocalDate createdDate;
    private LocalTime createdTime;
    private String createdBy;
    private Integer versionNum;

    public UserResponseDto() {
    }

    public UserResponseDto(Long id, Long personId, String username, String password, String email, LocalDate createdDate, LocalTime createdTime, String createdBy, Integer versionNum) {
        this.id = id;
        this.personId = personId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.createdDate = createdDate;
        this.createdTime = createdTime;
        this.createdBy = createdBy;
        this.versionNum = versionNum;
    }

    public Long getId() {
        return id;
    }

    public UserResponseDto setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getPersonId() {
        return personId;
    }

    public UserResponseDto setPersonId(Long personId) {
        this.personId = personId;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserResponseDto setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserResponseDto setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserResponseDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public UserResponseDto setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public LocalTime getCreatedTime() {
        return createdTime;
    }

    public UserResponseDto setCreatedTime(LocalTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public UserResponseDto setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Integer getVersionNum() {
        return versionNum;
    }

    public UserResponseDto setVersionNum(Integer versionNum) {
        this.versionNum = versionNum;
        return this;
    }

    @Override
    public String toString() {
        return "UserResponseDto{" +
                "id=" + id +
                ", personId=" + personId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", createdDate=" + createdDate +
                ", createdTime=" + createdTime +
                ", createdBy='" + createdBy + '\'' +
                ", versionNum=" + versionNum +
                '}';
    }
}