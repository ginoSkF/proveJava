package packB;

import packA.Persona;

//L'ereditarietà si applica su classi simili
//Dipendente è figlia di Persona
//Dipendente eradita attributi e metodi da Persona
public class Dipendente extends Persona {
	
	private double stipendio;
	
	public void test() {
		/*
		 * id è visibile
		 * nome non visibile
		 * s1 non visibile
		 * s2 è visibile
		 * */
		System.out.println(this.id);
		System.out.println(this.s2);
	}

}
