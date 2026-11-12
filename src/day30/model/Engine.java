package day30.model;

public class Engine {
	private String engineMfg;
	private String engineType;
	private int engineCC;
	private double engineLitres;
	public Engine() {}
	public Engine(String engineMfg, String engineType, int engineCC, double engineLitres) {
		this.engineMfg = engineMfg;
		this.engineType = engineType;
		this.engineCC = engineCC;
		this.engineLitres = engineLitres;
		System.out.println("In Engine class All Args Constructor");
	}
	public String getEngineMfg() {
		return engineMfg;
	}
	public void setEngineMfg(String engineMfg) {
		this.engineMfg = engineMfg;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public int getEngineCC() {
		return engineCC;
	}
	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	public double getEngineLitres() {
		return engineLitres;
	}
	public void setEngineLitres(double engineLitres) {
		this.engineLitres = engineLitres;
	}
	@Override
	public String toString() {
		return "Engine [engineMfg=" + engineMfg + ", engineType=" + engineType + ", engineCC=" + engineCC
				+ ", engineLitres=" + engineLitres + "]";
	}
	
	
}
