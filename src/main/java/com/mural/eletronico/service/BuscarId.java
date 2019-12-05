package com.mural.eletronico.service;

import com.mural.eletronico.domain.Produto;
import com.mural.eletronico.repository.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuscarId {

    @Autowired
    private Produtos produtos;

    public Produto buscarId(Long id) {
        return produtos.getOne(id);
    }
}
