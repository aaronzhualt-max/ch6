import java.util.Scanner;
public class Root {
	public static void main(String[] args) {
		squareRoot(9);
	}
		public static double squareRoot(double num) {
			if (num == 0) {
				return 0;
			}
			
			double guess1 = num/2;
			double guess2 = (guess1 + num/guess1) / 2;
			
			while (Math.abs(guess1 - guess2) > 0.0001) {
				guess1 = guess2;
				guess2 = (guess1 + num/guess1) / 2;
			}
			System.out.print(guess2);
			return guess2;
			
		}
}
