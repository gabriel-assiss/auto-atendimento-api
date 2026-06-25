package br.com.parafusos.projeto.service;

import br.com.parafusos.projeto.Entity.Estoque;
import br.com.parafusos.projeto.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class EstoqueService {
    EstoqueRepository estoqueRepository;
    @Autowired

    public Optional<Estoque> buscarEstoquePorProdutoId(Long produtoId) {

        Optional<Estoque> estoque = estoqueRepository.findByProdutoId(produtoId);

        if (estoque.isPresent() && estoque.get().getQuantidade() > 0) {
            return estoque;
        }else{
            throw new RuntimeException("Estoque insuficiente");
        }
    }
}
