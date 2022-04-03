package packing;
import java.util.Scanner;
public class Packing {

	public static void main(String[] args) {
		// prompting the user to enter the number of big cars and small cars 
		int smallCars,bigCars = 0,spaceLeft,spaceNeeded;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of small cars with dimensions (20cm length and 15cm width)");	
		 smallCars = input.nextInt();

		while(smallCars <= 0){
			System.out.println("Invalid entry \n Please try again!!");
			System.out.println("enter the number of small cars with dimensions (20cm length and 15cm width)");	
			 smallCars = input.nextInt();
		};
//		System.out.println("enter the number of big cars with dimensions (40cm length and 15cm width)");	
//		 bigCars = input.nextInt();
		while(bigCars <= 0){
			System.out.println("Invalid entry \n Please try again!!");
			System.out.println("enter the number of big cars with dimensions (40cm length and 15cm width)");	
			bigCars = input.nextInt();
		}
//		if(smallCars > 0) {
//			System.out.println("enter the number of big cars with dimensions (40cm length and 15cm width)");	
//			 bigCars = input.nextInt();
//			if(bigCars <= 0) {
//				System.out.println("Invalid entry \n Please try again!!");
//				System.out.println("enter the number of big cars with dimensions (40cm length and 15cm width)");	
//				 bigCars = input.nextInt();
//			}
			
			
	
		// testing the inputs from the user if its correct
	
    System.out.println("you have entered "+ smallCars + " small cars and  "+bigCars +" big cars");
    int smallArea = 3000, bigArea = 6000, packingArea = 600000;
       int newSarea = smallArea * smallCars;
       int newBarea = bigArea * bigCars;
       int totalCarea = newSarea + newBarea;
       System.out.println("The small cars occupies "+newSarea +" square centimeters space \n \n while the big cars occupies "+newBarea+" square centimeters space\n");
      
    
      if(totalCarea > packingArea) {
    	  System.out.println("no more space will be left");
    	   spaceLeft = totalCarea - packingArea;
    	  System.out.println( spaceLeft +" square centimeters more area is required!!"); 
      }else
      if(totalCarea <= packingArea) {
    	   spaceNeeded = packingArea - totalCarea;
    	   System.out.println(spaceNeeded + " square centimeters is remaining");
    	   int latestSarea = spaceNeeded /smallArea;
    	  System.out.println( latestSarea +" small cars can fit the remaining space "); 
      }
    

}
}
