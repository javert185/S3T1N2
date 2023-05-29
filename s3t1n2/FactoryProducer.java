package s3t1n2;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String tipus) {
		if (tipus.equalsIgnoreCase("ADRE�A")) {
			return new AfegirTipusAdre�a();
		} else if (tipus.equalsIgnoreCase("TELEFON")) {
			return new AfegirTipusTelefon();
		}
		return null;
	}
}
