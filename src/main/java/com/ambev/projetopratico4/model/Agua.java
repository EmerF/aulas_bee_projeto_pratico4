package com.ambev.projetopratico4.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "aguas")
public class Agua extends Produto {
    private boolean gaseificada;

    public Agua(String id, String nome, String descricao, double preco) {
        super(id, nome, descricao, preco);
    }

    public boolean isComGas() {
        return gaseificada;
    }

    public void setComGas(boolean comGas) {
        this.gaseificada = comGas;
    }
}