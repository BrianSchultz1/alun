package com.matricula.demo.base;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class Base {
    private Map<String, String> map;

    public Map<String, String> obterAlunos() {
        alunos();
        return map;
    }

    private void alunos() {
        map = new HashMap<String, String>();
        map.put("202320014", "aluno1");
        map.put("202320105", "aluno2");
        map.put("202320206", "aluno3");
        map.put("202320388", "aluno4");
        map.put("202320509", "aluno5");
    }

}
