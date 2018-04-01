/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prism;

import java.util.Scanner;

/**
 *
 * @author Aman
 */
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
       
    }
    
}

