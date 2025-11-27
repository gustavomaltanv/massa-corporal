package org.imc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CalculadoraMassaCorporalTest {
    private static final double ALTURA = 1.70;

    @Mock
    Pessoa pessoa;

    @InjectMocks
    CalculadoraMassaCorporal calculadoraMassaCorporal;

    @Test
    void deveSerAbaixoDoPesoMasculino() {
        when(pessoa.getAltura()).thenReturn(ALTURA);
        double peso = 20.69 * (ALTURA * ALTURA);
        when(pessoa.getPeso()).thenReturn(peso);
        when(pessoa.getGenero()).thenReturn("masculino");
        Assertions.assertEquals("Abaixo do peso.", calculadoraMassaCorporal.obterResultadoImc());
    }

    @Test
    void deveSerPesoNormalMasculino() {
        when(pessoa.getAltura()).thenReturn(ALTURA);
        double peso = 20.7 * (ALTURA * ALTURA);
        when(pessoa.getPeso()).thenReturn(peso);
        when(pessoa.getGenero()).thenReturn("masculino");
        Assertions.assertEquals("Peso normal.", calculadoraMassaCorporal.obterResultadoImc());
    }

    @Test
    void deveSerMarginalmenteAcimaDoPesoMasculino() {
        when(pessoa.getAltura()).thenReturn(ALTURA);
        double peso = 26.4 * (ALTURA * ALTURA);
        when(pessoa.getPeso()).thenReturn(peso);
        when(pessoa.getGenero()).thenReturn("masculino");
        Assertions.assertEquals("Marginalmente acima do peso.", calculadoraMassaCorporal.obterResultadoImc());
    }

    @Test
    void deveSerAcimaDoPesoMasculino() {
        when(pessoa.getAltura()).thenReturn(ALTURA);
        double peso = 27.8 * (ALTURA * ALTURA);
        when(pessoa.getPeso()).thenReturn(peso);
        when(pessoa.getGenero()).thenReturn("masculino");
        Assertions.assertEquals("Acima do peso.", calculadoraMassaCorporal.obterResultadoImc());
    }

    @Test
    void deveSerObesidadeMasculino() {
        when(pessoa.getAltura()).thenReturn(ALTURA);
        double peso = 31.1 * (ALTURA * ALTURA);
        when(pessoa.getPeso()).thenReturn(peso);
        when(pessoa.getGenero()).thenReturn("masculino");
        Assertions.assertEquals("Obesidade.", calculadoraMassaCorporal.obterResultadoImc());
    }

    @Test
    void deveSerAbaixoDoPesoFeminino() {
        when(pessoa.getAltura()).thenReturn(ALTURA);
        double peso = 19.09 * (ALTURA * ALTURA);
        when(pessoa.getPeso()).thenReturn(peso);
        when(pessoa.getGenero()).thenReturn("feminino");
        Assertions.assertEquals("Abaixo do peso.", calculadoraMassaCorporal.obterResultadoImc());
    }

    @Test
    void deveSerPesoNormalFeminino() {
        when(pessoa.getAltura()).thenReturn(ALTURA);
        double peso = 19.1 * (ALTURA * ALTURA);
        when(pessoa.getPeso()).thenReturn(peso);
        when(pessoa.getGenero()).thenReturn("feminino");
        Assertions.assertEquals("Peso normal.", calculadoraMassaCorporal.obterResultadoImc());
    }

    @Test
    void deveSerMarginalmenteAcimaDoPesoFeminino() {
        when(pessoa.getAltura()).thenReturn(ALTURA);
        double peso = 25.8 * (ALTURA * ALTURA);
        when(pessoa.getPeso()).thenReturn(peso);
        when(pessoa.getGenero()).thenReturn("feminino");
        Assertions.assertEquals("Marginalmente acima do peso.", calculadoraMassaCorporal.obterResultadoImc());
    }

    @Test
    void deveSerAcimaDoPesoFeminino() {
        when(pessoa.getAltura()).thenReturn(ALTURA);
        double peso = 27.3 * (ALTURA * ALTURA);
        when(pessoa.getPeso()).thenReturn(peso);
        when(pessoa.getGenero()).thenReturn("feminino");
        Assertions.assertEquals("Acima do peso.", calculadoraMassaCorporal.obterResultadoImc());
    }

    @Test
    void deveSerObesidadeFeminino() {
        when(pessoa.getAltura()).thenReturn(ALTURA);
        double peso = 32.3 * (ALTURA * ALTURA);
        when(pessoa.getPeso()).thenReturn(peso);
        when(pessoa.getGenero()).thenReturn("feminino");
        Assertions.assertEquals("Obesidade.", calculadoraMassaCorporal.obterResultadoImc());
    }
}