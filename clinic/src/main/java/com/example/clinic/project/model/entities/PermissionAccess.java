package com.example.clinic.project.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity(name = "permissionAccessEntity")
@Table(name = "permission_access")
public class PermissionAccess {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PERMISSION_ACCESS_ID", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ROLE_ID", nullable = false)
    private Role role;

    @Size(max = 50)
    @NotNull
    @Column(name = "ACCESS_TITLE", nullable = false, length = 50)
    private String accessTitle;

    @NotNull
    @Column(name = "CREATED_DATE", nullable = false)
    private LocalDate createdDate;

    @NotNull
    @Column(name = "CREATED_TIME", nullable = false)
    private LocalTime createdTime;

    @Size(max = 50)
    @NotNull
    @Column(name = "CREATED_BY", nullable = false, length = 50)
    private String createdBy;

    @NotNull
    @Version
    private Integer versionNum;

    public PermissionAccess() {
    }

    public PermissionAccess(Long id, Role role, String accessTitle, LocalDate createdDate, LocalTime createdTime, String createdBy, Integer versionNum) {
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

    public PermissionAccess setId(Long id) {
        this.id = id;
        return this;
    }

    public Role getRole() {
        return role;
    }

    public PermissionAccess setRole(Role role) {
        this.role = role;
        return this;
    }

    public String getAccessTitle() {
        return accessTitle;
    }

    public PermissionAccess setAccessTitle(String accessTitle) {
        this.accessTitle = accessTitle;
        return this;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public PermissionAccess setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public LocalTime getCreatedTime() {
        return createdTime;
    }

    public PermissionAccess setCreatedTime(LocalTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public PermissionAccess setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Integer getVersionNum() {
        return versionNum;
    }

    public PermissionAccess setVersionNum(Integer versionNum) {
        this.versionNum = versionNum;
        return this;
    }

    @Override
    public String toString() {
        return "PermissionAccess{" +
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