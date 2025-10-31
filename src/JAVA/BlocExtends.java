package JAVA;

public class BlocExtends extends BlocAEtendre {

    private boolean porteur;
    
    BlocExtends(final int longue,final int larg,final int haut,final boolean porteur){
    	super(longue,larg,haut);
    	this.porteur = porteur;
    }
    
    public void afficherBloc() {
    	System.out.println(super.longue + " " + super.larg + " " + super.haut + " " + this.porteur);
                
                
                
                
    	
    }

}
