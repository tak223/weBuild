/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

/**
 *
 * @author user
 */
public class commande {
    
    private int Id_comd;
    private String Nom_Prod;
    private int Quantite;
    private int Prix;
    private String Image;

    public commande() {
    }
    

    public commande(int Id_comd, String Nom_Prod, int Quantite, int Prix, String Image) {
        this.Id_comd = Id_comd;
        this.Nom_Prod = Nom_Prod;
        this.Quantite = Quantite;
        this.Prix = Prix;
        this.Image = Image;
    }

    public commande(String Nom_Prod, int Quantite, int Prix, String Image) {
        this.Nom_Prod = Nom_Prod;
        this.Quantite = Quantite;
        this.Prix = Prix;
        this.Image = Image;
    }

    public int getId_comd() {
        return Id_comd;
    }

    public void setId_comd(int Id_comd) {
        this.Id_comd = Id_comd;
    }

    public String getNom_Prod() {
        return Nom_Prod;
    }

    public void setNom_Prod(String Nom_Prod) {
        this.Nom_Prod = Nom_Prod;
    }

    public int getQuantite() {
        return Quantite;
    }

    public void setQuantite(int Quantite) {
        this.Quantite = Quantite;
    }

    public int getPrix() {
        return Prix;
    }

    public void setPrix(int Prix) {
        this.Prix = Prix;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    @Override
    public String toString() {
        return "commande{" + "Id_comd=" + Id_comd + ", Nom_Prod=" + Nom_Prod + ", Quantite=" + Quantite + ", Prix=" + Prix + ", Image=" + Image + '}';
    }
    
    
    
}
