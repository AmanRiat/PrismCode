/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prism;


public class Rectangle {
    // Method to calculate the area of a circle, does't return a value, i.e void
	public void RectangleArea(double rect_length, double rect_width) {
		double Rect_Area = (rect_length * rect_width);
		System.out.println("Area of rectangle: " + Rect_Area);
	}

	// Method to calculate the perimeter of a circle, doesn't return a value, i.e void
	public void RectanglePerimeter(double rect_length, double rect_width) {
		double Rect_Perimeter = 2 * (rect_length * rect_width);
		System.out.println("Perimeter of rectangle: " + Rect_Perimeter);
	}
}
