package classes.mobilePhone;

public class GSM {
	/**
	 * Дефинирайте клас, който съдържа информация за мобилен телефон: модел,
	 * производител, цена, собственик, характеристики на батерията (модел, idle
	 * time и часове разговор /hours talk/) и характеристики на екрана (големина
	 * и цветове).
	 * 
	 * Към класа за мобилен телефон от предходните две задачи, добавете статично
	 * поле nokiaN95, което да съхранява информация за мобилен телефон модел
	 * Nokia 95. Добавете метод, в същия клас, който извежда информация за това
	 * статично поле.
	 */
	private String model = null;
	private String producer = null;
	private String price = null;
	private String owner = null;
	private Battery battery = null;
	private Display display = null;
	private static GSM nokiaN95 = new GSM("NokiaN95", "Nokia", "350.00", "Petkan",
			new Battery("GD-18SHT", "86h", "4h"), new Display("3.5\"", "256k"));
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public GSM() {
		this("N/A");
	}

	public GSM(String model) {
		this(model, "N/A");
	}

	public GSM(String model, String producer) {
		this(model, producer, "N/A");
	}

	public GSM(String model, String producer, String price) {
		this(model, producer, price, "N/A");
	}

	public GSM(String model, String producer, String price, String owner) {
		this(model, producer, price, owner, new Battery());
	}

	public GSM(String model, String producer, String price, String owner,
			Battery battery) {
		this(model, producer, price, owner, battery, new Display());
	}

	public GSM(String model, String producer, String price, String owner,
			Battery battery, Display display) {
		this.model = model;
		this.producer = producer;
		this.price = price;
		this.owner = owner;
		this.battery = battery;
		this.display = display;
	}
	
	public static GSM getNokiaN95Info(){
		return nokiaN95;
	}
	
	@Override
	public String toString(){
		return String.format("\tPhone\nProducer: %s\nModel: %s\nPrice: %s\nOwner: "
				+ "%s\nBattery\nmodel: %s\nIdleTime: %s\nHoursTalk: "
				+ "%s\nDisplay\nSize: %s\nColors: %s\n", this.getProducer(), this.getModel(),
				this.getPrice(), this.getOwner(), this.getBattery().getModel(),
				this.getBattery().getIdleTime(), this.getBattery().getHoursTalk(), 
				this.getDisplay().getSize(), this.getDisplay().getColors());
	}
}
