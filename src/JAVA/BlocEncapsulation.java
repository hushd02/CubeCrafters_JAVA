package JAVA;

public class BlocEncapsulation {
	//Declaration des variables.
        private int longueur;
        private int largeur;
        private int hauteur;
        
    //Constructeur pour les trois attributs
       public BlocEncapsulation(final int longueur, final int largeur, final int hauteur ){
        	
        	this.longueur = longueur;
        	this.largeur = largeur;
        	this.hauteur = hauteur;
        	
        }
       
    //Methode public getter pour l'attribut longueur.
       public int getlongueur() {
    	   return longueur;
    	   
       }
       
    //Methode public getter pour l'attrubut largeur.
       public int getlargeur() {
    	   return largeur;
       }
       
     //Methode public getter pour l'attrubut hauteur.
       public int gethauteur() {
    	   return hauteur;
       }
      
       
}