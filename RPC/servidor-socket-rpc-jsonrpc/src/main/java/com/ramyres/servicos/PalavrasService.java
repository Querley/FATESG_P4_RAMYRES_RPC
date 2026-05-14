package com.ramyres.servicos;

public class PalavrasService implements ServiceInterface {

    private boolean isVogal(char c) {
        return "aeiouAEIOU".indexOf(c) >= 0;
    }

    private boolean isVogalAcentuada(char c) {
        return "áéíóúàèìòùâêîôûãõÁÉÍÓÚÀÈÌÒÙÂÊÎÔÛÃÕ".indexOf(c) >= 0;
    }

    @Override
    public String[] Run(String[] params) {

        if (params.length != 1) {
            throw new IllegalArgumentException("Texto inválido");
        }

        String texto = params[0];

        int qtdLetras = 0;
        int qtdPalavras = 0;
        int qtdVogal = 0;
        int qtdVogalAcentuada = 0;
        int qtdConsoantes = 0;
        int qtdEspacos = 0;
        int qtdPalavrasPar = 0;
        int qtdPalavrasImpar = 0;
        int qtdDeLinhas = 1;

        for (char c : texto.toCharArray()) {

            if (Character.isLetter(c)) {

                qtdLetras++;

                if (isVogal(c)) {
                    qtdVogal++;
                } else if (isVogalAcentuada(c)) {
                    qtdVogalAcentuada++;
                } else {
                    qtdConsoantes++;
                }
            }

            if (c == ' ') {
                qtdEspacos++;
            }

            if (c == '\n') {
                qtdDeLinhas++;
            }
        }

        String[] palavras = texto.trim().split("\\s+");

        qtdPalavras = palavras.length;

        for (String palavra : palavras) {

            int tamanho = palavra.replaceAll("[^a-zA-ZÀ-ÿ]", "").length();

            if (tamanho % 2 == 0) {
                qtdPalavrasPar++;
            } else {
                qtdPalavrasImpar++;
            }
        }

        return new String[] {
                String.valueOf(qtdLetras),
                String.valueOf(qtdPalavras),
                String.valueOf(qtdVogal),
                String.valueOf(qtdVogalAcentuada),
                String.valueOf(qtdConsoantes),
                String.valueOf(qtdEspacos),
                String.valueOf(qtdPalavrasPar),
                String.valueOf(qtdPalavrasImpar),
                String.valueOf(qtdDeLinhas)
        };
    }
}
