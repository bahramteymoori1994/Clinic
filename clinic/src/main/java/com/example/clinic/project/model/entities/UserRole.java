package com.example.clinic.project.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity(name = "userRoleEntity")
@Table(name = "user_role")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ROLE_ID", nullable = false)
    private Long id;

    @NotNull
    private Long user;

    @NotNull
    private Long role;

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

    public UserRole() {
    }

    public UserRole(Long id, Long user, Long role, LocalDate createdDate, LocalTime createdTime, String createdBy, Integer versionNum) {
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

    public UserRole setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUser() {
        return user;
    }

    public UserRole setUser(Long user) {
        this.user = user;
        return this;
    }

    public Long getRole() {
        return role;
    }

    public UserRole setRole(Long role) {
        this.role = role;
        return this;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public UserRole setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public LocalTime getCreatedTime() {
        return createdTime;
    }

    public UserRole setCreatedTime(LocalTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public UserRole setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Integer getVersionNum() {
        return versionNum;
    }

    public UserRole setVersionNum(Integer versionNum) {
        this.versionNum = versionNum;
        return this;
    }

    @Override
    public String toString() {
        return "UserRole{" +
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