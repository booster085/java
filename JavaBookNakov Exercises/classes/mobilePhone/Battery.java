package classes.mobilePhone;

public class Battery {

	/**
	 * характеристики на батерията (модел, idle time и часове разговор /hours
	 * talk/)
	 * 
	 * @author Ilian
	 *
	 */

	private String model = null;
	private String idleTime = null;
	private String hoursTalk = null;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getIdleTime() {
		return idleTime;
	}

	public void setIdleTime(String idleTime) {
		this.idleTime = idleTime;
	}

	public String getHoursTalk() {
		return hoursTalk;
	}

	public void setHoursTalk(String hoursTalk) {
		this.hoursTalk = hoursTalk;
	}

	public Battery() {
		this("N/D");
	}

	public Battery(String model) {
		this(model, "N/D");
	}

	public Battery(String model, String idleTime) {
		this(model, idleTime, "N/D");
	}

	public Battery(String model, String idleTime, String hoursTalk) {
		this.model = model;
		this.idleTime = idleTime;
		this.hoursTalk = hoursTalk;
	}
}
