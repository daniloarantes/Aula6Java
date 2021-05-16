/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daniloarantes.aula6java;

import javax.swing.JOptionPane;

/**
 *
 * @author Danilo Arantes <danilo at daniloarantes.com>
 */
public class Principal {

    public static void main(String[] args) {

        String n = JOptionPane.showInputDialog("Digite o nome");
        String t = JOptionPane.showInputDialog("Digite a turma");

        Aluno a = new Aluno(n, t);
        Aluno b = new Aluno();

        JOptionPane.showMessageDialog(null, a.exibeDados());

    }
}
