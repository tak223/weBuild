/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

import com.mysql.jdbc.integration.c3p0.MysqlConnectionTester;
import java.sql.PreparedStatement;

/**
 *
 * @author user
 */
public class Stock {
    private int id_produit;
    private String nom_produit;
    private int quantite_produit;
    private String image_produit;
    private int prix_produit;
    
    
  public Stock(){
  
  }

    public Stock(int id_produit, String nom_produit, int quantite_produit, String image_produit, int prix_produit) {
        this.id_produit = id_produit;
        this.nom_produit = nom_produit;
        this.quantite_produit = quantite_produit;
        this.image_produit = image_produit;
        this.prix_produit = prix_produit;
    }

    public Stock(String nom_produit, int quantite_produit, String image_produit, int prix_produit) {
        this.nom_produit = nom_produit;
        this.quantite_produit = quantite_produit;
        this.image_produit = image_produit;
        this.prix_produit = prix_produit;
    }

    public int getId_produit() {
        return id_produit;
    }

    public void setId_produit(int id_produit) {
        this.id_produit = id_produit;
    }

    public String getNom_produit() {
        return nom_produit;
    }

    public void setNom_produit(String nom_produit) {
        this.nom_produit = nom_produit;
    }

    public int getQuantite_produit() {
        return quantite_produit;
    }

    public void setQuantite_produit(int quantite_produit) {
        this.quantite_produit = quantite_produit;
    }

    public String getImage_produit() {
        return image_produit;
    }

    public void setImage_produit(String image_produit) {
        this.image_produit = image_produit;
    }

    public float getPrix_produit() {
        return prix_produit;
    }

    public void setPrix_produit(int prix_produit) {
        this.prix_produit = prix_produit;
    }

    @Override
    public String toString() {
        return "Stock{" + "id_produit=" + id_produit + ", nom_produit=" + nom_produit + ", quantite_produit=" + quantite_produit + ", image_produit=" + image_produit + ", prix_produit=" + prix_produit + '}';
    }

    public String getString(String nom_produit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getint(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
