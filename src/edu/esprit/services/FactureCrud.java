/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.services;

import edu.esprit.entities.Facture_Ph;
import edu.esprit.entities.pharmacien;
import edu.esprit.entities.produit;
import edu.esprit.utils.CurrentData;
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
            String requete="INSERT INTO Facture_Ph (Id_Phar,Somme_Prix,Id_ProdS) "
                    + "VALUES (1,500,3) ";
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
        String requette5 = "SELECT `Id_Phar`, `Somme_Prix` ,`Id_ProdS`  From `Facture_Ph` WHERE Id_fact= '" + id + "' ";

        try {
            Statement st = new MyConnection().getCnx().createStatement();
            rs = st.executeQuery(requette5);
            while (rs.next()) {
                Facture_Ph F = new Facture_Ph(rs.getInt("Id_Phar"), rs.getInt("Somme_Prix"), rs.getInt("Id_ProdS"));
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
                F.setId_ProdS(rs.getInt(3));
                
                myList.add(F);
            }
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
           
        }
        return myList;
        
}
     
     //////////////////MODIFIER Facture///////////////////
     
     public void modifierFacture(Facture_Ph Fact, int Id_fact){
       String requete4 = "UPDATE `Facture_Ph` SET `Somme_Prix`='" + Fact.getSomme_Prix() + "'," + "`Id_ProdS`='" + Fact.getId_ProdS() +  "' WHERE   Id_fact = '" + Id_fact + "'  ";
        try {
             
            PreparedStatement pst = new MyConnection().getCnx().prepareStatement(requete4);
            pst.executeUpdate(requete4);
            System.out.println("!!!!Commande modifie avec succès!!!!");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        
     }
     
     //rechercher une lettre
     public List FindById(int id_phar) {
        List<Facture_Ph> list = new ArrayList<>();

        String requete2 =  "SELECT `nom_Pharmacien`,"
                    + "`prenom_Pharmacien`,`id_Pharmacien`,`numTel_Pharmacien`,`Somme_Prix`,`nom_prod`"
                    + " FROM `facture_ph` JOIN `pharmacien` ON facture_ph.Id_Phar= pharmacien.id_Pharmacien JOIN `produit`"
                + "ON facture_ph.Id_ProdS = produit.id_prod WHERE facture_ph.Id_Phar=" + id_phar +"  " ;


        try {
              Statement st = new MyConnection().getCnx().createStatement();
            ResultSet rs = st.executeQuery(requete2);
           // ResultSet rs = st.executeQuery(requete2);
           
            while (rs.next()) {
  
                Facture_Ph Fact = new Facture_Ph();
                produit Pr = new produit ();
                pharmacien Phar = new pharmacien();
                Fact.setSomme_Prix(rs.getInt("Somme_Prix"));
                Pr.setNomProduit(rs.getString("nom_prod"));
               Phar.setId_phar(rs.getInt("id_Pharmacien"));
                Phar.setNom_Pharmacien(rs.getString("nom_Pharmacien"));
                Phar.setPrenom_Pharmacien(rs.getString("prenom_Pharmacien"));
                Phar.setNumTel_Pahrmacien(rs.getInt("numTel_Pharmacien"));
                
                list.add(Fact);
            }
          

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return list;
 
    
}
}
