package br.com.parafusos.projeto.controller;

import br.com.parafusos.projeto.Entity.Produto;
import br.com.parafusos.projeto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutosController {
    @Autowired
    ProdutoService produtoService;

    @GetMapping("/produtos")
    public List<Produto> buscarTodosProdutos() {
        return produtoService.buscarTodos();
    }

    @GetMapping("/tipos/{tipos}")
    public List<Produto> buscarProdutosPorTipos(@PathVariable String tipos) {
        return produtoService.buscarPorTipos(tipos);
    }



}
