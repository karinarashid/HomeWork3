package Polymorphism;

public class BodyShape {	

		public int bodyShape(int slim, int fat , int overWeight){
			int total = slim + fat + overWeight;
			return total;	
			
		}
		
		public int bodyShape (int slim, int fat , int overWeight, int superFat){
			int total = slim + fat + overWeight + superFat;
			return total;
	}
}
