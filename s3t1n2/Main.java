package s3t1n2;
import java.util.*;

public class Main {
	
	//Creem l'agenda
	static List<Object> agenda = new ArrayList();

	public static void main(String[] args) {
		
		//Afegim dues adre�es
		AbstractFactory fabricaAdre�a = FactoryProducer.getFactory("ADRE�A");
		Afegir adre�a1 = fabricaAdre�a.getTipus("ADRE�A");
		adre�a1.afegir("Carrer de Lepant n�35");
		
		Afegir adre�a2 = fabricaAdre�a.getTipus("ADRE�A");
		adre�a2.afegir("Carrer de Marina n�238");
		
		//Afegim dos telefons
		
		AbstractFactory fabricaTelefon = FactoryProducer.getFactory("TELEFON");
		Afegir telefon1 = fabricaTelefon.getTipus("ADRE�A");
		telefon1.afegir("+34 839294857");
		
		Afegir telefon2 = fabricaTelefon.getTipus("ADRE�A");
		telefon2.afegir("+56 928387294");		
	}
}