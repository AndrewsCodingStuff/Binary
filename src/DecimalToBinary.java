import java.util.ArrayList;

public class DecimalToBinary {

	public DecimalToBinary() {
		
	}
	
	public String convertToBinary(String num) {
		String current = num;
		ArrayList<Integer> binary = ArrayList<Integer>();
		ArrayList<Integer> reverse = ArrayList<Integer>();

		while(num>0) {
			binary.add(current%2);
			current = current/2;
		}
		
	for (int i = binary.size(); i >= 0; i--) {
        reverse.add(binary.get(i));
    }
	return reverse.toArray();
	}


public String binaryToDecimal(String binaryNum) {
    String decimal = "";
    int power = 0;

    for (int i = binaryNum.length() - 1; i >= 0; i--) {
        int bit = binaryNum.charAt(i) - '0';
        decimal += (char)bit * Math.pow(2, power);
        power++;
    }

    return decimal;
}
}