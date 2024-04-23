/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JOptionPane;

    
public class Cachorro implements Animal {
    private String raca;
    private int idade;
    private static final String tipo = "mamifero";
    
    public Cachorro() {
        this("",0);
    }
    public Cachorro(String raca, int idade) {
        this.raca = raca;
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override
    public void produzirSom(){
        JOptionPane.showMessageDialog(null, "Latir");
    }
    @Override
    public void mover(){
        JOptionPane.showMessageDialog(null, "Andar");
    }
}
