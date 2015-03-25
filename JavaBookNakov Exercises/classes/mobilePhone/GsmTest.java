package classes.mobilePhone;

public class GsmTest {

	public static void main(String[] args) {
		//Batteries
		Battery bat1 = new Battery("HGS22-11", "52h");
		Battery bat2 = new Battery("LMH-H5", "49h", "6h");
		Battery bat3 = new Battery("SK-750", "62h", "10h");
		Battery bat4 = new Battery("GoBat1000", "100h", "24h");
		
		//Displays
		Display disp1 = new Display("4.7\"", "256k");
		Display disp2 = new Display("5\"", "16mil");
		Display disp3 = new Display("5.2\"", "16mil");
		
		GSM samsung = new GSM("GalaxyS2", "Samsung", "649.00", "N/A", bat3, disp3);
		GSM iPhone = new GSM("iPhone 5S", "Apple", "1219.00", "Viktor Krum", bat1); 
		GSM htc = new GSM("ONE", "HTC", "749.00", "Harry Potter", bat4, disp2);
		GSM windowsPhone = new GSM("Windos Phone 8X", "HTC", "349.00", "Mihail Kalashnikov", bat2, disp1);
		GSM nokiaN95 = GSM.getNokiaN95Info();

		GSM[] phones = {samsung, iPhone, htc, windowsPhone, nokiaN95};
		
		for (int i = 0; i < phones.length; i++) {
			System.out.println(phones[i]);
		}
		
	}
}
