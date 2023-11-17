package com.ambev.projetopratico4.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "refrigerantes")
public class Refrigerante extends Produto{
    private boolean ComAcucar;

    public boolean isComAcucar() {
        return ComAcucar;
    }

    public void setComAcucar(boolean comAcucar) {
        ComAcucar = comAcucar;
    }
}
