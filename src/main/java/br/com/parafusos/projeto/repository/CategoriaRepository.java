package br.com.parafusos.projeto.repository;

import br.com.parafusos.projeto.Entity.Categoria;
import br.com.parafusos.projeto.Entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
