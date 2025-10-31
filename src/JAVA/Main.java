package JAVA;

public class Main {
    
	public static void main(String[] args) {
		
	// Declaration de la variable nom en utilisant var.
		var nom = "Esdras";
		//afficher nom dans la console.
		System.out.println(nom); 
		
	//Instance de la class Bloc sans parametre
		Bloc instanceBloc = new Bloc();
	/*Appele de la methode afficheDescription via l'instance instanceBloc.  Le constructeur de la class Bloc etant null par defaut.*/ 
		
      
		instanceBloc.afficheDescription();
		
		Bloc1 instanceBloc1 = new Bloc1("Premier appelle de la methode afficheDescriptions via l'instance Bloc1");
		instanceBloc1.afficheDescriptions();
		
		Bloc1 instance2Bloc1 = new Bloc1("Deuxieme appelle de la methode afficheDescriptions via l'instance Bloc1");
		instance2Bloc1.afficheDescriptions();
    
		Bloc2 instanceBloc2 = new Bloc2(2,3,4);
		instanceBloc2.afficheBloc2();
	}

}
