/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operationsarithmetiques;

/**
 *
 * @author tncr
 */
public class Operations {
    private int a ;
    private int b ;

    public Operations(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    

    public static void main(String[] args) {
        // TODO code application logic here

        Operations ops = new Operations(10,3);
        int resultatAddition = ops.getA() + ops.getB() ;
        int resultatSoustraction = ops.getA() - ops.getB() ;
        int resultatDivisionEntier = ops.getA() / ops.getB() ;
        float resultatDivisionFlottant = ops.getA() / ops.getB() ;
        int resultatDivisionModulaire = ops.getA() % ops.getB() ;

        System.out.println("Addition : " + resultatAddition);
        System.out.println("Soustraction : " + resultatSoustraction);
        System.out.println("Division Entier : " + resultatDivisionEntier);
        System.out.println("Division Flottant : " + resultatDivisionFlottant);
        System.out.println("Division Modulaire : " + resultatDivisionModulaire);
        int x ;
        float y;
        x = -3 + 5 - 2 ;
         System.out.println(x);

         //operateurs relationnels (Renvoi un resultat booleen)
        boolean isTrue1 ;
        boolean isTrue2 ;
        boolean isTrue3 ;

        isTrue1 = 20 > 10 ;
        isTrue2 = 50 < 5 ;
        isTrue3 = 30 >= 30 ;

        System.out.println("Vateur de isTrue1 : " + isTrue1);
        System.out.println("Vateur de isTrue2 : " + isTrue2);
        System.out.println("Vateur de isTrue3 : " + isTrue3);

        int xx = 8 ;
        int yy = 10 ;

        boolean b = xx < yy ;
        System.out.println("Vateur de b : " + b);

         //operateurs logique (&& et || )

        boolean rslt1 = (10 > 5) && (8 < 10) ; // ou plein &&
        boolean rslt2 = (10 > 5) & (8 < 10) ; // ou inclusif &
        boolean rslt3 = (10 < 5) || (8 < 10) ; // ou plein ||
        boolean rslt4 = (10 < 5) | (8 < 10) ; // ou inclusif |
        boolean rslt5 = (10 < 5) ^ (8 < 10) ; // ou inclusif ^

        //operateurs d'incrementation
        int i = 5 ;

        i++ ;
        System.out.println("Valeur i=5 et  i++ : " + i);

        i-- ;
        System.out.println("Valeur  i-- : " + i);

        i+= 5 ;
        System.out.println("Valeur i+= 5  : " + i);

        i-= 5 ;
        System.out.println("Valeur i-= 5  : " + i);
        
        int r = 8 ;
        int t = r++ ;
        System.out.println("Valeur r  : " + i);
        
         //operateurs de concatenation NB il existe une nouvelle version de concatenation avec .append() de la classe StringBuilder
         String debut = "Voici une Chaine " ;
         String fin = "Concatenee" ;
         String rslt = debut + fin ;
         
         System.out.println(rslt);
         
         // Pour des besoins de performence c'est la methode .append() de la classe StringBuilder apparue avec le java 8
         // on peut egalement utiliser la methode .join de la classe String
         StringBuilder sb = new StringBuilder ();
         System.out.println(sb.append(debut).append(" ").append(fin));
         
          // Concatenantion d'une chaine de caractere et d'un entier
         String maChaine = "Mon Age est :  " ;
         int age = 50 ;
         StringBuilder sb2 = new StringBuilder ();
         System.out.println(sb2.append(maChaine).append(age)); 

    }
}