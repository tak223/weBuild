/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.services;

import edu.esprit.entities.Facture_Ph;
import edu.esprit.utils.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class FactureCrud {
    
    //////////////////AJOUTER FACTURE///////////////////
    
     public void ajouterFacture(){
        try {
            String requete="INSERT INTO Facture_Ph (Id_Phar,Somme_Prix) "
                    + "VALUES (1,199) ";
            Statement st = new MyConnection().getCnx().createStatement();
             st.executeUpdate(requete);
             System.out.println("Facture ajoutée avec succès");
        } catch (SQLException ex) {
           System.err.println(ex.getMessage());
        }
        
    
}
     //////////////////SUPPRIMER FACTURE///////////////////
     
     public void deleteFacture(int id) {
        String requete3 = "DELETE FROM `Facture_Ph`  WHERE Id_fact= '" + id + "'";
            List<Facture_Ph> list =new ArrayList<>();
        try {
            Statement st = new MyConnection().getCnx().createStatement();
               st.executeUpdate(requete3);
           
                 System.out.println(" Facture supprimer avec succès!!!!!");
           
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
}
     
     //////////////////RECHERCHE FACTURE///////////////////
     
      private ResultSet rs;
      
     public List FindFactureById(int id) {
        List<Facture_Ph> list = new ArrayList<>();
        String requette5 = "SELECT `Id_Phar`, `Somme_Prix`From `Facture_Ph` WHERE Id_fact= '" + id + "' ";

        try {
            Statement st = new MyConnection().getCnx().createStatement();
            rs = st.executeQuery(requette5);
            while (rs.next()) {
                Facture_Ph F = new Facture_Ph( rs.getInt("Somme_Prix"));
                list.add(F);
            }
            System.out.println("Facture trouvée avec succées!!!!!!!");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return list;
    } 
     
     //////////////////AFFICHER COMMANDE///////////////////
     
     public List<Facture_Ph> afficherFacture(){
    List<Facture_Ph> myList = new ArrayList<>();
    
        try {
            
            String requete3 = "SELECT * FROM Facture_Ph";
            Statement st = new MyConnection().getCnx().createStatement();
            ResultSet rs = st.executeQuery(requete3);
            while(rs.next()){
                Facture_Ph F =new Facture_Ph();
                F.setSomme_Prix(rs.getInt(3));
                
                myList.add(F);
            }
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
           
        }
        return myList;
        
}
     
     //////////////////MODIFIER Facture///////////////////
     
     public void modifierFacture(Facture_Ph Fact, int Id_fact){
       String requete4 = "UPDATE `Facture_Ph` SET `Somme_Prix`='" + Fact.getSomme_Prix()  +  "' WHERE   Id_fact = '" + Id_fact + "'  ";
        try {
             
            PreparedStatement pst = new MyConnection().getCnx().prepareStatement(requete4);
            pst.executeUpdate(requete4);
            System.out.println("!!!!Commande modifie avec succès!!!!");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        
     }
 
    
}
