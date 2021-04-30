package com.example.JSP_SERVLET;

public class CreditMetier {
    public double calculMensualite( double c ,int duree, double taux){
        double t=taux /100;
        double t1=c*(t/12);
        double t2=1-(Math.pow((1+(t/12)), 1-duree));
        return (t1/t2);
    }
    public static void main(String[] args) {
        CreditMetier CM= new CreditMetier();
        double R= CM.calculMensualite(200000, 240, 7.5);
        System.out.println(R);
    }
}
