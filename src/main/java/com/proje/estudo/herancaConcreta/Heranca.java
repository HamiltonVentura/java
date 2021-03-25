/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proje.estudo.herancaConcreta;

/**
 *
 * @author operador
 */
public class Heranca {
    
    private double peso;
    private String grupo;
    
    public Heranca(){
        super(); //seta como null os atributos 
        System.out.println("construtor Heranca");
    }
    
     public Heranca(double peso, String grupo) {
        super();
        this.peso = peso;
        this.grupo = grupo;        
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
}
