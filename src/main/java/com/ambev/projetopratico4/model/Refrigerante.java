package com.ambev.projetopratico4.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "refrigerante")
public class Refrigerante extends Produto {

    private boolean comAcucar;

    public boolean isComAcucar() {
        return comAcucar;
    }

    public void setComAcucar(boolean comAcucar) {
        this.comAcucar = comAcucar;
    }
}
