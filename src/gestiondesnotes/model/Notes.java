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
public class Notes {
    private String matriculeEtudiant;
    private String matriculeEnseignant;
    private float note;
    private Date dateEvaluation;
    private String matiere;
    
    public Notes(){
    }

    public Notes(String matriculeEtudiant, String matriculeEnseignant, float note, Date dateEvaluation, String matiere) {
        this.matriculeEtudiant = matriculeEtudiant;
        this.matriculeEnseignant = matriculeEnseignant;
        this.note = note;
        this.dateEvaluation = dateEvaluation;
        this.matiere = matiere;
    }

    public String getMatriculeEtudiant() {
        return matriculeEtudiant;
    }

    public void setMatriculeEtudiant(String matriculeEtudiant) {
        this.matriculeEtudiant = matriculeEtudiant;
    }

    public String getMatriculeEnseignant() {
        return matriculeEnseignant;
    }

    public void setMatriculeEnseignant(String matriculeEnseignant) {
        this.matriculeEnseignant = matriculeEnseignant;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public Date getDateEvaluation() {
        return dateEvaluation;
    }

    public void setDateEvaluation(Date dateEvaluation) {
        this.dateEvaluation = dateEvaluation;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }
    
}

