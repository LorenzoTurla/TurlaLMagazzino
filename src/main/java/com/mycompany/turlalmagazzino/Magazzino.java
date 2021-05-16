/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.turlalmagazzino;

/**
 *
 * @author STUDENTE
 */
public class Magazzino
{
    private int codiceIdentificativo;
    private String categoriaProdotto;
    private String nomeProdotto;
    private double costoProdotto;
    private final int maxDivano=10;

    public Magazzino(int codiceIdentificativo, String categoriaProdotto, String nomeProdotto, double costoProdotto) {
        this.codiceIdentificativo = codiceIdentificativo;
        this.categoriaProdotto = categoriaProdotto;
        this.nomeProdotto = nomeProdotto;
        this.costoProdotto = costoProdotto;
    }

    private void Magazzino(Magazzino m1){
        
        codiceIdentificativo= m1.getCodiceIdentificativo();
        
    }
    public int getCodiceIdentificativo() {
        return codiceIdentificativo;
    }

    public String getCategoriaProdotto() {
        return categoriaProdotto;
    }

    public String getNomeProdotto() {
        return nomeProdotto;
    }

    public double getCostoProdotto() {
        return costoProdotto;
    }

    public int getMaxDivano() {
        return maxDivano;
    }

    public void setCodiceIdentificativo(int codiceIdentificativo) {
        this.codiceIdentificativo = codiceIdentificativo;
    }

    public void setCategoriaProdotto(String categoriaProdotto) {
        this.categoriaProdotto = categoriaProdotto;
    }

    public void setNomeProdotto(String nomeProdotto) {
        this.nomeProdotto = nomeProdotto;
    }

    public void setCostoProdotto(double costoProdotto) {
        this.costoProdotto = costoProdotto;
    }
    
    public String toString()
    {
        
        String s="";
        
        System.out.println("");
        
        return s;
    }
    
    private void registraProdotto(){
        gnglkr=0
                
               for(i=0;cbuib<0;i++)}
    
    
        
    }
    
    
            
    
            
               
            
}
