/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondesnotes.model;

import java.util.Date;
/**
 *
 * @author tncr
 */
public class ChargementNote {
    private Etudiant etudiant ;
    private Professeur professeur ;
    
    public ChargementNote(){
    }

    public ChargementNote(Etudiant etudiant, Professeur professeur) {
        this.etudiant = etudiant;
        this.professeur = professeur;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
      //ici on cree un objet etud de type etudiant et on instancie   
       Etudiant etud = new Etudiant("FIAHAD KULEMAI", "Anselme", 43, "E00001", 'M');
       
       //ici on cree un objet prof de type Professeur et on instancie   
       Professeur prof = new Professeur("NYOBE", "Michael", "P00001", "PROGRAMMATION");
       
       //ici on  cree les differentes notes et on les instancie
       Notes noteHtml = new Notes("E00001", "P00001", 15, new Date(), "HTML"); 
       Notes noteJavaScript = new Notes("E00001", "P00001", 16, new Date(), "JavaScript");
       Notes noteJava = new Notes("E00001", "P00001", 17, new Date(), "Java");
       
       //ici on instancie Liste des notes de l'etudiant etud que nous qvons cree
       etud.getListeNotes().add(noteHtml);
       etud.getListeNotes().add(noteJavaScript);
       etud.getListeNotes().add(noteJava);
      
       //on cree notre objet charg_note de type ChargementNote et on instancie 
       ChargementNote charg_note = new ChargementNote(etud, prof);
          
       //ici on offiche les informations
       
       //infos du Prof
       System.out.println(" Informations sur le Professeur  ");
       System.out.println(" Professeur : " + charg_note.professeur.getNom() + " " + charg_note.professeur.getPrenom());
       System.out.println(" Matricule : " + charg_note.professeur.getMatricule() + " Matiere : " + charg_note.professeur.getMatiere());
       
       //infos du Prof
       System.out.println(" Informations sur l'Etudiant  ");
       System.out.println(" Etudiant : " + charg_note.etudiant.getNom() + " " + charg_note.etudiant.getPrenom());
       System.out.println(" Matricule : " + charg_note.etudiant.getMatricule() + " Age : " + charg_note.etudiant.getAge() + " Sexe : " + charg_note.etudiant.getSexe());
       
       //notes
       for (int i=0; i<3; i++)
       {
           System.out.println(" Sous-Matiere : (" + (i+1) + ")  " + charg_note.etudiant.getListeNotes().get(i).getMatiere() + " Notes : " + charg_note.etudiant.getListeNotes().get(i).getNote());
       }
       
    }

    
}
