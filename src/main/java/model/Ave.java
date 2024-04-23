/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author joao
 */
public class Ave implements Animal {
    private String especie;
    private int idade;
    private static final String tipo = "Ovíparo";

    public Ave() {
        this("",0);
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Ave(String especie, int idade) {
        this.especie = especie;
        this.idade = idade;
    }
    
    @Override
    public void produzirSom(){
        JOptionPane.showMessageDialog(null, "Cantar");
    }
    @Override
    public void mover(){
        JOptionPane.showMessageDialog(null, "Voar");
}
}
