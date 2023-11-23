package com.matricula.demo.controller;


import com.matricula.demo.service.BaseService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController

public class BaseController {
    @Autowired
    private BaseService baseService;

    @GetMapping("/nomes/{matricula}")
    public String getNome(@PathVariable("matricula") String matricula) {


        return baseService.getNomeByMatricula(matricula);
    }


}
