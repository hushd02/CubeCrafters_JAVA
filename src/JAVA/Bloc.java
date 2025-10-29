package JAVA;

public class Bloc {

	//Declaration de l'atribut description.
	String description;
	
	//Constructeur Bloc permettant d'acceder a la variable description.
	Bloc(){
		this.description = "Ceci est un bloc du jeu Epicraft's Journey";
	}
	
	
	/*Appelle de afficheDescription dans main via l'instence Bloc*/
	void afficheDescription() {
		System.out.println(this.description);
		}

}
