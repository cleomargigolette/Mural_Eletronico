package com.mural.eletronico.repository;

import com.mural.eletronico.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Long> {

}
