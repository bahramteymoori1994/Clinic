package com.example.clinic.project.model.entities;

import com.example.clinic.project.model.enums.Gender;
import com.example.clinic.project.model.enums.MarriageStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.ColumnDefault;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity(name = "personEntity")
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PERSON_ID", nullable = false)
    private Long id;

    @Size(max = 50)
    @NotNull
    @Column(name = "FIRST_NAME", nullable = false, length = 50)
    private String firstName;

    @Size(max = 50)
    @NotNull
    @Column(name = "LAST_NAME", nullable = false, length = 50)
    private String lastName;

    @Size(max = 10)
    @NotNull
    @Column(name = "NATIONAL_CODE", nullable = false, length = 10)
    private String nationalCode;

    @NotNull
    @Column(name = "BIRTH_DATE", nullable = false)
    private LocalDate birthDate;

    @Size(max = 10)
    @NotNull
    @Column(name = "IDENTITY_NUMBER", nullable = false, length = 10)
    private String identityNumber;

    @NotNull
    @Enumerated(value = EnumType.ORDINAL)
    @Column(name = "GENDER", nullable = false)
    private Gender gender;

    @Size(max = 50)
    @NotNull
    @Column(name = "FATHER_NAME", nullable = false, length = 50)
    private String fatherName;

    @NotNull
    @Enumerated(value = EnumType.ORDINAL)
    @Column(name = "IS_MARRIED", nullable = false)
    private MarriageStatus isMarried;

    @Size(max = 50)
    @NotNull
    @Column(name = "BORN_PLACE", nullable = false, length = 50)
    private String bornPlace;

    @Size(max = 50)
    @NotNull
    @Column(name = "BORN_COUNTRY", nullable = false, length = 50)
    private String bornCountry;

    @Size(max = 2000)
    @NotNull
    @Column(name = "ADDRESS", nullable = false, length = 2000)
    private String address;

    @Size(max = 11)
    @NotNull
    @Column(name = "PHONE_NUMBER", nullable = false, length = 11)
    private String phoneNumber;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "VERSION_NUM", nullable = false)
    @Version
    private Integer versionNum;

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

    @Column(name = "MODIFIED_DATE")
    private LocalDate modifiedDate;

    @Column(name = "MODIFIED_TIME")
    private LocalTime modifiedTime;

    @Size(max = 50)
    @Column(name = "MODIFIED_BY", length = 50)
    private String modifiedBy;

    public Person() {
    }

    public Person(Long id, String firstName, String lastName, String nationalCode, LocalDate birthDate, String identityNumber, Gender gender, String fatherName, MarriageStatus isMarried, String bornPlace, String bornCountry, String address, String phoneNumber, Integer versionNum, LocalDate createdDate, LocalTime createdTime, String createdBy, LocalDate modifiedDate, LocalTime modifiedTime, String modifiedBy) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalCode = nationalCode;
        this.birthDate = birthDate;
        this.identityNumber = identityNumber;
        this.gender = gender;
        this.fatherName = fatherName;
        this.isMarried = isMarried;
        this.bornPlace = bornPlace;
        this.bornCountry = bornCountry;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.versionNum = versionNum;
        this.createdDate = createdDate;
        this.createdTime = createdTime;
        this.createdBy = createdBy;
        this.modifiedDate = modifiedDate;
        this.modifiedTime = modifiedTime;
        this.modifiedBy = modifiedBy;
    }

    public Long getId() {
        return id;
    }

    public Person setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public Person setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
        return this;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Person setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public Person setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public Person setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public String getFatherName() {
        return fatherName;
    }

    public Person setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public MarriageStatus getIsMarried() {
        return isMarried;
    }

    public Person setIsMarried(MarriageStatus isMarried) {
        this.isMarried = isMarried;
        return this;
    }

    public String getBornPlace() {
        return bornPlace;
    }

    public Person setBornPlace(String bornPlace) {
        this.bornPlace = bornPlace;
        return this;
    }

    public String getBornCountry() {
        return bornCountry;
    }

    public Person setBornCountry(String bornCountry) {
        this.bornCountry = bornCountry;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Person setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Person setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Integer getVersionNum() {
        return versionNum;
    }

    public Person setVersionNum(Integer versionNum) {
        this.versionNum = versionNum;
        return this;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public Person setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public LocalTime getCreatedTime() {
        return createdTime;
    }

    public Person setCreatedTime(LocalTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Person setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public LocalDate getModifiedDate() {
        return modifiedDate;
    }

    public Person setModifiedDate(LocalDate modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public LocalTime getModifiedTime() {
        return modifiedTime;
    }

    public Person setModifiedTime(LocalTime modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public Person setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", birthDate=" + birthDate +
                ", identityNumber='" + identityNumber + '\'' +
                ", gender=" + gender +
                ", fatherName='" + fatherName + '\'' +
                ", isMarried=" + isMarried +
                ", bornPlace='" + bornPlace + '\'' +
                ", bornCountry='" + bornCountry + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", versionNum=" + versionNum +
                ", createdDate=" + createdDate +
                ", createdTime=" + createdTime +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedDate=" + modifiedDate +
                ", modifiedTime=" + modifiedTime +
                ", modifiedBy='" + modifiedBy + '\'' +
                '}';
    }
}