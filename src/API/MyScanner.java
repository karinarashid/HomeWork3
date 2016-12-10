package API;

import java.util.Scanner;

public class MyScanner {

	public static void main(String[] args) {
	
			int [] array = new int [10];
			
			// class call Scanner- how to take input from user= System.in
			// Scanner takes int. value
			Scanner sc = new Scanner (System.in);
			//prompt the value --you can enter all the value you need to 
			System.out.println("please enter input varilabe");
			//j is just a local variable/value 
			for (int j=0; j<array.length; j++){
				array[j] = sc.nextInt();
			}
				array[0] = 10;
				array[1] = 5;
				array[3] = 8;
	
			//for loop //array has variable called length. So instead of saying i<10 we just can say arry.lenght
			System.out.println("Lets retrive the value from the array......");
			for (int i =0; i<array.length; i++){
	
			//i just a local variable/value) is going though the Array. Instead of saying any value simply say i
				//i is represent where we start until end. 
			System.out.println(array [i]);
			
			}
		}
	}


