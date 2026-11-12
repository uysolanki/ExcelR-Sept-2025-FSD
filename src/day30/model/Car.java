package day30.model;

public class Car {
	private String carModel;
	private String carMfg;
	private String carColor;
	private double carPrice;
	
	Engine engine;
	Gear gear;
	
	public Car() {}
	public Car(String carModel, String carMfg, String carColor, double carPrice, Engine engine, Gear gear) {
		super();
		this.carModel = carModel;
		this.carMfg = carMfg;
		this.carColor = carColor;
		this.carPrice = carPrice;
		this.engine = engine;
		this.gear = gear;
	}
	
	
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarMfg() {
		return carMfg;
	}
	public void setCarMfg(String carMfg) {
		this.carMfg = carMfg;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Gear getGear() {
		return gear;
	}
	public void setGear(Gear gear) {
		this.gear = gear;
	}
	@Override
	public String toString() {
		return "Car [carModel=" + carModel + ", carMfg=" + carMfg + ", carColor=" + carColor + ", carPrice=" + carPrice
				+ ", engine=" + engine + ", gear=" + gear + "]";
	}
	
	
}
