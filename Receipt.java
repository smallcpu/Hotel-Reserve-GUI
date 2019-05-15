
public class Receipt {
	private String name;
	private String date;
	private double numDays;
	private String hotelName;
	private String hotelLocation;
	private String paymentType;
	private Double totalPrice;
	
	public Receipt(String name, String date, double numDays, String hotelName, String hotelLocation, String paymentType, double totalPrice) {
		this.name = name;
		this.date = date;
		this.numDays = numDays;
		this.hotelName = hotelName;
		this.hotelLocation = hotelLocation;
		this.paymentType = paymentType;
		this.totalPrice = totalPrice;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDate() {
		return this.date;
	}
	
	public double getNumDays() {
		return this.numDays;
	}
	
	public String getHotelName() {
		return this.hotelName;
	}
	
	public String getHotelLocation() {
		return this.hotelLocation;
	}
	
	public String getPaymentType() {
		return this.paymentType;
	}
	
	public double getTotalPrice() {
		return this.totalPrice;
	}
	
}
