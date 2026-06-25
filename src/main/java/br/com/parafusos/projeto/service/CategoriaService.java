package br.com.parafusos.projeto.service;

import br.com.parafusos.projeto.Entity.Categoria;
import br.com.parafusos.projeto.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

    @Service
    public class CategoriaService {
        @Autowired
        CategoriaRepository categoriaRepository;

        public List<Categoria> buscarTodos(){
            return categoriaRepository.findAll();
        }


        public Optional<Categoria> buscarPorId(long id)
        {
            return categoriaRepository.findById(id);
        }

        public Categoria criar(Categoria categoria){
            return categoriaRepository.save(categoria);
        }


        public Optional<Categoria> atualizar(long id,Categoria categoria){

            Categoria CategoriaExistente = categoriaRepository.findById(id).orElseThrow(() -> new RuntimeException("Não existe"));

            CategoriaExistente.setNome(categoria.getNome());

            return Optional.of(categoriaRepository.save(CategoriaExistente));
        }

        public void excluir(long id) {
            if (categoriaRepository.existsById(id)) {
                categoriaRepository.deleteById(id);
            } else {
                throw new RuntimeException("Não existe");
            }
        }
    }


