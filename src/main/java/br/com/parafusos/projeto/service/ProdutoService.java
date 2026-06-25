package br.com.parafusos.projeto.service;

import br.com.parafusos.projeto.Entity.Produto;
import br.com.parafusos.projeto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> buscarPorTipos(String tipo){
        return produtoRepository.findByTipoNome(tipo);
    }

    public List<Produto> buscarTodos(){
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarPorId(long id){
        if (produtoRepository.existsById(id)){
            return produtoRepository.findById(id);
        }else {
            throw new RuntimeException("Não existe");
        }
    }

    public Produto criar(Produto produto){
        return produtoRepository.save(produto);
    }

    public void excluir(long id){
        if (produtoRepository.existsById(id)){
            produtoRepository.deleteById(id);
        }else{
            throw new RuntimeException("Não existe");
        }

    }





}
