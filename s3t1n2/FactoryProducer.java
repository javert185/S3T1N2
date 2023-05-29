package s3t1n2;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String tipus) {
		if (tipus.equalsIgnoreCase("ADREÇA")) {
			return new AfegirTipusAdreça();
		} else if (tipus.equalsIgnoreCase("TELEFON")) {
			return new AfegirTipusTelefon();
		}
		return null;
	}
}
