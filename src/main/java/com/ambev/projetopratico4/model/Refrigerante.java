package com.ambev.projetopratico4.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Refrigerante")
public class Refrigerante extends Produto{

    private boolean comAcucar;

    public Refrigerante(String id, String nome, String descricao, double preco, boolean comAcucar){
        super(id, nome, descricao, preco);
        this.comAcucar = comAcucar;
    }

    public boolean isComAcucar() {
        return comAcucar;
    }

    public void setComAcucar(boolean comAcucar) {
        this.comAcucar = comAcucar;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + getId() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", preco=" + getPreco() +
                ", comAcucar=" + comAcucar +
                '}';
    }
}
