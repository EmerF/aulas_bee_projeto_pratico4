package Model;

import org.springframework.data.mongodb.core.mapping.Document;

public class Agua extends Produto{

    private boolean comGas;

    public Agua(String id, String nome, String descricao, double preco, boolean comGas) {
        super(id, nome, descricao, preco);
        this.comGas = comGas;
    }

    public boolean isComGas() {
        return comGas;
    }

    public void setComGas(boolean comGas) {
        this.comGas = comGas;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + getId() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", preco=" + getPreco() +
                ", comGas=" + comGas +
                '}';
    }
}