package br.com.parafusos.projeto.repository;

import br.com.parafusos.projeto.Entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {


    List<Produto> findByTipoNome(String tipo);
}
