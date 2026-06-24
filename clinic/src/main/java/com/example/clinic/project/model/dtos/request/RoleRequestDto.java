package com.example.clinic.project.model.dtos.request;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RoleRequestDto {

    private Long id;
    private String englishRoleTitle;
    private String persianRoleTitle;
    private LocalDate createdDate;
    private LocalTime createdTime;
    private String createdBy;
    private Integer versionNum;
    private List<Long> users = new ArrayList<>();

    public RoleRequestDto() {
    }

    public RoleRequestDto(Long id, String englishRoleTitle, String persianRoleTitle, LocalDate createdDate, LocalTime createdTime, String createdBy, Integer versionNum, List<Long> users) {
        this.id = id;
        this.englishRoleTitle = englishRoleTitle;
        this.persianRoleTitle = persianRoleTitle;
        this.createdDate = createdDate;
        this.createdTime = createdTime;
        this.createdBy = createdBy;
        this.versionNum = versionNum;
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public RoleRequestDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getEnglishRoleTitle() {
        return englishRoleTitle;
    }

    public RoleRequestDto setEnglishRoleTitle(String englishRoleTitle) {
        this.englishRoleTitle = englishRoleTitle;
        return this;
    }

    public String getPersianRoleTitle() {
        return persianRoleTitle;
    }

    public RoleRequestDto setPersianRoleTitle(String persianRoleTitle) {
        this.persianRoleTitle = persianRoleTitle;
        return this;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public RoleRequestDto setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public LocalTime getCreatedTime() {
        return createdTime;
    }

    public RoleRequestDto setCreatedTime(LocalTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public RoleRequestDto setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Integer getVersionNum() {
        return versionNum;
    }

    public RoleRequestDto setVersionNum(Integer versionNum) {
        this.versionNum = versionNum;
        return this;
    }

    public List<Long> getUsers() {
        return users;
    }

    public RoleRequestDto setUsers(List<Long> users) {
        this.users = users;
        return this;
    }

    @Override
    public String toString() {
        return "RoleRequestDto{" +
                "id=" + id +
                ", englishRoleTitle='" + englishRoleTitle + '\'' +
                ", persianRoleTitle='" + persianRoleTitle + '\'' +
                ", createdDate=" + createdDate +
                ", createdTime=" + createdTime +
                ", createdBy='" + createdBy + '\'' +
                ", versionNum=" + versionNum +
                ", users=" + users +
                '}';
    }
}