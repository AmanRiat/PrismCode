
package prism;

import java.util.Scanner;

public class Prism extends Rectangle {
	// Method to calculate volume of a rectangular prism
    public double prismVolume(double prism_height, double prism_length, double prism_width) {
		double prism_volume =  (prism_height * prism_length * prism_width);
		return prism_volume;
	}
	
	// Method to calculate the surface area of a rectangular prism, returns a value
	public double prismSurfaceArea(double prism_height, double prism_length, double prism_width) {
		double prism_surfaceArea = 2*((prism_width*prism_length)+(prism_height*prism_length)+(prism_height*prism_width));
		return prism_surfaceArea;
	}
       
    public static void main(String[] args) {
	    // Getting user input, declaring it for later use 
        Scanner scan1 = new Scanner(System.in);	
	Scanner scan2 = new Scanner(System.in);
	Scanner scan3 = new Scanner(System.in);	
	Scanner scan4 = new Scanner(System.in);
        Scanner scan5 = new Scanner(System.in);
        Scanner scan6 = new Scanner(System.in);
        // ans2 was created so program runs until no is entered upon completion 
        String ans2 = "yes"; 
        do {
		
			// Create a local variable
			double perimeter;
						
			// Create a prism object (child class)
			Prism myPrism = new Prism();
		
			// Create a rectangle object (parent class)
			Rectangle myRectangle = new Rectangle();
	
			System.out.print("Enter the Rectangle length and width: ");
			
			// Check for valid input
			try {
				// Using rectangle class prints out area and perimeter
				double rect_length = scan1.nextDouble();
                                double rect_width = scan2.nextDouble();
				
				//checks if positive value was entered
				if (rect_length < 0) {
					throw new IllegalArgumentException ("Invalid input");
				}
				if (rect_width < 0) {
					throw new IllegalArgumentException ("Invalid input");
				}
				
				// Call rectanglearea method
				myRectangle.RectangleArea(rect_length,rect_width);
				// Call RectanglePerimeter
				myRectangle.RectanglePerimeter(rect_length,rect_width);
		
			}
		
			// Once invalid input has been entered
			catch(Exception e){
				System.out.println("Invalid input");
				if(scan1.hasNextDouble()) {
					double rect_length = scan1.nextDouble();
					double rect_width = scan1.nextDouble();
				}	
		
			// Check for valid input
			try {
				System.out.print("Enter the Prism Height, length, width: ");
				double prism_height = scan3.nextDouble();
				
				// Make sure user enters a positive height
				if (prism_height < 0) {
					throw new IllegalArgumentException ("Invalid input");
				}
				
                                double prism_length = scan4.nextDouble();
				
				// Make sure user enters a positive height
				if (prism_length < 0) {
					throw new IllegalArgumentException ("Invalid input");
				}
				
                                double prism_width = scan5.nextDouble();
				
				// Make sure user enters a positive height
				if (prism_width < 0) {
					throw new IllegalArgumentException ("Invalid input");
				}
			
			
				// Using prism class prints out volume and surface area
				// Call prismVolume method
				myPrism.prismVolume(prism_height, prism_length, prism_width);
				System.out.println("The volume of the rectangular prism is: " + myPrism.prismVolume(prism_height, prism_length, prism_width));
			
				//call prismSurfaceArea method
				myPrism.prismSurfaceArea(prism_height, prism_length, prism_width);
				System.out.println("The surface area of the rectangular prism is: " + myPrism.prismSurfaceArea(prism_height, prism_length, prism_width));
			}
		
			// If there is an invalid input, print 
			catch(Exception e){
				System.out.println("Invalid input ");
			}
		// Lines below used for multiple runs 
			System.out.println("Would you like to try again? ");
			ans2 = scan6.nextLine();
				
		} while (ans2.equals("yes") || ans2.equals("y"));
		
		System.out.println("Thank you for time");
     
    }
    
}
