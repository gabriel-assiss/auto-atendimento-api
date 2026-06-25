package br.com.parafusos.projeto.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name ="tipo")
public class Tipo {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private long id;
private String nome;

@ManyToOne
@JoinColumn(name = "categoria_id")
private Categoria categoria;
    @JsonIgnore
    @OneToMany(mappedBy = "tipo")
    private List<Produto> produtos;

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }


    public long getId() {return id;}

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
