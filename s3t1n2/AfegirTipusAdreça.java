package s3t1n2;

public class AfegirTipusAdreša extends AbstractFactory {

	@Override
	public Afegir getTipus(String tipus) {
		return new Telefon();
	}
}