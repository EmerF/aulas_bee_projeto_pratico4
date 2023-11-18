package model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "refrigerante")
public class Refrigerante extends Produto {

    private boolean temAcucar;

    public boolean isTemAcucar() {
        return temAcucar;
    }

    public void setTemAcucar(boolean temAcucar) {
        this.temAcucar = temAcucar;
    }
}