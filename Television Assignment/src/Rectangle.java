class Rectangle {
	public static void main(String args[]) {
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();

		// calculating areas of two rectangles
		int area1 = rect1.area(20, 30);
		int area2 = rect2.area(20, 20);
		// comparing the areas
		if (area1 == area2) {
			System.out.println("Both rectangles have same area and area is : " + area1);
		} else {
			System.out.println("Both areas are different");
		}
		// perimeter
		int peri1 = rect1.perimeter(20, 30), peri2 = rect2.perimeter(20, 20);
		System.out.println("Perimeter of rectangle 1:" + peri1 + "\nPerimeter of rectangle 2:" + peri2);

	}

	int length;
	int breadth;

	int area(int length, int breadth) {
		return length * breadth;
	}

	int perimeter(int length, int breadth) {
		return (2 * (length + breadth));
	}

}
