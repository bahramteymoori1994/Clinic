package com.example.clinic.project.converters;

import com.example.clinic.project.model.dtos.request.PersonRequestDto;
import com.example.clinic.project.model.dtos.response.PersonResponseDto;
import com.example.clinic.project.model.entities.Person;

public class PersonConverter {

    public static Person convertToEntity(PersonRequestDto personRequestDto){

        Person person = new Person();

        person
                .setId(personRequestDto.getId())
                .setAddress(personRequestDto.getAddress())
                .setBirthDate(personRequestDto.getBirthDate())
                .setBornCountry(personRequestDto.getBornCountry())
                .setBornPlace(personRequestDto.getBornPlace())
                .setCreatedBy(personRequestDto.getCreatedBy())
                .setCreatedDate(personRequestDto.getCreatedDate())
                .setCreatedBy(personRequestDto.getCreatedBy())
                .setFirstName(personRequestDto.getFirstName())
                .setLastName(personRequestDto.getLastName())
                .setFatherName(personRequestDto.getFatherName())
                .setGender(personRequestDto.getGender())
                .setNationalCode(personRequestDto.getNationalCode())
                .setPhoneNumber(personRequestDto.getPhoneNumber())
                .setIsMarried(personRequestDto.getIsMarried())
                .setIdentityNumber(personRequestDto.getIdentityNumber())
                .setVersionNum(personRequestDto.getVersionNum())
                .setModifiedBy(personRequestDto.getModifiedBy())
                .setModifiedDate(personRequestDto.getModifiedDate())
                .setModifiedTime(personRequestDto.getModifiedTime());

        return person;
    }

    public static PersonResponseDto convertToDto(Person person){

        PersonResponseDto personResponseDto = new PersonResponseDto();

        personResponseDto
                .setId(person.getId())
                .setAddress(person.getAddress())
                .setBirthDate(person.getBirthDate())
                .setBornCountry(person.getBornCountry())
                .setBornPlace(person.getBornPlace())
                .setCreatedBy(person.getCreatedBy())
                .setCreatedDate(person.getCreatedDate())
                .setCreatedBy(person.getCreatedBy())
                .setFirstName(person.getFirstName())
                .setLastName(person.getLastName())
                .setFatherName(person.getFatherName())
                .setGender(person.getGender())
                .setIsMarried(person.getIsMarried())
                .setNationalCode(person.getNationalCode())
                .setPhoneNumber(person.getPhoneNumber())
                .setIdentityNumber(person.getIdentityNumber())
                .setVersionNum(person.getVersionNum())
                .setModifiedBy(person.getModifiedBy())
                .setModifiedDate(person.getModifiedDate())
                .setModifiedTime(person.getModifiedTime());

        return personResponseDto;
    }
}