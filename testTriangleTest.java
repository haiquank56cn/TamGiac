package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class testTriangleTest {

	@Test
	public void tamGiacvuong() {
		Triangle T= new Triangle();
		Assert.assertEquals("Right Triangle",T.Triangel(3,4,5));
	}
	public void tamGiacCan() {
		Triangle T= new Triangle();
		Assert.assertEquals("Isosceles",T.Triangel(4,3,3));
	}
	public void not() {
		Triangel T= new Triangle();
		Assert.assertEquals("NotATriangle",T.Triangel(4,2,2));

}
