/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proje.estudo.herancaConcreta;

/**
 *
 * @hamitlon
 */
public class Imoveis extends Heranca {
    private String tipo;
    private Double valor;
    
  
    public Imoveis(){
        super(23, "casa"); //usa os atributos da classe mãe, ja setados como null 
        System.out.println("Construtor Imoveis");
    }
    
     public Imoveis(String tipo, Double valor){
        super(); //usa os atributos da classe mãe, ja setados como null 
        System.out.println("Construtor Imoveis");
        this.tipo = tipo;
        this.valor = valor;        
        super.setPeso(23);
        super.setGrupo("familia");
    }
    
    public static void main(String[] args){
        Imoveis imovel = new Imoveis("casas",34.45);
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Exemplo de heranca:( "+imovel.getGrupo()+") tipo : ("+imovel.getTipo()+") valor: ("+imovel.getValor()+")");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------");        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
}
