package main;

public class Triangle {
	private int a1, a2, a3;

	public Triangle(int a1, int a2, int a3) {
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
	}

	public void checkTriangle() {
	
		 if (a1 == a2 || a1 == a3 || a2 == a3)
			System.out.println("Isosceles");
		else if (a1 == a2 && a2 == a3)
			System.out.println("Equilateral");
		else if (a1 * a1 + a2 * a2 == a3 * a3 || a1 * a1 + a3 * a3 == a2
				|| a2 * a2 + a3 * a3 == a1 * a1)
			System.out.println("Right Triangle");
		else
			System.out.println("NotATriangle");
	}

}
