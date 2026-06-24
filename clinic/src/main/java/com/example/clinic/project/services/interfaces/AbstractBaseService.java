package com.example.clinic.project.services.interfaces;

import java.util.List;

/*
*this interface represents request and response services
* Q indicates request dtos
* S indicates response dtos
 */
public interface AbstractBaseService<Q,S>{

    S save(Q q);
    S update(Q q);
    S findById(Long id);
    List<S> findAll();
}