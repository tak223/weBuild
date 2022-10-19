
import edu.esprit.entities.Facture_Ph;
import edu.esprit.entities.Stock;
import edu.esprit.entities.commande;
import edu.esprit.services.FactureCrud;
import edu.esprit.services.StockCrud;
import edu.esprit.services.commandeCrud;
import edu.esprit.utils.MyConnection;
import java.util.List;

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
    //StockCrud Scd = new StockCrud();
    //Stock s = new Stock("algesic",5,"image",8);
    //commandeCrud Ccd = new commandeCrud();
    //commande c = new commande("SPASFON",6,30,"Image_SPASFON");
    
    FactureCrud Fcd = new FactureCrud();
    Facture_Ph F = new Facture_Ph(4004);
    
    
    //Fcd.ajouterFacture();
    
    //Ccd.ajouterCommande();
    
   // System.out.println(Scd.afficherStock());
   
    //System.out.println(Ccd.afficherCommande());
    
    //System.out.println(Fcd.afficherFacture());
    
    
   
    //Scd.modifierStock(s,4);
    
    //Ccd.modifierCommande(c,4);
    
    //Fcd.modifierFacture(F,4);
    
    
    
    //List list= Scd.FindById(2);
    //System.out.println(list);
    
    //List list= Ccd.FindCommandeById(7);
    //System.out.println(list);
    
    //List list= Fcd.FindFactureById(7);
    //System.out.println(list);
    
    //Scd.delete(1);
    //Ccd.deleteCommande(1);
    Fcd.deleteFacture(10);
    }
    
}
