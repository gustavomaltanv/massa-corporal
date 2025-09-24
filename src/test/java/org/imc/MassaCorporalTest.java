package org.imc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.imc.MassaCorporal.obterResultadoImc;

class MassaCorporalTest {
    private static final double ALTURA = 1.70;

    // region MASCULINO
    @Test
    @DisplayName("Teste: Masculino - Abaixo do peso")
    void deveSerAbaixoDoPesoMasculino() {
        double peso = 20.69 * (ALTURA * ALTURA);
        Assertions.assertEquals("Abaixo do peso.", obterResultadoImc(ALTURA, peso, Genero.MASCULINO));
    }

    @Test
    @DisplayName("Teste: Masculino - Peso normal")
    void deveSerPesoNormalMasculino() {
        double peso = 20.7 * (ALTURA * ALTURA);
        Assertions.assertEquals("Peso normal.", obterResultadoImc(ALTURA, peso, Genero.MASCULINO));
    }

    @Test
    @DisplayName("Teste: Masculino - Marginalmente acima do peso")
    void deveSerMarginalmenteAcimaDoPesoMasculino() {
        double peso = 26.4 * (ALTURA * ALTURA);
        Assertions.assertEquals("Marginalmente acima do peso.", obterResultadoImc(ALTURA, peso, Genero.MASCULINO));
    }

    @Test
    @DisplayName("Teste: Masculino - Acima do peso")
    void deveSerAcimaDoPesoMasculino() {
        double peso = 27.8 * (ALTURA * ALTURA);
        Assertions.assertEquals("Acima do peso.", obterResultadoImc(ALTURA, peso, Genero.MASCULINO));
    }

    @Test
    @DisplayName("Teste: Masculino - Obesidade")
    void deveSerObesidadeMasculino() {
        double peso = 31.1 * (ALTURA * ALTURA);
        Assertions.assertEquals("Obesidade.", obterResultadoImc(ALTURA, peso, Genero.MASCULINO));
    }
    //endregion

    // region FEMININO
    @Test
    @DisplayName("Teste: Feminino - Abaixo do peso")
    void deveSerAbaixoDoPesoFeminino() {
        double peso = 19.09 * (ALTURA * ALTURA);
        Assertions.assertEquals("Abaixo do peso.", obterResultadoImc(ALTURA, peso, Genero.FEMININO));
    }

    @Test
    @DisplayName("Teste: Feminino - Peso normal")
    void deveSerPesoNormalFeminino() {
        double peso = 19.1 * (ALTURA * ALTURA);
        Assertions.assertEquals("Peso normal.", obterResultadoImc(ALTURA, peso, Genero.FEMININO));
    }

    @Test
    @DisplayName("Teste: Feminino - Marginalmente acima do peso")
    void deveSerMarginalmenteAcimaDoPesoFeminino() {
        double peso = 25.8 * (ALTURA * ALTURA);
        Assertions.assertEquals("Marginalmente acima do peso.", obterResultadoImc(ALTURA, peso, Genero.FEMININO));
    }

    @Test
    @DisplayName("Teste: Feminino - Acima do peso")
    void deveSerAcimaDoPesoFeminino() {
        double peso = 27.3 * (ALTURA * ALTURA);
        Assertions.assertEquals("Acima do peso.", obterResultadoImc(ALTURA, peso, Genero.FEMININO));
    }

    @Test
    @DisplayName("Teste: Feminino - Obesidade")
    void deveSerObesidadeFeminino() {
        double peso = 32.3 * (ALTURA * ALTURA);
        Assertions.assertEquals("Obesidade.", obterResultadoImc(ALTURA, peso, Genero.FEMININO));
    }
    // endregion
}