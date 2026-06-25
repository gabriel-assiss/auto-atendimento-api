package br.com.parafusos.projeto.controller;

import br.com.parafusos.projeto.Entity.Categoria;
import br.com.parafusos.projeto.service.CategoriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categoria")
public class CategoriasController{

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/categorias")
    public List<Categoria> Todos(){
        return categoriaService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Categoria> buscarPorId(@PathVariable long id){
        return categoriaService.buscarPorId(id);
    }
    @PostMapping("/categorias")
   public Categoria criarCategoria(@RequestBody Categoria categoria){
       return categoriaService.criar(categoria);
   }

    @PutMapping("/{id}")
    public Optional<Categoria> atualizarCategoria(@PathVariable long id, @RequestBody Categoria categoria){
        return categoriaService.atualizar(id,categoria);
    }

    @DeleteMapping("/{id}")
    public void deletarCategoria(@PathVariable long id){
        categoriaService.excluir(id);
    }

}
