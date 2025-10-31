package JAVA;

public class Bloc2 {
	//Declaration attributs
      protected int L;
      protected int l;
      protected int H;
      
    //Constructeur
      public Bloc2(final int L,final int l,final int H) {
      this.L = L;
      this.l = l;
      this.H = H;
      }
      
    //Methode
      public void afficheBloc2() {
    	  System.out.println(this.L);
    	  System.out.println(this.l);
    	  System.out.println(this.H);
      }
      
}
