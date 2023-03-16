import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner keyboard = new Scanner (System.in);
		
		System.out.print("Do you want to convert from binary to decimal or from decimal to binary");
		String answer = keyboard.next();
		if(answer.equals("binary to decimal")) {
			System.out.println("Enter a number");
			String num = keyboard.next();
			System.out.println(binaryToDecimal(num));
			
		}
		else if(answer.equals("decimal to binary")){
			System.out.println("Enter a number");
			Long num = keyboard.nextLong();
			System.out.println(convertToBinary(num));
		}
		*/
		System.out.println(convertToBinary((long)100000000000));
		System.out.println(binaryToDecimal("101000101110111000101101001011010"));
		
		
	}
	
	public static StringBuilder convertToBinary(Long num) {
		
		String binary = "";
		//ArrayList<Integer> reverse = ArrayList<Integer>();

		while(num>0) {
			binary = binary + num%2;
			
			num = num/2;
		}
		StringBuilder str = new StringBuilder(binary);
		return str.reverse();
	}
	
	


public static Long binaryToDecimal(String binaryNum) {
    long decimal = 0;
    int power = 0;

    for (int i = binaryNum.length() - 1; i >= 0; i--) {
    	if(binaryNum.charAt(i) ==  '1') {
    		long current = (long) Math.pow(2, power);
    		decimal = decimal+current;
    	}
        power++;
    }

    return decimal;
}

}
