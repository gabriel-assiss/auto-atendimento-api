package br.com.parafusos.projeto.controller;

import br.com.parafusos.projeto.Entity.Estoque;
import br.com.parafusos.projeto.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/estoque")
public class EstoqueController {
    @Autowired
    private EstoqueRepository estoqueRepository;

    @GetMapping("/estoque/{produtoId}")
    public Optional<Estoque> buscarPorId(@PathVariable long produtoId){
       return estoqueRepository.findById(produtoId);
    }
}
