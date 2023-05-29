package s3t1n2;
import java.util.*;

public class Main {
	
	//Creem l'agenda
	static List<Object> agenda = new ArrayList();

	public static void main(String[] args) {
		
		//Afegim dues adreçes
		AbstractFactory fabricaAdreça = FactoryProducer.getFactory("ADREÇA");
		Afegir adreça1 = fabricaAdreça.getTipus("ADREÇA");
		adreça1.afegir("Carrer de Lepant nº35");
		
		Afegir adreça2 = fabricaAdreça.getTipus("ADREÇA");
		adreça2.afegir("Carrer de Marina nª238");
		
		//Afegim dos telefons
		
		AbstractFactory fabricaTelefon = FactoryProducer.getFactory("TELEFON");
		Afegir telefon1 = fabricaTelefon.getTipus("ADREÇA");
		telefon1.afegir("+34 839294857");
		
		Afegir telefon2 = fabricaTelefon.getTipus("ADREÇA");
		telefon2.afegir("+56 928387294");		
	}
}