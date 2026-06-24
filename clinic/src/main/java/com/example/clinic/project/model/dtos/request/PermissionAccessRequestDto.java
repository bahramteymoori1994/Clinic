package com.example.clinic.project.model.dtos.request;

import java.time.LocalDate;
import java.time.LocalTime;

public class PermissionAccessRequestDto {

    private Long id;
    private Long roleId;
    private String accessTitle;
    private LocalDate createdDate;
    private LocalTime createdTime;
    private String createdBy;
    private Integer versionNum;

    public PermissionAccessRequestDto() {
    }

    public PermissionAccessRequestDto(Long id, Long roleId, String accessTitle, LocalDate createdDate, LocalTime createdTime, String createdBy, Integer versionNum) {
        this.id = id;
        this.roleId = roleId;
        this.accessTitle = accessTitle;
        this.createdDate = createdDate;
        this.createdTime = createdTime;
        this.createdBy = createdBy;
        this.versionNum = versionNum;
    }

    public Long getId() {
        return id;
    }

    public PermissionAccessRequestDto setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getRoleId() {
        return roleId;
    }

    public PermissionAccessRequestDto setRoleId(Long roleId) {
        this.roleId = roleId;
        return this;
    }

    public String getAccessTitle() {
        return accessTitle;
    }

    public PermissionAccessRequestDto setAccessTitle(String accessTitle) {
        this.accessTitle = accessTitle;
        return this;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public PermissionAccessRequestDto setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public LocalTime getCreatedTime() {
        return createdTime;
    }

    public PermissionAccessRequestDto setCreatedTime(LocalTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public PermissionAccessRequestDto setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Integer getVersionNum() {
        return versionNum;
    }

    public PermissionAccessRequestDto setVersionNum(Integer versionNum) {
        this.versionNum = versionNum;
        return this;
    }

    @Override
    public String toString() {
        return "PermissionAccessRequestDto{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", accessTitle='" + accessTitle + '\'' +
                ", createdDate=" + createdDate +
                ", createdTime=" + createdTime +
                ", createdBy='" + createdBy + '\'' +
                ", versionNum=" + versionNum +
                '}';
    }
}