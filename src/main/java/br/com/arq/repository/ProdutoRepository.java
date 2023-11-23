package br.com.arq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.arq.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
