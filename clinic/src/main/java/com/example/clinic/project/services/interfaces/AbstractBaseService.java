package com.example.clinic.project.services.interfaces;

import java.util.List;

/*
*this interface represents request and response services
* Q indicates request dtos
* S indicates response dtos
 */
public interface AbstractBaseService<Q,S>{

    S save(Q q) throws Exception;
    S update(Q q) throws Exception;
    S findById(Long id) throws Exception;
    List<S> findAll() throws Exception;
}