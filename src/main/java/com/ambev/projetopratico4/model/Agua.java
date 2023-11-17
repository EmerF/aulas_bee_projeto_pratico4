package com.ambev.projetopratico4.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "aguas")
public class Agua extends Produto{
    private boolean comGas;

    public boolean isComGas() {
        return comGas;
    }

    public void setComGas(boolean comGas) {
        this.comGas = comGas;
    }
}
