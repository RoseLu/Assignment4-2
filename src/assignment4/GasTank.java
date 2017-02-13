package assignment4;

public class GasTank {
	private double amount = 0f;
	public GasTank(double amount){
		this.amount=amount;
	}
	public void addGas(double quantity) {
		amount += quantity;
		System.out.println("You have added " + quantity + " gallon.");
	}

	public void useGas(double quantity) {
		amount -= quantity;
		System.out.println("You have used " + quantity + " gallon.");
	}

	public double getGasLevel() {

		return amount;
	}

	public static void main(String[] args) {
		GasTank gt = new GasTank(0.8);
		gt.addGas(13.89);
		gt.useGas(3.52);
		System.out.println("Now your gas level is " + gt.getGasLevel() + " gallon.");

	}
}
