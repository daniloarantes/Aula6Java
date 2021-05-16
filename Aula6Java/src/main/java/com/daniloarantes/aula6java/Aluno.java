/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daniloarantes.aula6java;

/**
 *
 * @author Danilo Arantes <danilo at daniloarantes.com>
 */
public class Aluno {

    private String nome;
    private String turma;

    // Método Construtor
    public Aluno(){
        
    }   
    
    public Aluno(String nome, String turma) {
        this.nome = nome;
        this.turma = turma;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return "Olá " + nome;
    }

    /**
     * @return the turma
     */
    public String getTurma() {
        return "Você é aluno da turma " + turma;
    }
    
    public String exibeDados(){
        String dados = "";
        
        dados += nome + "\n";
        dados += turma + "\n";
        
        // dados = dados + nome
        // dados = dados + turma
        
        // dados = nome + "\" + turma "\n"
        
        return dados;
    }

}
