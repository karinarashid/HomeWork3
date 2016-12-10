package Inheritance;

public class TestAGEdifference {

	public static void main(String[] args) {
		gm1AGE gm= new gm1AGE ();
		gm.LovesTORead();
		
		mom1AGE mother = new mom1AGE ();
		mother.blackhair();
		mother.LovesTORead();
		
		gd1AGE gg = new gd1AGE ();
		gg.Shopping();
		gg.blackhair();
		gg.LovesTORead();
		
		//ifElse
		int gm1 = 70;
		int gd1 = 29;
		
		if (gm1>gd1){
			System.out.println(gm1 + " gm1-grandmother age is greater than gd1-grand-daughter");
			}else{
			System.out.println(gd1 + " gd1 age is greater than gm1");
			}
	}

}
