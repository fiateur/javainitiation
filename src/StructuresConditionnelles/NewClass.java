/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StructuresConditionnelles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tncr
 */
public class NewClass {
    private int age ;

    public NewClass(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        NewClass stc = new NewClass (45) ;
        
        // if else
        if (stc.getAge() < 100 ){
            System.out.println("Vous n\'etes pas Centenaire!");
        } else {
            System.out.println("Vous etes Centenaire!");
        }
        
        // avec un ternaire
        String centenaire = stc.getAge() < 100 ? "Vous n\'etes pas Centenaire!" : "Vous etes Centenaire!" ;
        System.out.println(centenaire);
    
   
    //if-else avec imbrication des blocs d'instructions
        if (stc.getAge() < 100 ){
            if (stc.getAge() > 50 ){
                System.out.println("Vous etes au dessus de la Cinquantaine!");
            } else {
                System.out.println("Vous avez moins de Cinquante ans!");
            }
        } else {
            if (stc.getAge() > 200 ){
                System.out.println("Vous etes un tres grand patriarche!");
            } else {
                System.out.println("Vous etes Centenaire!");
            }
        }
        
        // 10 07 2025
        int xage = (stc.getAge() < 100 )? 1 : 0 ;
        boolean nvoage = false;
        
        // Switch
        switch (xage) {
            case 1 : 
                if (stc.getAge() > 50 ){
                    System.out.println("Vous etes au dessus de la Cinquantaine!");
                } else {
                    System.out.println("Vous avez moins de Cinquante ans!");
                }
                break ;
            default : 
                if (stc.getAge() > 200 ){
                    System.out.println("Vous etes un tres grand patriarche!");
                } else {
                    System.out.println("Vous etes Centenaire!");
                }
        } 
        // Exo switch planet 
        Scanner scanner = new Scanner( System.in) ;
        System.out.println("Veuiller saisir votre nom!") ;
        String nom = scanner.nextLine() ;
        System.out.println("Veuiller saisir le numero de planete!") ;
        int numplanete = scanner.nextInt() ;
        
        switch (numplanete) {
            case 1 : 
                System.out.println("Bonjour Mr : " + nom) ;
                System.out.println("Vous etes a la planete 1 ") ;
                break ;
            case 2 : 
                System.out.println("Bonjour Mr : " + nom) ;
                System.out.println("Vous etes a la planete 2 ") ;
                break ;
            case 3 : 
                System.out.println("Bonjour Mr : " + nom) ;
                System.out.println("Vous etes a la planete 3 ") ;
                break ;
            case 4 : 
                System.out.println("Bonjour Mr : " + nom) ;
                System.out.println("Vous etes a la planete 4 ") ;
                break ;
            case 5 : 
                System.out.println("Bonjour Mr : " + nom) ;
                System.out.println("Vous etes a la planete 5 ") ;
                break ;
            case 6 : 
                System.out.println("Bonjour Mr : " + nom) ;
                System.out.println("Vous etes a la planete 6 ") ;
                break ;
            case 7 : 
                System.out.println("Bonjour Mr : " + nom) ;
                System.out.println("Vous etes a la planete 7 ") ;
                break ;
            case 8 : 
                System.out.println("Bonjour Mr : " + nom) ;
                System.out.println("Vous etes a la planete 8 ") ;
                break ;
            case 9 : 
                System.out.println("Bonjour Mr : " + nom) ;
                System.out.println("Vous etes a la planete 9 ") ;
                break ;
            default :
                System.out.println("Bonjour Mr : " + nom) ;
                System.out.println("Vous avez saisi un numero de planete Incorrect! ") ; 
        
        }
        
        //Boucle For
        for (int i=1; i<=5; i++) { // On initialise une variable, et tant qu'elle est inférieure ou égale à 5 on l'incrémente de 1.
            System.out.println("Itération n° " + i); // A chaque fois on affiche une boîte de dialogue (5 fois)
        } 
        
        List<Integer> listedenombre = new ArrayList<>();
        listedenombre.add(1) ;
        listedenombre.add(2) ;
        listedenombre.add(3) ;
        listedenombre.add(4) ;
        listedenombre.add(5) ;
        
        for (Integer i : listedenombre){
            System.out.println("Itération n° " + i);
        }
        
        List <String> listedestring = new ArrayList<>();
        listedestring.add("Lundi") ;
        listedestring.add("Mardi") ;
        listedestring.add("Mercredi") ;
        listedestring.add("Jeudi") ;
        listedestring.add("Vendredi") ;
        listedestring.add("Samedi") ;
        listedestring.add("Dimanche") ;
        
        for (String jour : listedestring){
            System.out.println(jour);
        }
        
        //Boucle While
        int lg = listedenombre.size();
        while (lg > 0 && !listedenombre.isEmpty()){
            for (Integer i : listedenombre){
                System.out.println("Itération n° " + i);
            }
        }
    }
       
}
