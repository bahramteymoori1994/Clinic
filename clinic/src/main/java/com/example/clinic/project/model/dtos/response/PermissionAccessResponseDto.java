package com.example.clinic.project.model.dtos.response;

import java.time.LocalDate;
import java.time.LocalTime;

public class PermissionAccessResponseDto {

    private Long id;
    private Long role;
    private String accessTitle;
    private LocalDate createdDate;
    private LocalTime createdTime;
    private String createdBy;
    private Integer versionNum;

    public PermissionAccessResponseDto() {
    }

    public PermissionAccessResponseDto(Long id, Long role, String accessTitle, LocalDate createdDate, LocalTime createdTime, String createdBy, Integer versionNum) {
        this.id = id;
        this.role = role;
        this.accessTitle = accessTitle;
        this.createdDate = createdDate;
        this.createdTime = createdTime;
        this.createdBy = createdBy;
        this.versionNum = versionNum;
    }

    public Long getId() {
        return id;
    }

    public PermissionAccessResponseDto setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getRole() {
        return role;
    }

    public PermissionAccessResponseDto setRole(Long role) {
        this.role = role;
        return this;
    }

    public String getAccessTitle() {
        return accessTitle;
    }

    public PermissionAccessResponseDto setAccessTitle(String accessTitle) {
        this.accessTitle = accessTitle;
        return this;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public PermissionAccessResponseDto setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public LocalTime getCreatedTime() {
        return createdTime;
    }

    public PermissionAccessResponseDto setCreatedTime(LocalTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public PermissionAccessResponseDto setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Integer getVersionNum() {
        return versionNum;
    }

    public PermissionAccessResponseDto setVersionNum(Integer versionNum) {
        this.versionNum = versionNum;
        return this;
    }

    @Override
    public String toString() {
        return "PermissionAccessResponseDto{" +
                "id=" + id +
                ", role=" + role +
                ", accessTitle='" + accessTitle + '\'' +
                ", createdDate=" + createdDate +
                ", createdTime=" + createdTime +
                ", createdBy='" + createdBy + '\'' +
                ", versionNum=" + versionNum +
                '}';
    }
}