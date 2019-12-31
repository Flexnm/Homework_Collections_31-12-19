package collectionHomework;

public class Geolocation {
	private double longtitude;
	private double latitude;

	public Geolocation(double longtitude, double latitude) {
		setLong(longtitude);
		setLati(latitude);
	}

	public double getLong() {
		return longtitude;
	}

	public double getLati() {
		return latitude;
	}

	public void setLong(double longtitude) {
		this.longtitude = longtitude;
	}

	public void setLati(double latitude) {
		this.latitude = latitude;
	}

	public String toString() {
		String location = "(" + longtitude + ", " + latitude + ")";
		return location;
	}
}
