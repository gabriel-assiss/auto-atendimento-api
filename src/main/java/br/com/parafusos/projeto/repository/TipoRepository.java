package br.com.parafusos.projeto.repository;

import br.com.parafusos.projeto.Entity.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TipoRepository extends JpaRepository<Tipo, Long> {
    List<Tipo> findByCategoriaNome(String nomeCategoria);
}
