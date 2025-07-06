/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondesnotes.model;

/**
 *
 * @author tncr
 */
public class Professeur {
   private String nom ;
   private String prenom ;
   private String matricule;
   private String matiere;
    
   public Professeur(){
   }
   
   public Professeur(String nom, String prenom, String matricule, String matiere) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.matiere = matiere;
   }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    } 
    
}
