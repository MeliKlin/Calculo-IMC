package com.meli.exercicio.models;

import java.text.DecimalFormat;

public class Pessoa {
    private String id;
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa() {}

    public Pessoa(String id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String id, String nome, int idade, double peso, double altura) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    private double valorIMC() {
        return this.peso / Math.pow(this.altura, 2);
    }

    public int calcularIMC() {
        double imc = valorIMC();

        if (imc < 20) {
            return -1;
        } else if (imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean ehMaiorIdade() {
        return this.idade > 18;
    }

    public String toString() {
        return  "Identificador: " + this.id +
                "\nNome: " + this.nome +
                "\nIdade: " + this.idade +
                "\nPeso: " + this.peso +
                "\nAltura: " + this.altura +
                "\nIMC: " + new DecimalFormat("0.00").format(valorIMC()) +
                "\nMaior de idade: " + (ehMaiorIdade() ? "sim" : "nao");
    }
}
