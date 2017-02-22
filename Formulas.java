package Java_Challenges;

import java.util.Scanner;

public class Formulas {
	
	public static final double G = 6.673e-11, g = 9.8;
	
	public static double force (double mass, double acc) {
		
		double force = mass * acc; 
		return force;
	}
	
	public static double forceAttraction (double mass1, double mass2, double radius) {
		
		double forceAttr = G * mass1 * mass2;
		forceAttr = forceAttr / (radius * radius);
		
		return forceAttr;
		
	}
	
	public static double tempCel (double tempF) {
		
		double tempC = 5 * (tempF - 32);
		tempC = tempC/9;
		
		return tempC;
		
	}
	
	public static double tempFah (double tempC) {
		
		double tempFah = (9 * tempC) / 5;
		tempFah = tempFah + 32;
		
		return tempFah;		
	}
	
	public static double kineticEnergy (double mass, double velocity) {
		
		double kinetic = mass * velocity * velocity;
		kinetic = kinetic/2;
		
		return kinetic;		
	}
	
	public static double potentialEnergy (double mass, double height) {
		
		double potential = mass * g * height;
				
		return potential;		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/**
		System.out.println ("Enter the mass of the object: ");
		double mass = scan.nextDouble();
		
		//How to parse scientific enteries 4 * 10^3 

		System.out.println ("Enter the accerlation of the object: ");
		double acc = scan.nextDouble();
		
		double force = Formulas.force(mass, acc);
		
		System.out.println ("The force is: " + force);
		
		System.out.println ("Enter the mass of the object one: ");
		double mass1 = scan.nextDouble();
		
		//How to parse scientific enteries 4 * 10^3 

		System.out.println ("Enter the mass of the object two: ");
		double mass2 = scan.nextDouble();
		
		System.out.println ("Enter the distance between the objects: ");
		double distance = scan.nextDouble();
				
		double forceAttr = Formulas.forceAttraction(mass1, mass2, distance);
		
		System.out.println ("The force is: " + forceAttr);
		
		
		System.out.println ("Enter the Fahrenheit temperature: ");
		double tempFah = scan.nextDouble();
		
		System.out.println ("The temperature is: " + Formulas.tempCel(tempFah) + "\n");
		
		System.out.println ("Enter the Celsius temperature: ");
		double tempCel = scan.nextDouble();
		
		System.out.println ("The temperature is: " + Formulas.tempFah(tempCel) + "\n");
		*/
		
		System.out.println ("Enter the mass of the object: ");
		double massKE = scan.nextDouble();
		
		System.out.println ("Enter the height of the object: ");
		double height = scan.nextDouble();
		
		System.out.println ("The potential energy is: " + Formulas.potentialEnergy(massKE, height) + "\n");
		
		scan.close();				
	}

}
