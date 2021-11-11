import java.util.*;

public class triangel {

	public static double triangleArea (double base, double height) {
		return ((base * height)/2);
		
	}
	
	public static double triangleCircumeference (double side1, double side2, double side3) {
		return (side1 + side2 + side3);
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("\nDo you wish to calculate a triangles area press 1");
		System.out.println("Do you wish to calculate a triangles circumference press 2");
		
		int menu = in.nextInt();
		
		switch(menu){
		case 1:
			System.out.print("Choose the triangles base: ");
			double base = in.nextDouble();
			System.out.print("Choose the triangles height: ");
			double height = in.nextDouble();
			System.out.println("The triangles area is: " + triangleArea(base, height));
			break;
			
		case 2:
			System.out.println("Choose three sides for the triangle");
			System.out.print("Side 1: ");
			double side1 = in.nextDouble();
			System.out.print("Side 2: ");
			double side2 = in.nextDouble();
			System.out.print("Side 3: ");
			double side3 = in.nextDouble();
			System.out.println("The triangles circumference is: " + 
						triangleCircumeference(side1, side2, side3));
			break;
		
		default:
			System.out.println("Try another number, something went wrong");
			main(args);
			break;
		
		
		}

		in.close();
	}

}
