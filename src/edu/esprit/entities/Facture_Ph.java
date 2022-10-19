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
public class Facture_Ph {
    private int Id_fact;
    private int Id_comd;
    private int Id_Phar;
    private int Somme_Prix;
    private int Id_ProdS;
    private pharmacien Phar;
    private produit Prod;

    public Facture_Ph(int Id_comd, int Id_Phar, int Somme_Prix, int Id_ProdS, pharmacien Phar, produit Prod) {
        this.Id_comd = Id_comd;
        this.Id_Phar = Id_Phar;
        this.Somme_Prix = Somme_Prix;
        this.Id_ProdS = Id_ProdS;
        this.Phar = Phar;
        this.Prod = Prod;
    }

    public Facture_Ph() {
    }

    public Facture_Ph(int aInt, int aInt0, int aInt1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_fact() {
        return Id_fact;
    }

    public void setId_fact(int Id_fact) {
        this.Id_fact = Id_fact;
    }

    public int getId_comd() {
        return Id_comd;
    }

    public void setId_comd(int Id_comd) {
        this.Id_comd = Id_comd;
    }

    public int getId_Phar() {
        return Id_Phar;
    }

    public void setId_Phar(int Id_Phar) {
        this.Id_Phar = Id_Phar;
    }

    public int getSomme_Prix() {
        return Somme_Prix;
    }

    public void setSomme_Prix(int Somme_Prix) {
        this.Somme_Prix = Somme_Prix;
    }

    public int getId_ProdS() {
        return Id_ProdS;
    }

    public void setId_ProdS(int Id_ProdS) {
        this.Id_ProdS = Id_ProdS;
    }

    public pharmacien getPhar() {
        return Phar;
    }

    public void setPhar(pharmacien Phar) {
        this.Phar = Phar;
    }

    public produit getProd() {
        return Prod;
    }

    public void setProd(produit Prod) {
        this.Prod = Prod;
    }

    @Override
    public String toString() {
        return "Facture_Ph{" + "Id_fact=" + Id_fact + ", Id_comd=" + Id_comd + ", Id_Phar=" + Id_Phar + ", Somme_Prix=" + Somme_Prix + ", Id_ProdS=" + Id_ProdS + ", Phar=" + Phar + ", Prod=" + Prod + '}';
    }

   
 
}
