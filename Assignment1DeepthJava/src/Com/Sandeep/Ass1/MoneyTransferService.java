package Com.Sandeep.Ass1;

public class MoneyTransferService extends CurrencyConverter{
	
	CurrencyConverter cc = new CurrencyConverter();
	double computeTransferAmount(int countryIndex, double amount) {
		return cc.computeTransferAmount(countryIndex,amount);
	}
	double computeTransferFee(int countryIndex, double amount) {
		return 0.02 * computeTransferAmount(countryIndex, amount);
	}
	double finalAmountTransfered(int countryIndex, double amount) {
		double finalAmount=computeTransferAmount(countryIndex, amount)-computeTransferFee(countryIndex, amount);
		return finalAmount;
	}
public static void main(String[] args) {
	MoneyTransferService mts= new MoneyTransferService();
	System.out.println("Amount to Transfer	: " + mts.computeTransferAmount(0, 100));
	System.out.println("Transfer Fees:  "+ mts.computeTransferFee(0, 100));
	System.out.println("Total Amount Transfered after deduction of Transfer Fees: "+mts.finalAmountTransfered(0, 100));
}
}
