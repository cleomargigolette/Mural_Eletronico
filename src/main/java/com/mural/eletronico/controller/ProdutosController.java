package com.mural.eletronico.controller;

import com.mural.eletronico.domain.Produto;
import com.mural.eletronico.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {

    @Autowired
    private ListarProdutos listarProdutos;

    @Autowired
    private AdicionarProduto adicionarProduto;

    @Autowired
    private BuscarId buscarId;

    @Autowired
    private EditarProduto editarProduto;

    @Autowired
    private DeletarProduto deletarProduto;

    @PostMapping
    public Produto adicionar(@Valid @RequestBody Produto produto) {

        return adicionarProduto.adicionar(produto);
    }

    @GetMapping
    public List<Produto> listar() {
        return listarProdutos.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscar(@PathVariable Long id) {
        Produto produto = buscarId.buscarId(id);

        if (produto == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(produto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizar(@PathVariable Long id,
                                             @Valid @RequestBody Produto produto) {
        Produto existente = editarProduto.editarProduto(id);

        return ResponseEntity.ok(existente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {

        deletarProduto.deletarProduto(id);

        return ResponseEntity.noContent().build();
    }
}