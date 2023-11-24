package Com.Sandeep.Ass1;

public class CurrencyConverter {

	double[] exchangeRates= { 63, 3, 3, 595, 18, 107, 2, 3 };
	double[] rates ;

	void setExchangeRates(double[] rates) {
		exchangeRates = rates;
	}

	void updateExhangeRates(int arrayIndex, double val1) {
		exchangeRates[arrayIndex] = val1;
	}

	double getExchangeRates(int arrayIndex) {
		return exchangeRates[arrayIndex];
	}

	double computeTransferAmount(int arrayIndex, double amount) {
		return amount * getExchangeRates(arrayIndex);
	}

	void printCurrencies() {

		System.out.println("rupee: " + exchangeRates[0]);
		System.out.println("dirham " + exchangeRates[1]);
		System.out.println("real " + exchangeRates[2]);
		System.out.println("chilean_peso: " + exchangeRates[3]);
		System.out.println("mexican_peso: " + exchangeRates[4]);
		System.out.println("_yen: " + exchangeRates[5]);
		System.out.println("$austrailian: " + exchangeRates[6]);
		System.out.println("No of Currencies: " + exchangeRates.length);

//System.out.println("dirham: " + dirham);
//System.out.println("real: " + real);
//System.out.println("chilean_peso: " + chilean_peso);
//System.out.println("mexican_peso: " + mexican_peso);
//System.out.println("_yen: " + _yen);
//System.out.println("$australian: " + $australian);

	}

//	public static void main(String[] args) {
//
//		
//
//		CurrencyConverter cc = new CurrencyConverter();
//
//		cc.setExchangeRates(rates);
//		cc.updateExhangeRates(0, 65);
//		cc.getExchangeRates(0);
//		cc.computeTransferAmount(0, 100);
//
//		cc.printCurrencies();
//
//		System.out.println("The rate of exchange  :" + cc.getExchangeRates(0));
//		System.out.println("The converted Amount  :" + cc.computeTransferAmount(0, 100));

//	}

}
