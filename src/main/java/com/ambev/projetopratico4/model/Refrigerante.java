package com.ambev.projetopratico4.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "refrigerantes")
public class Refrigerante extends Produto {
    private boolean light;


    public Refrigerante(String id, String nome, String descricao, double preco) {
        super(id, nome, descricao, preco);
    }

    public boolean isComAcucar() {
        return light;
    }

    public void setComAcucar(boolean comAcucar) {
        this.light = comAcucar;
    }
}