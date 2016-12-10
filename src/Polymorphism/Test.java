package Polymorphism;

public class Test {

	public static void main(String[] args) {
		BodyShape shape = new BodyShape();
		int womanBodyShape = shape.bodyShape(3, 5, 8);
		System.out.println(womanBodyShape );
	
		int petitewomanBodyShape = shape.bodyShape(3, 5, 8, 10);
		System.out.println(petitewomanBodyShape);
		
		BodyShape superBodyShape= new SuperBodyShape();
		int superpetitewomanBodyShape = superBodyShape.bodyShape(3, 5, 8, 10);
		System.out.println(superpetitewomanBodyShape);
		
		//Exception
		int slim = 3;
		int fat = 5;
		try {
			int result = slim + fat;
			System.out.println(result);	
		}catch(Exception ex){
			System.out.println("Slim + fat = overweight");
		
			
		}	
	}
}
