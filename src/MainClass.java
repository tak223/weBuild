
import edu.esprit.entities.Stock;
import edu.esprit.services.StockCrud;
import edu.esprit.utils.MyConnection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package edu.esprit.tests;


import edu.esprit.services.StockCrud;
import edu.esprit.utils.MyConnection;

/**
 *
 * @author user
 */
public class MainClass {
    public static void main(String[] args){
        
     MyConnection mc = new MyConnection();
    StockCrud Scd = new StockCrud();
    Stock s = new Stock("algesic",5,"image",8);
    //Scd.ajouterStock();
   // System.out.println(Scd.afficherStock());
    Scd.modifierStock(s,4);
    
    
    //Scd.delete(1);
    }
    
}
