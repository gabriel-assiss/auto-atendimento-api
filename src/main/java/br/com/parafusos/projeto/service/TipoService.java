package br.com.parafusos.projeto.service;


import br.com.parafusos.projeto.Entity.Tipo;
import br.com.parafusos.projeto.repository.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TipoService {
    @Autowired
    TipoRepository tipoRepository;

    public List<Tipo> buscarTodos(){
        return tipoRepository.findAll();
    }

    public Optional<Tipo> buscarPorId(long id)
    {
        return tipoRepository.findById(id);
    }

    public Tipo criar(Tipo tipo){
        return tipoRepository.save(tipo);
    }
    public Optional<Tipo> atualizar(long id,Tipo tipo){

        Tipo TipoExistente = tipoRepository.findById(id).orElseThrow(() -> new RuntimeException("Não existe"));

        TipoExistente.setNome(tipo.getNome());

        TipoExistente.setCategoria(tipo.getCategoria());

        return Optional.of(tipoRepository.save(TipoExistente));
    }
    public List<Tipo> buscarTiposPorCategoria(String nomeCategoria){
        return tipoRepository.findByCategoriaNome(nomeCategoria);
    }
    public void excluir(long id) {
        if (tipoRepository.existsById(id)) {
            tipoRepository.deleteById(id);
        } else {
            throw new RuntimeException("Não existe");
        }
    }
}
