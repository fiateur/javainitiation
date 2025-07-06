/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondesnotes.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tncr
 */
public class Etudiant {
   private String nom ;
   private String prenom ;
   private int age;
   private String matricule;
   private char sexe;
   private final List<Notes> listeNotes = new ArrayList<>();
   
   public Etudiant(){

   }

    public Etudiant(String nom, String prenom, int age, String matricule, char sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.matricule = matricule;
        this.sexe = sexe;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public List<Notes> getListeNotes() {
        return listeNotes;
    }
   
}




