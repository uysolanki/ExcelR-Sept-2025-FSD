package day30.model;

public class Gear {
	private String gearMfg;
	private String gearType;
	private int Gearlever;
	public Gear() {}
	public Gear(String gearMfg, String gearType, int gearlever) {
		this.gearMfg = gearMfg;
		this.gearType = gearType;
		Gearlever = gearlever;
	}
	public String getGearMfg() {
		return gearMfg;
	}
	public void setGearMfg(String gearMfg) {
		this.gearMfg = gearMfg;
	}
	public String getGearType() {
		return gearType;
	}
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	public int getGearlever() {
		return Gearlever;
	}
	public void setGearlever(int gearlever) {
		Gearlever = gearlever;
	}
	@Override
	public String toString() {
		return "Gear [gearMfg=" + gearMfg + ", gearType=" + gearType + ", Gearlever=" + Gearlever + "]";
	}
	
}
