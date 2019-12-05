package com.mural.eletronico.service;

import com.mural.eletronico.domain.Produto;
import com.mural.eletronico.repository.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeletarProduto {

    @Autowired
    private Produtos produtos;

    @Autowired
    private BuscarId buscarId;

    public String deletarProduto(Long id) {
        Produto produto = buscarId.buscarId(id);

        if (produto == null) {
            return "produto não encontrado";
        }

        produtos.delete(produto);

        return "Produto deletado";
    }
}
