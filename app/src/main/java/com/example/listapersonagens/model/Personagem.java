package com.example.listapersonagens.model;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Personagem implements Serializable {
    //Variaveis para guardar a informação de nome, altura e nascimento para manipulação do get e set
    private String nome;
    private String altura;
    private String nascimento;
    private int id = 0;

    //Metodo para coletar as informações do personagem
    public Personagem(String nome, String altura, String nascimento) {
        this.nome = nome;
        this.altura = altura;
        this.nascimento = nascimento;
    }

    public Personagem() {

    }

    //Metodo para retornar o nome guardado
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Metodo para retornar o altura guardado
    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    //Metodo para retornar o nascimento guardado
    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    //Metodo para exibir o nome do personagem (String)
    @NonNull
    @Override
    public String toString() {
        return nome;
    }

    //metodo para setar o id do item
    public void setId(int id) {
        this.id = id;
    }

    //Metodo para receber o valor do id
    public int getId() {
        return id;
    }

    public boolean IdValido() {
        return id > 0;
    }
}
