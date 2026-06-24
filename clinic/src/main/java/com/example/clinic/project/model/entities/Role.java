package com.example.clinic.project.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "roleEntity")
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ROLE_ID", nullable = false)
    private Long id;

    @Size(max = 100)
    @NotNull
    @Column(name = "ENGLISH_ROLE_TITLE", nullable = false, length = 100)
    private String englishRoleTitle;

    @Size(max = 100)
    @NotNull
    @Column(name = "PERSIAN_ROLE_TITLE", nullable = false, length = 100)
    private String persianRoleTitle;

    @NotNull
    @Column(name = "CREATED_DATE", nullable = false)
    private LocalDate createdDate = LocalDate.now();

    @NotNull
    @Column(name = "CREATED_TIME", nullable = false)
    private LocalTime createdTime = LocalTime.now();

    @Size(max = 50)
    @NotNull
    @Column(name = "CREATED_BY", nullable = false, length = 50)
    private String createdBy = "admin";

    @NotNull
    @Version
    private Integer versionNum;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(name = "USER_ROLE", joinColumns = @JoinColumn(name = "ROLE_ID", referencedColumnName = "ROLE_ID", foreignKey =
    @ForeignKey(name = "FK_ROLE_ID")), inverseJoinColumns = @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID",
    foreignKey = @ForeignKey(name = "FK_USER_ID")))
    private List<User> users = new ArrayList<>();

    public Role() {
    }

    public Role(Long id, String englishRoleTitle, String persianRoleTitle, LocalDate createdDate, LocalTime createdTime, String createdBy, Integer versionNum, List<User> users) {
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

    public Role setId(Long id) {
        this.id = id;
        return this;
    }

    public String getEnglishRoleTitle() {
        return englishRoleTitle;
    }

    public Role setEnglishRoleTitle(String englishRoleTitle) {
        this.englishRoleTitle = englishRoleTitle;
        return this;
    }

    public String getPersianRoleTitle() {
        return persianRoleTitle;
    }

    public Role setPersianRoleTitle(String persianRoleTitle) {
        this.persianRoleTitle = persianRoleTitle;
        return this;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public Role setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public LocalTime getCreatedTime() {
        return createdTime;
    }

    public Role setCreatedTime(LocalTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Role setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Integer getVersionNum() {
        return versionNum;
    }

    public Role setVersionNum(Integer versionNum) {
        this.versionNum = versionNum;
        return this;
    }

    public List<User> getUsers() {
        return users;
    }

    public Role setUsers(List<User> users) {
        this.users = users;
        return this;
    }

    @Override
    public String toString() {
        return "Role{" +
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