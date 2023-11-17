package com.ambev.projetopratico4.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Produto {
    @Id
    private String id;
    private String descricao;
    private double preco;

    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
