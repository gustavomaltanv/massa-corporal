package org.imc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PessoaTest {

    @Test
    void alturaZeroDeveLancar() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Pessoa(0, 70, "masculino"));
    }

    @Test
    void alturaNegativaDeveLancar() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Pessoa(-0.1, 70, "masculino"));
    }

    @Test
    void alturaMinimaAceita() {
        double altura = 1e-9;
        Pessoa p = new Pessoa(altura, 70, "feminino");
        Assertions.assertEquals(altura, p.getAltura(), 1e-15);
    }

    @Test
    void pesoZeroDeveLancar() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Pessoa(1.7, 0, "masculino"));
    }

    @Test
    void pesoNegativoDeveLancar() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Pessoa(1.7, -0.5, "masculino"));
    }

    @Test
    void pesoMinimoAceito() {
        double peso = 1e-9;
        Pessoa p = new Pessoa(1.7, peso, "feminino");
        Assertions.assertEquals(peso, p.getPeso(), 1e-15);
    }

    @Test
    void generoMasculinoAceito() {
        Pessoa p = new Pessoa(1.7, 70, "masculino");
        Assertions.assertEquals("masculino", p.getGenero());
    }

    @Test
    void generoMaiusculasAceito() {
        Pessoa p = new Pessoa(1.7, 70, "MASCULINO");
        Assertions.assertEquals("MASCULINO", p.getGenero());
    }

    @Test
    void generoInvalidoDeveLancar() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Pessoa(1.7, 70, "outro"));
    }

    @Test
    void generoVazioDeveLancar() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Pessoa(1.7, 70, ""));
    }
}