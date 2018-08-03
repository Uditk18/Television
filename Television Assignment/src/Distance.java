//This is the Distance class with instance variables and members
class Distance {
	int feet;
	float inches;

	public void set(int f, float i) {
		feet = f;
		inches = i;
	}

	public void disp() {
		System.out.println("Distance is : " + feet + " feet " + inches + " inches");
	}

//As we know, 12inch=1feet,therefore doing the calculations accordingly
	public static Distance add(Distance dist1, Distance dist2) {
		Distance dist3 = new Distance();
		dist3.feet = dist1.feet + dist2.feet;
		dist3.inches = dist1.inches + dist2.inches;
		if (dist3.inches >= 12) {
			dist3.inches = dist3.inches - 12;
			dist3.feet = dist3.feet + 1;
		}
		return dist3;

	}

}
