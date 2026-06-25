# Auto Atendimento API

API REST desenvolvida para gerenciamento de produtos de uma loja de ferragens/parafusos, permitindo organização por categorias, tipos de produtos e controle de estoque.

Projeto desenvolvido com foco em arquitetura backend, modelagem relacional e boas práticas com Java e Spring Boot.

---

## Tecnologias Utilizadas

* Java 21
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* Git e GitHub

---

## Arquitetura do Projeto

O projeto segue uma arquitetura em camadas:

```text
Controller → recebe requisições HTTP

Service → regras de negócio

Repository → acesso ao banco de dados

Entity → mapeamento das tabelas
```

Estrutura:

```text
src/main/java/br/com/parafusos/projeto

├── controller
├── service
├── repository
├── Entity
└── ProjetoApplication
```

---

## Modelagem do Banco de Dados

O sistema possui as seguintes entidades:

### Categoria

Responsável por agrupar os tipos de produtos.

Exemplo:

```text
Parafusos
Porcas
Arruelas
Ferramentas
```

Relacionamento:

```text
1 Categoria → N Tipos
```

---

### Tipo

Representa um tipo específico de produto.

Exemplo:

```text
Sextavado
Philips
Allen
Rosca Máquina
```

Relacionamento:

```text
1 Tipo → N Produtos
```

---

### Produto

Contém as informações principais do produto.

Atributos:

```text
id
medida
preco
img_url
```

Relacionamento:

```text
1 Produto → 1 Estoque
```

---

### Estoque

Controla a quantidade disponível.

Atributos:

```text
id
quantidade
```

---

## Relacionamentos JPA

Implementados com:

```java
@OneToMany

@ManyToOne

@OneToOne

@JoinColumn

mappedBy
```

Exemplo:

```text
Categoria → Tipo → Produto → Estoque
```

---

## Funcionalidades

Atualmente a API possui:

* Cadastro de categorias
* Cadastro de tipos
* Cadastro de produtos
* Controle de estoque
* Busca personalizada com queries JPA
* CRUD completo para entidades

---

## Exemplo de Endpoint

Buscar produto por categoria, tipo e medida:

```http
GET /produtos/buscar
```

Exemplo:

```text
/parafusos/sextavado/30x30
```

---

## Como executar o projeto

Clone o repositório:

```bash
git clone https://github.com/gabriel-assiss/auto-atendimento-api.git
```

Entre na pasta:

```bash
cd auto-atendimento-api
```

Configure o banco de dados MySQL no arquivo:

```text
application.properties
```

Execute:

```bash
./mvnw spring-boot:run
```

---

## Aprendizados aplicados no projeto

Durante o desenvolvimento foram praticados conceitos como:

* Modelagem relacional
* API REST
* Hibernate ORM
* Relacionamentos entre entidades
* Queries customizadas com JPA
* Integração com banco MySQL
* Organização em camadas
* Versionamento com Git e GitHub

---

## Próximas melhorias

Planejado para evolução do projeto:

* DTOs
* Tratamento global de exceções
* Validações com Bean Validation
* Swagger/OpenAPI
* Spring Security com JWT
* Docker
* Testes unitários

---

## Autor

Gabriel Assis

Estudante de Ciência da Computação e Desenvolvimento de Sistemas
Focado em Backend Development, arquitetura de software e construção de sistemas confiáveis.
