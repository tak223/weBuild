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
public class pharmacien {
            private int id_phar;
            private String nom_Pharmacien;
            private String prenom_Pharmacien;
            private int numTel_Pahrmacien;

    public pharmacien(int id_phar, String nom_Pharmacien, String prenom_Pharmacien, int numTel_Pahrmacien) {
        this.id_phar = id_phar;
        this.nom_Pharmacien = nom_Pharmacien;
        this.prenom_Pharmacien = prenom_Pharmacien;
        this.numTel_Pahrmacien = numTel_Pahrmacien;
    }
            
            

    public pharmacien(String nom_Pharmacien, String prenom_Pharmacien, int numTel_Pahrmacien) {
        this.nom_Pharmacien = nom_Pharmacien;
        this.prenom_Pharmacien = prenom_Pharmacien;
        this.numTel_Pahrmacien = numTel_Pahrmacien;
    }

    public pharmacien() {
    }

    public int getId_phar() {
        return id_phar;
    }

    public void setId_phar(int id_phar) {
        this.id_phar = id_phar;
    }

    public String getNom_Pharmacien() {
        return nom_Pharmacien;
    }

    public void setNom_Pharmacien(String nom_Pharmacien) {
        this.nom_Pharmacien = nom_Pharmacien;
    }

    public String getPrenom_Pharmacien() {
        return prenom_Pharmacien;
    }

    public void setPrenom_Pharmacien(String prenom_Pharmacien) {
        this.prenom_Pharmacien = prenom_Pharmacien;
    }

    public int getNumTel_Pahrmacien() {
        return numTel_Pahrmacien;
    }

    public void setNumTel_Pahrmacien(int numTel_Pahrmacien) {
        this.numTel_Pahrmacien = numTel_Pahrmacien;
    }

    @Override
    public String toString() {
        return "pharmacien{" + "id_phar=" + id_phar + ", nom_Pharmacien=" + nom_Pharmacien + ", prenom_Pharmacien=" + prenom_Pharmacien + ", numTel_Pahrmacien=" + numTel_Pahrmacien + '}';
    }
            
    
}
