//time1 class defining its members and variables

class Time1 {
	int hours;
	int mins;

	public void setTime(int h, int m) {
		hours = h;
		mins = m;
	}

	// converting minutes to hours and so on
	public void showTime() {
		int temp;
		if (mins >= 60) {
			temp = mins / 60;
			hours = hours + temp;
			mins = mins % 60;
		}
		System.out.println("Time : " + hours + " hours " + mins + " minutes");
	}

	// passing objects and return object with new values
	public static Time1 sum(Time1 t1, Time1 t2) {
		Time1 t3 = new Time1();
		t3.hours = t1.hours + t2.hours;
		t3.mins = t1.mins + t2.mins;
		if (t3.mins >= 60) {
			t3.mins = t3.mins - 60;
			t3.hours = t3.hours + 1;
		}
		return t3;
		// System.out.println("Sum of Time = "+hours+" Hours "+mins+" minutes");
	}
}