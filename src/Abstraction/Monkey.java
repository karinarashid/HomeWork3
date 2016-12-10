package Abstraction;

public  class Monkey extends Giraffe implements PolarBear {


	//ElseIF
	public void tallest() {
		int hight = 17;
		
		if (hight>=20){
			System.out.println("If hight is 20ft then most likely its a male Giraffe");
		}else if (hight>=15){
			System.out.println("If hight is 15ft or less then most likely its a famle giraffe");
			
		}else if (hight>9){
		System.out.println("If the hight is 9ft or less then most likely its a baby giraffe");
		}
			
	System.out.println("giraffe is the tallest mammal in the world");	
	}
	 
	
	
	public void BabyGiraffes() {
		System.out.println("Baby Giraffes can stand within half an hour ");
	
	}

	public void largestMonkey(){
		System.out.println("The largest monkey is the male Mandrill, which weighs almost 35 kilograms");
	}
	
	public void monkeyEats(){
		System.out.println("Most of the monkeys eat both plants and animals, some monkeys also eat dirt");	
	}


	public void bearpecies() {
		System.out.println("polar bears feed primarily on the fat of ice-dependent seals");
	}
	
	

}
