package com.example.JSP_SERVLET;


public class CreditModel {

    private double montant;
    private int duree;
    private double taux;
    public double mensualite;


    public CreditModel() {
        montant = 0;
        duree = 0;
        mensualite = 0;
        taux = 0;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public Double getMensualite() {
        return mensualite;
    }

    public void setMensualite(double mensualite) {
        this.mensualite = mensualite;
    }
}
