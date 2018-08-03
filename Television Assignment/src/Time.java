//main method for time1 class

public class Time {

	public static void main(String args[]) {
		// making objects of time1 in main method
		Time1 t1 = new Time1();
		Time1 t2 = new Time1();
		Time1 t4 = new Time1();

		// calling setTime and passing values
		t1.setTime(3, 50);
		t2.setTime(4, 50);

		// calling showTime method
		t1.showTime();
		t2.showTime();

		// passing objects for sum
		t4 = Time1.sum(t1, t2);
		System.out.println("Sum of Time = " + t4.hours + " Hours " + t4.mins + " minutes");

	}

}
