package org.imc;

public class Pessoa {

    private double altura;
    private double peso;
    private String genero;

    public Pessoa(double altura, double peso, String genero) {
        setAltura(altura);
        setPeso(peso);
        setGenero(genero);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw  new IllegalArgumentException("Altura deve ser positivo");
        }
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw  new IllegalArgumentException("Altura deve ser positivo");
        }
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if ("masculino".equalsIgnoreCase(genero) || "feminino".equalsIgnoreCase(genero)) {
            this.genero = genero;
        } else {
            throw new IllegalArgumentException("Gênero inválido: " + genero);
        }
    }
}
