/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Variables.GestionVariables;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tncr
 */
public class Variables {
    private int nombrehomme ;
    private String nom ;
    private int[] tableauentier ;
    private String[] tableauString ;
    private boolean istest ;
    private List<String> listeString = new ArrayList<>();
    private float nombreFlotant;
    
    public Variables (){
    }

    public Variables(int nombrehomme, String nom, int[] tableauentier, String[] tableauString, boolean istest, float nombreFlotant) {
        this.nombrehomme = nombrehomme;
        this.nom = nom;
        this.tableauentier = tableauentier;
        this.tableauString = tableauString;
        this.istest = istest;
        this.nombreFlotant = nombreFlotant;
    }

    public String[] getTableauString() {
        return tableauString;
    }

    public void setTableauString(String[] tableauString) {
        this.tableauString = tableauString;
    }
    
        public List<String> getListeString() {
        return listeString;
    }

    public void setListeString(List<String> listeString) {
        this.listeString = listeString;
    }


    public float getNombreFlotant() {
        return nombreFlotant;
    }

    public void setNombreFlotant(float nombreFlotant) {
        this.nombreFlotant = nombreFlotant;
    }

    public int getNombrehomme() {
        return nombrehomme;
    }

    public void setNombrehomme(int nombrehomme) {
        this.nombrehomme = nombrehomme;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int[] getTableauentier() {
        return tableauentier;
    }

    public void setTableauentier(int[] tableauentier) {
        this.tableauentier = tableauentier;
    }

    public boolean isIstest() {
        return istest;
    }

    public void setIstest(boolean istest) {
        this.istest = istest;
    }


    public static void main(String[] args) {
        // TODO code application logic here
        
        //creation de l'objet'
        Variables g = new Variables(); 
        //affectation des valeurs par injection des Variables
        g.setNom("FIAHAD");
        g.setNombrehomme(3);
        g.setNombreFlotant(2);
        g.setTableauString(new String[]{"A","B","C"});
        g.setTableauentier(new int[]{1,2,3});
        g.setIstest(true);
        
        //injection par constructeur
        Variables g2 = new Variables(10, "BRUNO", new int[] {1,2,3}, new String[]{"A","B","C"}, true, 2);
        
                //affichage des valeus g
        System.out.println("Visibilite de g : ") ;
        System.out.println("Nom g : " +g.getNom()) ;
        System.out.println("setNombrehomme g  : " +g.getNombrehomme()) ;
        System.out.println("Istest g  : " +g.isIstest()) ;
        System.out.println("NombreFlotant g  : " +g.getNombreFlotant()) ;
        
                    //affichage des valeus g2
        System.out.println("Visibilite de g2 : ") ;
        System.out.println("Nom g2 : " +g2.getNom()) ;
        System.out.println("setNombrehomme g2  : " +g2.getNombrehomme()) ;
        System.out.println("Istest g2  : " +g2.isIstest()) ;
        System.out.println("NombreFlotant g2  : " +g2.getNombreFlotant()) ;
        
    }

}
    
