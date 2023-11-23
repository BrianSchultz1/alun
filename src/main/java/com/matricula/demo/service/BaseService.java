package com.matricula.demo.service;

import com.matricula.demo.base.Base;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BaseService {

    @Autowired
    private  Base base;


    public String getNomeByMatricula(String matricula){

        return base.obterAlunos().get(matricula);

}

}
