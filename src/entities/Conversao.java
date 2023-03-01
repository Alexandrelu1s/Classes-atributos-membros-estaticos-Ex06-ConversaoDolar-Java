package entities;

public class Conversao {

	public static Double converter(Double cotacao, Double dolar) {
		return cotacao * (dolar + (dolar * 0.06));
	}
}
