package s3t1n2;

public class AfegirTipusTelefon extends AbstractFactory {

	@Override
	public Afegir getTipus(String tipus) {
		return new Adreça();
	}
}
