/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.services;

import edu.esprit.entities.commande;
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
//////////////////AJOUTE COMMANDE///////////////////

public class commandeCrud {
     public void ajouterCommande(){
        try {
            String requete="INSERT INTO commande_st (Nom_Prod,Quantite,Prix,Image) "
                    + "VALUES ('Panadollll',5,40,'Image_Panadolll'  ) ";
            Statement st = new MyConnection().getCnx().createStatement();
             st.executeUpdate(requete);
             System.out.println("Commande ajoutée avec succès");
        } catch (SQLException ex) {
           System.err.println(ex.getMessage());
        }
        
    
}
     //////////////////SUPPRIMER COMMANDE///////////////////
     
     public void deleteCommande(int id) {
        String requete3 = "DELETE FROM `commande_st`  WHERE Id_comd= '" + id + "'";
            List<commande> list =new ArrayList<>();
        try {
            Statement st = new MyConnection().getCnx().createStatement();
               st.executeUpdate(requete3);
           
                 System.out.println(" Commande supprimer avec succès");
           
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
}
     
     //////////////////RECHERCHE COMMANDE///////////////////
     
      private ResultSet rs;
      
     public List FindCommandeById(int id) {
        List<commande> list = new ArrayList<>();
        String requette5 = "SELECT  `Nom_Prod`,`Quantite`, `Prix`, `Image` From `commande_st` WHERE Id_comd= '" + id + "' ";

        try {
            Statement st = new MyConnection().getCnx().createStatement();
            rs = st.executeQuery(requette5);
            while (rs.next()) {
                commande c = new commande(rs.getString("Nom_Prod"), rs.getInt("Quantite"), rs.getInt("Prix"), rs.getString("Image"));
                list.add(c);
            }
            System.out.println("!!!!!!!Commande trouvée avec succées!!!!!!!");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return list;
    } 
     
     //////////////////AFFICHER COMMANDE///////////////////
     
     public List<commande> afficherCommande(){
    List<commande> myList = new ArrayList<>();
    
        try {
            
            String requete3 = "SELECT * FROM commande_st";
            Statement st = new MyConnection().getCnx().createStatement();
            ResultSet rs = st.executeQuery(requete3);
            while(rs.next()){
                commande c =new commande();
                c.setId_comd(rs.getInt(1));
                c.setNom_Prod("Nom_Prod");
                c.setQuantite(rs.getInt(3));
                c.setPrix(rs.getInt(4));
                c.setImage("Image");
                
              
                
                myList.add(c);
            }
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
           
        }
        return myList;
        
}
     
     //////////////////MODIFIER COMMANDE///////////////////
     
     public void modifierCommande(commande com, int id_comd){
       String requete4 = "UPDATE `commande_st` SET `Nom_Prod`='" + com.getNom_Prod() + "'," + "`Quantite`='" + com.getQuantite() + "',`Prix`='" + com.getPrix() +  "' WHERE   Id_comd = '" + id_comd + "'  ";
        try {
             
            PreparedStatement pst = new MyConnection().getCnx().prepareStatement(requete4);
            pst.executeUpdate(requete4);
            System.out.println("!!!!Commande modifie!!!!");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        
     }
 
}
