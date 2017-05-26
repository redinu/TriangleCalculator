import java.util.Scanner;

public class TriangleCalculator {
	
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter sides of a triangle");
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter side one");
		double side1 = keyboard.nextInt();
		
		System.out.println("Enter side two");
		double side2 = keyboard.nextInt();
		
		System.out.println("Enter side three");
		double side3 = keyboard.nextInt();
		
		double higherNumber = Math.max(side2, side3);
		double max =  Math.max(side1, higherNumber);
		double side1Square = Math.pow(side1,2) ;
		double side2Square = Math.pow(side2,2);
		double side3Square = Math.pow(side3,2);
		double maxSquare = Math.pow(max,2);
		
		
		if ( side1 == side2 && side2 == side3){
			System.out.println("The triangle is Equilateral triangle");
		} else {
			
		if (maxSquare == side1Square+side2Square || maxSquare == side2Square+side3Square || maxSquare == side3Square + side1Square){
			System.out.println("The triangle is right angled triangle");
		} else {
					
			System.out.println("The triangle is not a right angled triangle");
		}
	}
	}

}
