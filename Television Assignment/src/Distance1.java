//main method for Distance class

class Distance1 {
	public static void main(String args[])

	{
		// type of reference reference name=new(allocate memory) object
		// type(constructor)
		Distance dist1 = new Distance();
		Distance dist2 = new Distance();
		Distance dist4 = new Distance();

		dist1.set(3, 11);
		dist2.set(4, 7);
		dist1.disp();
		dist2.disp();

		// float inch=dist2.inches+dist1.inches;
		// float feet=dist1.feet+dist2.feet;

		dist4 = Distance.add(dist1, dist2);
		System.out.println("Sum of distances = Feet: " + dist4.feet + " Inches: " + dist4.inches);
	}
}
