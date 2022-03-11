package com.meli.exercicio;

import com.meli.exercicio.models.Pessoa;

public class Main {

    public static void main(String[] args) {
        Pessoa klin = new Pessoa();
        Pessoa klinton = new Pessoa("99c2a2c2-d68d-4c74-9322-37ea362184c9", "klinton", 29);
        Pessoa johnDoe = new Pessoa("c92eed6c-b6ff-467c-903d-d13601a02986", "john doe", 25, 72.5, 1.75);

        System.out.println(johnDoe.toString());
    }

}
