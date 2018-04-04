
package prism;

import java.util.Scanner;

public class Prism extends Rectangle {
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
        Scanner scan1 = new Scanner(System.in);	
	Scanner scan2 = new Scanner(System.in);
	Scanner scan3 = new Scanner(System.in);	
	Scanner scan4 = new Scanner(System.in);
        Scanner scan5 = new Scanner(System.in);
        Scanner scan6 = new Scanner(System.in);
        
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
                        catch(Exception e){
				System.out.println("Invalid input, Re-Enter Values");
				if  (scan1.hasNextDouble()) {
					double rect_length = scan1.nextDouble();
                                        double rect_width = scan2.nextDouble();
				}	
			}
			// Check for valid input
			try {
				System.out.print("Enter the Prism Height, length, width: ");
				double prism_height = scan3.nextDouble();
                                
                                if (prism_height <0){
                                    throw new IllegalArgumentException("Invalid Input");
                                }
                                
                                double prism_length = scan4.nextDouble();
                                
                                 if (prism_length <0){
                                    throw new IllegalArgumentException("Invalid Input");
                                }
                                 
                                double prism_width = scan5.nextDouble();
                               
                                 if (prism_width <0){
                                    throw new IllegalArgumentException("Invalid Input");
                                }
			
			
				// Using cylinder class print out volume and surface area
				// Call cylinderVolume method
				myPrism.prismVolume(prism_height, prism_length, prism_width);
				System.out.println("The volume of the rectangular prism is: " + myPrism.prismVolume(prism_height, prism_length, prism_width));
			
				//call cylinderSurfaceArea method
				myPrism.prismSurfaceArea(prism_height, prism_length, prism_width);
				System.out.println("The surface area of the rectangular prism is: " + myPrism.prismSurfaceArea(prism_height, prism_length, prism_width));
			}
		
			// If there is an invalid input, print 
			catch(Exception e){
				System.out.println("Invalid input, Re-Enter Values ");
                                if  (scan3.hasNextDouble()) {
					double prism_height = scan3.nextDouble();
                                        double prism_length= scan4.nextDouble();
                                        double prism_width = scan5.nextDouble();
			}
                    }
		
			System.out.println("Would you like to try again? ");
			ans2 = scan6.nextLine();
				
		} while (ans2.equals("yes") || ans2.equals("y"));
		
		System.out.println("Thank you for time");
     
    }
    
}

