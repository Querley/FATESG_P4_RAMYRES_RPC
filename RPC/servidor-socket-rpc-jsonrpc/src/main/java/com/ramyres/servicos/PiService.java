package com.ramyres.servicos;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class PiService implements ServiceInterface {

    private BigDecimal calcularPi(int casas) {

        BigDecimal pi = BigDecimal.ZERO;
        BigDecimal quatro = new BigDecimal("4");

        int iteracoes = casas * 100;

        for (int i = 0; i < iteracoes; i++) {

            BigDecimal numerador = (i % 2 == 0)
                    ? quatro
                    : quatro.negate();

            BigDecimal denominador = new BigDecimal((2 * i) + 1);

            BigDecimal termo = numerador.divide(
                    denominador,
                    new MathContext(casas + 5, RoundingMode.HALF_UP));

            pi = pi.add(termo);
        }

        return pi.setScale(casas, RoundingMode.HALF_UP);
    }

    @Override
    public String[] Run(String[] params) {

        if (params.length != 1) {
            throw new IllegalArgumentException("Quantidade de casas inválida");
        }

        int casas = Integer.parseInt(params[0]);

        BigDecimal resultado = calcularPi(casas);

        return new String[] { resultado.toString() };
    }
}
