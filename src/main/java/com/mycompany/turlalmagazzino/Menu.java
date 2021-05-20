/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.turlalmagazzino;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */

    public class Menu
{
  private String[] elencoVoci;
  private int numeroVoci;
  
  public Menu(String [] elencoVoci)
  {
      numeroVoci=elencoVoci.length;
      this.elencoVoci=new String[numeroVoci];
      for(int i=0;i<numeroVoci;i++)
      this.elencoVoci[i]=elencoVoci[i];

  }
  
  public void visualizzaMenu()
  {
      System.out.println("MENU: ");
      for(int i=0;i<numeroVoci;i++)
      {
          System.out.println(i+" --> "+elencoVoci[i]);
      }
      
      
  }
  
  public int sceltaMenu()
  {
       Scanner tastiera= new Scanner (System.in);
       String inputUtente;
       int sceltaUtente=0;
       boolean inputUtenteOk=true;
       
      do
      {
          visualizzaMenu();
          System.out.println("Scelta --> ");
          inputUtente=tastiera.nextLine();
       
       //verifico che l'input sia numerico
       for(int i=0;i<inputUtente.length();i++)
       {
             if(inputUtente.charAt(i)>='0' && inputUtente.charAt(i)<='9')
             i++;
             else
            {
             inputUtenteOk=false;
             break;
            }
       }
       
       //verifico che il numero sia valido (compreso fra 0 e numeroVoci-1
       if(inputUtenteOk)
       {
           sceltaUtente=Integer.parseInt(inputUtente);
           if (sceltaUtente<0 || sceltaUtente>numeroVoci-1)
               inputUtenteOk=false;
               
       }
       
       if(!inputUtenteOk)
       {
           System.out.println("il valore inserito non e' corretto. Premi invio ed inserisci nuovamenta la tua scelta"); 
           tastiera.nextLine();
       }
       
    }while(!inputUtenteOk);
      
     return sceltaUtente;
   
  }
  
  
  
 
  
  
  
}
    
