package assignment4;

public class car {
	private String VIN;
	private String brand;
	private String color;
	private Double displacement;
	private float MPG;

	public car(String VIN, String brand, String color, Double displacement, float MPG) {
		this.VIN = VIN;
		this.brand = brand;
		this.color = color;
		this.displacement = displacement;
		this.MPG = MPG;
	}

	/* Below are the getters and setters. */
	public String getVIN() {
		return VIN;
	}

	public void setVIN(String VIN) {
		this.VIN = VIN;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getDisplacement() {
		return displacement;
	}

	public void setDisplacement(Double displacement) {
		this.displacement = displacement;
	}

	public float getMPG() {
		return MPG;
	}

	public void setMPG(float mPG) {
		MPG = mPG;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/* setters and getters end.Below are my new function defenition. */
	public void introduction(car c) {
		System.out
				.println("This " + getBrand() + " car has a beautiful color of " + getColor() + ".Its displacement is "
						+ getDisplacement() + " and MPG is " + getMPG() + ".You can see the VIN is " + getVIN());
	}

	public boolean isGasSave(car c) {
		return (c.MPG > 23) ? true : false;
	}

}
