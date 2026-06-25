package br.com.parafusos.projeto.controller;

import br.com.parafusos.projeto.Entity.Tipo;
import br.com.parafusos.projeto.repository.TipoRepository;
import br.com.parafusos.projeto.service.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tipo")

public class TipoController {
    @Autowired
    private TipoService tipoService;

    @GetMapping("/todos")
    public List<Tipo> buscarTodos(){
        return tipoService.buscarTodos();
    }

    @GetMapping("/categoria/{nomeCategoria}")
    public List<Tipo> buscarTodosPorCategoria(@PathVariable String nomeCategoria){
        return tipoService.buscarTiposPorCategoria(nomeCategoria);
    }

}
