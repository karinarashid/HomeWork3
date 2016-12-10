package API;

import java.util.Random;

public class RandomLotteryNum {

	public static void main(String[] args) {
		int [] array = new int [5];
		Random random = new Random(0);
		for (int i=0; i<array.length; i++)
		array [i] = random.nextInt(1000);
		
		for(int lotterynum = 0; lotterynum<array.length; lotterynum++){
			System.out.println(array[lotterynum]);
	
		}}
}