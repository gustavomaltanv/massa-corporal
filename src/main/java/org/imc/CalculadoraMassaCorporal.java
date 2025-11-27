package org.imc;

import java.util.List;

public class CalculadoraMassaCorporal {

    private Pessoa pessoa;

    public CalculadoraMassaCorporal(Pessoa pessoa) {
        if (pessoa == null) {
            throw new IllegalArgumentException("Pessoa não pode ser nula");
        }
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    private static final List<Double> INDICES_MASCULINO = List.of(20.7, 26.4, 27.8, 31.1);
    private static final List<Double> INDICES_FEMININO = List.of(19.1, 25.8, 27.3, 32.3);

    private double calcularImc() {
        return this.pessoa.getPeso() / (this.pessoa.getAltura() * this.pessoa.getAltura());
    }

    public String obterResultadoImc() {
        var imc = calcularImc();
        var genero = this.pessoa.getGenero().toLowerCase();

        List<Double> indicesImc;
        if ("masculino".equals(genero)) {
            indicesImc = INDICES_MASCULINO;
        } else if ("feminino".equals(genero)) {
            indicesImc = INDICES_FEMININO;
        } else {
            throw new IllegalArgumentException("Gênero inválido: " + pessoa.getGenero());
        }

        if (imc < indicesImc.get(0)) {
            return "Abaixo do peso.";
        } else if (imc < indicesImc.get(1)) {
            return "Peso normal.";
        } else if (imc < indicesImc.get(2)) {
            return "Marginalmente acima do peso.";
        } else if (imc < indicesImc.get(3)) {
            return "Acima do peso.";
        } else {
            return "Obesidade.";
        }
    }
}
