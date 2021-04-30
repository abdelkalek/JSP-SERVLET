package com.example.JSP_SERVLET;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="cs", urlPatterns={"/controleur", "*.php" })
public class ControleurServlet extends HttpServlet {
    private CreditMetier CM;
    
    @Override
    public void init()throws ServletException{
        CM= new CreditMetier();
        
    }
    
    
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response )throws ServletException, IOException{
        
        /*Pour la premiere ouverture il faut setter un Credit  donc ,     */
        request.setAttribute("mod", new CreditModel());
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
    }    
    
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response )throws ServletException, IOException{
        // Recuperation  des données 
        double montant= Double.parseDouble(request.getParameter("montant"));
        int duree= Integer.parseInt(request.getParameter("duree"));
        double taux= Double.parseDouble(request.getParameter("taux"));
        
        // Creation du Modele
        CreditModel model =  new CreditModel();
        model.setMontant(montant);
        model.setDuree(duree);
        model.setTaux(taux);
        double res = CM.calculMensualite(montant, duree, taux);
        model.setMensualite(res);
        
        // Creation d'un attribut pour permettre l'affichage
        request.setAttribute("mod", model);
        
        
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
        
    }
    
    
    
}
