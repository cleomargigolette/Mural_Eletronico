package com.mural.eletronico.service;

import com.mural.eletronico.domain.Produto;
import com.mural.eletronico.repository.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdicionarProduto {

    @Autowired
    private Produtos produtos;

    public Produto adicionar(Produto produto) {
        return produtos.save(produto);
    }
}
