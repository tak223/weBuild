/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.services;

import edu.esprit.entities.commande;
import edu.esprit.utils.MyConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class commandeCrud {
     public void ajouterCommande(){
        try {
            String requete="INSERT INTO commande (Nom_Prod,Quantite,Prix,Image) "
                    + "VALUES ('EFFERALGAN',3,10,'Image_EFFERALGAN'  ) ";
            Statement st = new MyConnection().getCnx().createStatement();
             st.executeUpdate(requete);
             System.out.println("Commande ajoutée avec succès");
        } catch (SQLException ex) {
           System.err.println(ex.getMessage());
        }
        
    
}
     public void deleteCommande(int id) {
        String requete3 = "DELETE FROM `commande`  WHERE Id_comd= '" + id + "'";
            List<commande> list =new ArrayList<>();
        try {
            Statement st = new MyConnection().getCnx().createStatement();
               st.executeUpdate(requete3);
           
                 System.out.println(" Commande supprimer avec succès");
           
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
}
     
      private ResultSet rs;
      
     public List FindCommandeById(int id) {
        List<commande> list = new ArrayList<>();
        String requette5 = "SELECT  `Nom_Prod`,`Quantite`, `Prix`, `Image` From `commande` WHERE Id_comd= '" + id + "' ";

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
}
