package BaseStructure;

public class Location {

	private double Latitude;
	private double Longitude;
	
	Location(double d, double e){
		this.setLatitude(d);
		this.setLongitude(e);
	};
	public double getLatitude() {
		return Latitude;
	}
	public void setLatitude(double d) {
		Latitude = d;
	}
	public double getLongitude() {
		return Longitude;
	}
	public void setLongitude(double d) {
		Longitude = d;
	}
	
	
	
}
