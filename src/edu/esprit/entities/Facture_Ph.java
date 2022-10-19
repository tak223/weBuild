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
    private int Id_comd;
    private int Id_Phar;
    private int Somme_Prix;

    public Facture_Ph(int Id_comd, int Id_Phar, int Somme_Prix) {
        this.Id_comd = Id_comd;
        this.Id_Phar = Id_Phar;
        this.Somme_Prix = Somme_Prix;
    }

    public Facture_Ph(int Id_Phar, int Somme_Prix) {
        this.Id_Phar = Id_Phar;
        this.Somme_Prix = Somme_Prix;
    }

    public Facture_Ph() {
    }

    public Facture_Ph(int Somme_Prix) {
        this.Somme_Prix = Somme_Prix;
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

    @Override
    public String toString() {
        return "Facture_Ph{" + "Id_comd=" + Id_comd + ", Id_Phar=" + Id_Phar + ", Somme_Prix=" + Somme_Prix + '}';
    }
   
    
    

   
    
}
