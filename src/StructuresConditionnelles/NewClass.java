/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StructuresConditionnelles;

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
    }
}
