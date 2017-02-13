package assignment4;

public class Driver {
	private String name;
	public Driver(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void Launch(){
		System.out.println(getName()+" launches the car.");
	}
	
	public void Drive(Driver d, car c,GasTank gt,double distance){
		Launch();
		System.out.println(d.getName()+" drives a "+c.getColor()+" "+c.getBrand()+" car.");
		gt.useGas(distance/c.getMPG());
		System.out.println("After he drived "+distance+" miles, the gas level is " + gt.getGasLevel() + " gallon.");
		if(gt.getGasLevel()<2) gt.addGas(14);// Usually the capacity of car tank is 14(up and down).
		System.out.println("Now your gas level is " + gt.getGasLevel() + " gallon.");
	}
	



	public static void main(String[] args) {
		Driver d=new Driver("Mike");
		car c = new car("1FA6P0H76E374280", "Ford", "white", 2.0, 25f);
		c.introduction(c);
		System.out.println("Is this car saving gas? " + c.isGasSave(c));
		GasTank gt=new GasTank(5f);
		d.Drive(d, c, gt, 100);
		

	}

}
