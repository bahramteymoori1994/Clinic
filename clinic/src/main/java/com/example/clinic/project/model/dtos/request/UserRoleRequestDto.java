package com.example.clinic.project.model.dtos.request;

import java.time.LocalDate;
import java.time.LocalTime;

public class UserRoleRequestDto {

    private Long id;
    private Long user;
    private Long role;
    private LocalDate createdDate;
    private LocalTime createdTime;
    private String createdBy;
    private Integer versionNum;

    public UserRoleRequestDto() {
    }

    public UserRoleRequestDto(Long id, Long user, Long role, LocalDate createdDate, LocalTime createdTime, String createdBy, Integer versionNum) {
        this.id = id;
        this.user = user;
        this.role = role;
        this.createdDate = createdDate;
        this.createdTime = createdTime;
        this.createdBy = createdBy;
        this.versionNum = versionNum;
    }

    public Long getId() {
        return id;
    }

    public UserRoleRequestDto setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUser() {
        return user;
    }

    public UserRoleRequestDto setUser(Long user) {
        this.user = user;
        return this;
    }

    public Long getRole() {
        return role;
    }

    public UserRoleRequestDto setRole(Long role) {
        this.role = role;
        return this;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public UserRoleRequestDto setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public LocalTime getCreatedTime() {
        return createdTime;
    }

    public UserRoleRequestDto setCreatedTime(LocalTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public UserRoleRequestDto setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Integer getVersionNum() {
        return versionNum;
    }

    public UserRoleRequestDto setVersionNum(Integer versionNum) {
        this.versionNum = versionNum;
        return this;
    }

    @Override
    public String toString() {
        return "UserRoleRequestDto{" +
                "id=" + id +
                ", user=" + user +
                ", role=" + role +
                ", createdDate=" + createdDate +
                ", createdTime=" + createdTime +
                ", createdBy='" + createdBy + '\'' +
                ", versionNum=" + versionNum +
                '}';
    }
}