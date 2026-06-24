package com.example.clinic.project.model.dtos.response;

import com.example.clinic.project.model.enums.Gender;
import com.example.clinic.project.model.enums.MarriageStatus;

import java.time.LocalDate;
import java.time.LocalTime;

public class PersonResponseDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String nationalCode;
    private LocalDate birthDate;
    private String identityNumber;
    private Gender gender;
    private String fatherName;
    private MarriageStatus isMarried;
    private String bornPlace;
    private String bornCountry;
    private String address;
    private String phoneNumber;
    private Integer versionNum;
    private LocalDate createdDate;
    private LocalTime createdTime;
    private String createdBy;
    private LocalDate modifiedDate;
    private LocalTime modifiedTime;
    private String modifiedBy;

    public PersonResponseDto() {
    }

    public PersonResponseDto(Long id, String firstName, String lastName, String nationalCode, LocalDate birthDate, String identityNumber, Gender gender, String fatherName, MarriageStatus isMarried, String bornPlace, String bornCountry, String address, String phoneNumber, Integer versionNum, LocalDate createdDate, LocalTime createdTime, String createdBy, LocalDate modifiedDate, LocalTime modifiedTime, String modifiedBy) {
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

    public PersonResponseDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public PersonResponseDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public PersonResponseDto setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public PersonResponseDto setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
        return this;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public PersonResponseDto setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public PersonResponseDto setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public PersonResponseDto setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public String getFatherName() {
        return fatherName;
    }

    public PersonResponseDto setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public MarriageStatus getIsMarried() {
        return isMarried;
    }

    public PersonResponseDto setIsMarried(MarriageStatus isMarried) {
        this.isMarried = isMarried;
        return this;
    }

    public String getBornPlace() {
        return bornPlace;
    }

    public PersonResponseDto setBornPlace(String bornPlace) {
        this.bornPlace = bornPlace;
        return this;
    }

    public String getBornCountry() {
        return bornCountry;
    }

    public PersonResponseDto setBornCountry(String bornCountry) {
        this.bornCountry = bornCountry;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public PersonResponseDto setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public PersonResponseDto setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Integer getVersionNum() {
        return versionNum;
    }

    public PersonResponseDto setVersionNum(Integer versionNum) {
        this.versionNum = versionNum;
        return this;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public PersonResponseDto setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public LocalTime getCreatedTime() {
        return createdTime;
    }

    public PersonResponseDto setCreatedTime(LocalTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public PersonResponseDto setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public LocalDate getModifiedDate() {
        return modifiedDate;
    }

    public PersonResponseDto setModifiedDate(LocalDate modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    public LocalTime getModifiedTime() {
        return modifiedTime;
    }

    public PersonResponseDto setModifiedTime(LocalTime modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public PersonResponseDto setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    @Override
    public String toString() {
        return "PersonResponseDto{" +
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