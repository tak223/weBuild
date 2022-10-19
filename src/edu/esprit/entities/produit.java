/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

/**
 *
 * @author HP
 */
public class produit{
    private int idProduit;
    private String nomProduit;

    public produit() {
    }

    public produit(int idProduit, String nomProduit) {
        this.idProduit = idProduit;
        this.nomProduit = nomProduit;
    }

    public produit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    @Override
    public String toString() {
        return "Produit{" + "idProduit=" + idProduit + ", nomProduit=" + nomProduit + '}';
    }

    public void setNom_prod(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
   
}