package s3t1n2;

public class Telefon implements Afegir {
	
	@Override
	public void afegir(String s) {
		Main.agenda.add(s);
	}
}