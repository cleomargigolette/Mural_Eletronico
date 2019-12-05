package com.mural.eletronico.service;

import com.mural.eletronico.domain.Produto;
import com.mural.eletronico.repository.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListarProdutos {

    @Autowired
    private Produtos produtos;

    public List<Produto> listar() {
        return produtos.findAll();
    }
}
