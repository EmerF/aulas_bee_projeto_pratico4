package Model;

import org.springframework.data.mongodb.core.mapping.Document;

public class Refrigerante extends Produto {
    private boolean temAcucar;

    public Refrigerante(String id, String nome, String descricao, double preco, boolean temAcucar) {
        super(id, nome, descricao, preco);
        this.temAcucar = temAcucar;
    }

    public boolean isTemAcucar() {
        return temAcucar;
    }

    public void setTemAcucar(boolean temAcucar) {
        this.temAcucar = temAcucar;
    }


    @Override
    public String toString() {
        return "{" +
                "id='" + getId() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", preco=" + getPreco() +
                ", temAcucar=" + temAcucar +
                '}';
    }
}