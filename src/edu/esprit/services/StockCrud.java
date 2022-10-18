/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.services;

import edu.esprit.entities.Stock;
import edu.esprit.utils.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class StockCrud {
    public void ajouterStock(){
        try {
            String requete="INSERT INTO stock (nom_produit,quantite_produit,image_produit,prix_produit) "
                    + "VALUES ('Clamoxyl',5,'image',11  ) ";
            Statement st = new MyConnection().getCnx().createStatement();
             st.executeUpdate(requete);
             System.out.println("Stock ajoutée avec succès");
        } catch (SQLException ex) {
           System.err.println(ex.getMessage());
        }
        
    }
public void ajouterStock(Stock S){
    
    
       
}

public List<Stock> afficherStock(){
    List<Stock> myList = new ArrayList<>();
    
        try {
            
            String requete3 = "SELECT * FROM stock";
            Statement st = new MyConnection().getCnx().createStatement();
            ResultSet rs = st.executeQuery(requete3);
            while(rs.next()){
                Stock s =new Stock();
                s.setId_produit(rs.getInt(1));
                s.setNom_produit("Nom_produit");
                s.setQuantite_produit(rs.getInt(3));
                s.setImage_produit("Image_produit");
                s.setPrix_produit(rs.getInt(5));
                
              
                
                myList.add(s);
            }
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
           
        }
        return myList;
        
}
    public void delete(int id) {
        String requete3 = "DELETE FROM `stock`  WHERE id_produit= '" + id + "'";
            List<Stock> list =new ArrayList<>();
        try {
            Statement st = new MyConnection().getCnx().createStatement();
               st.executeUpdate(requete3);
           
                 System.out.println("STOCK DELETED SUCCSEFULY !!!");
           
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
 
       
    }
   
    private ResultSet rs;
  
    public List<Stock> FindAll() {
    List<Stock> list =new ArrayList<>();
     String requete3 = "SELECT * From `stock`";
         try {
            Statement st = new MyConnection().getCnx().createStatement();
            ResultSet rs = st.executeQuery(requete3);
            while(rs.next()){
                Stock s =new Stock();
                s.setId_produit(rs.getInt(1));
                s.setNom_produit("Nom_produit");
                s.setQuantite_produit(rs.getInt(3));
                s.setImage_produit("Image_produit");
                s.setPrix_produit(rs.getInt(5));
                
            list.add(s);                
            }
                 System.out.println("STOCK DELETED SUCCSEFULY !");
           
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
 return list;
   
    }
    public void modifierStock(Stock  Scd ,int id)
 {
       String requete4 =  "UPDATE `stock` SET `nom_produit`='" + Scd.getNom_produit()+ "'," + "`quantite_produit`='" + Scd.getQuantite_produit()+ "`image_produit`='" + Scd.getImage_produit()+ "`prix_produit`='" + Scd.getPrix_produit()+ "'WHERE id_produit = '" + id + "'  ";
        try {
             
            PreparedStatement Sc = new MyConnection().getCnx().prepareStatement(requete4);
            Sc.executeUpdate(requete4);
            System.out.println("Stock modifiée");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
       
   }

    


}





