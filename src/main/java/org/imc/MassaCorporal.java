package org.imc;

import java.util.List;

enum Genero {
    MASCULINO,
    FEMININO
}

public class MassaCorporal {

    private static final List<Double> INDICES_MASCULINO = List.of(20.7, 26.4, 27.8, 31.1);
    private static final List<Double> INDICES_FEMININO = List.of(19.1, 25.8, 27.3, 32.3);

    private static double calcularImc(double altura, double peso) {
        return peso / (altura * altura);
    }

    public static String obterResultadoImc(double altura, double peso, Genero genero) {
        var imc = calcularImc(altura, peso);
        List<Double> indicesImc =
                (genero == Genero.MASCULINO) ? INDICES_MASCULINO
                : INDICES_FEMININO;

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




