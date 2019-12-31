package collectionHomework;

import java.util.ArrayList;

public class ArrList2_Geolocation {
	public static void main(String[] args) {

		ArrayList<Geolocation> locations = new ArrayList<Geolocation>();

		while (locations.size() < 10) {
			double lon = (double) (int) (Math.random() * 21);
			double lat = (double) (int) (Math.random() * 21);
			locations.add(new Geolocation(lon, lat));
		}
		System.out.println(locations);

		for (int i = 0; i < locations.size(); i++) {
			if (locations.get(i).getLong() > 10) {
				locations.remove(i);
				i--;
			}
		}
		System.out.println(locations);
	}
}
