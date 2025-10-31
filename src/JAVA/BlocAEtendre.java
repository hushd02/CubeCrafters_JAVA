package JAVA;

public class BlocAEtendre {
  //variables.
    protected int longue;
    protected int larg;
    protected int haut;
    
   //construteur
    BlocAEtendre(final int longue,final int larg,final int haut){
    	this.longue = longue;
    	this.larg = larg;
    	this.haut = haut;
    	
    	
    }
    
   //Methode
    public void afficheBlocAEtendre() {
    	/*System.out.println(this.longue);
    	System.out.println(this.larg);
        System.out.println(this.haut);    	*/
    	
    	System.out.println(this.longue+ " " +this.larg+ " " +this.haut);
    	
    }
    
    
}
